/*
 * Linstor REST API
 *
 *
 * OpenAPI spec version: 1.20.1
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
import com.linbit.linstor.api.model.SnapshotNode;
import com.linbit.linstor.api.model.SnapshotVolumeDefinition;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * Snapshot
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-03T09:13:01.489Z[GMT]")

public class Snapshot {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("resource_name")
  private String resourceName = null;

  @JsonProperty("nodes")
  private List<String> nodes = null;

  @JsonProperty("props")
  private Properties props = null;

  @JsonProperty("flags")
  private List<String> flags = null;

  @JsonProperty("volume_definitions")
  private List<SnapshotVolumeDefinition> volumeDefinitions = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("snapshots")
  private List<SnapshotNode> snapshots = null;

  public Snapshot name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Snapshot resourceName(String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

   /**
   * Get resourceName
   * @return resourceName
  **/
  @Schema(description = "")
  public String getResourceName() {
    return resourceName;
  }

  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }

  public Snapshot nodes(List<String> nodes) {
    this.nodes = nodes;
    return this;
  }

  public Snapshot addNodesItem(String nodesItem) {
    if (this.nodes == null) {
      this.nodes = new ArrayList<>();
    }
    this.nodes.add(nodesItem);
    return this;
  }

   /**
   * Get nodes
   * @return nodes
  **/
  @Schema(description = "")
  public List<String> getNodes() {
    return nodes;
  }

  public void setNodes(List<String> nodes) {
    this.nodes = nodes;
  }

  public Snapshot props(Properties props) {
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

  public Snapshot flags(List<String> flags) {
    this.flags = flags;
    return this;
  }

  public Snapshot addFlagsItem(String flagsItem) {
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

  public Snapshot volumeDefinitions(List<SnapshotVolumeDefinition> volumeDefinitions) {
    this.volumeDefinitions = volumeDefinitions;
    return this;
  }

  public Snapshot addVolumeDefinitionsItem(SnapshotVolumeDefinition volumeDefinitionsItem) {
    if (this.volumeDefinitions == null) {
      this.volumeDefinitions = new ArrayList<>();
    }
    this.volumeDefinitions.add(volumeDefinitionsItem);
    return this;
  }

   /**
   * Get volumeDefinitions
   * @return volumeDefinitions
  **/
  @Schema(description = "")
  public List<SnapshotVolumeDefinition> getVolumeDefinitions() {
    return volumeDefinitions;
  }

  public void setVolumeDefinitions(List<SnapshotVolumeDefinition> volumeDefinitions) {
    this.volumeDefinitions = volumeDefinitions;
  }

  public Snapshot uuid(String uuid) {
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

  public Snapshot snapshots(List<SnapshotNode> snapshots) {
    this.snapshots = snapshots;
    return this;
  }

  public Snapshot addSnapshotsItem(SnapshotNode snapshotsItem) {
    if (this.snapshots == null) {
      this.snapshots = new ArrayList<>();
    }
    this.snapshots.add(snapshotsItem);
    return this;
  }

   /**
   * Get snapshots
   * @return snapshots
  **/
  @Schema(description = "")
  public List<SnapshotNode> getSnapshots() {
    return snapshots;
  }

  public void setSnapshots(List<SnapshotNode> snapshots) {
    this.snapshots = snapshots;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Snapshot snapshot = (Snapshot) o;
    return Objects.equals(this.name, snapshot.name) &&
        Objects.equals(this.resourceName, snapshot.resourceName) &&
        Objects.equals(this.nodes, snapshot.nodes) &&
        Objects.equals(this.props, snapshot.props) &&
        Objects.equals(this.flags, snapshot.flags) &&
        Objects.equals(this.volumeDefinitions, snapshot.volumeDefinitions) &&
        Objects.equals(this.uuid, snapshot.uuid) &&
        Objects.equals(this.snapshots, snapshot.snapshots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, resourceName, nodes, props, flags, volumeDefinitions, uuid, snapshots);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Snapshot {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    volumeDefinitions: ").append(toIndentedString(volumeDefinitions)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    snapshots: ").append(toIndentedString(snapshots)).append("\n");
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
