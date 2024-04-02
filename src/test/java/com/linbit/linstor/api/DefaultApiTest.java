/*
 * Linstor REST API
 * Linstor REST API V1  The V1 rest api of Linstor should stay compatible and only additions are made to the API, If there are breaking changes or redesigned a new major REST API version will be issued.  Server runs per default on port `3370` on `::` ipv6 and ipv4.  To change the bind address or port you can use the following linstor client commands: ``` linstor controller set-property REST/bindAddress 127.0.0.1 linstor controller set-property REST/port 8080 ```  After setting this properties restart the controller and the new values should be used. 
 *
 * OpenAPI spec version: 1.22.0
 * Contact: rene.peinthor@linbit.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.linbit.linstor.api;

import com.linbit.linstor.api.model.ApiCallRcList;
import com.linbit.linstor.api.model.NodeRestore;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    /**
     * restore node
     *
     * restore an evicted node
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void v1NodesNodeRestorePutTest() throws Exception {
        String node = null;
        NodeRestore body = null;
        ApiCallRcList response = api.v1NodesNodeRestorePut(node, body);

        // TODO: test validations
    }
}
