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
/**
 * ControllerConfigDebug
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-02-05T10:27:33.226Z[GMT]")
public class ControllerConfigDebug {
  @JsonProperty("console_enabled")
  private Boolean consoleEnabled = null;

  public ControllerConfigDebug consoleEnabled(Boolean consoleEnabled) {
    this.consoleEnabled = consoleEnabled;
    return this;
  }

   /**
   * Get consoleEnabled
   * @return consoleEnabled
  **/
  @Schema(description = "")
  public Boolean isConsoleEnabled() {
    return consoleEnabled;
  }

  public void setConsoleEnabled(Boolean consoleEnabled) {
    this.consoleEnabled = consoleEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControllerConfigDebug controllerConfigDebug = (ControllerConfigDebug) o;
    return Objects.equals(this.consoleEnabled, controllerConfigDebug.consoleEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consoleEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControllerConfigDebug {\n");
    
    sb.append("    consoleEnabled: ").append(toIndentedString(consoleEnabled)).append("\n");
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
