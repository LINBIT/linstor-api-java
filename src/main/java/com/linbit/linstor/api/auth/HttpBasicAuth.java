/*
 * Linstor REST API
 *
 *
 * OpenAPI spec version: 1.25.1
 * Contact: rene.peinthor@linbit.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.linbit.linstor.api.auth;

import com.linbit.linstor.api.Pair;

import java.util.Base64;
import java.nio.charset.StandardCharsets;

import java.util.Map;
import java.util.List;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-05-08T11:58:50.875992750Z[Etc/UTC]")
public class HttpBasicAuth implements Authentication {
  private String username;
  private String password;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) {
    if (username == null && password == null) {
      return;
    }
    String str = (username == null ? "" : username) + ":" + (password == null ? "" : password);
    headerParams.put("Authorization", "Basic " + Base64.getEncoder().encodeToString(str.getBytes(StandardCharsets.UTF_8)));
  }
}
