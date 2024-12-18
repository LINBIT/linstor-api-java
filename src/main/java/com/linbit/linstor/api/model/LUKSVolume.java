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
 * LUKSVolume
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-18T06:34:31.141535853Z[Etc/UTC]")

public class LUKSVolume implements OneOfVolumeLayerData {
  @JsonProperty("volume_number")
  private Integer volumeNumber = null;

  @JsonProperty("device_path")
  private String devicePath = null;

  @JsonProperty("backing_device")
  private String backingDevice = null;

  @JsonProperty("allocated_size_kib")
  private Long allocatedSizeKib = null;

  @JsonProperty("usable_size_kib")
  private Long usableSizeKib = null;

  @JsonProperty("disk_state")
  private String diskState = null;

  @JsonProperty("opened")
  private Boolean opened = null;

  public LUKSVolume volumeNumber(Integer volumeNumber) {
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

  public LUKSVolume devicePath(String devicePath) {
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

  public LUKSVolume backingDevice(String backingDevice) {
    this.backingDevice = backingDevice;
    return this;
  }

   /**
   * block device used by luks
   * @return backingDevice
  **/
  @Schema(description = "block device used by luks")
  public String getBackingDevice() {
    return backingDevice;
  }

  public void setBackingDevice(String backingDevice) {
    this.backingDevice = backingDevice;
  }

  public LUKSVolume allocatedSizeKib(Long allocatedSizeKib) {
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

  public LUKSVolume usableSizeKib(Long usableSizeKib) {
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

  public LUKSVolume diskState(String diskState) {
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

  public LUKSVolume opened(Boolean opened) {
    this.opened = opened;
    return this;
  }

   /**
   * Get opened
   * @return opened
  **/
  @Schema(description = "")
  public Boolean isOpened() {
    return opened;
  }

  public void setOpened(Boolean opened) {
    this.opened = opened;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LUKSVolume luKSVolume = (LUKSVolume) o;
    return Objects.equals(this.volumeNumber, luKSVolume.volumeNumber) &&
        Objects.equals(this.devicePath, luKSVolume.devicePath) &&
        Objects.equals(this.backingDevice, luKSVolume.backingDevice) &&
        Objects.equals(this.allocatedSizeKib, luKSVolume.allocatedSizeKib) &&
        Objects.equals(this.usableSizeKib, luKSVolume.usableSizeKib) &&
        Objects.equals(this.diskState, luKSVolume.diskState) &&
        Objects.equals(this.opened, luKSVolume.opened);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volumeNumber, devicePath, backingDevice, allocatedSizeKib, usableSizeKib, diskState, opened);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LUKSVolume {\n");
    
    sb.append("    volumeNumber: ").append(toIndentedString(volumeNumber)).append("\n");
    sb.append("    devicePath: ").append(toIndentedString(devicePath)).append("\n");
    sb.append("    backingDevice: ").append(toIndentedString(backingDevice)).append("\n");
    sb.append("    allocatedSizeKib: ").append(toIndentedString(allocatedSizeKib)).append("\n");
    sb.append("    usableSizeKib: ").append(toIndentedString(usableSizeKib)).append("\n");
    sb.append("    diskState: ").append(toIndentedString(diskState)).append("\n");
    sb.append("    opened: ").append(toIndentedString(opened)).append("\n");
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
