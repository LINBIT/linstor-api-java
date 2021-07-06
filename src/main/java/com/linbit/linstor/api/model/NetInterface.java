/*
 * Linstor REST API
 *
 *
 * OpenAPI spec version: 1.8.0
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
 * NetInterface
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-18T05:15:14.614Z[GMT]")
public class NetInterface {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("address")
  private String address = null;

  @JsonProperty("satellite_port")
  private Integer satellitePort = null;

  /**
   * Gets or Sets satelliteEncryptionType
   */
  public enum SatelliteEncryptionTypeEnum {
    PLAIN("Plain"),
    SSL("SSL");

    private String value;

    SatelliteEncryptionTypeEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static SatelliteEncryptionTypeEnum fromValue(String text) {
      for (SatelliteEncryptionTypeEnum b : SatelliteEncryptionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("satellite_encryption_type")
  private SatelliteEncryptionTypeEnum satelliteEncryptionType = null;

  @JsonProperty("is_active")
  private Boolean isActive = null;

  @JsonProperty("uuid")
  private String uuid = null;

  public NetInterface name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(example = "default", required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NetInterface address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @Schema(example = "10.0.0.2", required = true, description = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public NetInterface satellitePort(Integer satellitePort) {
    this.satellitePort = satellitePort;
    return this;
  }

   /**
   * Get satellitePort
   * @return satellitePort
  **/
  @Schema(example = "3366", description = "")
  public Integer getSatellitePort() {
    return satellitePort;
  }

  public void setSatellitePort(Integer satellitePort) {
    this.satellitePort = satellitePort;
  }

  public NetInterface satelliteEncryptionType(SatelliteEncryptionTypeEnum satelliteEncryptionType) {
    this.satelliteEncryptionType = satelliteEncryptionType;
    return this;
  }

   /**
   * Get satelliteEncryptionType
   * @return satelliteEncryptionType
  **/
  @Schema(example = "Plain", description = "")
  public SatelliteEncryptionTypeEnum getSatelliteEncryptionType() {
    return satelliteEncryptionType;
  }

  public void setSatelliteEncryptionType(SatelliteEncryptionTypeEnum satelliteEncryptionType) {
    this.satelliteEncryptionType = satelliteEncryptionType;
  }

  public NetInterface isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Defines if this netinterface should be used for the satellite connection
   * @return isActive
  **/
  @Schema(description = "Defines if this netinterface should be used for the satellite connection")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public NetInterface uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * unique object id
   * @return uuid
  **/
  @Schema(example = "e8ef8d6b-17bc-42f0-9367-4aae40c78ecb", description = "unique object id")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetInterface netInterface = (NetInterface) o;
    return Objects.equals(this.name, netInterface.name) &&
        Objects.equals(this.address, netInterface.address) &&
        Objects.equals(this.satellitePort, netInterface.satellitePort) &&
        Objects.equals(this.satelliteEncryptionType, netInterface.satelliteEncryptionType) &&
        Objects.equals(this.isActive, netInterface.isActive) &&
        Objects.equals(this.uuid, netInterface.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, address, satellitePort, satelliteEncryptionType, isActive, uuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetInterface {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    satellitePort: ").append(toIndentedString(satellitePort)).append("\n");
    sb.append("    satelliteEncryptionType: ").append(toIndentedString(satelliteEncryptionType)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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