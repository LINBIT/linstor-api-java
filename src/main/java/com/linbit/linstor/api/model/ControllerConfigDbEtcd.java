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
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * ControllerConfigDbEtcd
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-18T06:34:31.141535853Z[Etc/UTC]")

public class ControllerConfigDbEtcd {
  @JsonProperty("operations_per_transaction")
  private Integer operationsPerTransaction = null;

  @JsonProperty("prefix")
  private String prefix = null;

  public ControllerConfigDbEtcd operationsPerTransaction(Integer operationsPerTransaction) {
    this.operationsPerTransaction = operationsPerTransaction;
    return this;
  }

   /**
   * Get operationsPerTransaction
   * @return operationsPerTransaction
  **/
  @Schema(description = "")
  public Integer getOperationsPerTransaction() {
    return operationsPerTransaction;
  }

  public void setOperationsPerTransaction(Integer operationsPerTransaction) {
    this.operationsPerTransaction = operationsPerTransaction;
  }

  public ControllerConfigDbEtcd prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

   /**
   * Get prefix
   * @return prefix
  **/
  @Schema(description = "")
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControllerConfigDbEtcd controllerConfigDbEtcd = (ControllerConfigDbEtcd) o;
    return Objects.equals(this.operationsPerTransaction, controllerConfigDbEtcd.operationsPerTransaction) &&
        Objects.equals(this.prefix, controllerConfigDbEtcd.prefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationsPerTransaction, prefix);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControllerConfigDbEtcd {\n");
    
    sb.append("    operationsPerTransaction: ").append(toIndentedString(operationsPerTransaction)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
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
