/*
 * Linstor REST API
 *
 *
 * OpenAPI spec version: 1.6.0
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
 * Actual snapshot data from a node
 */
@Schema(description = "Actual snapshot data from a node")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-02-05T10:27:33.226Z[GMT]")
public class SnapshotNode {
  @JsonProperty("snapshot_name")
  private String snapshotName = null;

  @JsonProperty("node_name")
  private String nodeName = null;

  @JsonProperty("create_timestamp")
  private Long createTimestamp = null;

  @JsonProperty("flags")
  private List<String> flags = null;

  @JsonProperty("uuid")
  private String uuid = null;

  public SnapshotNode snapshotName(String snapshotName) {
    this.snapshotName = snapshotName;
    return this;
  }

   /**
   * Snapshot name this snapshots belongs to
   * @return snapshotName
  **/
  @Schema(description = "Snapshot name this snapshots belongs to")
  public String getSnapshotName() {
    return snapshotName;
  }

  public void setSnapshotName(String snapshotName) {
    this.snapshotName = snapshotName;
  }

  public SnapshotNode nodeName(String nodeName) {
    this.nodeName = nodeName;
    return this;
  }

   /**
   * Node name where this snapshot was taken
   * @return nodeName
  **/
  @Schema(description = "Node name where this snapshot was taken")
  public String getNodeName() {
    return nodeName;
  }

  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }

  public SnapshotNode createTimestamp(Long createTimestamp) {
    this.createTimestamp = createTimestamp;
    return this;
  }

   /**
   * milliseconds since unix epoch in UTC
   * @return createTimestamp
  **/
  @Schema(description = "milliseconds since unix epoch in UTC")
  public Long getCreateTimestamp() {
    return createTimestamp;
  }

  public void setCreateTimestamp(Long createTimestamp) {
    this.createTimestamp = createTimestamp;
  }

  public SnapshotNode flags(List<String> flags) {
    this.flags = flags;
    return this;
  }

  public SnapshotNode addFlagsItem(String flagsItem) {
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

  public SnapshotNode uuid(String uuid) {
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
    SnapshotNode snapshotNode = (SnapshotNode) o;
    return Objects.equals(this.snapshotName, snapshotNode.snapshotName) &&
        Objects.equals(this.nodeName, snapshotNode.nodeName) &&
        Objects.equals(this.createTimestamp, snapshotNode.createTimestamp) &&
        Objects.equals(this.flags, snapshotNode.flags) &&
        Objects.equals(this.uuid, snapshotNode.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snapshotName, nodeName, createTimestamp, flags, uuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotNode {\n");
    
    sb.append("    snapshotName: ").append(toIndentedString(snapshotName)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    createTimestamp: ").append(toIndentedString(createTimestamp)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
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
