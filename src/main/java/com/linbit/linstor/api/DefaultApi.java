package com.linbit.linstor.api;

import com.linbit.linstor.api.ApiException;
import com.linbit.linstor.api.ApiClient;
import com.linbit.linstor.api.Configuration;
import com.linbit.linstor.api.Pair;

import javax.ws.rs.core.GenericType;

import com.linbit.linstor.api.model.ApiCallRcList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-31T11:02:45.596Z[GMT]")public class DefaultApi {
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
}
