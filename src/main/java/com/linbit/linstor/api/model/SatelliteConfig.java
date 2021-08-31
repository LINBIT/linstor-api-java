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
import com.linbit.linstor.api.model.ControllerConfigConfig;
import com.linbit.linstor.api.model.ControllerConfigDebug;
import com.linbit.linstor.api.model.SatelliteConfigLog;
import com.linbit.linstor.api.model.SatelliteConfigNet;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * SatelliteConfig
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-31T11:02:45.596Z[GMT]")
public class SatelliteConfig {
  @JsonProperty("config")
  private ControllerConfigConfig config = null;

  @JsonProperty("debug")
  private ControllerConfigDebug debug = null;

  @JsonProperty("log")
  private SatelliteConfigLog log = null;

  @JsonProperty("stlt_override_node_name")
  private String stltOverrideNodeName = null;

  @JsonProperty("openflex")
  private Boolean openflex = null;

  @JsonProperty("remote_spdk")
  private Boolean remoteSpdk = null;

  @JsonProperty("special_satellite")
  private Boolean specialSatellite = null;

  @JsonProperty("drbd_keep_res_pattern")
  private String drbdKeepResPattern = null;

  @JsonProperty("net")
  private SatelliteConfigNet net = null;

  public SatelliteConfig config(ControllerConfigConfig config) {
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @Schema(description = "")
  public ControllerConfigConfig getConfig() {
    return config;
  }

  public void setConfig(ControllerConfigConfig config) {
    this.config = config;
  }

  public SatelliteConfig debug(ControllerConfigDebug debug) {
    this.debug = debug;
    return this;
  }

   /**
   * Get debug
   * @return debug
  **/
  @Schema(description = "")
  public ControllerConfigDebug getDebug() {
    return debug;
  }

  public void setDebug(ControllerConfigDebug debug) {
    this.debug = debug;
  }

  public SatelliteConfig log(SatelliteConfigLog log) {
    this.log = log;
    return this;
  }

   /**
   * Get log
   * @return log
  **/
  @Schema(description = "")
  public SatelliteConfigLog getLog() {
    return log;
  }

  public void setLog(SatelliteConfigLog log) {
    this.log = log;
  }

  public SatelliteConfig stltOverrideNodeName(String stltOverrideNodeName) {
    this.stltOverrideNodeName = stltOverrideNodeName;
    return this;
  }

   /**
   * Get stltOverrideNodeName
   * @return stltOverrideNodeName
  **/
  @Schema(description = "")
  public String getStltOverrideNodeName() {
    return stltOverrideNodeName;
  }

  public void setStltOverrideNodeName(String stltOverrideNodeName) {
    this.stltOverrideNodeName = stltOverrideNodeName;
  }

  public SatelliteConfig openflex(Boolean openflex) {
    this.openflex = openflex;
    return this;
  }

   /**
   * Get openflex
   * @return openflex
  **/
  @Schema(description = "")
  public Boolean isOpenflex() {
    return openflex;
  }

  public void setOpenflex(Boolean openflex) {
    this.openflex = openflex;
  }

  public SatelliteConfig remoteSpdk(Boolean remoteSpdk) {
    this.remoteSpdk = remoteSpdk;
    return this;
  }

   /**
   * Get remoteSpdk
   * @return remoteSpdk
  **/
  @Schema(description = "")
  public Boolean isRemoteSpdk() {
    return remoteSpdk;
  }

  public void setRemoteSpdk(Boolean remoteSpdk) {
    this.remoteSpdk = remoteSpdk;
  }

  public SatelliteConfig specialSatellite(Boolean specialSatellite) {
    this.specialSatellite = specialSatellite;
    return this;
  }

   /**
   * Get specialSatellite
   * @return specialSatellite
  **/
  @Schema(description = "")
  public Boolean isSpecialSatellite() {
    return specialSatellite;
  }

  public void setSpecialSatellite(Boolean specialSatellite) {
    this.specialSatellite = specialSatellite;
  }

  public SatelliteConfig drbdKeepResPattern(String drbdKeepResPattern) {
    this.drbdKeepResPattern = drbdKeepResPattern;
    return this;
  }

   /**
   * Get drbdKeepResPattern
   * @return drbdKeepResPattern
  **/
  @Schema(description = "")
  public String getDrbdKeepResPattern() {
    return drbdKeepResPattern;
  }

  public void setDrbdKeepResPattern(String drbdKeepResPattern) {
    this.drbdKeepResPattern = drbdKeepResPattern;
  }

  public SatelliteConfig net(SatelliteConfigNet net) {
    this.net = net;
    return this;
  }

   /**
   * Get net
   * @return net
  **/
  @Schema(description = "")
  public SatelliteConfigNet getNet() {
    return net;
  }

  public void setNet(SatelliteConfigNet net) {
    this.net = net;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SatelliteConfig satelliteConfig = (SatelliteConfig) o;
    return Objects.equals(this.config, satelliteConfig.config) &&
        Objects.equals(this.debug, satelliteConfig.debug) &&
        Objects.equals(this.log, satelliteConfig.log) &&
        Objects.equals(this.stltOverrideNodeName, satelliteConfig.stltOverrideNodeName) &&
        Objects.equals(this.openflex, satelliteConfig.openflex) &&
        Objects.equals(this.remoteSpdk, satelliteConfig.remoteSpdk) &&
        Objects.equals(this.specialSatellite, satelliteConfig.specialSatellite) &&
        Objects.equals(this.drbdKeepResPattern, satelliteConfig.drbdKeepResPattern) &&
        Objects.equals(this.net, satelliteConfig.net);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, debug, log, stltOverrideNodeName, openflex, remoteSpdk, specialSatellite, drbdKeepResPattern, net);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SatelliteConfig {\n");
    
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    debug: ").append(toIndentedString(debug)).append("\n");
    sb.append("    log: ").append(toIndentedString(log)).append("\n");
    sb.append("    stltOverrideNodeName: ").append(toIndentedString(stltOverrideNodeName)).append("\n");
    sb.append("    openflex: ").append(toIndentedString(openflex)).append("\n");
    sb.append("    remoteSpdk: ").append(toIndentedString(remoteSpdk)).append("\n");
    sb.append("    specialSatellite: ").append(toIndentedString(specialSatellite)).append("\n");
    sb.append("    drbdKeepResPattern: ").append(toIndentedString(drbdKeepResPattern)).append("\n");
    sb.append("    net: ").append(toIndentedString(net)).append("\n");
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
