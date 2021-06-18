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
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * PassPhraseCreate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-18T05:15:14.614Z[GMT]")
public class PassPhraseCreate {
  @JsonProperty("new_passphrase")
  private String newPassphrase = null;

  @JsonProperty("old_passphrase")
  private String oldPassphrase = null;

  public PassPhraseCreate newPassphrase(String newPassphrase) {
    this.newPassphrase = newPassphrase;
    return this;
  }

   /**
   * Get newPassphrase
   * @return newPassphrase
  **/
  @Schema(description = "")
  public String getNewPassphrase() {
    return newPassphrase;
  }

  public void setNewPassphrase(String newPassphrase) {
    this.newPassphrase = newPassphrase;
  }

  public PassPhraseCreate oldPassphrase(String oldPassphrase) {
    this.oldPassphrase = oldPassphrase;
    return this;
  }

   /**
   * Get oldPassphrase
   * @return oldPassphrase
  **/
  @Schema(description = "")
  public String getOldPassphrase() {
    return oldPassphrase;
  }

  public void setOldPassphrase(String oldPassphrase) {
    this.oldPassphrase = oldPassphrase;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PassPhraseCreate passPhraseCreate = (PassPhraseCreate) o;
    return Objects.equals(this.newPassphrase, passPhraseCreate.newPassphrase) &&
        Objects.equals(this.oldPassphrase, passPhraseCreate.oldPassphrase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newPassphrase, oldPassphrase);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PassPhraseCreate {\n");
    
    sb.append("    newPassphrase: ").append(toIndentedString(newPassphrase)).append("\n");
    sb.append("    oldPassphrase: ").append(toIndentedString(oldPassphrase)).append("\n");
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
