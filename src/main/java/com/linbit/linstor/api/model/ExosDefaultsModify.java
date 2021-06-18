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
import com.linbit.linstor.api.model.ExosDefaults;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * ExosDefaultsModify
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-18T05:15:14.614Z[GMT]")
public class ExosDefaultsModify extends ExosDefaults {
  @JsonProperty("unset_keys")
  private List<String> unsetKeys = null;

  public ExosDefaultsModify unsetKeys(List<String> unsetKeys) {
    this.unsetKeys = unsetKeys;
    return this;
  }

  public ExosDefaultsModify addUnsetKeysItem(String unsetKeysItem) {
    if (this.unsetKeys == null) {
      this.unsetKeys = new ArrayList<>();
    }
    this.unsetKeys.add(unsetKeysItem);
    return this;
  }

   /**
   * A list of keys to unset. The keys have to exist in ExosDefaults 
   * @return unsetKeys
  **/
  @Schema(description = "A list of keys to unset. The keys have to exist in ExosDefaults ")
  public List<String> getUnsetKeys() {
    return unsetKeys;
  }

  public void setUnsetKeys(List<String> unsetKeys) {
    this.unsetKeys = unsetKeys;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExosDefaultsModify exosDefaultsModify = (ExosDefaultsModify) o;
    return Objects.equals(this.unsetKeys, exosDefaultsModify.unsetKeys) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unsetKeys, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExosDefaultsModify {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    unsetKeys: ").append(toIndentedString(unsetKeys)).append("\n");
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
