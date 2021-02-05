/*
 * Linstor REST API
 *
 *
 * OpenAPI spec version: 1.6.0
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
 * ControllerConfigHttps
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-02-05T10:27:33.226Z[GMT]")
public class ControllerConfigHttps {
  @JsonProperty("enabled")
  private Boolean enabled = null;

  @JsonProperty("listen_address")
  private String listenAddress = null;

  @JsonProperty("port")
  private Integer port = null;

  public ControllerConfigHttps enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @Schema(description = "")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public ControllerConfigHttps listenAddress(String listenAddress) {
    this.listenAddress = listenAddress;
    return this;
  }

   /**
   * Get listenAddress
   * @return listenAddress
  **/
  @Schema(description = "")
  public String getListenAddress() {
    return listenAddress;
  }

  public void setListenAddress(String listenAddress) {
    this.listenAddress = listenAddress;
  }

  public ControllerConfigHttps port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @Schema(description = "")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControllerConfigHttps controllerConfigHttps = (ControllerConfigHttps) o;
    return Objects.equals(this.enabled, controllerConfigHttps.enabled) &&
        Objects.equals(this.listenAddress, controllerConfigHttps.listenAddress) &&
        Objects.equals(this.port, controllerConfigHttps.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, listenAddress, port);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControllerConfigHttps {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    listenAddress: ").append(toIndentedString(listenAddress)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
