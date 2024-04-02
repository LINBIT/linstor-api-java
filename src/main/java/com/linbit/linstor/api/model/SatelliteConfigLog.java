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
import com.linbit.linstor.api.model.LogLevel;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * SatelliteConfigLog
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-02T13:40:09.628252133Z[Etc/UTC]")

public class SatelliteConfigLog {
  @JsonProperty("print_stack_trace")
  private Boolean printStackTrace = null;

  @JsonProperty("directory")
  private String directory = null;

  @JsonProperty("level")
  private LogLevel level = null;

  @JsonProperty("level_linstor")
  private LogLevel levelLinstor = null;

  public SatelliteConfigLog printStackTrace(Boolean printStackTrace) {
    this.printStackTrace = printStackTrace;
    return this;
  }

   /**
   * Get printStackTrace
   * @return printStackTrace
  **/
  @Schema(description = "")
  public Boolean isPrintStackTrace() {
    return printStackTrace;
  }

  public void setPrintStackTrace(Boolean printStackTrace) {
    this.printStackTrace = printStackTrace;
  }

  public SatelliteConfigLog directory(String directory) {
    this.directory = directory;
    return this;
  }

   /**
   * Get directory
   * @return directory
  **/
  @Schema(description = "")
  public String getDirectory() {
    return directory;
  }

  public void setDirectory(String directory) {
    this.directory = directory;
  }

  public SatelliteConfigLog level(LogLevel level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @Schema(description = "")
  public LogLevel getLevel() {
    return level;
  }

  public void setLevel(LogLevel level) {
    this.level = level;
  }

  public SatelliteConfigLog levelLinstor(LogLevel levelLinstor) {
    this.levelLinstor = levelLinstor;
    return this;
  }

   /**
   * Get levelLinstor
   * @return levelLinstor
  **/
  @Schema(description = "")
  public LogLevel getLevelLinstor() {
    return levelLinstor;
  }

  public void setLevelLinstor(LogLevel levelLinstor) {
    this.levelLinstor = levelLinstor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SatelliteConfigLog satelliteConfigLog = (SatelliteConfigLog) o;
    return Objects.equals(this.printStackTrace, satelliteConfigLog.printStackTrace) &&
        Objects.equals(this.directory, satelliteConfigLog.directory) &&
        Objects.equals(this.level, satelliteConfigLog.level) &&
        Objects.equals(this.levelLinstor, satelliteConfigLog.levelLinstor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(printStackTrace, directory, level, levelLinstor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SatelliteConfigLog {\n");
    
    sb.append("    printStackTrace: ").append(toIndentedString(printStackTrace)).append("\n");
    sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    levelLinstor: ").append(toIndentedString(levelLinstor)).append("\n");
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
