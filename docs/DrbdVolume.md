# DrbdVolume

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**drbdVolumeDefinition** | [**DrbdVolumeDefinition**](DrbdVolumeDefinition.md) |  |  [optional]
**devicePath** | **String** | drbd device path e.g. &#x27;/dev/drbd1000&#x27; |  [optional]
**backingDevice** | **String** | block device used by drbd |  [optional]
**metaDisk** | **String** |  |  [optional]
**allocatedSizeKib** | **Long** |  |  [optional]
**usableSizeKib** | **Long** |  |  [optional]
**diskState** | **String** | String describing current volume state |  [optional]
**extMetaStorPool** | **String** | Storage pool name used for external meta data; null for internal |  [optional]
