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
import com.linbit.linstor.api.model.LayerType;
import com.linbit.linstor.api.model.Properties;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * ResourceDefinitionModify
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-18T06:34:31.141535853Z[Etc/UTC]")

public class ResourceDefinitionModify {
  @JsonProperty("override_props")
  private Properties overrideProps = null;

  @JsonProperty("delete_props")
  private List<String> deleteProps = null;

  @JsonProperty("delete_namespaces")
  private List<String> deleteNamespaces = null;

  @JsonProperty("drbd_port")
  private Integer drbdPort = null;

  @JsonProperty("drbd_peer_slots")
  private Integer drbdPeerSlots = null;

  @JsonProperty("layer_stack")
  private List<LayerType> layerStack = null;

  @JsonProperty("resource_group")
  private String resourceGroup = null;

  public ResourceDefinitionModify overrideProps(Properties overrideProps) {
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

  public ResourceDefinitionModify deleteProps(List<String> deleteProps) {
    this.deleteProps = deleteProps;
    return this;
  }

  public ResourceDefinitionModify addDeletePropsItem(String deletePropsItem) {
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

  public ResourceDefinitionModify deleteNamespaces(List<String> deleteNamespaces) {
    this.deleteNamespaces = deleteNamespaces;
    return this;
  }

  public ResourceDefinitionModify addDeleteNamespacesItem(String deleteNamespacesItem) {
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

  public ResourceDefinitionModify drbdPort(Integer drbdPort) {
    this.drbdPort = drbdPort;
    return this;
  }

   /**
   * drbd port for resources
   * @return drbdPort
  **/
  @Schema(description = "drbd port for resources")
  public Integer getDrbdPort() {
    return drbdPort;
  }

  public void setDrbdPort(Integer drbdPort) {
    this.drbdPort = drbdPort;
  }

  public ResourceDefinitionModify drbdPeerSlots(Integer drbdPeerSlots) {
    this.drbdPeerSlots = drbdPeerSlots;
    return this;
  }

   /**
   * drbd peer slot number
   * @return drbdPeerSlots
  **/
  @Schema(description = "drbd peer slot number")
  public Integer getDrbdPeerSlots() {
    return drbdPeerSlots;
  }

  public void setDrbdPeerSlots(Integer drbdPeerSlots) {
    this.drbdPeerSlots = drbdPeerSlots;
  }

  public ResourceDefinitionModify layerStack(List<LayerType> layerStack) {
    this.layerStack = layerStack;
    return this;
  }

  public ResourceDefinitionModify addLayerStackItem(LayerType layerStackItem) {
    if (this.layerStack == null) {
      this.layerStack = new ArrayList<>();
    }
    this.layerStack.add(layerStackItem);
    return this;
  }

   /**
   * Get layerStack
   * @return layerStack
  **/
  @Schema(description = "")
  public List<LayerType> getLayerStack() {
    return layerStack;
  }

  public void setLayerStack(List<LayerType> layerStack) {
    this.layerStack = layerStack;
  }

  public ResourceDefinitionModify resourceGroup(String resourceGroup) {
    this.resourceGroup = resourceGroup;
    return this;
  }

   /**
   * change resource group to the given group name
   * @return resourceGroup
  **/
  @Schema(description = "change resource group to the given group name")
  public String getResourceGroup() {
    return resourceGroup;
  }

  public void setResourceGroup(String resourceGroup) {
    this.resourceGroup = resourceGroup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceDefinitionModify resourceDefinitionModify = (ResourceDefinitionModify) o;
    return Objects.equals(this.overrideProps, resourceDefinitionModify.overrideProps) &&
        Objects.equals(this.deleteProps, resourceDefinitionModify.deleteProps) &&
        Objects.equals(this.deleteNamespaces, resourceDefinitionModify.deleteNamespaces) &&
        Objects.equals(this.drbdPort, resourceDefinitionModify.drbdPort) &&
        Objects.equals(this.drbdPeerSlots, resourceDefinitionModify.drbdPeerSlots) &&
        Objects.equals(this.layerStack, resourceDefinitionModify.layerStack) &&
        Objects.equals(this.resourceGroup, resourceDefinitionModify.resourceGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overrideProps, deleteProps, deleteNamespaces, drbdPort, drbdPeerSlots, layerStack, resourceGroup);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceDefinitionModify {\n");
    
    sb.append("    overrideProps: ").append(toIndentedString(overrideProps)).append("\n");
    sb.append("    deleteProps: ").append(toIndentedString(deleteProps)).append("\n");
    sb.append("    deleteNamespaces: ").append(toIndentedString(deleteNamespaces)).append("\n");
    sb.append("    drbdPort: ").append(toIndentedString(drbdPort)).append("\n");
    sb.append("    drbdPeerSlots: ").append(toIndentedString(drbdPeerSlots)).append("\n");
    sb.append("    layerStack: ").append(toIndentedString(layerStack)).append("\n");
    sb.append("    resourceGroup: ").append(toIndentedString(resourceGroup)).append("\n");
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
