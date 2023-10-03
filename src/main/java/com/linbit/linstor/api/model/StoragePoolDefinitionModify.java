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
import com.linbit.linstor.api.model.Properties;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * StoragePoolDefinitionModify
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-03T09:13:01.489Z[GMT]")

public class StoragePoolDefinitionModify {
  @JsonProperty("override_props")
  private Properties overrideProps = null;

  @JsonProperty("delete_props")
  private List<String> deleteProps = null;

  @JsonProperty("delete_namespaces")
  private List<String> deleteNamespaces = null;

  public StoragePoolDefinitionModify overrideProps(Properties overrideProps) {
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

  public StoragePoolDefinitionModify deleteProps(List<String> deleteProps) {
    this.deleteProps = deleteProps;
    return this;
  }

  public StoragePoolDefinitionModify addDeletePropsItem(String deletePropsItem) {
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

  public StoragePoolDefinitionModify deleteNamespaces(List<String> deleteNamespaces) {
    this.deleteNamespaces = deleteNamespaces;
    return this;
  }

  public StoragePoolDefinitionModify addDeleteNamespacesItem(String deleteNamespacesItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoragePoolDefinitionModify storagePoolDefinitionModify = (StoragePoolDefinitionModify) o;
    return Objects.equals(this.overrideProps, storagePoolDefinitionModify.overrideProps) &&
        Objects.equals(this.deleteProps, storagePoolDefinitionModify.deleteProps) &&
        Objects.equals(this.deleteNamespaces, storagePoolDefinitionModify.deleteNamespaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overrideProps, deleteProps, deleteNamespaces);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoragePoolDefinitionModify {\n");
    
    sb.append("    overrideProps: ").append(toIndentedString(overrideProps)).append("\n");
    sb.append("    deleteProps: ").append(toIndentedString(deleteProps)).append("\n");
    sb.append("    deleteNamespaces: ").append(toIndentedString(deleteNamespaces)).append("\n");
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
