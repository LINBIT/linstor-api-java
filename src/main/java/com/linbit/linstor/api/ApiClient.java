package com.linbit.linstor.api;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.ClientProperties;
import org.glassfish.jersey.client.HttpUrlConnectorProvider;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.logging.LoggingFeature;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.MultiPart;
import org.glassfish.jersey.media.multipart.MultiPartFeature;

import java.io.IOException;
import java.io.InputStream;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

import java.net.URLEncoder;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.UnsupportedEncodingException;

import java.text.DateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.linbit.linstor.api.auth.Authentication;
import com.linbit.linstor.api.auth.HttpBasicAuth;
import com.linbit.linstor.api.auth.ApiKeyAuth;
import com.linbit.linstor.api.auth.OAuth;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-06-03T06:16:23.152592345Z[Etc/UTC]")
public class ApiClient {
  protected Map<String, String> defaultHeaderMap = new HashMap<String, String>();
  protected String basePath = "http://localhost:3370";
  protected boolean debugging = false;
  protected int connectionTimeout = 0;
  private int readTimeout = 0;
  protected SSLContext sslContext;
  protected HostnameVerifier hostnameVerifier;
  public static final String AUTH_JSON_PATH = "/var/lib/linstor.d/auth.json";

  protected Client httpClient;
  protected JSON json;
  protected String tempFolderPath = null;

  protected Map<String, Authentication> authentications;

  protected int statusCode;
  protected Map<String, List<String>> responseHeaders;

  protected DateFormat dateFormat;

  public ApiClient() {
    json = new JSON();
    httpClient = buildHttpClient(debugging);

    this.dateFormat = new RFC3339DateFormat();

    // Set default User-Agent.
    setUserAgent("java-linstor/0.7.0");

    // Setup authentications (key: authentication name, value: authentication).
    authentications = new HashMap<String, Authentication>();
    authentications.put("bearerAuth", new OAuth());
    // Prevent the authentications from being modified.
    authentications = Collections.unmodifiableMap(authentications);
  }

  /**
   * Gets the JSON instance to do JSON serialization and deserialization.
   * @return JSON
   */
  public JSON getJSON() {
    return json;
  }

  public Client getHttpClient() {
    return httpClient;
  }

  public ApiClient setHttpClient(Client httpClient) {
    this.httpClient = httpClient;
    return this;
  }

  public String getBasePath() {
    return basePath;
  }

  public ApiClient setBasePath(String basePath) {
    this.basePath = basePath;
    return this;
  }

  /**
   * Resolve the base path scheme and, for a plain endpoint, probe the controller for an
   * HTTP-&gt;HTTPS redirect and switch to the discovered HTTPS endpoint. A LINSTOR controller with
   * HTTPS enabled answers its plain HTTP port with a 302 to its HTTPS listener; the JDK HTTP client
   * does not follow such cross-scheme redirects, so we detect it here and switch up-front.
   *
   * <p>Scheme handling (the base path is normalized to a real {@code http}/{@code https} URL the
   * client can use):</p>
   * <ul>
   *   <li>{@code https} / {@code linstor+ssl} &ndash; use HTTPS directly (default port 3371);</li>
   *   <li>{@code http} / {@code linstor} &ndash; probe and switch to HTTPS on a 302, else stay plain
   *       HTTP (default port 3370).</li>
   * </ul>
   *
   * @return true if the (effective) base path is HTTPS
   */
  public boolean discoverHttps() {
    URI uri;
    try {
      uri = URI.create(basePath);
    } catch (RuntimeException exc) {
      return false;
    }
    String scheme = uri.getScheme() == null ? "" : uri.getScheme().toLowerCase();
    String host = uri.getHost();
    if (host == null) {
      return false;
    }

    // "https" / "linstor+ssl": connect straight to the HTTPS port, no probe needed
    if ("https".equals(scheme) || "linstor+ssl".equals(scheme)) {
      int port = uri.getPort() != -1 ? uri.getPort() : 3371;
      setBasePath(String.format("https://%s:%d", host, port));
      return true;
    }

    // only "http" / "linstor" are probed for an HTTP->HTTPS redirect
    if (!"http".equals(scheme) && !"linstor".equals(scheme)) {
      return false;
    }
    int httpPort = uri.getPort() != -1 ? uri.getPort() : 3370;
    // normalize the "linstor://" alias to a real http URL so the client can use it
    if ("linstor".equals(scheme)) {
      setBasePath(String.format("http://%s:%d", host, httpPort));
    }
    HttpURLConnection conn = null;
    try {
      URL url = new URL("http", host, httpPort, "/v1/controller/version");
      conn = (HttpURLConnection) url.openConnection();
      conn.setRequestMethod("GET");
      conn.setInstanceFollowRedirects(false);
      conn.setConnectTimeout(3000);
      conn.setReadTimeout(3000);
      int status = conn.getResponseCode();
      if (status >= 300 && status < 400) {
        String location = conn.getHeaderField("Location");
        if (location != null && !location.isEmpty()) {
          URI redirect = URI.create(location);
          if ("https".equalsIgnoreCase(redirect.getScheme())) {
            int port = redirect.getPort() != -1 ? redirect.getPort() : 3371;
            setBasePath(String.format("https://%s:%d", host, port));
            return true;
          }
        }
      }
    } catch (IOException exc) {
      // not reachable over plain HTTP or not redirecting: keep the current base path
    } finally {
      if (conn != null) {
        conn.disconnect();
      }
    }
    return false;
  }

  /**
   * Trust all HTTPS certificates and skip hostname verification, for controllers serving a
   * self-signed certificate. Rebuilds the HTTP client (so call before setting timeouts).
   *
   * @return API client
   */
  public ApiClient setInsecureSsl() {
    try {
      SSLContext ctx = SSLContext.getInstance("TLS");
      ctx.init(null, new TrustManager[] {new TrustAllManager()}, null);
      this.sslContext = ctx;
      this.hostnameVerifier = new TrustAllHostnameVerifier();
    } catch (Exception exc) {
      throw new RuntimeException("Failed to set up insecure TLS", exc);
    }
    this.httpClient = buildHttpClient(debugging);
    return this;
  }

  /**
   * Verify the controller's HTTPS certificate against the given CA certificate (PEM or DER).
   * Rebuilds the HTTP client (so call before setting timeouts).
   *
   * @param caCertificate path to a CA certificate
   * @return API client
   */
  public ApiClient setCaCertificate(Path caCertificate) {
    try {
      CertificateFactory cf = CertificateFactory.getInstance("X.509");
      KeyStore trustStore = KeyStore.getInstance(KeyStore.getDefaultType());
      trustStore.load(null, null);
      try (InputStream in = Files.newInputStream(caCertificate)) {
        int idx = 0;
        for (Certificate cert : cf.generateCertificates(in)) {
          trustStore.setCertificateEntry("ca-" + idx, cert);
          idx++;
        }
      }
      TrustManagerFactory tmf =
          TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
      tmf.init(trustStore);
      SSLContext ctx = SSLContext.getInstance("TLS");
      ctx.init(null, tmf.getTrustManagers(), null);
      this.sslContext = ctx;
      this.hostnameVerifier = null;
    } catch (Exception exc) {
      throw new RuntimeException("Failed to load CA certificate " + caCertificate, exc);
    }
    this.httpClient = buildHttpClient(debugging);
    return this;
  }

  /**
   * Set the bearer access token, falling back to the token stored in {@value #AUTH_JSON_PATH} when
   * no explicit token is given. An explicit (non-empty) token always takes precedence.
   *
   * @param explicitToken token to use, or null/empty to fall back to the auth.json file
   * @return API client
   */
  public ApiClient setAccessTokenWithFallback(String explicitToken) {
    String token = (explicitToken != null && !explicitToken.isEmpty())
        ? explicitToken
        : readAuthTokenFile(Paths.get(AUTH_JSON_PATH));
    if (token != null && !token.isEmpty()) {
      setAccessToken(token);
    }
    return this;
  }

  /**
   * Read the "token" field from a LINSTOR auth.json file.
   *
   * @param path path to the auth.json file
   * @return the token, or null if the file is missing, unreadable, or has no "token" field
   */
  static String readAuthTokenFile(Path path) {
    if (path == null || !Files.exists(path)) {
      return null;
    }
    try (InputStream in = Files.newInputStream(path)) {
      JsonNode root = new ObjectMapper().readTree(in);
      JsonNode tokenNode = root == null ? null : root.get("token");
      if (tokenNode != null && tokenNode.isTextual()) {
        return tokenNode.asText();
      }
    } catch (IOException exc) {
      // missing or invalid auth.json: behave as if no token is configured
    }
    return null;
  }

  private static final class TrustAllManager implements X509TrustManager {
    @Override public void checkClientTrusted(X509Certificate[] chain, String authType) { }
    @Override public void checkServerTrusted(X509Certificate[] chain, String authType) { }
    @Override public X509Certificate[] getAcceptedIssuers() { return new X509Certificate[0]; }
  }

  private static final class TrustAllHostnameVerifier implements HostnameVerifier {
    @Override public boolean verify(String hostname, SSLSession session) { return true; }
  }

  /**
   * Gets the status code of the previous request
   * @return Status code
   */
  public int getStatusCode() {
    return statusCode;
  }

  /**
   * Gets the response headers of the previous request
   * @return Response headers
   */
  public Map<String, List<String>> getResponseHeaders() {
    return responseHeaders;
  }

  /**
   * Get authentications (key: authentication name, value: authentication).
   * @return Map of authentication object
   */
  public Map<String, Authentication> getAuthentications() {
    return authentications;
  }

  /**
   * Get authentication for the given name.
   *
   * @param authName The authentication name
   * @return The authentication, null if not found
   */
  public Authentication getAuthentication(String authName) {
    return authentications.get(authName);
  }

  /**
   * Helper method to set username for the first HTTP basic authentication.
   * @param username Username
   */
  public void setUsername(String username) {
    for (Authentication auth : authentications.values()) {
      if (auth instanceof HttpBasicAuth) {
        ((HttpBasicAuth) auth).setUsername(username);
        return;
      }
    }
    throw new RuntimeException("No HTTP basic authentication configured!");
  }

  /**
   * Helper method to set password for the first HTTP basic authentication.
   * @param password Password
   */
  public void setPassword(String password) {
    for (Authentication auth : authentications.values()) {
      if (auth instanceof HttpBasicAuth) {
        ((HttpBasicAuth) auth).setPassword(password);
        return;
      }
    }
    throw new RuntimeException("No HTTP basic authentication configured!");
  }

  /**
   * Helper method to set API key value for the first API key authentication.
   * @param apiKey API key
   */
  public void setApiKey(String apiKey) {
    for (Authentication auth : authentications.values()) {
      if (auth instanceof ApiKeyAuth) {
        ((ApiKeyAuth) auth).setApiKey(apiKey);
        return;
      }
    }
    throw new RuntimeException("No API key authentication configured!");
  }

  /**
   * Helper method to set API key prefix for the first API key authentication.
   * @param apiKeyPrefix API key prefix
   */
  public void setApiKeyPrefix(String apiKeyPrefix) {
    for (Authentication auth : authentications.values()) {
      if (auth instanceof ApiKeyAuth) {
        ((ApiKeyAuth) auth).setApiKeyPrefix(apiKeyPrefix);
        return;
      }
    }
    throw new RuntimeException("No API key authentication configured!");
  }

  /**
   * Helper method to set access token for the first OAuth2 authentication.
   * @param accessToken Access token
   */
  public void setAccessToken(String accessToken) {
    for (Authentication auth : authentications.values()) {
      if (auth instanceof OAuth) {
        ((OAuth) auth).setAccessToken(accessToken);
        return;
      }
    }
    throw new RuntimeException("No OAuth2 authentication configured!");
  }

  /**
   * Set the User-Agent header's value (by adding to the default header map).
   * @param userAgent Http user agent
   * @return API client
   */
  public ApiClient setUserAgent(String userAgent) {
    addDefaultHeader("User-Agent", userAgent);
    return this;
  }

  /**
   * Add a default header.
   *
   * @param key The header's key
   * @param value The header's value
   * @return API client
   */
  public ApiClient addDefaultHeader(String key, String value) {
    defaultHeaderMap.put(key, value);
    return this;
  }

  /**
   * Check that whether debugging is enabled for this API client.
   * @return True if debugging is switched on
   */
  public boolean isDebugging() {
    return debugging;
  }

  /**
   * Enable/disable debugging for this API client.
   *
   * @param debugging To enable (true) or disable (false) debugging
   * @return API client
   */
  public ApiClient setDebugging(boolean debugging) {
    this.debugging = debugging;
    // Rebuild HTTP Client according to the new "debugging" value.
    this.httpClient = buildHttpClient(debugging);
    return this;
  }

  /**
   * The path of temporary folder used to store downloaded files from endpoints
   * with file response. The default value is <code>null</code>, i.e. using
   * the system's default tempopary folder.
   *
   * @return Temp folder path
   */
  public String getTempFolderPath() {
    return tempFolderPath;
  }

  /**
   * Set temp folder path
   * @param tempFolderPath Temp folder path
   * @return API client
   */
  public ApiClient setTempFolderPath(String tempFolderPath) {
    this.tempFolderPath = tempFolderPath;
    return this;
  }

  /**
   * Connect timeout (in milliseconds).
   * @return Connection timeout
   */
  public int getConnectTimeout() {
    return connectionTimeout;
  }

  /**
   * Set the connect timeout (in milliseconds).
   * A value of 0 means no timeout, otherwise values must be between 1 and
   * {@link Integer#MAX_VALUE}.
   * @param connectionTimeout Connection timeout in milliseconds
   * @return API client
   */
  public ApiClient setConnectTimeout(int connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
    httpClient.property(ClientProperties.CONNECT_TIMEOUT, connectionTimeout);
    return this;
  }

  /**
   * read timeout (in milliseconds).
   * @return Read timeout
   */
   public int getReadTimeout() {
     return readTimeout;
   }

   /**
    * Set the read timeout (in milliseconds).
    * A value of 0 means no timeout, otherwise values must be between 1 and
    * {@link Integer#MAX_VALUE}.
    * @param readTimeout Read timeout in milliseconds
    * @return API client
    */
    public ApiClient setReadTimeout(int readTimeout) {
      this.readTimeout = readTimeout;
      httpClient.property(ClientProperties.READ_TIMEOUT, readTimeout);
      return this;
    }

  /**
   * Get the date format used to parse/format date parameters.
   * @return Date format
   */
  public DateFormat getDateFormat() {
    return dateFormat;
  }

  /**
   * Set the date format used to parse/format date parameters.
   * @param dateFormat Date format
   * @return API client
   */
  public ApiClient setDateFormat(DateFormat dateFormat) {
    this.dateFormat = dateFormat;
    // also set the date format for model (de)serialization with Date properties
    this.json.setDateFormat((DateFormat) dateFormat.clone());
    return this;
  }

  /**
   * Parse the given string into Date object.
   * @param str String
   * @return Date
   */
  public Date parseDate(String str) {
    try {
      return dateFormat.parse(str);
    } catch (java.text.ParseException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * Format the given Date object into string.
   * @param date Date
   * @return Date in string format
   */
  public String formatDate(Date date) {
    return dateFormat.format(date);
  }

  /**
   * Format the given parameter object into string.
   * @param param Object
   * @return Object in string format
   */
  public String parameterToString(Object param) {
    if (param == null) {
      return "";
    } else if (param instanceof Date) {
      return formatDate((Date) param);
    } else if (param instanceof Collection) {
      StringBuilder b = new StringBuilder();
      for(Object o : (Collection)param) {
        if(b.length() > 0) {
          b.append(',');
        }
        b.append(String.valueOf(o));
      }
      return b.toString();
    } else {
      return String.valueOf(param);
    }
  }

  /*
   * Format to {@code Pair} objects.
   * @param collectionFormat Collection format
   * @param name Name
   * @param value Value
   * @return List of pairs
   */
  public List<Pair> parameterToPairs(String collectionFormat, String name, Object value){
    List<Pair> params = new ArrayList<Pair>();

    // preconditions
    if (name == null || name.isEmpty() || value == null) return params;

    Collection valueCollection;
    if (value instanceof Collection) {
      valueCollection = (Collection) value;
    } else {
      params.add(new Pair(name, parameterToString(value)));
      return params;
    }

    if (valueCollection.isEmpty()){
      return params;
    }

    // get the collection format (default: csv)
    String format = (collectionFormat == null || collectionFormat.isEmpty() ? "csv" : collectionFormat);

    // create the params based on the collection format
    if ("multi".equals(format)) {
      for (Object item : valueCollection) {
        params.add(new Pair(name, parameterToString(item)));
      }

      return params;
    }

    String delimiter = ",";

    if ("csv".equals(format)) {
      delimiter = ",";
    } else if ("ssv".equals(format)) {
      delimiter = " ";
    } else if ("tsv".equals(format)) {
      delimiter = "\t";
    } else if ("pipes".equals(format)) {
      delimiter = "|";
    }

    StringBuilder sb = new StringBuilder() ;
    for (Object item : valueCollection) {
      sb.append(delimiter);
      sb.append(parameterToString(item));
    }

    params.add(new Pair(name, sb.substring(1)));

    return params;
  }

  /**
   * Check if the given MIME is a JSON MIME.
   * JSON MIME examples:
   *   application/json
   *   application/json; charset=UTF8
   *   APPLICATION/JSON
   *   application/vnd.company+json
   * "* / *" is also default to JSON
   * @param mime MIME
   * @return True if the MIME type is JSON
   */
  public boolean isJsonMime(String mime) {
    String jsonMime = "(?i)^(application/json|[^;/ \t]+/[^;/ \t]+[+]json)[ \t]*(;.*)?$";
    return mime != null && (mime.matches(jsonMime) || mime.equals("*/*"));
  }

  /**
   * Select the Accept header's value from the given accepts array:
   *   if JSON exists in the given array, use it;
   *   otherwise use all of them (joining into a string)
   *
   * @param accepts The accepts array to select from
   * @return The Accept header to use. If the given array is empty,
   *   null will be returned (not to set the Accept header explicitly).
   */
  public String selectHeaderAccept(String[] accepts) {
    if (accepts.length == 0) {
      return null;
    }
    for (String accept : accepts) {
      if (isJsonMime(accept)) {
        return accept;
      }
    }
    return StringUtil.join(accepts, ",");
  }

  /**
   * Select the Content-Type header's value from the given array:
   *   if JSON exists in the given array, use it;
   *   otherwise use the first one of the array.
   *
   * @param contentTypes The Content-Type array to select from
   * @return The Content-Type header to use. If the given array is empty,
   *   JSON will be used.
   */
  public String selectHeaderContentType(String[] contentTypes) {
    if (contentTypes.length == 0) {
      return "application/json";
    }
    for (String contentType : contentTypes) {
      if (isJsonMime(contentType)) {
        return contentType;
      }
    }
    return contentTypes[0];
  }

  /**
   * Escape the given string to be used as URL query value.
   * @param str String
   * @return Escaped string
   */
  public String escapeString(String str) {
    try {
      return URLEncoder.encode(str, "utf8").replaceAll("\\+", "%20");
    } catch (UnsupportedEncodingException e) {
      return str;
    }
  }

  /**
   * Serialize the given Java object into string entity according the given
   * Content-Type (only JSON is supported for now).
   * @param obj Object
   * @param formParams Form parameters
   * @param contentType Context type
   * @return Entity
   * @throws ApiException API exception
   */
  public Entity<?> serialize(Object obj, Map<String, Object> formParams, String contentType) throws ApiException {
    Entity<?> entity;
    if (contentType.startsWith("multipart/form-data")) {
      MultiPart multiPart = new MultiPart();
      for (Entry<String, Object> param: formParams.entrySet()) {
        if (param.getValue() instanceof File) {
          File file = (File) param.getValue();
          FormDataContentDisposition contentDisp = FormDataContentDisposition.name(param.getKey())
              .fileName(file.getName()).size(file.length()).build();
          multiPart.bodyPart(new FormDataBodyPart(contentDisp, file, MediaType.APPLICATION_OCTET_STREAM_TYPE));
        } else {
          FormDataContentDisposition contentDisp = FormDataContentDisposition.name(param.getKey()).build();
          multiPart.bodyPart(new FormDataBodyPart(contentDisp, parameterToString(param.getValue())));
        }
      }
      entity = Entity.entity(multiPart, MediaType.MULTIPART_FORM_DATA_TYPE);
    } else if (contentType.startsWith("application/x-www-form-urlencoded")) {
      Form form = new Form();
      for (Entry<String, Object> param: formParams.entrySet()) {
        form.param(param.getKey(), parameterToString(param.getValue()));
      }
      entity = Entity.entity(form, MediaType.APPLICATION_FORM_URLENCODED_TYPE);
    } else {
      // We let jersey handle the serialization
      entity = Entity.entity(obj, contentType);
    }
    return entity;
  }

  /**
   * Deserialize response body to Java object according to the Content-Type.
   * @param <T> Type
   * @param response Response
   * @param returnType Return type
   * @return Deserialize object
   * @throws ApiException API exception
   */
  @SuppressWarnings("unchecked")
  public <T> T deserialize(Response response, GenericType<T> returnType) throws ApiException {
    if (response == null || returnType == null) {
      return null;
    }

    if ("byte[]".equals(returnType.toString())) {
      // Handle binary response (byte array).
      return (T) response.readEntity(byte[].class);
    } else if (returnType.getRawType() == File.class) {
      // Handle file downloading.
      T file = (T) downloadFileFromResponse(response);
      return file;
    }

    String contentType = null;
    List<Object> contentTypes = response.getHeaders().get("Content-Type");
    if (contentTypes != null && !contentTypes.isEmpty())
      contentType = String.valueOf(contentTypes.get(0));
    if (contentType == null)
      throw new ApiException(500, "missing Content-Type in response");

    return response.readEntity(returnType);
  }

  /**
   * Download file from the given response.
   * @param response Response
   * @return File
   * @throws ApiException If fail to read file content from response and write to disk
   */
  public File downloadFileFromResponse(Response response) throws ApiException {
    try {
      File file = prepareDownloadFile(response);
      Files.copy(response.readEntity(InputStream.class), file.toPath(), StandardCopyOption.REPLACE_EXISTING);
      return file;
    } catch (IOException e) {
      throw new ApiException(e);
    }
  }

  public File prepareDownloadFile(Response response) throws IOException {
    String filename = null;
    String contentDisposition = (String) response.getHeaders().getFirst("Content-Disposition");
    if (contentDisposition != null && !"".equals(contentDisposition)) {
      // Get filename from the Content-Disposition header.
      Pattern pattern = Pattern.compile("filename=['\"]?([^'\"\\s]+)['\"]?");
      Matcher matcher = pattern.matcher(contentDisposition);
      if (matcher.find())
        filename = matcher.group(1);
    }

    String prefix;
    String suffix = null;
    if (filename == null) {
      prefix = "download-";
      suffix = "";
    } else {
      int pos = filename.lastIndexOf('.');
      if (pos == -1) {
        prefix = filename + "-";
      } else {
        prefix = filename.substring(0, pos) + "-";
        suffix = filename.substring(pos);
      }
      // File.createTempFile requires the prefix to be at least three characters long
      if (prefix.length() < 3)
        prefix = "download-";
    }

    if (tempFolderPath == null)
      return Files.createTempFile(prefix, suffix).toFile();
    else
      return Files.createTempFile(Paths.get(tempFolderPath), prefix, suffix).toFile();
  }

  /**
   * Invoke API by sending HTTP request with the given options.
   *
   * @param <T> Type
   * @param path The sub-path of the HTTP URL
   * @param method The request method, one of "GET", "POST", "PUT", "HEAD" and "DELETE"
   * @param queryParams The query parameters
   * @param body The request body object
   * @param headerParams The header parameters
   * @param formParams The form parameters
   * @param accept The request's Accept header
   * @param contentType The request's Content-Type header
   * @param authNames The authentications to apply
   * @param returnType The return type into which to deserialize the response
   * @return The response body in type of string
   * @throws ApiException API exception
   */
  public <T> T invokeAPI(String path, String method, List<Pair> queryParams, Object body, Map<String, String> headerParams, Map<String, Object> formParams, String accept, String contentType, String[] authNames, GenericType<T> returnType) throws ApiException {
    updateParamsForAuth(authNames, queryParams, headerParams);

    // Not using `.target(this.basePath).path(path)` below,
    // to support (constant) query string in `path`, e.g. "/posts?draft=1"
    WebTarget target = httpClient.target(this.basePath + path);

    if (queryParams != null) {
      for (Pair queryParam : queryParams) {
        if (queryParam.getValue() != null) {
          target = target.queryParam(queryParam.getName(), queryParam.getValue());
        }
      }
    }

    Invocation.Builder invocationBuilder = target.request();

    if (accept != null) {
    	invocationBuilder = invocationBuilder.accept(accept);
    }

    for (Entry<String, String> entry : headerParams.entrySet()) {
      String value = entry.getValue();
      if (value != null) {
        invocationBuilder = invocationBuilder.header(entry.getKey(), value);
      }
    }

    for (Entry<String, String> entry : defaultHeaderMap.entrySet()) {
      String key = entry.getKey();
      if (!headerParams.containsKey(key)) {
        String value = entry.getValue();
        if (value != null) {
          invocationBuilder = invocationBuilder.header(key, value);
        }
      }
    }

    Entity<?> entity = serialize(body, formParams, contentType);

    Response response = null;

    try {
      if ("GET".equals(method)) {
        response = invocationBuilder.get();
      } else if ("POST".equals(method)) {
        response = invocationBuilder.post(entity);
      } else if ("PUT".equals(method)) {
        response = invocationBuilder.put(entity);
      } else if ("DELETE".equals(method)) {
        response = invocationBuilder.delete();
      } else if ("PATCH".equals(method)) {
        response = invocationBuilder.method("PATCH", entity);
      } else if ("HEAD".equals(method)) {
        response = invocationBuilder.head();
      } else {
        throw new ApiException(500, "unknown method type " + method);
      }

      statusCode = response.getStatusInfo().getStatusCode();
      responseHeaders = buildResponseHeaders(response);

      if (response.getStatus() == Status.NO_CONTENT.getStatusCode()) {
        return null;
      } else if (response.getStatusInfo().getFamily() == Status.Family.SUCCESSFUL) {
        if (returnType == null)
          return null;
        else
          return deserialize(response, returnType);
      } else {
        String message = "error";
        String respBody = null;
        if (response.hasEntity()) {
          try {
            respBody = String.valueOf(response.readEntity(String.class));
            message = respBody;
          } catch (RuntimeException e) {
            // e.printStackTrace();
          }
        }
        throw new ApiException(
          response.getStatus(),
          message,
          buildResponseHeaders(response),
          respBody);
      }
    } finally {
      try {
        response.close();
      } catch (Exception e) {
        // it's not critical, since the response object is local in method invokeAPI; that's fine, just continue
      }
    }
  }

  /**
   * Build the Client used to make HTTP requests.
   * @param debugging Debug setting
   * @return Client
   */
  protected Client buildHttpClient(boolean debugging) {
    final ClientConfig clientConfig = new ClientConfig();
    clientConfig.register(MultiPartFeature.class);
    clientConfig.register(json);
    clientConfig.register(JacksonFeature.class);
    clientConfig.property(HttpUrlConnectorProvider.SET_METHOD_WORKAROUND, true);
    if (debugging) {
      clientConfig.register(new LoggingFeature(java.util.logging.Logger.getLogger(LoggingFeature.DEFAULT_LOGGER_NAME), java.util.logging.Level.INFO, LoggingFeature.Verbosity.PAYLOAD_ANY, 1024*50 /* Log payloads up to 50K */));
      clientConfig.property(LoggingFeature.LOGGING_FEATURE_VERBOSITY, LoggingFeature.Verbosity.PAYLOAD_ANY);
      // Set logger to ALL
      java.util.logging.Logger.getLogger(LoggingFeature.DEFAULT_LOGGER_NAME).setLevel(java.util.logging.Level.ALL);
    }
    performAdditionalClientConfiguration(clientConfig);
    ClientBuilder clientBuilder = ClientBuilder.newBuilder().withConfig(clientConfig);
    if (sslContext != null) {
      clientBuilder.sslContext(sslContext);
    }
    if (hostnameVerifier != null) {
      clientBuilder.hostnameVerifier(hostnameVerifier);
    }
    return clientBuilder.build();
  }

  protected void performAdditionalClientConfiguration(ClientConfig clientConfig) {
    // No-op extension point
  }

  protected Map<String, List<String>> buildResponseHeaders(Response response) {
    Map<String, List<String>> responseHeaders = new HashMap<String, List<String>>();
    for (Entry<String, List<Object>> entry: response.getHeaders().entrySet()) {
      List<Object> values = entry.getValue();
      List<String> headers = new ArrayList<String>();
      for (Object o : values) {
        headers.add(String.valueOf(o));
      }
      responseHeaders.put(entry.getKey(), headers);
    }
    return responseHeaders;
  }

  /**
   * Update query and header parameters based on authentication settings.
   *
   * @param authNames The authentications to apply
   */
  protected void updateParamsForAuth(String[] authNames, List<Pair> queryParams, Map<String, String> headerParams) {
    for (String authName : authNames) {
      Authentication auth = authentications.get(authName);
      if (auth == null) throw new RuntimeException("Authentication undefined: " + authName);
      auth.applyToParams(queryParams, headerParams);
    }
  }
}
