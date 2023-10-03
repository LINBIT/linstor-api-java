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
/**
 * NodeConnection
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-03T09:13:01.489Z[GMT]")

public class NodeConnection {
  @JsonProperty("node_a")
  private String nodeA = null;

  @JsonProperty("node_b")
  private String nodeB = null;

  @JsonProperty("props")
  private Properties props = null;

  public NodeConnection nodeA(String nodeA) {
    this.nodeA = nodeA;
    return this;
  }

   /**
   * source node of the connection
   * @return nodeA
  **/
  @Schema(description = "source node of the connection")
  public String getNodeA() {
    return nodeA;
  }

  public void setNodeA(String nodeA) {
    this.nodeA = nodeA;
  }

  public NodeConnection nodeB(String nodeB) {
    this.nodeB = nodeB;
    return this;
  }

   /**
   * target node of the connection
   * @return nodeB
  **/
  @Schema(description = "target node of the connection")
  public String getNodeB() {
    return nodeB;
  }

  public void setNodeB(String nodeB) {
    this.nodeB = nodeB;
  }

  public NodeConnection props(Properties props) {
    this.props = props;
    return this;
  }

   /**
   * Get props
   * @return props
  **/
  @Schema(description = "")
  public Properties getProps() {
    return props;
  }

  public void setProps(Properties props) {
    this.props = props;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeConnection nodeConnection = (NodeConnection) o;
    return Objects.equals(this.nodeA, nodeConnection.nodeA) &&
        Objects.equals(this.nodeB, nodeConnection.nodeB) &&
        Objects.equals(this.props, nodeConnection.props);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeA, nodeB, props);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeConnection {\n");
    
    sb.append("    nodeA: ").append(toIndentedString(nodeA)).append("\n");
    sb.append("    nodeB: ").append(toIndentedString(nodeB)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
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