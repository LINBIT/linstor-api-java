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
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * BackupCreate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-03T09:13:01.489Z[GMT]")

public class BackupCreate {
  @JsonProperty("rsc_name")
  private String rscName = null;

  @JsonProperty("node_name")
  private String nodeName = null;

  @JsonProperty("snap_name")
  private String snapName = null;

  @JsonProperty("incremental")
  private Boolean incremental = null;

  public BackupCreate rscName(String rscName) {
    this.rscName = rscName;
    return this;
  }

   /**
   * Get rscName
   * @return rscName
  **/
  @Schema(required = true, description = "")
  public String getRscName() {
    return rscName;
  }

  public void setRscName(String rscName) {
    this.rscName = rscName;
  }

  public BackupCreate nodeName(String nodeName) {
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

  public BackupCreate snapName(String snapName) {
    this.snapName = snapName;
    return this;
  }

   /**
   * Get snapName
   * @return snapName
  **/
  @Schema(description = "")
  public String getSnapName() {
    return snapName;
  }

  public void setSnapName(String snapName) {
    this.snapName = snapName;
  }

  public BackupCreate incremental(Boolean incremental) {
    this.incremental = incremental;
    return this;
  }

   /**
   * Get incremental
   * @return incremental
  **/
  @Schema(description = "")
  public Boolean isIncremental() {
    return incremental;
  }

  public void setIncremental(Boolean incremental) {
    this.incremental = incremental;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupCreate backupCreate = (BackupCreate) o;
    return Objects.equals(this.rscName, backupCreate.rscName) &&
        Objects.equals(this.nodeName, backupCreate.nodeName) &&
        Objects.equals(this.snapName, backupCreate.snapName) &&
        Objects.equals(this.incremental, backupCreate.incremental);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rscName, nodeName, snapName, incremental);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupCreate {\n");
    
    sb.append("    rscName: ").append(toIndentedString(rscName)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    snapName: ").append(toIndentedString(snapName)).append("\n");
    sb.append("    incremental: ").append(toIndentedString(incremental)).append("\n");
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
