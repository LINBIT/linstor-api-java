/*
 * Linstor REST API
 *
 *
 * OpenAPI spec version: 1.6.0
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
 * ErrorReportDelete
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-02-05T10:27:33.226Z[GMT]")
public class ErrorReportDelete {
  @JsonProperty("since")
  private Long since = null;

  @JsonProperty("to")
  private Long to = null;

  @JsonProperty("nodes")
  private List<String> nodes = null;

  @JsonProperty("exception")
  private String exception = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("ids")
  private List<String> ids = null;

  public ErrorReportDelete since(Long since) {
    this.since = since;
    return this;
  }

   /**
   * timestamp in millis start date to delete
   * @return since
  **/
  @Schema(description = "timestamp in millis start date to delete")
  public Long getSince() {
    return since;
  }

  public void setSince(Long since) {
    this.since = since;
  }

  public ErrorReportDelete to(Long to) {
    this.to = to;
    return this;
  }

   /**
   * timestamp in millis for the end date to delete
   * @return to
  **/
  @Schema(description = "timestamp in millis for the end date to delete")
  public Long getTo() {
    return to;
  }

  public void setTo(Long to) {
    this.to = to;
  }

  public ErrorReportDelete nodes(List<String> nodes) {
    this.nodes = nodes;
    return this;
  }

  public ErrorReportDelete addNodesItem(String nodesItem) {
    if (this.nodes == null) {
      this.nodes = new ArrayList<>();
    }
    this.nodes.add(nodesItem);
    return this;
  }

   /**
   * on which nodes to delete error-reports, if empty/null all nodes
   * @return nodes
  **/
  @Schema(description = "on which nodes to delete error-reports, if empty/null all nodes")
  public List<String> getNodes() {
    return nodes;
  }

  public void setNodes(List<String> nodes) {
    this.nodes = nodes;
  }

  public ErrorReportDelete exception(String exception) {
    this.exception = exception;
    return this;
  }

   /**
   * delete all error reports with the given exception
   * @return exception
  **/
  @Schema(description = "delete all error reports with the given exception")
  public String getException() {
    return exception;
  }

  public void setException(String exception) {
    this.exception = exception;
  }

  public ErrorReportDelete version(String version) {
    this.version = version;
    return this;
  }

   /**
   * delete all error reports from the given version
   * @return version
  **/
  @Schema(description = "delete all error reports from the given version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public ErrorReportDelete ids(List<String> ids) {
    this.ids = ids;
    return this;
  }

  public ErrorReportDelete addIdsItem(String idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * error report ids to delete
   * @return ids
  **/
  @Schema(description = "error report ids to delete")
  public List<String> getIds() {
    return ids;
  }

  public void setIds(List<String> ids) {
    this.ids = ids;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorReportDelete errorReportDelete = (ErrorReportDelete) o;
    return Objects.equals(this.since, errorReportDelete.since) &&
        Objects.equals(this.to, errorReportDelete.to) &&
        Objects.equals(this.nodes, errorReportDelete.nodes) &&
        Objects.equals(this.exception, errorReportDelete.exception) &&
        Objects.equals(this.version, errorReportDelete.version) &&
        Objects.equals(this.ids, errorReportDelete.ids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(since, to, nodes, exception, version, ids);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorReportDelete {\n");
    
    sb.append("    since: ").append(toIndentedString(since)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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
