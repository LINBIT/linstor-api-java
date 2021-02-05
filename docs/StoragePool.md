# StoragePool

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**storagePoolName** | **String** |  | 
**nodeName** | **String** |  |  [optional]
**providerKind** | [**ProviderKind**](ProviderKind.md) |  | 
**props** | [**Properties**](Properties.md) |  |  [optional]
**staticTraits** | **Map&lt;String, String&gt;** | read only map of static storage pool traits |  [optional]
**freeCapacity** | **Long** | Kibi - read only |  [optional]
**totalCapacity** | **Long** | Kibi - read only |  [optional]
**freeSpaceMgrName** | **String** | read only |  [optional]
**uuid** | **String** | unique object id |  [optional]
**reports** | [**List&lt;ApiCallRc&gt;**](ApiCallRc.md) | Currently known report messages for this storage pool |  [optional]
**supportsSnapshots** | **Boolean** | true if the storage pool supports snapshots. false otherwise |  [optional]
