/*
 * Linstor REST API
 *
 *
 * OpenAPI spec version: 1.10.0
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
import com.linbit.linstor.api.model.AutoSelectFilter;
import com.linbit.linstor.api.model.LayerType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * AutoPlaceRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-31T11:02:45.596Z[GMT]")
public class AutoPlaceRequest {
  @JsonProperty("diskless_on_remaining")
  private Boolean disklessOnRemaining = false;

  @JsonProperty("select_filter")
  private AutoSelectFilter selectFilter = null;

  @JsonProperty("layer_list")
  private List<LayerType> layerList = null;

  public AutoPlaceRequest disklessOnRemaining(Boolean disklessOnRemaining) {
    this.disklessOnRemaining = disklessOnRemaining;
    return this;
  }

   /**
   * Get disklessOnRemaining
   * @return disklessOnRemaining
  **/
  @Schema(description = "")
  public Boolean isDisklessOnRemaining() {
    return disklessOnRemaining;
  }

  public void setDisklessOnRemaining(Boolean disklessOnRemaining) {
    this.disklessOnRemaining = disklessOnRemaining;
  }

  public AutoPlaceRequest selectFilter(AutoSelectFilter selectFilter) {
    this.selectFilter = selectFilter;
    return this;
  }

   /**
   * Get selectFilter
   * @return selectFilter
  **/
  @Schema(required = true, description = "")
  public AutoSelectFilter getSelectFilter() {
    return selectFilter;
  }

  public void setSelectFilter(AutoSelectFilter selectFilter) {
    this.selectFilter = selectFilter;
  }

  public AutoPlaceRequest layerList(List<LayerType> layerList) {
    this.layerList = layerList;
    return this;
  }

  public AutoPlaceRequest addLayerListItem(LayerType layerListItem) {
    if (this.layerList == null) {
      this.layerList = new ArrayList<>();
    }
    this.layerList.add(layerListItem);
    return this;
  }

   /**
   * Get layerList
   * @return layerList
  **/
  @Schema(description = "")
  public List<LayerType> getLayerList() {
    return layerList;
  }

  public void setLayerList(List<LayerType> layerList) {
    this.layerList = layerList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoPlaceRequest autoPlaceRequest = (AutoPlaceRequest) o;
    return Objects.equals(this.disklessOnRemaining, autoPlaceRequest.disklessOnRemaining) &&
        Objects.equals(this.selectFilter, autoPlaceRequest.selectFilter) &&
        Objects.equals(this.layerList, autoPlaceRequest.layerList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disklessOnRemaining, selectFilter, layerList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoPlaceRequest {\n");
    
    sb.append("    disklessOnRemaining: ").append(toIndentedString(disklessOnRemaining)).append("\n");
    sb.append("    selectFilter: ").append(toIndentedString(selectFilter)).append("\n");
    sb.append("    layerList: ").append(toIndentedString(layerList)).append("\n");
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
