/*
 * Linstor REST API
 *
 *
 * OpenAPI spec version: 1.25.1
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
 * DrbdConnection
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-05-08T11:58:50.875992750Z[Etc/UTC]")

public class DrbdConnection {
  @JsonProperty("connected")
  private Boolean connected = null;

  /**
   * DRBD connection status
   */
  public enum MessageEnum {
    STANDALONE("StandAlone"),
    DISCONNECTING("Disconnecting"),
    UNCONNECTED("Unconnected"),
    TIMEOUT("Timeout"),
    BROKENPIPE("BrokenPipe"),
    NETWORKFAILURE("NetworkFailure"),
    PROTOCOLERROR("ProtocolError"),
    CONNECTING("Connecting"),
    TEARDOWN("TearDown"),
    CONNECTED("Connected"),
    UNKNOWN("Unknown");

    private String value;

    MessageEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static MessageEnum fromValue(String input) {
      for (MessageEnum b : MessageEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("message")
  private MessageEnum message = null;

  public DrbdConnection connected(Boolean connected) {
    this.connected = connected;
    return this;
  }

   /**
   * Get connected
   * @return connected
  **/
  @Schema(description = "")
  public Boolean isConnected() {
    return connected;
  }

  public void setConnected(Boolean connected) {
    this.connected = connected;
  }

  public DrbdConnection message(MessageEnum message) {
    this.message = message;
    return this;
  }

   /**
   * DRBD connection status
   * @return message
  **/
  @Schema(example = "Connected", description = "DRBD connection status")
  public MessageEnum getMessage() {
    return message;
  }

  public void setMessage(MessageEnum message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DrbdConnection drbdConnection = (DrbdConnection) o;
    return Objects.equals(this.connected, drbdConnection.connected) &&
        Objects.equals(this.message, drbdConnection.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connected, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrbdConnection {\n");
    
    sb.append("    connected: ").append(toIndentedString(connected)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
