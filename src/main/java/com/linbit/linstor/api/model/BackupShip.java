/*
 * Linstor REST API
 *
 *
 * OpenAPI spec version: 1.24.0
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * BackupShip
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-18T06:34:31.141535853Z[Etc/UTC]")

public class BackupShip {
  @JsonProperty("src_node_name")
  private String srcNodeName = null;

  @JsonProperty("src_rsc_name")
  private String srcRscName = null;

  @JsonProperty("dst_rsc_name")
  private String dstRscName = null;

  @JsonProperty("dst_node_name")
  private String dstNodeName = null;

  @JsonProperty("dst_net_if_name")
  private String dstNetIfName = null;

  @JsonProperty("dst_stor_pool")
  private String dstStorPool = null;

  @JsonProperty("stor_pool_rename")
  private Map<String, String> storPoolRename = null;

  @JsonProperty("download_only")
  private Boolean downloadOnly = false;

  @JsonProperty("force_restore")
  private Boolean forceRestore = false;

  @JsonProperty("allow_incremental")
  private Boolean allowIncremental = true;

  @JsonProperty("dst_rsc_grp")
  private String dstRscGrp = null;

  @JsonProperty("force_mv_rsc_grp")
  private Boolean forceMvRscGrp = false;

  public BackupShip srcNodeName(String srcNodeName) {
    this.srcNodeName = srcNodeName;
    return this;
  }

   /**
   * Get srcNodeName
   * @return srcNodeName
  **/
  @Schema(description = "")
  public String getSrcNodeName() {
    return srcNodeName;
  }

  public void setSrcNodeName(String srcNodeName) {
    this.srcNodeName = srcNodeName;
  }

  public BackupShip srcRscName(String srcRscName) {
    this.srcRscName = srcRscName;
    return this;
  }

   /**
   * Get srcRscName
   * @return srcRscName
  **/
  @Schema(required = true, description = "")
  public String getSrcRscName() {
    return srcRscName;
  }

  public void setSrcRscName(String srcRscName) {
    this.srcRscName = srcRscName;
  }

  public BackupShip dstRscName(String dstRscName) {
    this.dstRscName = dstRscName;
    return this;
  }

   /**
   * Get dstRscName
   * @return dstRscName
  **/
  @Schema(required = true, description = "")
  public String getDstRscName() {
    return dstRscName;
  }

  public void setDstRscName(String dstRscName) {
    this.dstRscName = dstRscName;
  }

  public BackupShip dstNodeName(String dstNodeName) {
    this.dstNodeName = dstNodeName;
    return this;
  }

   /**
   * Get dstNodeName
   * @return dstNodeName
  **/
  @Schema(description = "")
  public String getDstNodeName() {
    return dstNodeName;
  }

  public void setDstNodeName(String dstNodeName) {
    this.dstNodeName = dstNodeName;
  }

  public BackupShip dstNetIfName(String dstNetIfName) {
    this.dstNetIfName = dstNetIfName;
    return this;
  }

   /**
   * Get dstNetIfName
   * @return dstNetIfName
  **/
  @Schema(description = "")
  public String getDstNetIfName() {
    return dstNetIfName;
  }

  public void setDstNetIfName(String dstNetIfName) {
    this.dstNetIfName = dstNetIfName;
  }

  public BackupShip dstStorPool(String dstStorPool) {
    this.dstStorPool = dstStorPool;
    return this;
  }

   /**
   * Get dstStorPool
   * @return dstStorPool
  **/
  @Schema(description = "")
  public String getDstStorPool() {
    return dstStorPool;
  }

  public void setDstStorPool(String dstStorPool) {
    this.dstStorPool = dstStorPool;
  }

  public BackupShip storPoolRename(Map<String, String> storPoolRename) {
    this.storPoolRename = storPoolRename;
    return this;
  }

  public BackupShip putStorPoolRenameItem(String key, String storPoolRenameItem) {
    if (this.storPoolRename == null) {
      this.storPoolRename = new HashMap<>();
    }
    this.storPoolRename.put(key, storPoolRenameItem);
    return this;
  }

   /**
   * Get storPoolRename
   * @return storPoolRename
  **/
  @Schema(description = "")
  public Map<String, String> getStorPoolRename() {
    return storPoolRename;
  }

  public void setStorPoolRename(Map<String, String> storPoolRename) {
    this.storPoolRename = storPoolRename;
  }

  public BackupShip downloadOnly(Boolean downloadOnly) {
    this.downloadOnly = downloadOnly;
    return this;
  }

   /**
   * Get downloadOnly
   * @return downloadOnly
  **/
  @Schema(description = "")
  public Boolean isDownloadOnly() {
    return downloadOnly;
  }

  public void setDownloadOnly(Boolean downloadOnly) {
    this.downloadOnly = downloadOnly;
  }

  public BackupShip forceRestore(Boolean forceRestore) {
    this.forceRestore = forceRestore;
    return this;
  }

   /**
   * Get forceRestore
   * @return forceRestore
  **/
  @Schema(description = "")
  public Boolean isForceRestore() {
    return forceRestore;
  }

  public void setForceRestore(Boolean forceRestore) {
    this.forceRestore = forceRestore;
  }

  public BackupShip allowIncremental(Boolean allowIncremental) {
    this.allowIncremental = allowIncremental;
    return this;
  }

   /**
   * Get allowIncremental
   * @return allowIncremental
  **/
  @Schema(description = "")
  public Boolean isAllowIncremental() {
    return allowIncremental;
  }

  public void setAllowIncremental(Boolean allowIncremental) {
    this.allowIncremental = allowIncremental;
  }

  public BackupShip dstRscGrp(String dstRscGrp) {
    this.dstRscGrp = dstRscGrp;
    return this;
  }

   /**
   * Get dstRscGrp
   * @return dstRscGrp
  **/
  @Schema(description = "")
  public String getDstRscGrp() {
    return dstRscGrp;
  }

  public void setDstRscGrp(String dstRscGrp) {
    this.dstRscGrp = dstRscGrp;
  }

  public BackupShip forceMvRscGrp(Boolean forceMvRscGrp) {
    this.forceMvRscGrp = forceMvRscGrp;
    return this;
  }

   /**
   * If the destination resource-definition exists and has resources, the force_mv_rsc_grp must be used in order to change the resource-group of the destination resource-definition. This is a safety-option to prevent unexpected autoplace-actions for example performed by the BalanceResourceTask. 
   * @return forceMvRscGrp
  **/
  @Schema(description = "If the destination resource-definition exists and has resources, the force_mv_rsc_grp must be used in order to change the resource-group of the destination resource-definition. This is a safety-option to prevent unexpected autoplace-actions for example performed by the BalanceResourceTask. ")
  public Boolean isForceMvRscGrp() {
    return forceMvRscGrp;
  }

  public void setForceMvRscGrp(Boolean forceMvRscGrp) {
    this.forceMvRscGrp = forceMvRscGrp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupShip backupShip = (BackupShip) o;
    return Objects.equals(this.srcNodeName, backupShip.srcNodeName) &&
        Objects.equals(this.srcRscName, backupShip.srcRscName) &&
        Objects.equals(this.dstRscName, backupShip.dstRscName) &&
        Objects.equals(this.dstNodeName, backupShip.dstNodeName) &&
        Objects.equals(this.dstNetIfName, backupShip.dstNetIfName) &&
        Objects.equals(this.dstStorPool, backupShip.dstStorPool) &&
        Objects.equals(this.storPoolRename, backupShip.storPoolRename) &&
        Objects.equals(this.downloadOnly, backupShip.downloadOnly) &&
        Objects.equals(this.forceRestore, backupShip.forceRestore) &&
        Objects.equals(this.allowIncremental, backupShip.allowIncremental) &&
        Objects.equals(this.dstRscGrp, backupShip.dstRscGrp) &&
        Objects.equals(this.forceMvRscGrp, backupShip.forceMvRscGrp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(srcNodeName, srcRscName, dstRscName, dstNodeName, dstNetIfName, dstStorPool, storPoolRename, downloadOnly, forceRestore, allowIncremental, dstRscGrp, forceMvRscGrp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupShip {\n");
    
    sb.append("    srcNodeName: ").append(toIndentedString(srcNodeName)).append("\n");
    sb.append("    srcRscName: ").append(toIndentedString(srcRscName)).append("\n");
    sb.append("    dstRscName: ").append(toIndentedString(dstRscName)).append("\n");
    sb.append("    dstNodeName: ").append(toIndentedString(dstNodeName)).append("\n");
    sb.append("    dstNetIfName: ").append(toIndentedString(dstNetIfName)).append("\n");
    sb.append("    dstStorPool: ").append(toIndentedString(dstStorPool)).append("\n");
    sb.append("    storPoolRename: ").append(toIndentedString(storPoolRename)).append("\n");
    sb.append("    downloadOnly: ").append(toIndentedString(downloadOnly)).append("\n");
    sb.append("    forceRestore: ").append(toIndentedString(forceRestore)).append("\n");
    sb.append("    allowIncremental: ").append(toIndentedString(allowIncremental)).append("\n");
    sb.append("    dstRscGrp: ").append(toIndentedString(dstRscGrp)).append("\n");
    sb.append("    forceMvRscGrp: ").append(toIndentedString(forceMvRscGrp)).append("\n");
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
