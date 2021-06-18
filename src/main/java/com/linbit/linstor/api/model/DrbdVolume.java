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
import com.linbit.linstor.api.model.DrbdVolumeDefinition;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * DrbdVolume
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-18T05:15:14.614Z[GMT]")
public class DrbdVolume implements OneOfVolumeLayerData {
  @JsonProperty("drbd_volume_definition")
  private DrbdVolumeDefinition drbdVolumeDefinition = null;

  @JsonProperty("device_path")
  private String devicePath = null;

  @JsonProperty("backing_device")
  private String backingDevice = null;

  @JsonProperty("meta_disk")
  private String metaDisk = null;

  @JsonProperty("allocated_size_kib")
  private Long allocatedSizeKib = null;

  @JsonProperty("usable_size_kib")
  private Long usableSizeKib = null;

  @JsonProperty("disk_state")
  private String diskState = null;

  @JsonProperty("ext_meta_stor_pool")
  private String extMetaStorPool = null;

  public DrbdVolume drbdVolumeDefinition(DrbdVolumeDefinition drbdVolumeDefinition) {
    this.drbdVolumeDefinition = drbdVolumeDefinition;
    return this;
  }

   /**
   * Get drbdVolumeDefinition
   * @return drbdVolumeDefinition
  **/
  @Schema(description = "")
  public DrbdVolumeDefinition getDrbdVolumeDefinition() {
    return drbdVolumeDefinition;
  }

  public void setDrbdVolumeDefinition(DrbdVolumeDefinition drbdVolumeDefinition) {
    this.drbdVolumeDefinition = drbdVolumeDefinition;
  }

  public DrbdVolume devicePath(String devicePath) {
    this.devicePath = devicePath;
    return this;
  }

   /**
   * drbd device path e.g. &#x27;/dev/drbd1000&#x27;
   * @return devicePath
  **/
  @Schema(description = "drbd device path e.g. '/dev/drbd1000'")
  public String getDevicePath() {
    return devicePath;
  }

  public void setDevicePath(String devicePath) {
    this.devicePath = devicePath;
  }

  public DrbdVolume backingDevice(String backingDevice) {
    this.backingDevice = backingDevice;
    return this;
  }

   /**
   * block device used by drbd
   * @return backingDevice
  **/
  @Schema(description = "block device used by drbd")
  public String getBackingDevice() {
    return backingDevice;
  }

  public void setBackingDevice(String backingDevice) {
    this.backingDevice = backingDevice;
  }

  public DrbdVolume metaDisk(String metaDisk) {
    this.metaDisk = metaDisk;
    return this;
  }

   /**
   * Get metaDisk
   * @return metaDisk
  **/
  @Schema(description = "")
  public String getMetaDisk() {
    return metaDisk;
  }

  public void setMetaDisk(String metaDisk) {
    this.metaDisk = metaDisk;
  }

  public DrbdVolume allocatedSizeKib(Long allocatedSizeKib) {
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

  public DrbdVolume usableSizeKib(Long usableSizeKib) {
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

  public DrbdVolume diskState(String diskState) {
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

  public DrbdVolume extMetaStorPool(String extMetaStorPool) {
    this.extMetaStorPool = extMetaStorPool;
    return this;
  }

   /**
   * Storage pool name used for external meta data; null for internal
   * @return extMetaStorPool
  **/
  @Schema(description = "Storage pool name used for external meta data; null for internal")
  public String getExtMetaStorPool() {
    return extMetaStorPool;
  }

  public void setExtMetaStorPool(String extMetaStorPool) {
    this.extMetaStorPool = extMetaStorPool;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DrbdVolume drbdVolume = (DrbdVolume) o;
    return Objects.equals(this.drbdVolumeDefinition, drbdVolume.drbdVolumeDefinition) &&
        Objects.equals(this.devicePath, drbdVolume.devicePath) &&
        Objects.equals(this.backingDevice, drbdVolume.backingDevice) &&
        Objects.equals(this.metaDisk, drbdVolume.metaDisk) &&
        Objects.equals(this.allocatedSizeKib, drbdVolume.allocatedSizeKib) &&
        Objects.equals(this.usableSizeKib, drbdVolume.usableSizeKib) &&
        Objects.equals(this.diskState, drbdVolume.diskState) &&
        Objects.equals(this.extMetaStorPool, drbdVolume.extMetaStorPool);
  }

  @Override
  public int hashCode() {
    return Objects.hash(drbdVolumeDefinition, devicePath, backingDevice, metaDisk, allocatedSizeKib, usableSizeKib, diskState, extMetaStorPool);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrbdVolume {\n");
    
    sb.append("    drbdVolumeDefinition: ").append(toIndentedString(drbdVolumeDefinition)).append("\n");
    sb.append("    devicePath: ").append(toIndentedString(devicePath)).append("\n");
    sb.append("    backingDevice: ").append(toIndentedString(backingDevice)).append("\n");
    sb.append("    metaDisk: ").append(toIndentedString(metaDisk)).append("\n");
    sb.append("    allocatedSizeKib: ").append(toIndentedString(allocatedSizeKib)).append("\n");
    sb.append("    usableSizeKib: ").append(toIndentedString(usableSizeKib)).append("\n");
    sb.append("    diskState: ").append(toIndentedString(diskState)).append("\n");
    sb.append("    extMetaStorPool: ").append(toIndentedString(extMetaStorPool)).append("\n");
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
