/*
 * Linstor REST API
 *
 *
 * OpenAPI spec version: 1.20.1
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
 * PhysicalStorageDevice
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-03T09:13:01.489Z[GMT]")

public class PhysicalStorageDevice {
  @JsonProperty("device")
  private String device = null;

  @JsonProperty("model")
  private String model = null;

  @JsonProperty("serial")
  private String serial = null;

  @JsonProperty("wwn")
  private String wwn = null;

  public PhysicalStorageDevice device(String device) {
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  @Schema(description = "")
  public String getDevice() {
    return device;
  }

  public void setDevice(String device) {
    this.device = device;
  }

  public PhysicalStorageDevice model(String model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @Schema(description = "")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public PhysicalStorageDevice serial(String serial) {
    this.serial = serial;
    return this;
  }

   /**
   * Get serial
   * @return serial
  **/
  @Schema(description = "")
  public String getSerial() {
    return serial;
  }

  public void setSerial(String serial) {
    this.serial = serial;
  }

  public PhysicalStorageDevice wwn(String wwn) {
    this.wwn = wwn;
    return this;
  }

   /**
   * Get wwn
   * @return wwn
  **/
  @Schema(description = "")
  public String getWwn() {
    return wwn;
  }

  public void setWwn(String wwn) {
    this.wwn = wwn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhysicalStorageDevice physicalStorageDevice = (PhysicalStorageDevice) o;
    return Objects.equals(this.device, physicalStorageDevice.device) &&
        Objects.equals(this.model, physicalStorageDevice.model) &&
        Objects.equals(this.serial, physicalStorageDevice.serial) &&
        Objects.equals(this.wwn, physicalStorageDevice.wwn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(device, model, serial, wwn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhysicalStorageDevice {\n");
    
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
    sb.append("    wwn: ").append(toIndentedString(wwn)).append("\n");
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
