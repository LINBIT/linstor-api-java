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
import com.linbit.linstor.api.model.BCacheVolume;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * BCacheResource
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-31T11:02:45.596Z[GMT]")
public class BCacheResource {
  @JsonProperty("bcache_volumes")
  private List<BCacheVolume> bcacheVolumes = null;

  public BCacheResource bcacheVolumes(List<BCacheVolume> bcacheVolumes) {
    this.bcacheVolumes = bcacheVolumes;
    return this;
  }

  public BCacheResource addBcacheVolumesItem(BCacheVolume bcacheVolumesItem) {
    if (this.bcacheVolumes == null) {
      this.bcacheVolumes = new ArrayList<>();
    }
    this.bcacheVolumes.add(bcacheVolumesItem);
    return this;
  }

   /**
   * Get bcacheVolumes
   * @return bcacheVolumes
  **/
  @Schema(description = "")
  public List<BCacheVolume> getBcacheVolumes() {
    return bcacheVolumes;
  }

  public void setBcacheVolumes(List<BCacheVolume> bcacheVolumes) {
    this.bcacheVolumes = bcacheVolumes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BCacheResource bcacheResource = (BCacheResource) o;
    return Objects.equals(this.bcacheVolumes, bcacheResource.bcacheVolumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bcacheVolumes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BCacheResource {\n");
    
    sb.append("    bcacheVolumes: ").append(toIndentedString(bcacheVolumes)).append("\n");
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
