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
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * VolumeDefinitionModify
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-18T05:15:14.614Z[GMT]")
public class VolumeDefinitionModify {
  @JsonProperty("size_kib")
  private Long sizeKib = null;

  @JsonProperty("override_props")
  private Properties overrideProps = null;

  @JsonProperty("delete_props")
  private List<String> deleteProps = null;

  @JsonProperty("delete_namespaces")
  private List<String> deleteNamespaces = null;

  @JsonProperty("flags")
  private List<String> flags = null;

  public VolumeDefinitionModify sizeKib(Long sizeKib) {
    this.sizeKib = sizeKib;
    return this;
  }

   /**
   * Get sizeKib
   * @return sizeKib
  **/
  @Schema(description = "")
  public Long getSizeKib() {
    return sizeKib;
  }

  public void setSizeKib(Long sizeKib) {
    this.sizeKib = sizeKib;
  }

  public VolumeDefinitionModify overrideProps(Properties overrideProps) {
    this.overrideProps = overrideProps;
    return this;
  }

   /**
   * Get overrideProps
   * @return overrideProps
  **/
  @Schema(description = "")
  public Properties getOverrideProps() {
    return overrideProps;
  }

  public void setOverrideProps(Properties overrideProps) {
    this.overrideProps = overrideProps;
  }

  public VolumeDefinitionModify deleteProps(List<String> deleteProps) {
    this.deleteProps = deleteProps;
    return this;
  }

  public VolumeDefinitionModify addDeletePropsItem(String deletePropsItem) {
    if (this.deleteProps == null) {
      this.deleteProps = new ArrayList<>();
    }
    this.deleteProps.add(deletePropsItem);
    return this;
  }

   /**
   * Get deleteProps
   * @return deleteProps
  **/
  @Schema(description = "")
  public List<String> getDeleteProps() {
    return deleteProps;
  }

  public void setDeleteProps(List<String> deleteProps) {
    this.deleteProps = deleteProps;
  }

  public VolumeDefinitionModify deleteNamespaces(List<String> deleteNamespaces) {
    this.deleteNamespaces = deleteNamespaces;
    return this;
  }

  public VolumeDefinitionModify addDeleteNamespacesItem(String deleteNamespacesItem) {
    if (this.deleteNamespaces == null) {
      this.deleteNamespaces = new ArrayList<>();
    }
    this.deleteNamespaces.add(deleteNamespacesItem);
    return this;
  }

   /**
   * Get deleteNamespaces
   * @return deleteNamespaces
  **/
  @Schema(description = "")
  public List<String> getDeleteNamespaces() {
    return deleteNamespaces;
  }

  public void setDeleteNamespaces(List<String> deleteNamespaces) {
    this.deleteNamespaces = deleteNamespaces;
  }

  public VolumeDefinitionModify flags(List<String> flags) {
    this.flags = flags;
    return this;
  }

  public VolumeDefinitionModify addFlagsItem(String flagsItem) {
    if (this.flags == null) {
      this.flags = new ArrayList<>();
    }
    this.flags.add(flagsItem);
    return this;
  }

   /**
   * To add a flag just specify the flag name, to remove a flag prepend it with a &#x27;-&#x27;.  Flags:   * GROSS_SIZE 
   * @return flags
  **/
  @Schema(description = "To add a flag just specify the flag name, to remove a flag prepend it with a '-'.  Flags:   * GROSS_SIZE ")
  public List<String> getFlags() {
    return flags;
  }

  public void setFlags(List<String> flags) {
    this.flags = flags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeDefinitionModify volumeDefinitionModify = (VolumeDefinitionModify) o;
    return Objects.equals(this.sizeKib, volumeDefinitionModify.sizeKib) &&
        Objects.equals(this.overrideProps, volumeDefinitionModify.overrideProps) &&
        Objects.equals(this.deleteProps, volumeDefinitionModify.deleteProps) &&
        Objects.equals(this.deleteNamespaces, volumeDefinitionModify.deleteNamespaces) &&
        Objects.equals(this.flags, volumeDefinitionModify.flags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sizeKib, overrideProps, deleteProps, deleteNamespaces, flags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeDefinitionModify {\n");
    
    sb.append("    sizeKib: ").append(toIndentedString(sizeKib)).append("\n");
    sb.append("    overrideProps: ").append(toIndentedString(overrideProps)).append("\n");
    sb.append("    deleteProps: ").append(toIndentedString(deleteProps)).append("\n");
    sb.append("    deleteNamespaces: ").append(toIndentedString(deleteNamespaces)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
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
