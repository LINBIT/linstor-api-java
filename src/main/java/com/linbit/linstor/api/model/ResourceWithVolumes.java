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
import com.linbit.linstor.api.model.Properties;
import com.linbit.linstor.api.model.Resource;
import com.linbit.linstor.api.model.ResourceLayer;
import com.linbit.linstor.api.model.ResourceState;
import com.linbit.linstor.api.model.Volume;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * ResourceWithVolumes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-18T05:15:14.614Z[GMT]")
public class ResourceWithVolumes extends Resource {
  @JsonProperty("volumes")
  private List<Volume> volumes = null;

  @JsonProperty("shared_name")
  private String sharedName = null;

  public ResourceWithVolumes volumes(List<Volume> volumes) {
    this.volumes = volumes;
    return this;
  }

  public ResourceWithVolumes addVolumesItem(Volume volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<>();
    }
    this.volumes.add(volumesItem);
    return this;
  }

   /**
   * Get volumes
   * @return volumes
  **/
  @Schema(description = "")
  public List<Volume> getVolumes() {
    return volumes;
  }

  public void setVolumes(List<Volume> volumes) {
    this.volumes = volumes;
  }

  public ResourceWithVolumes sharedName(String sharedName) {
    this.sharedName = sharedName;
    return this;
  }

   /**
   * shared space name of the data storage pool of the first volume of the resource or empty if data storage pool is not shared 
   * @return sharedName
  **/
  @Schema(description = "shared space name of the data storage pool of the first volume of the resource or empty if data storage pool is not shared ")
  public String getSharedName() {
    return sharedName;
  }

  public void setSharedName(String sharedName) {
    this.sharedName = sharedName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceWithVolumes resourceWithVolumes = (ResourceWithVolumes) o;
    return Objects.equals(this.volumes, resourceWithVolumes.volumes) &&
        Objects.equals(this.sharedName, resourceWithVolumes.sharedName) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volumes, sharedName, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceWithVolumes {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
    sb.append("    sharedName: ").append(toIndentedString(sharedName)).append("\n");
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