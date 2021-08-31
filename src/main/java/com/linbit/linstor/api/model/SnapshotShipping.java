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
/**
 * SnapshotShipping
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-31T11:02:45.596Z[GMT]")
public class SnapshotShipping {
  @JsonProperty("from_node")
  private String fromNode = null;

  @JsonProperty("from_nic")
  private String fromNic = null;

  @JsonProperty("to_node")
  private String toNode = null;

  @JsonProperty("to_nic")
  private String toNic = null;

  public SnapshotShipping fromNode(String fromNode) {
    this.fromNode = fromNode;
    return this;
  }

   /**
   * Node where to ship the snapshot from
   * @return fromNode
  **/
  @Schema(required = true, description = "Node where to ship the snapshot from")
  public String getFromNode() {
    return fromNode;
  }

  public void setFromNode(String fromNode) {
    this.fromNode = fromNode;
  }

  public SnapshotShipping fromNic(String fromNic) {
    this.fromNic = fromNic;
    return this;
  }

   /**
   * NetInterface of the source node
   * @return fromNic
  **/
  @Schema(description = "NetInterface of the source node")
  public String getFromNic() {
    return fromNic;
  }

  public void setFromNic(String fromNic) {
    this.fromNic = fromNic;
  }

  public SnapshotShipping toNode(String toNode) {
    this.toNode = toNode;
    return this;
  }

   /**
   * Node where to ship the snapshot
   * @return toNode
  **/
  @Schema(required = true, description = "Node where to ship the snapshot")
  public String getToNode() {
    return toNode;
  }

  public void setToNode(String toNode) {
    this.toNode = toNode;
  }

  public SnapshotShipping toNic(String toNic) {
    this.toNic = toNic;
    return this;
  }

   /**
   * NetInterface of the destination node
   * @return toNic
  **/
  @Schema(description = "NetInterface of the destination node")
  public String getToNic() {
    return toNic;
  }

  public void setToNic(String toNic) {
    this.toNic = toNic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotShipping snapshotShipping = (SnapshotShipping) o;
    return Objects.equals(this.fromNode, snapshotShipping.fromNode) &&
        Objects.equals(this.fromNic, snapshotShipping.fromNic) &&
        Objects.equals(this.toNode, snapshotShipping.toNode) &&
        Objects.equals(this.toNic, snapshotShipping.toNic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromNode, fromNic, toNode, toNic);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotShipping {\n");
    
    sb.append("    fromNode: ").append(toIndentedString(fromNode)).append("\n");
    sb.append("    fromNic: ").append(toIndentedString(fromNic)).append("\n");
    sb.append("    toNode: ").append(toIndentedString(toNode)).append("\n");
    sb.append("    toNic: ").append(toIndentedString(toNic)).append("\n");
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
