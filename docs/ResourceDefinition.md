# ResourceDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  |  [optional]
**externalName** | **String** | External name can be used to have native resource names. If you need to store a non Linstor compatible resource name use this field and Linstor will generate a compatible name.  |  [optional]
**props** | [**Properties**](Properties.md) |  |  [optional]
**flags** | **List&lt;String&gt;** |  |  [optional]
**layerData** | [**List&lt;ResourceDefinitionLayer&gt;**](ResourceDefinitionLayer.md) |  |  [optional]
**uuid** | **String** | unique object id |  [optional]
**resourceGroupName** | **String** | name of the linked resource group, if there is a link |  [optional]
**volumeDefinitions** | [**List&lt;VolumeDefinition&gt;**](VolumeDefinition.md) |  |  [optional]
