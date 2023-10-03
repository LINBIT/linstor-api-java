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
 * Clone request object
 */
@Schema(description = "Clone request object")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-03T09:13:01.489Z[GMT]")

public class ResourceDefinitionCloneRequest {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("external_name")
  private String externalName = null;

  @JsonProperty("use_zfs_clone")
  private Boolean useZfsClone = null;

  public ResourceDefinitionCloneRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResourceDefinitionCloneRequest externalName(String externalName) {
    this.externalName = externalName;
    return this;
  }

   /**
   * Get externalName
   * @return externalName
  **/
  @Schema(description = "")
  public String getExternalName() {
    return externalName;
  }

  public void setExternalName(String externalName) {
    this.externalName = externalName;
  }

  public ResourceDefinitionCloneRequest useZfsClone(Boolean useZfsClone) {
    this.useZfsClone = useZfsClone;
    return this;
  }

   /**
   * If true Zfs will not use send/recv to clone, but instead use a parent snapshot with clone, which cannot be deleted 
   * @return useZfsClone
  **/
  @Schema(description = "If true Zfs will not use send/recv to clone, but instead use a parent snapshot with clone, which cannot be deleted ")
  public Boolean isUseZfsClone() {
    return useZfsClone;
  }

  public void setUseZfsClone(Boolean useZfsClone) {
    this.useZfsClone = useZfsClone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceDefinitionCloneRequest resourceDefinitionCloneRequest = (ResourceDefinitionCloneRequest) o;
    return Objects.equals(this.name, resourceDefinitionCloneRequest.name) &&
        Objects.equals(this.externalName, resourceDefinitionCloneRequest.externalName) &&
        Objects.equals(this.useZfsClone, resourceDefinitionCloneRequest.useZfsClone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, externalName, useZfsClone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceDefinitionCloneRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    externalName: ").append(toIndentedString(externalName)).append("\n");
    sb.append("    useZfsClone: ").append(toIndentedString(useZfsClone)).append("\n");
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
