# ResourceGroupSpawn

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resourceDefinitionName** | **String** | name of the resulting resource-definition |  [optional]
**resourceDefinitionExternalName** | **String** | External name can be used to have native resource names. If you need to store a non Linstor compatible resource name use this field and Linstor will generate a compatible name.  |  [optional]
**volumeSizes** | **List&lt;Long&gt;** | sizes (in kib) of the resulting volume-definitions |  [optional]
**selectFilter** | [**AutoSelectFilter**](AutoSelectFilter.md) |  |  [optional]
**partial** | **Boolean** | If false, the length of the vlm_sizes has to match the number of volume-groups or an error is returned.  If true and there are more vlm_sizes than volume-groups, the additional volume-definitions will simply have no pre-set properties (i.e. \&quot;empty\&quot; volume-definitions) If true and there are less vlm_sizes than volume-groups, the additional volume-groups won&#x27;t be used.  If the count of vlm_sizes matches the number of volume-groups, this \&quot;partial\&quot; parameter has no effect.  |  [optional]
**definitionsOnly** | **Boolean** | If true, the spawn command will only create the resource-definition with the volume-definitions but will not perform an auto-place, even if it is configured.  |  [optional]
