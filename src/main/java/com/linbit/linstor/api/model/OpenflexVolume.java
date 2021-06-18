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
 * OpenflexVolume
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-18T05:15:14.614Z[GMT]")
public class OpenflexVolume {
  @JsonProperty("volume_number")
  private Integer volumeNumber = null;

  @JsonProperty("device_path")
  private String devicePath = null;

  @JsonProperty("allocated_size_kib")
  private Long allocatedSizeKib = null;

  @JsonProperty("usable_size_kib")
  private Long usableSizeKib = null;

  @JsonProperty("disk_state")
  private String diskState = null;

  public OpenflexVolume volumeNumber(Integer volumeNumber) {
    this.volumeNumber = volumeNumber;
    return this;
  }

   /**
   * Get volumeNumber
   * @return volumeNumber
  **/
  @Schema(description = "")
  public Integer getVolumeNumber() {
    return volumeNumber;
  }

  public void setVolumeNumber(Integer volumeNumber) {
    this.volumeNumber = volumeNumber;
  }

  public OpenflexVolume devicePath(String devicePath) {
    this.devicePath = devicePath;
    return this;
  }

   /**
   * block device path
   * @return devicePath
  **/
  @Schema(description = "block device path")
  public String getDevicePath() {
    return devicePath;
  }

  public void setDevicePath(String devicePath) {
    this.devicePath = devicePath;
  }

  public OpenflexVolume allocatedSizeKib(Long allocatedSizeKib) {
    this.allocatedSizeKib = allocatedSizeKib;
    return this;
  }

   /**
   * Get allocatedSizeKib
   * @return allocatedSizeKib
  **/
  @Schema(description = "")
  public Long getAllocatedSizeKib() {
    return allocatedSizeKib;
  }

  public void setAllocatedSizeKib(Long allocatedSizeKib) {
    this.allocatedSizeKib = allocatedSizeKib;
  }

  public OpenflexVolume usableSizeKib(Long usableSizeKib) {
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

  public OpenflexVolume diskState(String diskState) {
    this.diskState = diskState;
    return this;
  }

   /**
   * String describing current volume state
   * @return diskState
  **/
  @Schema(description = "String describing current volume state")
  public String getDiskState() {
    return diskState;
  }

  public void setDiskState(String diskState) {
    this.diskState = diskState;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenflexVolume openflexVolume = (OpenflexVolume) o;
    return Objects.equals(this.volumeNumber, openflexVolume.volumeNumber) &&
        Objects.equals(this.devicePath, openflexVolume.devicePath) &&
        Objects.equals(this.allocatedSizeKib, openflexVolume.allocatedSizeKib) &&
        Objects.equals(this.usableSizeKib, openflexVolume.usableSizeKib) &&
        Objects.equals(this.diskState, openflexVolume.diskState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volumeNumber, devicePath, allocatedSizeKib, usableSizeKib, diskState);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenflexVolume {\n");
    
    sb.append("    volumeNumber: ").append(toIndentedString(volumeNumber)).append("\n");
    sb.append("    devicePath: ").append(toIndentedString(devicePath)).append("\n");
    sb.append("    allocatedSizeKib: ").append(toIndentedString(allocatedSizeKib)).append("\n");
    sb.append("    usableSizeKib: ").append(toIndentedString(usableSizeKib)).append("\n");
    sb.append("    diskState: ").append(toIndentedString(diskState)).append("\n");
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
