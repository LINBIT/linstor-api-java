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
import com.linbit.linstor.api.model.CacheVolume;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * CacheResource
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-18T05:15:14.614Z[GMT]")
public class CacheResource {
  @JsonProperty("cache_volumes")
  private List<CacheVolume> cacheVolumes = null;

  public CacheResource cacheVolumes(List<CacheVolume> cacheVolumes) {
    this.cacheVolumes = cacheVolumes;
    return this;
  }

  public CacheResource addCacheVolumesItem(CacheVolume cacheVolumesItem) {
    if (this.cacheVolumes == null) {
      this.cacheVolumes = new ArrayList<>();
    }
    this.cacheVolumes.add(cacheVolumesItem);
    return this;
  }

   /**
   * Get cacheVolumes
   * @return cacheVolumes
  **/
  @Schema(description = "")
  public List<CacheVolume> getCacheVolumes() {
    return cacheVolumes;
  }

  public void setCacheVolumes(List<CacheVolume> cacheVolumes) {
    this.cacheVolumes = cacheVolumes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CacheResource cacheResource = (CacheResource) o;
    return Objects.equals(this.cacheVolumes, cacheResource.cacheVolumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cacheVolumes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CacheResource {\n");
    
    sb.append("    cacheVolumes: ").append(toIndentedString(cacheVolumes)).append("\n");
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
