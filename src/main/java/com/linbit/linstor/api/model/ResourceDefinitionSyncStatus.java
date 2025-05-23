/*
 * Linstor REST API
 *
 *
 * OpenAPI spec version: 1.25.1
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
 * Clone status object
 */
@Schema(description = "Clone status object")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-05-08T11:58:50.875992750Z[Etc/UTC]")

public class ResourceDefinitionSyncStatus {
  @JsonProperty("synced_on_all")
  private Boolean syncedOnAll = false;

  public ResourceDefinitionSyncStatus syncedOnAll(Boolean syncedOnAll) {
    this.syncedOnAll = syncedOnAll;
    return this;
  }

   /**
   * Get syncedOnAll
   * @return syncedOnAll
  **/
  @Schema(required = true, description = "")
  public Boolean isSyncedOnAll() {
    return syncedOnAll;
  }

  public void setSyncedOnAll(Boolean syncedOnAll) {
    this.syncedOnAll = syncedOnAll;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceDefinitionSyncStatus resourceDefinitionSyncStatus = (ResourceDefinitionSyncStatus) o;
    return Objects.equals(this.syncedOnAll, resourceDefinitionSyncStatus.syncedOnAll);
  }

  @Override
  public int hashCode() {
    return Objects.hash(syncedOnAll);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceDefinitionSyncStatus {\n");
    
    sb.append("    syncedOnAll: ").append(toIndentedString(syncedOnAll)).append("\n");
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
