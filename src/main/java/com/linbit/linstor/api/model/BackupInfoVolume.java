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
import com.linbit.linstor.api.model.LayerType;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * BackupInfoVolume
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-05-08T11:58:50.875992750Z[Etc/UTC]")

public class BackupInfoVolume {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("layer_type")
  private LayerType layerType = null;

  @JsonProperty("dl_size_kib")
  private Long dlSizeKib = null;

  @JsonProperty("alloc_size_kib")
  private Long allocSizeKib = null;

  @JsonProperty("usable_size_kib")
  private Long usableSizeKib = null;

  public BackupInfoVolume name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BackupInfoVolume layerType(LayerType layerType) {
    this.layerType = layerType;
    return this;
  }

   /**
   * Get layerType
   * @return layerType
  **/
  @Schema(required = true, description = "")
  public LayerType getLayerType() {
    return layerType;
  }

  public void setLayerType(LayerType layerType) {
    this.layerType = layerType;
  }

  public BackupInfoVolume dlSizeKib(Long dlSizeKib) {
    this.dlSizeKib = dlSizeKib;
    return this;
  }

   /**
   * Get dlSizeKib
   * @return dlSizeKib
  **/
  @Schema(description = "")
  public Long getDlSizeKib() {
    return dlSizeKib;
  }

  public void setDlSizeKib(Long dlSizeKib) {
    this.dlSizeKib = dlSizeKib;
  }

  public BackupInfoVolume allocSizeKib(Long allocSizeKib) {
    this.allocSizeKib = allocSizeKib;
    return this;
  }

   /**
   * Get allocSizeKib
   * @return allocSizeKib
  **/
  @Schema(description = "")
  public Long getAllocSizeKib() {
    return allocSizeKib;
  }

  public void setAllocSizeKib(Long allocSizeKib) {
    this.allocSizeKib = allocSizeKib;
  }

  public BackupInfoVolume usableSizeKib(Long usableSizeKib) {
    this.usableSizeKib = usableSizeKib;
    return this;
  }

   /**
   * Get usableSizeKib
   * @return usableSizeKib
  **/
  @Schema(description = "")
  public Long getUsableSizeKib() {
    return usableSizeKib;
  }

  public void setUsableSizeKib(Long usableSizeKib) {
    this.usableSizeKib = usableSizeKib;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupInfoVolume backupInfoVolume = (BackupInfoVolume) o;
    return Objects.equals(this.name, backupInfoVolume.name) &&
        Objects.equals(this.layerType, backupInfoVolume.layerType) &&
        Objects.equals(this.dlSizeKib, backupInfoVolume.dlSizeKib) &&
        Objects.equals(this.allocSizeKib, backupInfoVolume.allocSizeKib) &&
        Objects.equals(this.usableSizeKib, backupInfoVolume.usableSizeKib);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, layerType, dlSizeKib, allocSizeKib, usableSizeKib);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupInfoVolume {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    layerType: ").append(toIndentedString(layerType)).append("\n");
    sb.append("    dlSizeKib: ").append(toIndentedString(dlSizeKib)).append("\n");
    sb.append("    allocSizeKib: ").append(toIndentedString(allocSizeKib)).append("\n");
    sb.append("    usableSizeKib: ").append(toIndentedString(usableSizeKib)).append("\n");
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
