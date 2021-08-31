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
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * SnapshotRestore
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-31T11:02:45.596Z[GMT]")
public class SnapshotRestore {
  @JsonProperty("to_resource")
  private String toResource = null;

  @JsonProperty("nodes")
  private List<String> nodes = null;

  public SnapshotRestore toResource(String toResource) {
    this.toResource = toResource;
    return this;
  }

   /**
   * Resource where to restore the snapshot
   * @return toResource
  **/
  @Schema(example = "rsc2", required = true, description = "Resource where to restore the snapshot")
  public String getToResource() {
    return toResource;
  }

  public void setToResource(String toResource) {
    this.toResource = toResource;
  }

  public SnapshotRestore nodes(List<String> nodes) {
    this.nodes = nodes;
    return this;
  }

  public SnapshotRestore addNodesItem(String nodesItem) {
    if (this.nodes == null) {
      this.nodes = new ArrayList<>();
    }
    this.nodes.add(nodesItem);
    return this;
  }

   /**
   * List of nodes where to place the restored snapshot
   * @return nodes
  **/
  @Schema(description = "List of nodes where to place the restored snapshot")
  public List<String> getNodes() {
    return nodes;
  }

  public void setNodes(List<String> nodes) {
    this.nodes = nodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotRestore snapshotRestore = (SnapshotRestore) o;
    return Objects.equals(this.toResource, snapshotRestore.toResource) &&
        Objects.equals(this.nodes, snapshotRestore.nodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toResource, nodes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotRestore {\n");
    
    sb.append("    toResource: ").append(toIndentedString(toResource)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
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
