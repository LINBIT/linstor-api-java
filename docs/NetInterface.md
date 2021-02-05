# NetInterface

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  | 
**address** | **String** |  | 
**satellitePort** | **Integer** |  |  [optional]
**satelliteEncryptionType** | [**SatelliteEncryptionTypeEnum**](#SatelliteEncryptionTypeEnum) |  |  [optional]
**isActive** | **Boolean** | Defines if this netinterface should be used for the satellite connection |  [optional]
**uuid** | **String** | unique object id |  [optional]

<a name="SatelliteEncryptionTypeEnum"></a>
## Enum: SatelliteEncryptionTypeEnum
Name | Value
---- | -----
PLAIN | &quot;Plain&quot;
SSL | &quot;SSL&quot;
