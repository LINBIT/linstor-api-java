/*
 * Linstor REST API
 *
 *
 * OpenAPI spec version: 1.22.0
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
import com.linbit.linstor.api.model.ApiCallRc;
import com.linbit.linstor.api.model.Properties;
import com.linbit.linstor.api.model.ProviderKind;
import com.linbit.linstor.api.model.VolumeLayer;
import com.linbit.linstor.api.model.VolumeState;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * Volume
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-02T13:40:09.628252133Z[Etc/UTC]")

public class Volume {
  @JsonProperty("volume_number")
  private Integer volumeNumber = null;

  @JsonProperty("storage_pool_name")
  private String storagePoolName = null;

  @JsonProperty("provider_kind")
  private ProviderKind providerKind = null;

  @JsonProperty("device_path")
  private String devicePath = null;

  @JsonProperty("allocated_size_kib")
  private Long allocatedSizeKib = null;

  @JsonProperty("usable_size_kib")
  private Long usableSizeKib = null;

  @JsonProperty("props")
  private Properties props = null;

  @JsonProperty("flags")
  private List<String> flags = null;

  @JsonProperty("state")
  private VolumeState state = null;

  @JsonProperty("layer_data_list")
  private List<VolumeLayer> layerDataList = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("reports")
  private List<ApiCallRc> reports = null;

  public Volume volumeNumber(Integer volumeNumber) {
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

  public Volume storagePoolName(String storagePoolName) {
    this.storagePoolName = storagePoolName;
    return this;
  }

   /**
   * Get storagePoolName
   * @return storagePoolName
  **/
  @Schema(description = "")
  public String getStoragePoolName() {
    return storagePoolName;
  }

  public void setStoragePoolName(String storagePoolName) {
    this.storagePoolName = storagePoolName;
  }

  public Volume providerKind(ProviderKind providerKind) {
    this.providerKind = providerKind;
    return this;
  }

   /**
   * Get providerKind
   * @return providerKind
  **/
  @Schema(description = "")
  public ProviderKind getProviderKind() {
    return providerKind;
  }

  public void setProviderKind(ProviderKind providerKind) {
    this.providerKind = providerKind;
  }

  public Volume devicePath(String devicePath) {
    this.devicePath = devicePath;
    return this;
  }

   /**
   * Get devicePath
   * @return devicePath
  **/
  @Schema(description = "")
  public String getDevicePath() {
    return devicePath;
  }

  public void setDevicePath(String devicePath) {
    this.devicePath = devicePath;
  }

  public Volume allocatedSizeKib(Long allocatedSizeKib) {
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

  public Volume usableSizeKib(Long usableSizeKib) {
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

  public Volume props(Properties props) {
    this.props = props;
    return this;
  }

   /**
   * Get props
   * @return props
  **/
  @Schema(description = "")
  public Properties getProps() {
    return props;
  }

  public void setProps(Properties props) {
    this.props = props;
  }

  public Volume flags(List<String> flags) {
    this.flags = flags;
    return this;
  }

  public Volume addFlagsItem(String flagsItem) {
    if (this.flags == null) {
      this.flags = new ArrayList<>();
    }
    this.flags.add(flagsItem);
    return this;
  }

   /**
   * Get flags
   * @return flags
  **/
  @Schema(description = "")
  public List<String> getFlags() {
    return flags;
  }

  public void setFlags(List<String> flags) {
    this.flags = flags;
  }

  public Volume state(VolumeState state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @Schema(description = "")
  public VolumeState getState() {
    return state;
  }

  public void setState(VolumeState state) {
    this.state = state;
  }

  public Volume layerDataList(List<VolumeLayer> layerDataList) {
    this.layerDataList = layerDataList;
    return this;
  }

  public Volume addLayerDataListItem(VolumeLayer layerDataListItem) {
    if (this.layerDataList == null) {
      this.layerDataList = new ArrayList<>();
    }
    this.layerDataList.add(layerDataListItem);
    return this;
  }

   /**
   * Get layerDataList
   * @return layerDataList
  **/
  @Schema(description = "")
  public List<VolumeLayer> getLayerDataList() {
    return layerDataList;
  }

  public void setLayerDataList(List<VolumeLayer> layerDataList) {
    this.layerDataList = layerDataList;
  }

  public Volume uuid(String uuid) {
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

  public Volume reports(List<ApiCallRc> reports) {
    this.reports = reports;
    return this;
  }

  public Volume addReportsItem(ApiCallRc reportsItem) {
    if (this.reports == null) {
      this.reports = new ArrayList<>();
    }
    this.reports.add(reportsItem);
    return this;
  }

   /**
   * Get reports
   * @return reports
  **/
  @Schema(description = "")
  public List<ApiCallRc> getReports() {
    return reports;
  }

  public void setReports(List<ApiCallRc> reports) {
    this.reports = reports;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Volume volume = (Volume) o;
    return Objects.equals(this.volumeNumber, volume.volumeNumber) &&
        Objects.equals(this.storagePoolName, volume.storagePoolName) &&
        Objects.equals(this.providerKind, volume.providerKind) &&
        Objects.equals(this.devicePath, volume.devicePath) &&
        Objects.equals(this.allocatedSizeKib, volume.allocatedSizeKib) &&
        Objects.equals(this.usableSizeKib, volume.usableSizeKib) &&
        Objects.equals(this.props, volume.props) &&
        Objects.equals(this.flags, volume.flags) &&
        Objects.equals(this.state, volume.state) &&
        Objects.equals(this.layerDataList, volume.layerDataList) &&
        Objects.equals(this.uuid, volume.uuid) &&
        Objects.equals(this.reports, volume.reports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volumeNumber, storagePoolName, providerKind, devicePath, allocatedSizeKib, usableSizeKib, props, flags, state, layerDataList, uuid, reports);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Volume {\n");
    
    sb.append("    volumeNumber: ").append(toIndentedString(volumeNumber)).append("\n");
    sb.append("    storagePoolName: ").append(toIndentedString(storagePoolName)).append("\n");
    sb.append("    providerKind: ").append(toIndentedString(providerKind)).append("\n");
    sb.append("    devicePath: ").append(toIndentedString(devicePath)).append("\n");
    sb.append("    allocatedSizeKib: ").append(toIndentedString(allocatedSizeKib)).append("\n");
    sb.append("    usableSizeKib: ").append(toIndentedString(usableSizeKib)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    layerDataList: ").append(toIndentedString(layerDataList)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    reports: ").append(toIndentedString(reports)).append("\n");
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
