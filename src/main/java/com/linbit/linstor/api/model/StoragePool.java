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
import com.linbit.linstor.api.model.ApiCallRc;
import com.linbit.linstor.api.model.Properties;
import com.linbit.linstor.api.model.ProviderKind;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Contains information about a storage pool.  If state is &#x60;Error&#x60; check the storage pool object path for detailed error description:    /v1/nodes/{nodename}/storage-pools/{poolname} 
 */
@Schema(description = "Contains information about a storage pool.  If state is `Error` check the storage pool object path for detailed error description:    /v1/nodes/{nodename}/storage-pools/{poolname} ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-31T11:02:45.596Z[GMT]")
public class StoragePool {
  @JsonProperty("storage_pool_name")
  private String storagePoolName = null;

  @JsonProperty("node_name")
  private String nodeName = null;

  @JsonProperty("provider_kind")
  private ProviderKind providerKind = null;

  @JsonProperty("props")
  private Properties props = null;

  @JsonProperty("static_traits")
  private Map<String, String> staticTraits = null;

  @JsonProperty("free_capacity")
  private Long freeCapacity = null;

  @JsonProperty("total_capacity")
  private Long totalCapacity = null;

  @JsonProperty("free_space_mgr_name")
  private String freeSpaceMgrName = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("reports")
  private List<ApiCallRc> reports = null;

  @JsonProperty("supports_snapshots")
  private Boolean supportsSnapshots = null;

  @JsonProperty("shared_space")
  private String sharedSpace = null;

  @JsonProperty("external_locking")
  private Boolean externalLocking = false;

  public StoragePool storagePoolName(String storagePoolName) {
    this.storagePoolName = storagePoolName;
    return this;
  }

   /**
   * Get storagePoolName
   * @return storagePoolName
  **/
  @Schema(example = "DfltStorPool", required = true, description = "")
  public String getStoragePoolName() {
    return storagePoolName;
  }

  public void setStoragePoolName(String storagePoolName) {
    this.storagePoolName = storagePoolName;
  }

  public StoragePool nodeName(String nodeName) {
    this.nodeName = nodeName;
    return this;
  }

   /**
   * Get nodeName
   * @return nodeName
  **/
  @Schema(description = "")
  public String getNodeName() {
    return nodeName;
  }

  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }

  public StoragePool providerKind(ProviderKind providerKind) {
    this.providerKind = providerKind;
    return this;
  }

   /**
   * Get providerKind
   * @return providerKind
  **/
  @Schema(required = true, description = "")
  public ProviderKind getProviderKind() {
    return providerKind;
  }

  public void setProviderKind(ProviderKind providerKind) {
    this.providerKind = providerKind;
  }

  public StoragePool props(Properties props) {
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

   /**
   * read only map of static storage pool traits
   * @return staticTraits
  **/
  @Schema(description = "read only map of static storage pool traits")
  public Map<String, String> getStaticTraits() {
    return staticTraits;
  }

  public StoragePool freeCapacity(Long freeCapacity) {
    this.freeCapacity = freeCapacity;
    return this;
  }

   /**
   * Kibi - read only
   * @return freeCapacity
  **/
  @Schema(example = "882894848", description = "Kibi - read only")
  public Long getFreeCapacity() {
    return freeCapacity;
  }

  public void setFreeCapacity(Long freeCapacity) {
    this.freeCapacity = freeCapacity;
  }

  public StoragePool totalCapacity(Long totalCapacity) {
    this.totalCapacity = totalCapacity;
    return this;
  }

   /**
   * Kibi - read only
   * @return totalCapacity
  **/
  @Schema(example = "1056964608", description = "Kibi - read only")
  public Long getTotalCapacity() {
    return totalCapacity;
  }

  public void setTotalCapacity(Long totalCapacity) {
    this.totalCapacity = totalCapacity;
  }

  public StoragePool freeSpaceMgrName(String freeSpaceMgrName) {
    this.freeSpaceMgrName = freeSpaceMgrName;
    return this;
  }

   /**
   * read only
   * @return freeSpaceMgrName
  **/
  @Schema(example = "drbd1:myfastpool", description = "read only")
  public String getFreeSpaceMgrName() {
    return freeSpaceMgrName;
  }

  public void setFreeSpaceMgrName(String freeSpaceMgrName) {
    this.freeSpaceMgrName = freeSpaceMgrName;
  }

  public StoragePool uuid(String uuid) {
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

   /**
   * Currently known report messages for this storage pool
   * @return reports
  **/
  @Schema(description = "Currently known report messages for this storage pool")
  public List<ApiCallRc> getReports() {
    return reports;
  }

  public StoragePool supportsSnapshots(Boolean supportsSnapshots) {
    this.supportsSnapshots = supportsSnapshots;
    return this;
  }

   /**
   * true if the storage pool supports snapshots. false otherwise
   * @return supportsSnapshots
  **/
  @Schema(description = "true if the storage pool supports snapshots. false otherwise")
  public Boolean isSupportsSnapshots() {
    return supportsSnapshots;
  }

  public void setSupportsSnapshots(Boolean supportsSnapshots) {
    this.supportsSnapshots = supportsSnapshots;
  }

  public StoragePool sharedSpace(String sharedSpace) {
    this.sharedSpace = sharedSpace;
    return this;
  }

   /**
   * Name of the shared space or null if none given
   * @return sharedSpace
  **/
  @Schema(description = "Name of the shared space or null if none given")
  public String getSharedSpace() {
    return sharedSpace;
  }

  public void setSharedSpace(String sharedSpace) {
    this.sharedSpace = sharedSpace;
  }

  public StoragePool externalLocking(Boolean externalLocking) {
    this.externalLocking = externalLocking;
    return this;
  }

   /**
   * true if a shared storage pool uses linstor-external locking, like cLVM
   * @return externalLocking
  **/
  @Schema(description = "true if a shared storage pool uses linstor-external locking, like cLVM")
  public Boolean isExternalLocking() {
    return externalLocking;
  }

  public void setExternalLocking(Boolean externalLocking) {
    this.externalLocking = externalLocking;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoragePool storagePool = (StoragePool) o;
    return Objects.equals(this.storagePoolName, storagePool.storagePoolName) &&
        Objects.equals(this.nodeName, storagePool.nodeName) &&
        Objects.equals(this.providerKind, storagePool.providerKind) &&
        Objects.equals(this.props, storagePool.props) &&
        Objects.equals(this.staticTraits, storagePool.staticTraits) &&
        Objects.equals(this.freeCapacity, storagePool.freeCapacity) &&
        Objects.equals(this.totalCapacity, storagePool.totalCapacity) &&
        Objects.equals(this.freeSpaceMgrName, storagePool.freeSpaceMgrName) &&
        Objects.equals(this.uuid, storagePool.uuid) &&
        Objects.equals(this.reports, storagePool.reports) &&
        Objects.equals(this.supportsSnapshots, storagePool.supportsSnapshots) &&
        Objects.equals(this.sharedSpace, storagePool.sharedSpace) &&
        Objects.equals(this.externalLocking, storagePool.externalLocking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storagePoolName, nodeName, providerKind, props, staticTraits, freeCapacity, totalCapacity, freeSpaceMgrName, uuid, reports, supportsSnapshots, sharedSpace, externalLocking);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoragePool {\n");
    
    sb.append("    storagePoolName: ").append(toIndentedString(storagePoolName)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    providerKind: ").append(toIndentedString(providerKind)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    staticTraits: ").append(toIndentedString(staticTraits)).append("\n");
    sb.append("    freeCapacity: ").append(toIndentedString(freeCapacity)).append("\n");
    sb.append("    totalCapacity: ").append(toIndentedString(totalCapacity)).append("\n");
    sb.append("    freeSpaceMgrName: ").append(toIndentedString(freeSpaceMgrName)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    reports: ").append(toIndentedString(reports)).append("\n");
    sb.append("    supportsSnapshots: ").append(toIndentedString(supportsSnapshots)).append("\n");
    sb.append("    sharedSpace: ").append(toIndentedString(sharedSpace)).append("\n");
    sb.append("    externalLocking: ").append(toIndentedString(externalLocking)).append("\n");
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
