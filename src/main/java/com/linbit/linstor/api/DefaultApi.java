package com.linbit.linstor.api;

import com.linbit.linstor.api.ApiException;
import com.linbit.linstor.api.ApiClient;
import com.linbit.linstor.api.Configuration;
import com.linbit.linstor.api.Pair;

import javax.ws.rs.core.GenericType;

import com.linbit.linstor.api.model.ApiCallRcList;
import com.linbit.linstor.api.model.PropsInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-02-05T10:27:33.226Z[GMT]")public class DefaultApi {
  private ApiClient apiClient;

  public DefaultApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DefaultApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * list all properties
   * list all property-names and their descriptions
   * @return Map&lt;String, Map&lt;String, PropsInfo&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public Map<String, Map<String, PropsInfo>> v1ControllerPropertiesInfoAllGet() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/v1/controller/properties/info/all";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Map<String, Map<String, PropsInfo>>> localVarReturnType = new GenericType<Map<String, Map<String, PropsInfo>>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * list all controller properties
   * list all property-names and their descriptions
   * @return Map&lt;String, PropsInfo&gt;
   * @throws ApiException if fails to make API call
   */
  public Map<String, PropsInfo> v1ControllerPropertiesInfoGet() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/v1/controller/properties/info";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Map<String, PropsInfo>> localVarReturnType = new GenericType<Map<String, PropsInfo>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * restore node
   * restore an evicted node
   * @param node node to use (required)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList v1NodesNodeRestorePut(String node) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'node' is set
    if (node == null) {
      throw new ApiException(400, "Missing the required parameter 'node' when calling v1NodesNodeRestorePut");
    }
    // create path and map variables
    String localVarPath = "/v1/nodes/{node}/restore"
      .replaceAll("\\{" + "node" + "\\}", apiClient.escapeString(node.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * list all storage-pool properties
   * list all property-names and their descriptions
   * @param node node to use (required)
   * @return Map&lt;String, PropsInfo&gt;
   * @throws ApiException if fails to make API call
   */
  public Map<String, PropsInfo> v1NodesNodeStoragePoolsPropertiesInfoGet(String node) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'node' is set
    if (node == null) {
      throw new ApiException(400, "Missing the required parameter 'node' when calling v1NodesNodeStoragePoolsPropertiesInfoGet");
    }
    // create path and map variables
    String localVarPath = "/v1/nodes/{node}/storage-pools/properties/info"
      .replaceAll("\\{" + "node" + "\\}", apiClient.escapeString(node.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Map<String, PropsInfo>> localVarReturnType = new GenericType<Map<String, PropsInfo>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * list all node properties
   * list all property-names and their descriptions
   * @return Map&lt;String, PropsInfo&gt;
   * @throws ApiException if fails to make API call
   */
  public Map<String, PropsInfo> v1NodesPropertiesInfoGet() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/v1/nodes/properties/info";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Map<String, PropsInfo>> localVarReturnType = new GenericType<Map<String, PropsInfo>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * list all resource-definition properties
   * list all property-names and their descriptions
   * @return Map&lt;String, PropsInfo&gt;
   * @throws ApiException if fails to make API call
   */
  public Map<String, PropsInfo> v1ResourceDefinitionsPropertiesInfoGet() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/properties/info";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Map<String, PropsInfo>> localVarReturnType = new GenericType<Map<String, PropsInfo>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * list all drbd-proxy properties
   * list all property-names and their descriptions
   * @param resource resource to use (required)
   * @return Map&lt;String, PropsInfo&gt;
   * @throws ApiException if fails to make API call
   */
  public Map<String, PropsInfo> v1ResourceDefinitionsResourceDrbdProxyPropertiesInfoGet(String resource) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling v1ResourceDefinitionsResourceDrbdProxyPropertiesInfoGet");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/drbd-proxy/properties/info"
      .replaceAll("\\{" + "resource" + "\\}", apiClient.escapeString(resource.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Map<String, PropsInfo>> localVarReturnType = new GenericType<Map<String, PropsInfo>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * list all resource-connection properties
   * list all property-names and their descriptions
   * @param resource resource to use (required)
   * @return Map&lt;String, PropsInfo&gt;
   * @throws ApiException if fails to make API call
   */
  public Map<String, PropsInfo> v1ResourceDefinitionsResourceResourceConnectionsPropertiesInfoGet(String resource) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling v1ResourceDefinitionsResourceResourceConnectionsPropertiesInfoGet");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/resource-connections/properties/info"
      .replaceAll("\\{" + "resource" + "\\}", apiClient.escapeString(resource.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Map<String, PropsInfo>> localVarReturnType = new GenericType<Map<String, PropsInfo>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * list all volume properties
   * list all property-names and their descriptions
   * @param node node to use (required)
   * @param resource resource to use (required)
   * @return Map&lt;String, PropsInfo&gt;
   * @throws ApiException if fails to make API call
   */
  public Map<String, PropsInfo> v1ResourceDefinitionsResourceResourcesNodeVolumesPropertiesInfoGet(String node, String resource) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'node' is set
    if (node == null) {
      throw new ApiException(400, "Missing the required parameter 'node' when calling v1ResourceDefinitionsResourceResourcesNodeVolumesPropertiesInfoGet");
    }
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling v1ResourceDefinitionsResourceResourcesNodeVolumesPropertiesInfoGet");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/resources/{node}/volumes/properties/info"
      .replaceAll("\\{" + "node" + "\\}", apiClient.escapeString(node.toString()))
      .replaceAll("\\{" + "resource" + "\\}", apiClient.escapeString(resource.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Map<String, PropsInfo>> localVarReturnType = new GenericType<Map<String, PropsInfo>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * list all resource properties
   * list all property-names and their descriptions
   * @param resource resource to use (required)
   * @return Map&lt;String, PropsInfo&gt;
   * @throws ApiException if fails to make API call
   */
  public Map<String, PropsInfo> v1ResourceDefinitionsResourceResourcesPropertiesInfoGet(String resource) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling v1ResourceDefinitionsResourceResourcesPropertiesInfoGet");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/resources/properties/info"
      .replaceAll("\\{" + "resource" + "\\}", apiClient.escapeString(resource.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Map<String, PropsInfo>> localVarReturnType = new GenericType<Map<String, PropsInfo>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * list all volume-definition properties
   * list all property-names and their descriptions
   * @param resource resource to use (required)
   * @return Map&lt;String, PropsInfo&gt;
   * @throws ApiException if fails to make API call
   */
  public Map<String, PropsInfo> v1ResourceDefinitionsResourceVolumeDefinitionsPropertiesInfoGet(String resource) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling v1ResourceDefinitionsResourceVolumeDefinitionsPropertiesInfoGet");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/volume-definitions/properties/info"
      .replaceAll("\\{" + "resource" + "\\}", apiClient.escapeString(resource.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Map<String, PropsInfo>> localVarReturnType = new GenericType<Map<String, PropsInfo>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * list all resource-group properties
   * list all property-names and their descriptions
   * @return Map&lt;String, PropsInfo&gt;
   * @throws ApiException if fails to make API call
   */
  public Map<String, PropsInfo> v1ResourceGroupsPropertiesInfoGet() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/v1/resource-groups/properties/info";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Map<String, PropsInfo>> localVarReturnType = new GenericType<Map<String, PropsInfo>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * list all volume-group properties
   * list all property-names and their descriptions
   * @param resourceGroup resource group to use (required)
   * @return Map&lt;String, PropsInfo&gt;
   * @throws ApiException if fails to make API call
   */
  public Map<String, PropsInfo> v1ResourceGroupsResourceGroupVolumeGroupsPropertiesInfoGet(String resourceGroup) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'resourceGroup' is set
    if (resourceGroup == null) {
      throw new ApiException(400, "Missing the required parameter 'resourceGroup' when calling v1ResourceGroupsResourceGroupVolumeGroupsPropertiesInfoGet");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-groups/{resource_group}/volume-groups/properties/info"
      .replaceAll("\\{" + "resource_group" + "\\}", apiClient.escapeString(resourceGroup.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Map<String, PropsInfo>> localVarReturnType = new GenericType<Map<String, PropsInfo>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * list all storage-pool-definition properties
   * list all property-names and their descriptions
   * @return Map&lt;String, PropsInfo&gt;
   * @throws ApiException if fails to make API call
   */
  public Map<String, PropsInfo> v1StoragePoolDefinitionsPropertiesInfoGet() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/v1/storage-pool-definitions/properties/info";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Map<String, PropsInfo>> localVarReturnType = new GenericType<Map<String, PropsInfo>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
