/*
 * Linstor REST API
 *
 *
 * OpenAPI spec version: 1.20.1
 * Contact: rene.peinthor@linbit.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.linbit.linstor.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets LayerType
 */
public enum LayerType {
  DRBD("DRBD"),
  LUKS("LUKS"),
  STORAGE("STORAGE"),
  NVME("NVME"),
  WRITECACHE("WRITECACHE"),
  CACHE("CACHE"),
  BCACHE("BCACHE"),
  OPENFLEX("OPENFLEX");

  private String value;

  LayerType(String value) {
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
  public static LayerType fromValue(String input) {
    for (LayerType b : LayerType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }
}
