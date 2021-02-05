# DefaultApi

All URIs are relative to *http://localhost:3370*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1ControllerPropertiesInfoAllGet**](DefaultApi.md#v1ControllerPropertiesInfoAllGet) | **GET** /v1/controller/properties/info/all | list all properties
[**v1ControllerPropertiesInfoGet**](DefaultApi.md#v1ControllerPropertiesInfoGet) | **GET** /v1/controller/properties/info | list all controller properties
[**v1NodesNodeRestorePut**](DefaultApi.md#v1NodesNodeRestorePut) | **PUT** /v1/nodes/{node}/restore | restore node
[**v1NodesNodeStoragePoolsPropertiesInfoGet**](DefaultApi.md#v1NodesNodeStoragePoolsPropertiesInfoGet) | **GET** /v1/nodes/{node}/storage-pools/properties/info | list all storage-pool properties
[**v1NodesPropertiesInfoGet**](DefaultApi.md#v1NodesPropertiesInfoGet) | **GET** /v1/nodes/properties/info | list all node properties
[**v1ResourceDefinitionsPropertiesInfoGet**](DefaultApi.md#v1ResourceDefinitionsPropertiesInfoGet) | **GET** /v1/resource-definitions/properties/info | list all resource-definition properties
[**v1ResourceDefinitionsResourceDrbdProxyPropertiesInfoGet**](DefaultApi.md#v1ResourceDefinitionsResourceDrbdProxyPropertiesInfoGet) | **GET** /v1/resource-definitions/{resource}/drbd-proxy/properties/info | list all drbd-proxy properties
[**v1ResourceDefinitionsResourceResourceConnectionsPropertiesInfoGet**](DefaultApi.md#v1ResourceDefinitionsResourceResourceConnectionsPropertiesInfoGet) | **GET** /v1/resource-definitions/{resource}/resource-connections/properties/info | list all resource-connection properties
[**v1ResourceDefinitionsResourceResourcesNodeVolumesPropertiesInfoGet**](DefaultApi.md#v1ResourceDefinitionsResourceResourcesNodeVolumesPropertiesInfoGet) | **GET** /v1/resource-definitions/{resource}/resources/{node}/volumes/properties/info | list all volume properties
[**v1ResourceDefinitionsResourceResourcesPropertiesInfoGet**](DefaultApi.md#v1ResourceDefinitionsResourceResourcesPropertiesInfoGet) | **GET** /v1/resource-definitions/{resource}/resources/properties/info | list all resource properties
[**v1ResourceDefinitionsResourceVolumeDefinitionsPropertiesInfoGet**](DefaultApi.md#v1ResourceDefinitionsResourceVolumeDefinitionsPropertiesInfoGet) | **GET** /v1/resource-definitions/{resource}/volume-definitions/properties/info | list all volume-definition properties
[**v1ResourceGroupsPropertiesInfoGet**](DefaultApi.md#v1ResourceGroupsPropertiesInfoGet) | **GET** /v1/resource-groups/properties/info | list all resource-group properties
[**v1ResourceGroupsResourceGroupVolumeGroupsPropertiesInfoGet**](DefaultApi.md#v1ResourceGroupsResourceGroupVolumeGroupsPropertiesInfoGet) | **GET** /v1/resource-groups/{resource_group}/volume-groups/properties/info | list all volume-group properties
[**v1StoragePoolDefinitionsPropertiesInfoGet**](DefaultApi.md#v1StoragePoolDefinitionsPropertiesInfoGet) | **GET** /v1/storage-pool-definitions/properties/info | list all storage-pool-definition properties

<a name="v1ControllerPropertiesInfoAllGet"></a>
# **v1ControllerPropertiesInfoAllGet**
> Map&lt;String, Map&lt;String, PropsInfo&gt;&gt; v1ControllerPropertiesInfoAllGet()

list all properties

list all property-names and their descriptions

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    Map<String, Map<String, PropsInfo>> result = apiInstance.v1ControllerPropertiesInfoAllGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#v1ControllerPropertiesInfoAllGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Map&lt;String, Map&lt;String, PropsInfo&gt;&gt;**](Map.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1ControllerPropertiesInfoGet"></a>
# **v1ControllerPropertiesInfoGet**
> Map&lt;String, PropsInfo&gt; v1ControllerPropertiesInfoGet()

list all controller properties

list all property-names and their descriptions

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    Map<String, PropsInfo> result = apiInstance.v1ControllerPropertiesInfoGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#v1ControllerPropertiesInfoGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Map&lt;String, PropsInfo&gt;**](PropsInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1NodesNodeRestorePut"></a>
# **v1NodesNodeRestorePut**
> ApiCallRcList v1NodesNodeRestorePut(node)

restore node

restore an evicted node

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String node = "node_example"; // String | node to use
try {
    ApiCallRcList result = apiInstance.v1NodesNodeRestorePut(node);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#v1NodesNodeRestorePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **node** | **String**| node to use |

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1NodesNodeStoragePoolsPropertiesInfoGet"></a>
# **v1NodesNodeStoragePoolsPropertiesInfoGet**
> Map&lt;String, PropsInfo&gt; v1NodesNodeStoragePoolsPropertiesInfoGet(node)

list all storage-pool properties

list all property-names and their descriptions

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String node = "node_example"; // String | node to use
try {
    Map<String, PropsInfo> result = apiInstance.v1NodesNodeStoragePoolsPropertiesInfoGet(node);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#v1NodesNodeStoragePoolsPropertiesInfoGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **node** | **String**| node to use |

### Return type

[**Map&lt;String, PropsInfo&gt;**](PropsInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1NodesPropertiesInfoGet"></a>
# **v1NodesPropertiesInfoGet**
> Map&lt;String, PropsInfo&gt; v1NodesPropertiesInfoGet()

list all node properties

list all property-names and their descriptions

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    Map<String, PropsInfo> result = apiInstance.v1NodesPropertiesInfoGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#v1NodesPropertiesInfoGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Map&lt;String, PropsInfo&gt;**](PropsInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1ResourceDefinitionsPropertiesInfoGet"></a>
# **v1ResourceDefinitionsPropertiesInfoGet**
> Map&lt;String, PropsInfo&gt; v1ResourceDefinitionsPropertiesInfoGet()

list all resource-definition properties

list all property-names and their descriptions

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    Map<String, PropsInfo> result = apiInstance.v1ResourceDefinitionsPropertiesInfoGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#v1ResourceDefinitionsPropertiesInfoGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Map&lt;String, PropsInfo&gt;**](PropsInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1ResourceDefinitionsResourceDrbdProxyPropertiesInfoGet"></a>
# **v1ResourceDefinitionsResourceDrbdProxyPropertiesInfoGet**
> Map&lt;String, PropsInfo&gt; v1ResourceDefinitionsResourceDrbdProxyPropertiesInfoGet(resource)

list all drbd-proxy properties

list all property-names and their descriptions

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String resource = "resource_example"; // String | resource to use
try {
    Map<String, PropsInfo> result = apiInstance.v1ResourceDefinitionsResourceDrbdProxyPropertiesInfoGet(resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#v1ResourceDefinitionsResourceDrbdProxyPropertiesInfoGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | **String**| resource to use |

### Return type

[**Map&lt;String, PropsInfo&gt;**](PropsInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1ResourceDefinitionsResourceResourceConnectionsPropertiesInfoGet"></a>
# **v1ResourceDefinitionsResourceResourceConnectionsPropertiesInfoGet**
> Map&lt;String, PropsInfo&gt; v1ResourceDefinitionsResourceResourceConnectionsPropertiesInfoGet(resource)

list all resource-connection properties

list all property-names and their descriptions

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String resource = "resource_example"; // String | resource to use
try {
    Map<String, PropsInfo> result = apiInstance.v1ResourceDefinitionsResourceResourceConnectionsPropertiesInfoGet(resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#v1ResourceDefinitionsResourceResourceConnectionsPropertiesInfoGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | **String**| resource to use |

### Return type

[**Map&lt;String, PropsInfo&gt;**](PropsInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1ResourceDefinitionsResourceResourcesNodeVolumesPropertiesInfoGet"></a>
# **v1ResourceDefinitionsResourceResourcesNodeVolumesPropertiesInfoGet**
> Map&lt;String, PropsInfo&gt; v1ResourceDefinitionsResourceResourcesNodeVolumesPropertiesInfoGet(node, resource)

list all volume properties

list all property-names and their descriptions

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String node = "node_example"; // String | node to use
String resource = "resource_example"; // String | resource to use
try {
    Map<String, PropsInfo> result = apiInstance.v1ResourceDefinitionsResourceResourcesNodeVolumesPropertiesInfoGet(node, resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#v1ResourceDefinitionsResourceResourcesNodeVolumesPropertiesInfoGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **node** | **String**| node to use |
 **resource** | **String**| resource to use |

### Return type

[**Map&lt;String, PropsInfo&gt;**](PropsInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1ResourceDefinitionsResourceResourcesPropertiesInfoGet"></a>
# **v1ResourceDefinitionsResourceResourcesPropertiesInfoGet**
> Map&lt;String, PropsInfo&gt; v1ResourceDefinitionsResourceResourcesPropertiesInfoGet(resource)

list all resource properties

list all property-names and their descriptions

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String resource = "resource_example"; // String | resource to use
try {
    Map<String, PropsInfo> result = apiInstance.v1ResourceDefinitionsResourceResourcesPropertiesInfoGet(resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#v1ResourceDefinitionsResourceResourcesPropertiesInfoGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | **String**| resource to use |

### Return type

[**Map&lt;String, PropsInfo&gt;**](PropsInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1ResourceDefinitionsResourceVolumeDefinitionsPropertiesInfoGet"></a>
# **v1ResourceDefinitionsResourceVolumeDefinitionsPropertiesInfoGet**
> Map&lt;String, PropsInfo&gt; v1ResourceDefinitionsResourceVolumeDefinitionsPropertiesInfoGet(resource)

list all volume-definition properties

list all property-names and their descriptions

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String resource = "resource_example"; // String | resource to use
try {
    Map<String, PropsInfo> result = apiInstance.v1ResourceDefinitionsResourceVolumeDefinitionsPropertiesInfoGet(resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#v1ResourceDefinitionsResourceVolumeDefinitionsPropertiesInfoGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | **String**| resource to use |

### Return type

[**Map&lt;String, PropsInfo&gt;**](PropsInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1ResourceGroupsPropertiesInfoGet"></a>
# **v1ResourceGroupsPropertiesInfoGet**
> Map&lt;String, PropsInfo&gt; v1ResourceGroupsPropertiesInfoGet()

list all resource-group properties

list all property-names and their descriptions

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    Map<String, PropsInfo> result = apiInstance.v1ResourceGroupsPropertiesInfoGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#v1ResourceGroupsPropertiesInfoGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Map&lt;String, PropsInfo&gt;**](PropsInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1ResourceGroupsResourceGroupVolumeGroupsPropertiesInfoGet"></a>
# **v1ResourceGroupsResourceGroupVolumeGroupsPropertiesInfoGet**
> Map&lt;String, PropsInfo&gt; v1ResourceGroupsResourceGroupVolumeGroupsPropertiesInfoGet(resourceGroup)

list all volume-group properties

list all property-names and their descriptions

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String resourceGroup = "resourceGroup_example"; // String | resource group to use
try {
    Map<String, PropsInfo> result = apiInstance.v1ResourceGroupsResourceGroupVolumeGroupsPropertiesInfoGet(resourceGroup);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#v1ResourceGroupsResourceGroupVolumeGroupsPropertiesInfoGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourceGroup** | **String**| resource group to use |

### Return type

[**Map&lt;String, PropsInfo&gt;**](PropsInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1StoragePoolDefinitionsPropertiesInfoGet"></a>
# **v1StoragePoolDefinitionsPropertiesInfoGet**
> Map&lt;String, PropsInfo&gt; v1StoragePoolDefinitionsPropertiesInfoGet()

list all storage-pool-definition properties

list all property-names and their descriptions

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    Map<String, PropsInfo> result = apiInstance.v1StoragePoolDefinitionsPropertiesInfoGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#v1StoragePoolDefinitionsPropertiesInfoGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Map&lt;String, PropsInfo&gt;**](PropsInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

