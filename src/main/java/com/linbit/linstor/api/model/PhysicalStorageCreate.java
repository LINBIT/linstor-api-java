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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.linbit.linstor.api.model.PhysicalStorageStoragePoolCreate;
import com.linbit.linstor.api.model.ProviderKind;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * If &#x60;with_storage_pool&#x60; is set a linstor storage pool will also be created using this device pool
 */
@Schema(description = "If `with_storage_pool` is set a linstor storage pool will also be created using this device pool")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-03T09:13:01.489Z[GMT]")

public class PhysicalStorageCreate {
  @JsonProperty("provider_kind")
  private ProviderKind providerKind = null;

  @JsonProperty("device_paths")
  private List<String> devicePaths = new ArrayList<>();

  /**
   * RAID level to use for pool. 
   */
  public enum RaidLevelEnum {
    JBOD("JBOD");

    private String value;

    RaidLevelEnum(String value) {
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
    public static RaidLevelEnum fromValue(String input) {
      for (RaidLevelEnum b : RaidLevelEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("raid_level")
  private RaidLevelEnum raidLevel = RaidLevelEnum.JBOD;

  @JsonProperty("pool_name")
  private String poolName = null;

  @JsonProperty("vdo_enable")
  private Boolean vdoEnable = false;

  @JsonProperty("vdo_slab_size_kib")
  private Long vdoSlabSizeKib = 0l;

  @JsonProperty("vdo_logical_size_kib")
  private Long vdoLogicalSizeKib = 0l;

  @JsonProperty("with_storage_pool")
  private PhysicalStorageStoragePoolCreate withStoragePool = null;

  @JsonProperty("sed")
  private Boolean sed = false;

  public PhysicalStorageCreate providerKind(ProviderKind providerKind) {
    this.providerKind = providerKind;
    return this;
  }

   /**
   * Get providerKind
   * @return providerKind
  **/
  @Schema(required = true, description = "")
  public ProviderKind getProviderKind() {
    return providerKind;
  }

  public void setProviderKind(ProviderKind providerKind) {
    this.providerKind = providerKind;
  }

  public PhysicalStorageCreate devicePaths(List<String> devicePaths) {
    this.devicePaths = devicePaths;
    return this;
  }

  public PhysicalStorageCreate addDevicePathsItem(String devicePathsItem) {
    this.devicePaths.add(devicePathsItem);
    return this;
  }

   /**
   * Get devicePaths
   * @return devicePaths
  **/
  @Schema(required = true, description = "")
  public List<String> getDevicePaths() {
    return devicePaths;
  }

  public void setDevicePaths(List<String> devicePaths) {
    this.devicePaths = devicePaths;
  }

  public PhysicalStorageCreate raidLevel(RaidLevelEnum raidLevel) {
    this.raidLevel = raidLevel;
    return this;
  }

   /**
   * RAID level to use for pool. 
   * @return raidLevel
  **/
  @Schema(description = "RAID level to use for pool. ")
  public RaidLevelEnum getRaidLevel() {
    return raidLevel;
  }

  public void setRaidLevel(RaidLevelEnum raidLevel) {
    this.raidLevel = raidLevel;
  }

  public PhysicalStorageCreate poolName(String poolName) {
    this.poolName = poolName;
    return this;
  }

   /**
   * Get poolName
   * @return poolName
  **/
  @Schema(description = "")
  public String getPoolName() {
    return poolName;
  }

  public void setPoolName(String poolName) {
    this.poolName = poolName;
  }

  public PhysicalStorageCreate vdoEnable(Boolean vdoEnable) {
    this.vdoEnable = vdoEnable;
    return this;
  }

   /**
   * Get vdoEnable
   * @return vdoEnable
  **/
  @Schema(description = "")
  public Boolean isVdoEnable() {
    return vdoEnable;
  }

  public void setVdoEnable(Boolean vdoEnable) {
    this.vdoEnable = vdoEnable;
  }

  public PhysicalStorageCreate vdoSlabSizeKib(Long vdoSlabSizeKib) {
    this.vdoSlabSizeKib = vdoSlabSizeKib;
    return this;
  }

   /**
   * Get vdoSlabSizeKib
   * @return vdoSlabSizeKib
  **/
  @Schema(description = "")
  public Long getVdoSlabSizeKib() {
    return vdoSlabSizeKib;
  }

  public void setVdoSlabSizeKib(Long vdoSlabSizeKib) {
    this.vdoSlabSizeKib = vdoSlabSizeKib;
  }

  public PhysicalStorageCreate vdoLogicalSizeKib(Long vdoLogicalSizeKib) {
    this.vdoLogicalSizeKib = vdoLogicalSizeKib;
    return this;
  }

   /**
   * Get vdoLogicalSizeKib
   * @return vdoLogicalSizeKib
  **/
  @Schema(description = "")
  public Long getVdoLogicalSizeKib() {
    return vdoLogicalSizeKib;
  }

  public void setVdoLogicalSizeKib(Long vdoLogicalSizeKib) {
    this.vdoLogicalSizeKib = vdoLogicalSizeKib;
  }

  public PhysicalStorageCreate withStoragePool(PhysicalStorageStoragePoolCreate withStoragePool) {
    this.withStoragePool = withStoragePool;
    return this;
  }

   /**
   * Get withStoragePool
   * @return withStoragePool
  **/
  @Schema(description = "")
  public PhysicalStorageStoragePoolCreate getWithStoragePool() {
    return withStoragePool;
  }

  public void setWithStoragePool(PhysicalStorageStoragePoolCreate withStoragePool) {
    this.withStoragePool = withStoragePool;
  }

  public PhysicalStorageCreate sed(Boolean sed) {
    this.sed = sed;
    return this;
  }

   /**
   * initialize SED with a random password
   * @return sed
  **/
  @Schema(description = "initialize SED with a random password")
  public Boolean isSed() {
    return sed;
  }

  public void setSed(Boolean sed) {
    this.sed = sed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhysicalStorageCreate physicalStorageCreate = (PhysicalStorageCreate) o;
    return Objects.equals(this.providerKind, physicalStorageCreate.providerKind) &&
        Objects.equals(this.devicePaths, physicalStorageCreate.devicePaths) &&
        Objects.equals(this.raidLevel, physicalStorageCreate.raidLevel) &&
        Objects.equals(this.poolName, physicalStorageCreate.poolName) &&
        Objects.equals(this.vdoEnable, physicalStorageCreate.vdoEnable) &&
        Objects.equals(this.vdoSlabSizeKib, physicalStorageCreate.vdoSlabSizeKib) &&
        Objects.equals(this.vdoLogicalSizeKib, physicalStorageCreate.vdoLogicalSizeKib) &&
        Objects.equals(this.withStoragePool, physicalStorageCreate.withStoragePool) &&
        Objects.equals(this.sed, physicalStorageCreate.sed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerKind, devicePaths, raidLevel, poolName, vdoEnable, vdoSlabSizeKib, vdoLogicalSizeKib, withStoragePool, sed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhysicalStorageCreate {\n");
    
    sb.append("    providerKind: ").append(toIndentedString(providerKind)).append("\n");
    sb.append("    devicePaths: ").append(toIndentedString(devicePaths)).append("\n");
    sb.append("    raidLevel: ").append(toIndentedString(raidLevel)).append("\n");
    sb.append("    poolName: ").append(toIndentedString(poolName)).append("\n");
    sb.append("    vdoEnable: ").append(toIndentedString(vdoEnable)).append("\n");
    sb.append("    vdoSlabSizeKib: ").append(toIndentedString(vdoSlabSizeKib)).append("\n");
    sb.append("    vdoLogicalSizeKib: ").append(toIndentedString(vdoLogicalSizeKib)).append("\n");
    sb.append("    withStoragePool: ").append(toIndentedString(withStoragePool)).append("\n");
    sb.append("    sed: ").append(toIndentedString(sed)).append("\n");
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
