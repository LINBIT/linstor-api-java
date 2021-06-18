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
import com.linbit.linstor.api.model.Properties;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * DrbdProxyModify
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-18T05:15:14.614Z[GMT]")
public class DrbdProxyModify {
  @JsonProperty("override_props")
  private Properties overrideProps = null;

  @JsonProperty("delete_props")
  private List<String> deleteProps = null;

  /**
   * Compression type used by the proxy. 
   */
  public enum CompressionTypeEnum {
    NONE("none"),
    ZLIB("zlib"),
    LZMA("lzma"),
    LZ4("lz4");

    private String value;

    CompressionTypeEnum(String value) {
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
    public static CompressionTypeEnum fromValue(String text) {
      for (CompressionTypeEnum b : CompressionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("compression_type")
  private CompressionTypeEnum compressionType = null;

  @JsonProperty("compression_props")
  private Properties compressionProps = null;

  public DrbdProxyModify overrideProps(Properties overrideProps) {
    this.overrideProps = overrideProps;
    return this;
  }

   /**
   * Get overrideProps
   * @return overrideProps
  **/
  @Schema(description = "")
  public Properties getOverrideProps() {
    return overrideProps;
  }

  public void setOverrideProps(Properties overrideProps) {
    this.overrideProps = overrideProps;
  }

  public DrbdProxyModify deleteProps(List<String> deleteProps) {
    this.deleteProps = deleteProps;
    return this;
  }

  public DrbdProxyModify addDeletePropsItem(String deletePropsItem) {
    if (this.deleteProps == null) {
      this.deleteProps = new ArrayList<>();
    }
    this.deleteProps.add(deletePropsItem);
    return this;
  }

   /**
   * Get deleteProps
   * @return deleteProps
  **/
  @Schema(description = "")
  public List<String> getDeleteProps() {
    return deleteProps;
  }

  public void setDeleteProps(List<String> deleteProps) {
    this.deleteProps = deleteProps;
  }

  public DrbdProxyModify compressionType(CompressionTypeEnum compressionType) {
    this.compressionType = compressionType;
    return this;
  }

   /**
   * Compression type used by the proxy. 
   * @return compressionType
  **/
  @Schema(description = "Compression type used by the proxy. ")
  public CompressionTypeEnum getCompressionType() {
    return compressionType;
  }

  public void setCompressionType(CompressionTypeEnum compressionType) {
    this.compressionType = compressionType;
  }

  public DrbdProxyModify compressionProps(Properties compressionProps) {
    this.compressionProps = compressionProps;
    return this;
  }

   /**
   * Get compressionProps
   * @return compressionProps
  **/
  @Schema(description = "")
  public Properties getCompressionProps() {
    return compressionProps;
  }

  public void setCompressionProps(Properties compressionProps) {
    this.compressionProps = compressionProps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DrbdProxyModify drbdProxyModify = (DrbdProxyModify) o;
    return Objects.equals(this.overrideProps, drbdProxyModify.overrideProps) &&
        Objects.equals(this.deleteProps, drbdProxyModify.deleteProps) &&
        Objects.equals(this.compressionType, drbdProxyModify.compressionType) &&
        Objects.equals(this.compressionProps, drbdProxyModify.compressionProps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overrideProps, deleteProps, compressionType, compressionProps);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrbdProxyModify {\n");
    
    sb.append("    overrideProps: ").append(toIndentedString(overrideProps)).append("\n");
    sb.append("    deleteProps: ").append(toIndentedString(deleteProps)).append("\n");
    sb.append("    compressionType: ").append(toIndentedString(compressionType)).append("\n");
    sb.append("    compressionProps: ").append(toIndentedString(compressionProps)).append("\n");
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
