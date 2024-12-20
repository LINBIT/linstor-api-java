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
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * DatabaseBackupRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-18T06:34:31.141535853Z[Etc/UTC]")

public class DatabaseBackupRequest {
  @JsonProperty("backup_name")
  private String backupName = null;

  public DatabaseBackupRequest backupName(String backupName) {
    this.backupName = backupName;
    return this;
  }

   /**
   * Get backupName
   * @return backupName
  **/
  @Schema(description = "")
  public String getBackupName() {
    return backupName;
  }

  public void setBackupName(String backupName) {
    this.backupName = backupName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatabaseBackupRequest databaseBackupRequest = (DatabaseBackupRequest) o;
    return Objects.equals(this.backupName, databaseBackupRequest.backupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabaseBackupRequest {\n");
    
    sb.append("    backupName: ").append(toIndentedString(backupName)).append("\n");
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
