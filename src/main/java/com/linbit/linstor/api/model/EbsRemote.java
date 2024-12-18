/*
 * Linstor REST API
 *
 *
 * OpenAPI spec version: 1.24.0
 * Contact: rene.peinthor@linbit.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.linbit.linstor.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * EbsRemote
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-18T06:34:31.141535853Z[Etc/UTC]")

public class EbsRemote {
  @JsonProperty("remote_name")
  private String remoteName = null;

  @JsonProperty("endpoint")
  private String endpoint = null;

  @JsonProperty("region")
  private String region = null;

  @JsonProperty("availability_zone")
  private String availabilityZone = null;

  @JsonProperty("access_key")
  private String accessKey = null;

  @JsonProperty("secret_key")
  private String secretKey = null;

  public EbsRemote remoteName(String remoteName) {
    this.remoteName = remoteName;
    return this;
  }

   /**
   * Get remoteName
   * @return remoteName
  **/
  @Schema(description = "")
  public String getRemoteName() {
    return remoteName;
  }

  public void setRemoteName(String remoteName) {
    this.remoteName = remoteName;
  }

  public EbsRemote endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

   /**
   * Get endpoint
   * @return endpoint
  **/
  @Schema(description = "")
  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public EbsRemote region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @Schema(description = "")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public EbsRemote availabilityZone(String availabilityZone) {
    this.availabilityZone = availabilityZone;
    return this;
  }

   /**
   * Get availabilityZone
   * @return availabilityZone
  **/
  @Schema(description = "")
  public String getAvailabilityZone() {
    return availabilityZone;
  }

  public void setAvailabilityZone(String availabilityZone) {
    this.availabilityZone = availabilityZone;
  }

  public EbsRemote accessKey(String accessKey) {
    this.accessKey = accessKey;
    return this;
  }

   /**
   * Get accessKey
   * @return accessKey
  **/
  @Schema(description = "")
  public String getAccessKey() {
    return accessKey;
  }

  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }

  public EbsRemote secretKey(String secretKey) {
    this.secretKey = secretKey;
    return this;
  }

   /**
   * Get secretKey
   * @return secretKey
  **/
  @Schema(description = "")
  public String getSecretKey() {
    return secretKey;
  }

  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EbsRemote ebsRemote = (EbsRemote) o;
    return Objects.equals(this.remoteName, ebsRemote.remoteName) &&
        Objects.equals(this.endpoint, ebsRemote.endpoint) &&
        Objects.equals(this.region, ebsRemote.region) &&
        Objects.equals(this.availabilityZone, ebsRemote.availabilityZone) &&
        Objects.equals(this.accessKey, ebsRemote.accessKey) &&
        Objects.equals(this.secretKey, ebsRemote.secretKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(remoteName, endpoint, region, availabilityZone, accessKey, secretKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EbsRemote {\n");
    
    sb.append("    remoteName: ").append(toIndentedString(remoteName)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
