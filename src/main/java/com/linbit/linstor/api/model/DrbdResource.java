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
import com.linbit.linstor.api.model.DrbdConnection;
import com.linbit.linstor.api.model.DrbdResourceDefinitionLayer;
import com.linbit.linstor.api.model.DrbdVolume;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * DrbdResource
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-03T09:13:01.489Z[GMT]")

public class DrbdResource {
  @JsonProperty("drbd_resource_definition")
  private DrbdResourceDefinitionLayer drbdResourceDefinition = null;

  @JsonProperty("node_id")
  private Integer nodeId = null;

  @JsonProperty("peer_slots")
  private Integer peerSlots = null;

  @JsonProperty("al_stripes")
  private Integer alStripes = null;

  @JsonProperty("al_size")
  private Long alSize = null;

  @JsonProperty("flags")
  private List<String> flags = null;

  @JsonProperty("drbd_volumes")
  private List<DrbdVolume> drbdVolumes = null;

  @JsonProperty("connections")
  private Map<String, DrbdConnection> connections = null;

  @JsonProperty("promotion_score")
  private Integer promotionScore = null;

  @JsonProperty("may_promote")
  private Boolean mayPromote = null;

  public DrbdResource drbdResourceDefinition(DrbdResourceDefinitionLayer drbdResourceDefinition) {
    this.drbdResourceDefinition = drbdResourceDefinition;
    return this;
  }

   /**
   * Get drbdResourceDefinition
   * @return drbdResourceDefinition
  **/
  @Schema(description = "")
  public DrbdResourceDefinitionLayer getDrbdResourceDefinition() {
    return drbdResourceDefinition;
  }

  public void setDrbdResourceDefinition(DrbdResourceDefinitionLayer drbdResourceDefinition) {
    this.drbdResourceDefinition = drbdResourceDefinition;
  }

  public DrbdResource nodeId(Integer nodeId) {
    this.nodeId = nodeId;
    return this;
  }

   /**
   * Get nodeId
   * @return nodeId
  **/
  @Schema(description = "")
  public Integer getNodeId() {
    return nodeId;
  }

  public void setNodeId(Integer nodeId) {
    this.nodeId = nodeId;
  }

  public DrbdResource peerSlots(Integer peerSlots) {
    this.peerSlots = peerSlots;
    return this;
  }

   /**
   * Get peerSlots
   * @return peerSlots
  **/
  @Schema(description = "")
  public Integer getPeerSlots() {
    return peerSlots;
  }

  public void setPeerSlots(Integer peerSlots) {
    this.peerSlots = peerSlots;
  }

  public DrbdResource alStripes(Integer alStripes) {
    this.alStripes = alStripes;
    return this;
  }

   /**
   * Get alStripes
   * @return alStripes
  **/
  @Schema(description = "")
  public Integer getAlStripes() {
    return alStripes;
  }

  public void setAlStripes(Integer alStripes) {
    this.alStripes = alStripes;
  }

  public DrbdResource alSize(Long alSize) {
    this.alSize = alSize;
    return this;
  }

   /**
   * Get alSize
   * @return alSize
  **/
  @Schema(description = "")
  public Long getAlSize() {
    return alSize;
  }

  public void setAlSize(Long alSize) {
    this.alSize = alSize;
  }

  public DrbdResource flags(List<String> flags) {
    this.flags = flags;
    return this;
  }

  public DrbdResource addFlagsItem(String flagsItem) {
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

  public DrbdResource drbdVolumes(List<DrbdVolume> drbdVolumes) {
    this.drbdVolumes = drbdVolumes;
    return this;
  }

  public DrbdResource addDrbdVolumesItem(DrbdVolume drbdVolumesItem) {
    if (this.drbdVolumes == null) {
      this.drbdVolumes = new ArrayList<>();
    }
    this.drbdVolumes.add(drbdVolumesItem);
    return this;
  }

   /**
   * Get drbdVolumes
   * @return drbdVolumes
  **/
  @Schema(description = "")
  public List<DrbdVolume> getDrbdVolumes() {
    return drbdVolumes;
  }

  public void setDrbdVolumes(List<DrbdVolume> drbdVolumes) {
    this.drbdVolumes = drbdVolumes;
  }

  public DrbdResource connections(Map<String, DrbdConnection> connections) {
    this.connections = connections;
    return this;
  }

  public DrbdResource putConnectionsItem(String key, DrbdConnection connectionsItem) {
    if (this.connections == null) {
      this.connections = new HashMap<>();
    }
    this.connections.put(key, connectionsItem);
    return this;
  }

   /**
   * Get connections
   * @return connections
  **/
  @Schema(description = "")
  public Map<String, DrbdConnection> getConnections() {
    return connections;
  }

  public void setConnections(Map<String, DrbdConnection> connections) {
    this.connections = connections;
  }

  public DrbdResource promotionScore(Integer promotionScore) {
    this.promotionScore = promotionScore;
    return this;
  }

   /**
   * Get promotionScore
   * @return promotionScore
  **/
  @Schema(description = "")
  public Integer getPromotionScore() {
    return promotionScore;
  }

  public void setPromotionScore(Integer promotionScore) {
    this.promotionScore = promotionScore;
  }

  public DrbdResource mayPromote(Boolean mayPromote) {
    this.mayPromote = mayPromote;
    return this;
  }

   /**
   * Get mayPromote
   * @return mayPromote
  **/
  @Schema(description = "")
  public Boolean isMayPromote() {
    return mayPromote;
  }

  public void setMayPromote(Boolean mayPromote) {
    this.mayPromote = mayPromote;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DrbdResource drbdResource = (DrbdResource) o;
    return Objects.equals(this.drbdResourceDefinition, drbdResource.drbdResourceDefinition) &&
        Objects.equals(this.nodeId, drbdResource.nodeId) &&
        Objects.equals(this.peerSlots, drbdResource.peerSlots) &&
        Objects.equals(this.alStripes, drbdResource.alStripes) &&
        Objects.equals(this.alSize, drbdResource.alSize) &&
        Objects.equals(this.flags, drbdResource.flags) &&
        Objects.equals(this.drbdVolumes, drbdResource.drbdVolumes) &&
        Objects.equals(this.connections, drbdResource.connections) &&
        Objects.equals(this.promotionScore, drbdResource.promotionScore) &&
        Objects.equals(this.mayPromote, drbdResource.mayPromote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(drbdResourceDefinition, nodeId, peerSlots, alStripes, alSize, flags, drbdVolumes, connections, promotionScore, mayPromote);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrbdResource {\n");
    
    sb.append("    drbdResourceDefinition: ").append(toIndentedString(drbdResourceDefinition)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    peerSlots: ").append(toIndentedString(peerSlots)).append("\n");
    sb.append("    alStripes: ").append(toIndentedString(alStripes)).append("\n");
    sb.append("    alSize: ").append(toIndentedString(alSize)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    drbdVolumes: ").append(toIndentedString(drbdVolumes)).append("\n");
    sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
    sb.append("    promotionScore: ").append(toIndentedString(promotionScore)).append("\n");
    sb.append("    mayPromote: ").append(toIndentedString(mayPromote)).append("\n");
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
