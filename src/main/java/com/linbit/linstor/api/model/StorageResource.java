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
import com.linbit.linstor.api.model.StorageVolume;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * StorageResource
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-18T06:34:31.141535853Z[Etc/UTC]")

public class StorageResource {
  @JsonProperty("storage_volumes")
  private List<StorageVolume> storageVolumes = null;

  public StorageResource storageVolumes(List<StorageVolume> storageVolumes) {
    this.storageVolumes = storageVolumes;
    return this;
  }

  public StorageResource addStorageVolumesItem(StorageVolume storageVolumesItem) {
    if (this.storageVolumes == null) {
      this.storageVolumes = new ArrayList<>();
    }
    this.storageVolumes.add(storageVolumesItem);
    return this;
  }

   /**
   * Get storageVolumes
   * @return storageVolumes
  **/
  @Schema(description = "")
  public List<StorageVolume> getStorageVolumes() {
    return storageVolumes;
  }

  public void setStorageVolumes(List<StorageVolume> storageVolumes) {
    this.storageVolumes = storageVolumes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageResource storageResource = (StorageResource) o;
    return Objects.equals(this.storageVolumes, storageResource.storageVolumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storageVolumes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageResource {\n");
    
    sb.append("    storageVolumes: ").append(toIndentedString(storageVolumes)).append("\n");
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
