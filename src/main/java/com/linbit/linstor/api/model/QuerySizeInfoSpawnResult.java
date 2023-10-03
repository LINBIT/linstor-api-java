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
 * QuerySizeInfoSpawnResult
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-03T09:13:01.489Z[GMT]")

public class QuerySizeInfoSpawnResult {
  @JsonProperty("node_name")
  private String nodeName = null;

  @JsonProperty("stor_pool_name")
  private String storPoolName = null;

  @JsonProperty("stor_pool_oversubscription_ratio")
  private Double storPoolOversubscriptionRatio = null;

  public QuerySizeInfoSpawnResult nodeName(String nodeName) {
    this.nodeName = nodeName;
    return this;
  }

   /**
   * Get nodeName
   * @return nodeName
  **/
  @Schema(required = true, description = "")
  public String getNodeName() {
    return nodeName;
  }

  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }

  public QuerySizeInfoSpawnResult storPoolName(String storPoolName) {
    this.storPoolName = storPoolName;
    return this;
  }

   /**
   * Get storPoolName
   * @return storPoolName
  **/
  @Schema(required = true, description = "")
  public String getStorPoolName() {
    return storPoolName;
  }

  public void setStorPoolName(String storPoolName) {
    this.storPoolName = storPoolName;
  }

  public QuerySizeInfoSpawnResult storPoolOversubscriptionRatio(Double storPoolOversubscriptionRatio) {
    this.storPoolOversubscriptionRatio = storPoolOversubscriptionRatio;
    return this;
  }

   /**
   * Get storPoolOversubscriptionRatio
   * @return storPoolOversubscriptionRatio
  **/
  @Schema(description = "")
  public Double getStorPoolOversubscriptionRatio() {
    return storPoolOversubscriptionRatio;
  }

  public void setStorPoolOversubscriptionRatio(Double storPoolOversubscriptionRatio) {
    this.storPoolOversubscriptionRatio = storPoolOversubscriptionRatio;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuerySizeInfoSpawnResult querySizeInfoSpawnResult = (QuerySizeInfoSpawnResult) o;
    return Objects.equals(this.nodeName, querySizeInfoSpawnResult.nodeName) &&
        Objects.equals(this.storPoolName, querySizeInfoSpawnResult.storPoolName) &&
        Objects.equals(this.storPoolOversubscriptionRatio, querySizeInfoSpawnResult.storPoolOversubscriptionRatio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeName, storPoolName, storPoolOversubscriptionRatio);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuerySizeInfoSpawnResult {\n");
    
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    storPoolName: ").append(toIndentedString(storPoolName)).append("\n");
    sb.append("    storPoolOversubscriptionRatio: ").append(toIndentedString(storPoolOversubscriptionRatio)).append("\n");
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