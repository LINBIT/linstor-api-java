/*
 * Linstor REST API
 *
 *
 * OpenAPI spec version: 1.22.0
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
 * ErrorReport
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-02T13:40:09.628252133Z[Etc/UTC]")

public class ErrorReport {
  @JsonProperty("node_name")
  private String nodeName = null;

  @JsonProperty("error_time")
  private Long errorTime = null;

  @JsonProperty("filename")
  private String filename = null;

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("module")
  private String module = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("peer")
  private String peer = null;

  @JsonProperty("exception")
  private String exception = null;

  @JsonProperty("exception_message")
  private String exceptionMessage = null;

  @JsonProperty("origin_file")
  private String originFile = null;

  @JsonProperty("origin_method")
  private String originMethod = null;

  @JsonProperty("origin_line")
  private Integer originLine = null;

  public ErrorReport nodeName(String nodeName) {
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

  public ErrorReport errorTime(Long errorTime) {
    this.errorTime = errorTime;
    return this;
  }

   /**
   * Get errorTime
   * @return errorTime
  **/
  @Schema(required = true, description = "")
  public Long getErrorTime() {
    return errorTime;
  }

  public void setErrorTime(Long errorTime) {
    this.errorTime = errorTime;
  }

  public ErrorReport filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * Filename of the error report on the server.  Format is: &#x60;&#x60;&#x60;ErrorReport-{instanceid}-{nodeid}-{sequencenumber}.log&#x60;&#x60;&#x60; 
   * @return filename
  **/
  @Schema(description = "Filename of the error report on the server.  Format is: ```ErrorReport-{instanceid}-{nodeid}-{sequencenumber}.log``` ")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public ErrorReport text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Contains the full text of the error report file.
   * @return text
  **/
  @Schema(description = "Contains the full text of the error report file.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public ErrorReport module(String module) {
    this.module = module;
    return this;
  }

   /**
   * Which module this error occurred.
   * @return module
  **/
  @Schema(description = "Which module this error occurred.")
  public String getModule() {
    return module;
  }

  public void setModule(String module) {
    this.module = module;
  }

  public ErrorReport version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Linstor version this error report was created.
   * @return version
  **/
  @Schema(description = "Linstor version this error report was created.")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public ErrorReport peer(String peer) {
    this.peer = peer;
    return this;
  }

   /**
   * Peer client that was involved.
   * @return peer
  **/
  @Schema(description = "Peer client that was involved.")
  public String getPeer() {
    return peer;
  }

  public void setPeer(String peer) {
    this.peer = peer;
  }

  public ErrorReport exception(String exception) {
    this.exception = exception;
    return this;
  }

   /**
   * Exception that occurred
   * @return exception
  **/
  @Schema(description = "Exception that occurred")
  public String getException() {
    return exception;
  }

  public void setException(String exception) {
    this.exception = exception;
  }

  public ErrorReport exceptionMessage(String exceptionMessage) {
    this.exceptionMessage = exceptionMessage;
    return this;
  }

   /**
   * Exception message
   * @return exceptionMessage
  **/
  @Schema(description = "Exception message")
  public String getExceptionMessage() {
    return exceptionMessage;
  }

  public void setExceptionMessage(String exceptionMessage) {
    this.exceptionMessage = exceptionMessage;
  }

  public ErrorReport originFile(String originFile) {
    this.originFile = originFile;
    return this;
  }

   /**
   * Origin file of the exception
   * @return originFile
  **/
  @Schema(description = "Origin file of the exception")
  public String getOriginFile() {
    return originFile;
  }

  public void setOriginFile(String originFile) {
    this.originFile = originFile;
  }

  public ErrorReport originMethod(String originMethod) {
    this.originMethod = originMethod;
    return this;
  }

   /**
   * Origin method where the exception occurred
   * @return originMethod
  **/
  @Schema(description = "Origin method where the exception occurred")
  public String getOriginMethod() {
    return originMethod;
  }

  public void setOriginMethod(String originMethod) {
    this.originMethod = originMethod;
  }

  public ErrorReport originLine(Integer originLine) {
    this.originLine = originLine;
    return this;
  }

   /**
   * Origin line number
   * @return originLine
  **/
  @Schema(description = "Origin line number")
  public Integer getOriginLine() {
    return originLine;
  }

  public void setOriginLine(Integer originLine) {
    this.originLine = originLine;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorReport errorReport = (ErrorReport) o;
    return Objects.equals(this.nodeName, errorReport.nodeName) &&
        Objects.equals(this.errorTime, errorReport.errorTime) &&
        Objects.equals(this.filename, errorReport.filename) &&
        Objects.equals(this.text, errorReport.text) &&
        Objects.equals(this.module, errorReport.module) &&
        Objects.equals(this.version, errorReport.version) &&
        Objects.equals(this.peer, errorReport.peer) &&
        Objects.equals(this.exception, errorReport.exception) &&
        Objects.equals(this.exceptionMessage, errorReport.exceptionMessage) &&
        Objects.equals(this.originFile, errorReport.originFile) &&
        Objects.equals(this.originMethod, errorReport.originMethod) &&
        Objects.equals(this.originLine, errorReport.originLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeName, errorTime, filename, text, module, version, peer, exception, exceptionMessage, originFile, originMethod, originLine);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorReport {\n");
    
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    errorTime: ").append(toIndentedString(errorTime)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    peer: ").append(toIndentedString(peer)).append("\n");
    sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
    sb.append("    exceptionMessage: ").append(toIndentedString(exceptionMessage)).append("\n");
    sb.append("    originFile: ").append(toIndentedString(originFile)).append("\n");
    sb.append("    originMethod: ").append(toIndentedString(originMethod)).append("\n");
    sb.append("    originLine: ").append(toIndentedString(originLine)).append("\n");
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
