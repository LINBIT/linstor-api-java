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

package com.linbit.linstor.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * SatelliteConfigNet
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-05-08T11:58:50.875992750Z[Etc/UTC]")

public class SatelliteConfigNet {
  @JsonProperty("bind_address")
  private String bindAddress = null;

  @JsonProperty("port")
  private Integer port = null;

  @JsonProperty("com_type")
  private String comType = null;

  public SatelliteConfigNet bindAddress(String bindAddress) {
    this.bindAddress = bindAddress;
    return this;
  }

   /**
   * Get bindAddress
   * @return bindAddress
  **/
  @Schema(description = "")
  public String getBindAddress() {
    return bindAddress;
  }

  public void setBindAddress(String bindAddress) {
    this.bindAddress = bindAddress;
  }

  public SatelliteConfigNet port(Integer port) {
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

  public SatelliteConfigNet comType(String comType) {
    this.comType = comType;
    return this;
  }

   /**
   * Get comType
   * @return comType
  **/
  @Schema(description = "")
  public String getComType() {
    return comType;
  }

  public void setComType(String comType) {
    this.comType = comType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SatelliteConfigNet satelliteConfigNet = (SatelliteConfigNet) o;
    return Objects.equals(this.bindAddress, satelliteConfigNet.bindAddress) &&
        Objects.equals(this.port, satelliteConfigNet.port) &&
        Objects.equals(this.comType, satelliteConfigNet.comType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bindAddress, port, comType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SatelliteConfigNet {\n");
    
    sb.append("    bindAddress: ").append(toIndentedString(bindAddress)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    comType: ").append(toIndentedString(comType)).append("\n");
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
