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
import com.linbit.linstor.api.model.Properties;
import com.linbit.linstor.api.model.VolumeDefinitionLayer;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * VolumeDefinition
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-18T05:15:14.614Z[GMT]")
public class VolumeDefinition {
  @JsonProperty("volume_number")
  private Integer volumeNumber = null;

  @JsonProperty("size_kib")
  private Long sizeKib = null;

  @JsonProperty("props")
  private Properties props = null;

  @JsonProperty("flags")
  private List<String> flags = null;

  @JsonProperty("layer_data")
  private List<VolumeDefinitionLayer> layerData = null;

  @JsonProperty("uuid")
  private String uuid = null;

  public VolumeDefinition volumeNumber(Integer volumeNumber) {
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

  public VolumeDefinition sizeKib(Long sizeKib) {
    this.sizeKib = sizeKib;
    return this;
  }

   /**
   * Size of the volume in Kibi.
   * @return sizeKib
  **/
  @Schema(required = true, description = "Size of the volume in Kibi.")
  public Long getSizeKib() {
    return sizeKib;
  }

  public void setSizeKib(Long sizeKib) {
    this.sizeKib = sizeKib;
  }

  public VolumeDefinition props(Properties props) {
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

  public VolumeDefinition flags(List<String> flags) {
    this.flags = flags;
    return this;
  }

  public VolumeDefinition addFlagsItem(String flagsItem) {
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

  public VolumeDefinition layerData(List<VolumeDefinitionLayer> layerData) {
    this.layerData = layerData;
    return this;
  }

  public VolumeDefinition addLayerDataItem(VolumeDefinitionLayer layerDataItem) {
    if (this.layerData == null) {
      this.layerData = new ArrayList<>();
    }
    this.layerData.add(layerDataItem);
    return this;
  }

   /**
   * Get layerData
   * @return layerData
  **/
  @Schema(description = "")
  public List<VolumeDefinitionLayer> getLayerData() {
    return layerData;
  }

  public void setLayerData(List<VolumeDefinitionLayer> layerData) {
    this.layerData = layerData;
  }

  public VolumeDefinition uuid(String uuid) {
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
    VolumeDefinition volumeDefinition = (VolumeDefinition) o;
    return Objects.equals(this.volumeNumber, volumeDefinition.volumeNumber) &&
        Objects.equals(this.sizeKib, volumeDefinition.sizeKib) &&
        Objects.equals(this.props, volumeDefinition.props) &&
        Objects.equals(this.flags, volumeDefinition.flags) &&
        Objects.equals(this.layerData, volumeDefinition.layerData) &&
        Objects.equals(this.uuid, volumeDefinition.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volumeNumber, sizeKib, props, flags, layerData, uuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeDefinition {\n");
    
    sb.append("    volumeNumber: ").append(toIndentedString(volumeNumber)).append("\n");
    sb.append("    sizeKib: ").append(toIndentedString(sizeKib)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    layerData: ").append(toIndentedString(layerData)).append("\n");
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
