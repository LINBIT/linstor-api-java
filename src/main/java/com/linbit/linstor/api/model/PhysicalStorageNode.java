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
 * PhysicalStorageNode
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-05-08T11:58:50.875992750Z[Etc/UTC]")

public class PhysicalStorageNode {
  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("rotational")
  private Boolean rotational = null;

  @JsonProperty("device")
  private String device = null;

  @JsonProperty("model")
  private String model = null;

  @JsonProperty("serial")
  private String serial = null;

  @JsonProperty("wwn")
  private String wwn = null;

  public PhysicalStorageNode size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @Schema(description = "")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public PhysicalStorageNode rotational(Boolean rotational) {
    this.rotational = rotational;
    return this;
  }

   /**
   * Get rotational
   * @return rotational
  **/
  @Schema(description = "")
  public Boolean isRotational() {
    return rotational;
  }

  public void setRotational(Boolean rotational) {
    this.rotational = rotational;
  }

  public PhysicalStorageNode device(String device) {
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

  public PhysicalStorageNode model(String model) {
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

  public PhysicalStorageNode serial(String serial) {
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

  public PhysicalStorageNode wwn(String wwn) {
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
    PhysicalStorageNode physicalStorageNode = (PhysicalStorageNode) o;
    return Objects.equals(this.size, physicalStorageNode.size) &&
        Objects.equals(this.rotational, physicalStorageNode.rotational) &&
        Objects.equals(this.device, physicalStorageNode.device) &&
        Objects.equals(this.model, physicalStorageNode.model) &&
        Objects.equals(this.serial, physicalStorageNode.serial) &&
        Objects.equals(this.wwn, physicalStorageNode.wwn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, rotational, device, model, serial, wwn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhysicalStorageNode {\n");
    
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    rotational: ").append(toIndentedString(rotational)).append("\n");
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
