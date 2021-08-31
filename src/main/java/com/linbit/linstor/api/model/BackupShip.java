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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * BackupShip
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-31T11:02:45.596Z[GMT]")
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
  @Schema(description = "")
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
  @Schema(description = "")
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
        Objects.equals(this.storPoolRename, backupShip.storPoolRename);
  }

  @Override
  public int hashCode() {
    return Objects.hash(srcNodeName, srcRscName, dstRscName, dstNodeName, dstNetIfName, dstStorPool, storPoolRename);
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