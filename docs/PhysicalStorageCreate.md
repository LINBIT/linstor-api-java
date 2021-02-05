# PhysicalStorageCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**providerKind** | [**ProviderKind**](ProviderKind.md) |  | 
**devicePaths** | **List&lt;String&gt;** |  | 
**raidLevel** | [**RaidLevelEnum**](#RaidLevelEnum) | RAID level to use for pool.  |  [optional]
**poolName** | **String** |  |  [optional]
**vdoEnable** | **Boolean** |  |  [optional]
**vdoSlabSizeKib** | **Long** |  |  [optional]
**vdoLogicalSizeKib** | **Long** |  |  [optional]
**withStoragePool** | [**PhysicalStorageStoragePoolCreate**](PhysicalStorageStoragePoolCreate.md) |  |  [optional]

<a name="RaidLevelEnum"></a>
## Enum: RaidLevelEnum
Name | Value
---- | -----
JBOD | &quot;JBOD&quot;
