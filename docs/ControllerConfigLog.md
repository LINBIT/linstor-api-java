# ControllerConfigLog

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**printStackTrace** | **Boolean** |  |  [optional]
**directory** | **String** |  |  [optional]
**level** | [**LogLevel**](LogLevel.md) |  |  [optional]
**levelGlobal** | [**LogLevel**](LogLevel.md) |  |  [optional]
**levelLinstor** | [**LogLevel**](LogLevel.md) |  |  [optional]
**levelLinstorGlobal** | [**LogLevel**](LogLevel.md) |  |  [optional]
**restAccessLogPath** | **String** |  |  [optional]
**restAccessMode** | [**RestAccessModeEnum**](#RestAccessModeEnum) |  |  [optional]

<a name="RestAccessModeEnum"></a>
## Enum: RestAccessModeEnum
Name | Value
---- | -----
APPEND | &quot;APPEND&quot;
ROTATE_HOURLY | &quot;ROTATE_HOURLY&quot;
ROTATE_DAILY | &quot;ROTATE_DAILY&quot;
NO_LOG | &quot;NO_LOG&quot;
