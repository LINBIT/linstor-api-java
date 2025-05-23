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
import com.linbit.linstor.api.model.Resource;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * ResourceCreate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-05-08T11:58:50.875992750Z[Etc/UTC]")

public class ResourceCreate {
  @JsonProperty("resource")
  private Resource resource = null;

  @JsonProperty("layer_list")
  private List<LayerType> layerList = null;

  @JsonProperty("drbd_node_id")
  private Integer drbdNodeId = null;

  public ResourceCreate resource(Resource resource) {
    this.resource = resource;
    return this;
  }

   /**
   * Get resource
   * @return resource
  **/
  @Schema(description = "")
  public Resource getResource() {
    return resource;
  }

  public void setResource(Resource resource) {
    this.resource = resource;
  }

  public ResourceCreate layerList(List<LayerType> layerList) {
    this.layerList = layerList;
    return this;
  }

  public ResourceCreate addLayerListItem(LayerType layerListItem) {
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

  public ResourceCreate drbdNodeId(Integer drbdNodeId) {
    this.drbdNodeId = drbdNodeId;
    return this;
  }

   /**
   * Get drbdNodeId
   * @return drbdNodeId
  **/
  @Schema(description = "")
  public Integer getDrbdNodeId() {
    return drbdNodeId;
  }

  public void setDrbdNodeId(Integer drbdNodeId) {
    this.drbdNodeId = drbdNodeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceCreate resourceCreate = (ResourceCreate) o;
    return Objects.equals(this.resource, resourceCreate.resource) &&
        Objects.equals(this.layerList, resourceCreate.layerList) &&
        Objects.equals(this.drbdNodeId, resourceCreate.drbdNodeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resource, layerList, drbdNodeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceCreate {\n");
    
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    layerList: ").append(toIndentedString(layerList)).append("\n");
    sb.append("    drbdNodeId: ").append(toIndentedString(drbdNodeId)).append("\n");
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
