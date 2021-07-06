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
 * ResourceConnection
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-18T05:15:14.614Z[GMT]")
public class ResourceConnection {
  @JsonProperty("node_a")
  private String nodeA = null;

  @JsonProperty("node_b")
  private String nodeB = null;

  @JsonProperty("props")
  private Properties props = null;

  @JsonProperty("flags")
  private List<String> flags = null;

  @JsonProperty("port")
  private Integer port = null;

  public ResourceConnection nodeA(String nodeA) {
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

  public ResourceConnection nodeB(String nodeB) {
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

  public ResourceConnection props(Properties props) {
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

  public ResourceConnection flags(List<String> flags) {
    this.flags = flags;
    return this;
  }

  public ResourceConnection addFlagsItem(String flagsItem) {
    if (this.flags == null) {
      this.flags = new ArrayList<>();
    }
    this.flags.add(flagsItem);
    return this;
  }

   /**
   * Get flags
   * @return flags
  **/
  @Schema(description = "")
  public List<String> getFlags() {
    return flags;
  }

  public void setFlags(List<String> flags) {
    this.flags = flags;
  }

  public ResourceConnection port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @Schema(description = "")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceConnection resourceConnection = (ResourceConnection) o;
    return Objects.equals(this.nodeA, resourceConnection.nodeA) &&
        Objects.equals(this.nodeB, resourceConnection.nodeB) &&
        Objects.equals(this.props, resourceConnection.props) &&
        Objects.equals(this.flags, resourceConnection.flags) &&
        Objects.equals(this.port, resourceConnection.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeA, nodeB, props, flags, port);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceConnection {\n");
    
    sb.append("    nodeA: ").append(toIndentedString(nodeA)).append("\n");
    sb.append("    nodeB: ").append(toIndentedString(nodeB)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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