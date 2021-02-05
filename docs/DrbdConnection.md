# DrbdConnection

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**connected** | **Boolean** |  |  [optional]
**message** | [**MessageEnum**](#MessageEnum) | DRBD connection status |  [optional]

<a name="MessageEnum"></a>
## Enum: MessageEnum
Name | Value
---- | -----
STANDALONE | &quot;StandAlone&quot;
DISCONNECTING | &quot;Disconnecting&quot;
UNCONNECTED | &quot;Unconnected&quot;
TIMEOUT | &quot;Timeout&quot;
BROKENPIPE | &quot;BrokenPipe&quot;
NETWORKFAILURE | &quot;NetworkFailure&quot;
PROTOCOLERROR | &quot;ProtocolError&quot;
CONNECTING | &quot;Connecting&quot;
TEARDOWN | &quot;TearDown&quot;
CONNECTED | &quot;Connected&quot;
UNKNOWN | &quot;Unknown&quot;
