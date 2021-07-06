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
import com.linbit.linstor.api.model.AutoSelectFilter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * ResourceGroupSpawn
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-18T05:15:14.614Z[GMT]")
public class ResourceGroupSpawn {
  @JsonProperty("resource_definition_name")
  private String resourceDefinitionName = null;

  @JsonProperty("resource_definition_external_name")
  private String resourceDefinitionExternalName = null;

  @JsonProperty("volume_sizes")
  private List<Long> volumeSizes = null;

  @JsonProperty("select_filter")
  private AutoSelectFilter selectFilter = null;

  @JsonProperty("partial")
  private Boolean partial = false;

  @JsonProperty("definitions_only")
  private Boolean definitionsOnly = false;

  public ResourceGroupSpawn resourceDefinitionName(String resourceDefinitionName) {
    this.resourceDefinitionName = resourceDefinitionName;
    return this;
  }

   /**
   * name of the resulting resource-definition
   * @return resourceDefinitionName
  **/
  @Schema(description = "name of the resulting resource-definition")
  public String getResourceDefinitionName() {
    return resourceDefinitionName;
  }

  public void setResourceDefinitionName(String resourceDefinitionName) {
    this.resourceDefinitionName = resourceDefinitionName;
  }

  public ResourceGroupSpawn resourceDefinitionExternalName(String resourceDefinitionExternalName) {
    this.resourceDefinitionExternalName = resourceDefinitionExternalName;
    return this;
  }

   /**
   * External name can be used to have native resource names. If you need to store a non Linstor compatible resource name use this field and Linstor will generate a compatible name. 
   * @return resourceDefinitionExternalName
  **/
  @Schema(description = "External name can be used to have native resource names. If you need to store a non Linstor compatible resource name use this field and Linstor will generate a compatible name. ")
  public String getResourceDefinitionExternalName() {
    return resourceDefinitionExternalName;
  }

  public void setResourceDefinitionExternalName(String resourceDefinitionExternalName) {
    this.resourceDefinitionExternalName = resourceDefinitionExternalName;
  }

  public ResourceGroupSpawn volumeSizes(List<Long> volumeSizes) {
    this.volumeSizes = volumeSizes;
    return this;
  }

  public ResourceGroupSpawn addVolumeSizesItem(Long volumeSizesItem) {
    if (this.volumeSizes == null) {
      this.volumeSizes = new ArrayList<>();
    }
    this.volumeSizes.add(volumeSizesItem);
    return this;
  }

   /**
   * sizes (in kib) of the resulting volume-definitions
   * @return volumeSizes
  **/
  @Schema(description = "sizes (in kib) of the resulting volume-definitions")
  public List<Long> getVolumeSizes() {
    return volumeSizes;
  }

  public void setVolumeSizes(List<Long> volumeSizes) {
    this.volumeSizes = volumeSizes;
  }

  public ResourceGroupSpawn selectFilter(AutoSelectFilter selectFilter) {
    this.selectFilter = selectFilter;
    return this;
  }

   /**
   * Get selectFilter
   * @return selectFilter
  **/
  @Schema(description = "")
  public AutoSelectFilter getSelectFilter() {
    return selectFilter;
  }

  public void setSelectFilter(AutoSelectFilter selectFilter) {
    this.selectFilter = selectFilter;
  }

  public ResourceGroupSpawn partial(Boolean partial) {
    this.partial = partial;
    return this;
  }

   /**
   * If false, the length of the vlm_sizes has to match the number of volume-groups or an error is returned.  If true and there are more vlm_sizes than volume-groups, the additional volume-definitions will simply have no pre-set properties (i.e. \&quot;empty\&quot; volume-definitions) If true and there are less vlm_sizes than volume-groups, the additional volume-groups won&#x27;t be used.  If the count of vlm_sizes matches the number of volume-groups, this \&quot;partial\&quot; parameter has no effect. 
   * @return partial
  **/
  @Schema(description = "If false, the length of the vlm_sizes has to match the number of volume-groups or an error is returned.  If true and there are more vlm_sizes than volume-groups, the additional volume-definitions will simply have no pre-set properties (i.e. \"empty\" volume-definitions) If true and there are less vlm_sizes than volume-groups, the additional volume-groups won't be used.  If the count of vlm_sizes matches the number of volume-groups, this \"partial\" parameter has no effect. ")
  public Boolean isPartial() {
    return partial;
  }

  public void setPartial(Boolean partial) {
    this.partial = partial;
  }

  public ResourceGroupSpawn definitionsOnly(Boolean definitionsOnly) {
    this.definitionsOnly = definitionsOnly;
    return this;
  }

   /**
   * If true, the spawn command will only create the resource-definition with the volume-definitions but will not perform an auto-place, even if it is configured. 
   * @return definitionsOnly
  **/
  @Schema(description = "If true, the spawn command will only create the resource-definition with the volume-definitions but will not perform an auto-place, even if it is configured. ")
  public Boolean isDefinitionsOnly() {
    return definitionsOnly;
  }

  public void setDefinitionsOnly(Boolean definitionsOnly) {
    this.definitionsOnly = definitionsOnly;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceGroupSpawn resourceGroupSpawn = (ResourceGroupSpawn) o;
    return Objects.equals(this.resourceDefinitionName, resourceGroupSpawn.resourceDefinitionName) &&
        Objects.equals(this.resourceDefinitionExternalName, resourceGroupSpawn.resourceDefinitionExternalName) &&
        Objects.equals(this.volumeSizes, resourceGroupSpawn.volumeSizes) &&
        Objects.equals(this.selectFilter, resourceGroupSpawn.selectFilter) &&
        Objects.equals(this.partial, resourceGroupSpawn.partial) &&
        Objects.equals(this.definitionsOnly, resourceGroupSpawn.definitionsOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceDefinitionName, resourceDefinitionExternalName, volumeSizes, selectFilter, partial, definitionsOnly);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceGroupSpawn {\n");
    
    sb.append("    resourceDefinitionName: ").append(toIndentedString(resourceDefinitionName)).append("\n");
    sb.append("    resourceDefinitionExternalName: ").append(toIndentedString(resourceDefinitionExternalName)).append("\n");
    sb.append("    volumeSizes: ").append(toIndentedString(volumeSizes)).append("\n");
    sb.append("    selectFilter: ").append(toIndentedString(selectFilter)).append("\n");
    sb.append("    partial: ").append(toIndentedString(partial)).append("\n");
    sb.append("    definitionsOnly: ").append(toIndentedString(definitionsOnly)).append("\n");
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