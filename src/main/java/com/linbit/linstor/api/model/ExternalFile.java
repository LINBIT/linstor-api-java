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
/**
 * External file which can be configured to be deployed by Linstor
 */
@Schema(description = "External file which can be configured to be deployed by Linstor")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-31T11:02:45.596Z[GMT]")
public class ExternalFile {
  @JsonProperty("path")
  private String path = null;

  @JsonProperty("content")
  private String content = null;

  public ExternalFile path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The path where the external file should be deployed on the node
   * @return path
  **/
  @Schema(example = "/etc/some.conf", description = "The path where the external file should be deployed on the node")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public ExternalFile content(String content) {
    this.content = content;
    return this;
  }

   /**
   * The contents of the file, in base64 encoding
   * @return content
  **/
  @Schema(example = "SGVsbG8sIFdvcmxkIQo=", description = "The contents of the file, in base64 encoding")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalFile externalFile = (ExternalFile) o;
    return Objects.equals(this.path, externalFile.path) &&
        Objects.equals(this.content, externalFile.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, content);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalFile {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
