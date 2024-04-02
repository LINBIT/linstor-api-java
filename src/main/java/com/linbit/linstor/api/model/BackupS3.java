/*
 * Linstor REST API
 *
 *
 * OpenAPI spec version: 1.22.0
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
 * BackupS3
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-02T13:40:09.628252133Z[Etc/UTC]")

public class BackupS3 {
  @JsonProperty("meta_name")
  private String metaName = null;

  public BackupS3 metaName(String metaName) {
    this.metaName = metaName;
    return this;
  }

   /**
   * Get metaName
   * @return metaName
  **/
  @Schema(description = "")
  public String getMetaName() {
    return metaName;
  }

  public void setMetaName(String metaName) {
    this.metaName = metaName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupS3 backupS3 = (BackupS3) o;
    return Objects.equals(this.metaName, backupS3.metaName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metaName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupS3 {\n");
    
    sb.append("    metaName: ").append(toIndentedString(metaName)).append("\n");
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
