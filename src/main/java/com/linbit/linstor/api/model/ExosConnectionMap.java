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
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * ExosConnectionMap
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-31T11:02:45.596Z[GMT]")
public class ExosConnectionMap {
  @JsonProperty("node_name")
  private String nodeName = null;

  @JsonProperty("enclosure_name")
  private String enclosureName = null;

  @JsonProperty("connections")
  private List<String> connections = null;

  public ExosConnectionMap nodeName(String nodeName) {
    this.nodeName = nodeName;
    return this;
  }

   /**
   * Get nodeName
   * @return nodeName
  **/
  @Schema(description = "")
  public String getNodeName() {
    return nodeName;
  }

  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }

  public ExosConnectionMap enclosureName(String enclosureName) {
    this.enclosureName = enclosureName;
    return this;
  }

   /**
   * Get enclosureName
   * @return enclosureName
  **/
  @Schema(description = "")
  public String getEnclosureName() {
    return enclosureName;
  }

  public void setEnclosureName(String enclosureName) {
    this.enclosureName = enclosureName;
  }

  public ExosConnectionMap connections(List<String> connections) {
    this.connections = connections;
    return this;
  }

  public ExosConnectionMap addConnectionsItem(String connectionsItem) {
    if (this.connections == null) {
      this.connections = new ArrayList<>();
    }
    this.connections.add(connectionsItem);
    return this;
  }

   /**
   * Get connections
   * @return connections
  **/
  @Schema(description = "")
  public List<String> getConnections() {
    return connections;
  }

  public void setConnections(List<String> connections) {
    this.connections = connections;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExosConnectionMap exosConnectionMap = (ExosConnectionMap) o;
    return Objects.equals(this.nodeName, exosConnectionMap.nodeName) &&
        Objects.equals(this.enclosureName, exosConnectionMap.enclosureName) &&
        Objects.equals(this.connections, exosConnectionMap.connections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeName, enclosureName, connections);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExosConnectionMap {\n");
    
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    enclosureName: ").append(toIndentedString(enclosureName)).append("\n");
    sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
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
