/*
 * Linstor REST API
 *
 *
 * OpenAPI spec version: 1.10.0
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
 * KeyValueStoreModify
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-31T11:02:45.596Z[GMT]")
public class KeyValueStoreModify {
  @JsonProperty("override_props")
  private Properties overrideProps = null;

  @JsonProperty("delete_props")
  private List<String> deleteProps = null;

  @JsonProperty("delete_namespaces")
  private List<String> deleteNamespaces = null;

  public KeyValueStoreModify overrideProps(Properties overrideProps) {
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

  public KeyValueStoreModify deleteProps(List<String> deleteProps) {
    this.deleteProps = deleteProps;
    return this;
  }

  public KeyValueStoreModify addDeletePropsItem(String deletePropsItem) {
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

  public KeyValueStoreModify deleteNamespaces(List<String> deleteNamespaces) {
    this.deleteNamespaces = deleteNamespaces;
    return this;
  }

  public KeyValueStoreModify addDeleteNamespacesItem(String deleteNamespacesItem) {
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
    KeyValueStoreModify keyValueStoreModify = (KeyValueStoreModify) o;
    return Objects.equals(this.overrideProps, keyValueStoreModify.overrideProps) &&
        Objects.equals(this.deleteProps, keyValueStoreModify.deleteProps) &&
        Objects.equals(this.deleteNamespaces, keyValueStoreModify.deleteNamespaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overrideProps, deleteProps, deleteNamespaces);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyValueStoreModify {\n");
    
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
