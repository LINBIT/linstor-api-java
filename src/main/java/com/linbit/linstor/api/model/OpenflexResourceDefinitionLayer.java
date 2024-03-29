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
 * OpenflexResourceDefinitionLayer
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-03T09:13:01.489Z[GMT]")

public class OpenflexResourceDefinitionLayer implements OneOfResourceDefinitionLayerData {
  @JsonProperty("resource_name_suffix")
  private String resourceNameSuffix = null;

  @JsonProperty("nqn")
  private String nqn = null;

  public OpenflexResourceDefinitionLayer resourceNameSuffix(String resourceNameSuffix) {
    this.resourceNameSuffix = resourceNameSuffix;
    return this;
  }

   /**
   * Get resourceNameSuffix
   * @return resourceNameSuffix
  **/
  @Schema(description = "")
  public String getResourceNameSuffix() {
    return resourceNameSuffix;
  }

  public void setResourceNameSuffix(String resourceNameSuffix) {
    this.resourceNameSuffix = resourceNameSuffix;
  }

  public OpenflexResourceDefinitionLayer nqn(String nqn) {
    this.nqn = nqn;
    return this;
  }

   /**
   * Get nqn
   * @return nqn
  **/
  @Schema(description = "")
  public String getNqn() {
    return nqn;
  }

  public void setNqn(String nqn) {
    this.nqn = nqn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenflexResourceDefinitionLayer openflexResourceDefinitionLayer = (OpenflexResourceDefinitionLayer) o;
    return Objects.equals(this.resourceNameSuffix, openflexResourceDefinitionLayer.resourceNameSuffix) &&
        Objects.equals(this.nqn, openflexResourceDefinitionLayer.nqn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceNameSuffix, nqn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenflexResourceDefinitionLayer {\n");
    
    sb.append("    resourceNameSuffix: ").append(toIndentedString(resourceNameSuffix)).append("\n");
    sb.append("    nqn: ").append(toIndentedString(nqn)).append("\n");
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
