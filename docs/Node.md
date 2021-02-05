# Node

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  | 
**type** | [**TypeEnum**](#TypeEnum) |  | 
**flags** | **List&lt;String&gt;** |  |  [optional]
**props** | [**Properties**](Properties.md) |  |  [optional]
**netInterfaces** | [**List&lt;NetInterface&gt;**](NetInterface.md) |  |  [optional]
**connectionStatus** | [**ConnectionStatusEnum**](#ConnectionStatusEnum) | Enum describing the current connection status.  |  [optional]
**uuid** | **String** | unique object id |  [optional]
**storageProviders** | [**List&lt;ProviderKind&gt;**](ProviderKind.md) |  |  [optional]
**resourceLayers** | [**List&lt;LayerType&gt;**](LayerType.md) |  |  [optional]
**unsupportedProviders** | [**Map&lt;String, List&lt;String&gt;&gt;**](List.md) |  |  [optional]
**unsupportedLayers** | [**Map&lt;String, List&lt;String&gt;&gt;**](List.md) |  |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
CONTROLLER | &quot;Controller&quot;
SATELLITE | &quot;Satellite&quot;
COMBINED | &quot;Combined&quot;
AUXILIARY | &quot;Auxiliary&quot;
OPENFLEX_TARGET | &quot;Openflex_Target&quot;

<a name="ConnectionStatusEnum"></a>
## Enum: ConnectionStatusEnum
Name | Value
---- | -----
OFFLINE | &quot;OFFLINE&quot;
CONNECTED | &quot;CONNECTED&quot;
ONLINE | &quot;ONLINE&quot;
VERSION_MISMATCH | &quot;VERSION_MISMATCH&quot;
HOSTNAME_MISMATCH | &quot;HOSTNAME_MISMATCH&quot;
FULL_SYNC_FAILED | &quot;FULL_SYNC_FAILED&quot;
AUTHENTICATION_ERROR | &quot;AUTHENTICATION_ERROR&quot;
UNKNOWN | &quot;UNKNOWN&quot;
