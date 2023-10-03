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
 * SnapshotVolumeDefinition
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-03T09:13:01.489Z[GMT]")

public class SnapshotVolumeDefinition {
  @JsonProperty("volume_number")
  private Integer volumeNumber = null;

  @JsonProperty("size_kib")
  private Long sizeKib = null;

  public SnapshotVolumeDefinition volumeNumber(Integer volumeNumber) {
    this.volumeNumber = volumeNumber;
    return this;
  }

   /**
   * Get volumeNumber
   * @return volumeNumber
  **/
  @Schema(description = "")
  public Integer getVolumeNumber() {
    return volumeNumber;
  }

  public void setVolumeNumber(Integer volumeNumber) {
    this.volumeNumber = volumeNumber;
  }

  public SnapshotVolumeDefinition sizeKib(Long sizeKib) {
    this.sizeKib = sizeKib;
    return this;
  }

   /**
   * Volume size in KiB
   * @return sizeKib
  **/
  @Schema(description = "Volume size in KiB")
  public Long getSizeKib() {
    return sizeKib;
  }

  public void setSizeKib(Long sizeKib) {
    this.sizeKib = sizeKib;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotVolumeDefinition snapshotVolumeDefinition = (SnapshotVolumeDefinition) o;
    return Objects.equals(this.volumeNumber, snapshotVolumeDefinition.volumeNumber) &&
        Objects.equals(this.sizeKib, snapshotVolumeDefinition.sizeKib);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volumeNumber, sizeKib);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotVolumeDefinition {\n");
    
    sb.append("    volumeNumber: ").append(toIndentedString(volumeNumber)).append("\n");
    sb.append("    sizeKib: ").append(toIndentedString(sizeKib)).append("\n");
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
