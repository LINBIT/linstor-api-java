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
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * AutoSelectFilter
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-18T05:15:14.614Z[GMT]")
public class AutoSelectFilter {
  @JsonProperty("place_count")
  private Integer placeCount = null;

  @JsonProperty("additional_place_count")
  private Integer additionalPlaceCount = null;

  @JsonProperty("node_name_list")
  private List<String> nodeNameList = null;

  @JsonProperty("storage_pool")
  private String storagePool = null;

  @JsonProperty("storage_pool_list")
  private List<String> storagePoolList = null;

  @JsonProperty("storage_pool_diskless_list")
  private List<String> storagePoolDisklessList = null;

  @JsonProperty("not_place_with_rsc")
  private List<String> notPlaceWithRsc = null;

  @JsonProperty("not_place_with_rsc_regex")
  private String notPlaceWithRscRegex = null;

  @JsonProperty("replicas_on_same")
  private List<String> replicasOnSame = null;

  @JsonProperty("replicas_on_different")
  private List<String> replicasOnDifferent = null;

  @JsonProperty("layer_stack")
  private List<String> layerStack = null;

  @JsonProperty("provider_list")
  private List<String> providerList = null;

  @JsonProperty("diskless_on_remaining")
  private Boolean disklessOnRemaining = null;

  @JsonProperty("diskless_type")
  private String disklessType = null;

  public AutoSelectFilter placeCount(Integer placeCount) {
    this.placeCount = placeCount;
    return this;
  }

   /**
   * Get placeCount
   * @return placeCount
  **/
  @Schema(required = true, description = "")
  public Integer getPlaceCount() {
    return placeCount;
  }

  public void setPlaceCount(Integer placeCount) {
    this.placeCount = placeCount;
  }

  public AutoSelectFilter additionalPlaceCount(Integer additionalPlaceCount) {
    this.additionalPlaceCount = additionalPlaceCount;
    return this;
  }

   /**
   * Get additionalPlaceCount
   * @return additionalPlaceCount
  **/
  @Schema(description = "")
  public Integer getAdditionalPlaceCount() {
    return additionalPlaceCount;
  }

  public void setAdditionalPlaceCount(Integer additionalPlaceCount) {
    this.additionalPlaceCount = additionalPlaceCount;
  }

  public AutoSelectFilter nodeNameList(List<String> nodeNameList) {
    this.nodeNameList = nodeNameList;
    return this;
  }

  public AutoSelectFilter addNodeNameListItem(String nodeNameListItem) {
    if (this.nodeNameList == null) {
      this.nodeNameList = new ArrayList<>();
    }
    this.nodeNameList.add(nodeNameListItem);
    return this;
  }

   /**
   * Get nodeNameList
   * @return nodeNameList
  **/
  @Schema(description = "")
  public List<String> getNodeNameList() {
    return nodeNameList;
  }

  public void setNodeNameList(List<String> nodeNameList) {
    this.nodeNameList = nodeNameList;
  }

  public AutoSelectFilter storagePool(String storagePool) {
    this.storagePool = storagePool;
    return this;
  }

   /**
   * Get storagePool
   * @return storagePool
  **/
  @Schema(description = "")
  public String getStoragePool() {
    return storagePool;
  }

  public void setStoragePool(String storagePool) {
    this.storagePool = storagePool;
  }

  public AutoSelectFilter storagePoolList(List<String> storagePoolList) {
    this.storagePoolList = storagePoolList;
    return this;
  }

  public AutoSelectFilter addStoragePoolListItem(String storagePoolListItem) {
    if (this.storagePoolList == null) {
      this.storagePoolList = new ArrayList<>();
    }
    this.storagePoolList.add(storagePoolListItem);
    return this;
  }

   /**
   * Get storagePoolList
   * @return storagePoolList
  **/
  @Schema(description = "")
  public List<String> getStoragePoolList() {
    return storagePoolList;
  }

  public void setStoragePoolList(List<String> storagePoolList) {
    this.storagePoolList = storagePoolList;
  }

  public AutoSelectFilter storagePoolDisklessList(List<String> storagePoolDisklessList) {
    this.storagePoolDisklessList = storagePoolDisklessList;
    return this;
  }

  public AutoSelectFilter addStoragePoolDisklessListItem(String storagePoolDisklessListItem) {
    if (this.storagePoolDisklessList == null) {
      this.storagePoolDisklessList = new ArrayList<>();
    }
    this.storagePoolDisklessList.add(storagePoolDisklessListItem);
    return this;
  }

   /**
   * Get storagePoolDisklessList
   * @return storagePoolDisklessList
  **/
  @Schema(description = "")
  public List<String> getStoragePoolDisklessList() {
    return storagePoolDisklessList;
  }

  public void setStoragePoolDisklessList(List<String> storagePoolDisklessList) {
    this.storagePoolDisklessList = storagePoolDisklessList;
  }

  public AutoSelectFilter notPlaceWithRsc(List<String> notPlaceWithRsc) {
    this.notPlaceWithRsc = notPlaceWithRsc;
    return this;
  }

  public AutoSelectFilter addNotPlaceWithRscItem(String notPlaceWithRscItem) {
    if (this.notPlaceWithRsc == null) {
      this.notPlaceWithRsc = new ArrayList<>();
    }
    this.notPlaceWithRsc.add(notPlaceWithRscItem);
    return this;
  }

   /**
   * Get notPlaceWithRsc
   * @return notPlaceWithRsc
  **/
  @Schema(description = "")
  public List<String> getNotPlaceWithRsc() {
    return notPlaceWithRsc;
  }

  public void setNotPlaceWithRsc(List<String> notPlaceWithRsc) {
    this.notPlaceWithRsc = notPlaceWithRsc;
  }

  public AutoSelectFilter notPlaceWithRscRegex(String notPlaceWithRscRegex) {
    this.notPlaceWithRscRegex = notPlaceWithRscRegex;
    return this;
  }

   /**
   * Get notPlaceWithRscRegex
   * @return notPlaceWithRscRegex
  **/
  @Schema(description = "")
  public String getNotPlaceWithRscRegex() {
    return notPlaceWithRscRegex;
  }

  public void setNotPlaceWithRscRegex(String notPlaceWithRscRegex) {
    this.notPlaceWithRscRegex = notPlaceWithRscRegex;
  }

  public AutoSelectFilter replicasOnSame(List<String> replicasOnSame) {
    this.replicasOnSame = replicasOnSame;
    return this;
  }

  public AutoSelectFilter addReplicasOnSameItem(String replicasOnSameItem) {
    if (this.replicasOnSame == null) {
      this.replicasOnSame = new ArrayList<>();
    }
    this.replicasOnSame.add(replicasOnSameItem);
    return this;
  }

   /**
   * Get replicasOnSame
   * @return replicasOnSame
  **/
  @Schema(description = "")
  public List<String> getReplicasOnSame() {
    return replicasOnSame;
  }

  public void setReplicasOnSame(List<String> replicasOnSame) {
    this.replicasOnSame = replicasOnSame;
  }

  public AutoSelectFilter replicasOnDifferent(List<String> replicasOnDifferent) {
    this.replicasOnDifferent = replicasOnDifferent;
    return this;
  }

  public AutoSelectFilter addReplicasOnDifferentItem(String replicasOnDifferentItem) {
    if (this.replicasOnDifferent == null) {
      this.replicasOnDifferent = new ArrayList<>();
    }
    this.replicasOnDifferent.add(replicasOnDifferentItem);
    return this;
  }

   /**
   * Get replicasOnDifferent
   * @return replicasOnDifferent
  **/
  @Schema(description = "")
  public List<String> getReplicasOnDifferent() {
    return replicasOnDifferent;
  }

  public void setReplicasOnDifferent(List<String> replicasOnDifferent) {
    this.replicasOnDifferent = replicasOnDifferent;
  }

  public AutoSelectFilter layerStack(List<String> layerStack) {
    this.layerStack = layerStack;
    return this;
  }

  public AutoSelectFilter addLayerStackItem(String layerStackItem) {
    if (this.layerStack == null) {
      this.layerStack = new ArrayList<>();
    }
    this.layerStack.add(layerStackItem);
    return this;
  }

   /**
   * Get layerStack
   * @return layerStack
  **/
  @Schema(description = "")
  public List<String> getLayerStack() {
    return layerStack;
  }

  public void setLayerStack(List<String> layerStack) {
    this.layerStack = layerStack;
  }

  public AutoSelectFilter providerList(List<String> providerList) {
    this.providerList = providerList;
    return this;
  }

  public AutoSelectFilter addProviderListItem(String providerListItem) {
    if (this.providerList == null) {
      this.providerList = new ArrayList<>();
    }
    this.providerList.add(providerListItem);
    return this;
  }

   /**
   * Get providerList
   * @return providerList
  **/
  @Schema(description = "")
  public List<String> getProviderList() {
    return providerList;
  }

  public void setProviderList(List<String> providerList) {
    this.providerList = providerList;
  }

  public AutoSelectFilter disklessOnRemaining(Boolean disklessOnRemaining) {
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

  public AutoSelectFilter disklessType(String disklessType) {
    this.disklessType = disklessType;
    return this;
  }

   /**
   * Get disklessType
   * @return disklessType
  **/
  @Schema(description = "")
  public String getDisklessType() {
    return disklessType;
  }

  public void setDisklessType(String disklessType) {
    this.disklessType = disklessType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoSelectFilter autoSelectFilter = (AutoSelectFilter) o;
    return Objects.equals(this.placeCount, autoSelectFilter.placeCount) &&
        Objects.equals(this.additionalPlaceCount, autoSelectFilter.additionalPlaceCount) &&
        Objects.equals(this.nodeNameList, autoSelectFilter.nodeNameList) &&
        Objects.equals(this.storagePool, autoSelectFilter.storagePool) &&
        Objects.equals(this.storagePoolList, autoSelectFilter.storagePoolList) &&
        Objects.equals(this.storagePoolDisklessList, autoSelectFilter.storagePoolDisklessList) &&
        Objects.equals(this.notPlaceWithRsc, autoSelectFilter.notPlaceWithRsc) &&
        Objects.equals(this.notPlaceWithRscRegex, autoSelectFilter.notPlaceWithRscRegex) &&
        Objects.equals(this.replicasOnSame, autoSelectFilter.replicasOnSame) &&
        Objects.equals(this.replicasOnDifferent, autoSelectFilter.replicasOnDifferent) &&
        Objects.equals(this.layerStack, autoSelectFilter.layerStack) &&
        Objects.equals(this.providerList, autoSelectFilter.providerList) &&
        Objects.equals(this.disklessOnRemaining, autoSelectFilter.disklessOnRemaining) &&
        Objects.equals(this.disklessType, autoSelectFilter.disklessType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placeCount, additionalPlaceCount, nodeNameList, storagePool, storagePoolList, storagePoolDisklessList, notPlaceWithRsc, notPlaceWithRscRegex, replicasOnSame, replicasOnDifferent, layerStack, providerList, disklessOnRemaining, disklessType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoSelectFilter {\n");
    
    sb.append("    placeCount: ").append(toIndentedString(placeCount)).append("\n");
    sb.append("    additionalPlaceCount: ").append(toIndentedString(additionalPlaceCount)).append("\n");
    sb.append("    nodeNameList: ").append(toIndentedString(nodeNameList)).append("\n");
    sb.append("    storagePool: ").append(toIndentedString(storagePool)).append("\n");
    sb.append("    storagePoolList: ").append(toIndentedString(storagePoolList)).append("\n");
    sb.append("    storagePoolDisklessList: ").append(toIndentedString(storagePoolDisklessList)).append("\n");
    sb.append("    notPlaceWithRsc: ").append(toIndentedString(notPlaceWithRsc)).append("\n");
    sb.append("    notPlaceWithRscRegex: ").append(toIndentedString(notPlaceWithRscRegex)).append("\n");
    sb.append("    replicasOnSame: ").append(toIndentedString(replicasOnSame)).append("\n");
    sb.append("    replicasOnDifferent: ").append(toIndentedString(replicasOnDifferent)).append("\n");
    sb.append("    layerStack: ").append(toIndentedString(layerStack)).append("\n");
    sb.append("    providerList: ").append(toIndentedString(providerList)).append("\n");
    sb.append("    disklessOnRemaining: ").append(toIndentedString(disklessOnRemaining)).append("\n");
    sb.append("    disklessType: ").append(toIndentedString(disklessType)).append("\n");
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