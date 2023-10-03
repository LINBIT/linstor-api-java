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
import com.linbit.linstor.api.model.WritecacheVolume;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * WritecacheResource
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-03T09:13:01.489Z[GMT]")

public class WritecacheResource {
  @JsonProperty("writecache_volumes")
  private List<WritecacheVolume> writecacheVolumes = null;

  public WritecacheResource writecacheVolumes(List<WritecacheVolume> writecacheVolumes) {
    this.writecacheVolumes = writecacheVolumes;
    return this;
  }

  public WritecacheResource addWritecacheVolumesItem(WritecacheVolume writecacheVolumesItem) {
    if (this.writecacheVolumes == null) {
      this.writecacheVolumes = new ArrayList<>();
    }
    this.writecacheVolumes.add(writecacheVolumesItem);
    return this;
  }

   /**
   * Get writecacheVolumes
   * @return writecacheVolumes
  **/
  @Schema(description = "")
  public List<WritecacheVolume> getWritecacheVolumes() {
    return writecacheVolumes;
  }

  public void setWritecacheVolumes(List<WritecacheVolume> writecacheVolumes) {
    this.writecacheVolumes = writecacheVolumes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WritecacheResource writecacheResource = (WritecacheResource) o;
    return Objects.equals(this.writecacheVolumes, writecacheResource.writecacheVolumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(writecacheVolumes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WritecacheResource {\n");
    
    sb.append("    writecacheVolumes: ").append(toIndentedString(writecacheVolumes)).append("\n");
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
