/*
 * Linstor REST API
 * Linstor REST API V1  The V1 rest api of Linstor should stay compatible and only additions are made to the API, If there are breaking changes or redesigned a new major REST API version will be issued.  Server runs per default on port `3370` on `::` ipv6 and ipv4.  To change the bind address or port you can use the following linstor client commands: ``` linstor controller set-property REST/bindAddress 127.0.0.1 linstor controller set-property REST/port 8080 ```  After setting this properties restart the controller and the new values should be used.  Changelog:  * 1.6.0    - Added PropsInfoAll, PropsInfo and PropsInfoDetails as well as these entrypoints:       - /v1/controller/properties/info       - /v1/controller/properties/info/all       - /v1/nodes/properties/info       - /v1/storage-pool-definitions/properties/info       - /v1/nodes/{node}/storage-pools/properties/info       - /v1/resource-definitions/properties/info       - /v1/resource-definitions/{resource}/resources/properties/info       - /v1/resource-definitions/{resource}/volume-definitions/properties/info       - /v1/resource-definitions/{resource}/resources/{node}/volumes/properties/info       - /v1/resource-definitions/{resource}/resource-connections/properties/info       - /v1/resource-groups/properties/info       - /v1/resource-groups/{resource_group}/volume-groups/properties/info       - /v1/resource-definitions/{resource}/drbd-proxy/properties/info    - Added /v1/nodes/{node}/restore    - Added additional_place_count to AutoSelectFilter * 1.5.0    - Added etcd.prefix to ControllerConfigDbEtcd parameters * 1.4.0    - Added promotion_score and may_promote to DrbdResource object    - Added /v1/error-reports DELETE method, to delete a range of error reports or single ones    - Added SSE (Server Sent Events) url /v1/events/drbd/promotion * 1.3.0    - Added /v1/view/snapshot-shippings * 1.2.0    - Added optional AutoSelectFilter to resource-group/spawn    - Added /v1/nodes/{node}/config, that allows you to get and set the satellite config    - Added /v1/sos-report to create bug reports you can send to linbit    - Added new fields to the ErrorReport object    - Added /v1/resource-definitions/{resource}/snapshot-shipping    - Allow to modify the resource group in Resource definitions    - Added createTimestamp to Resource and Snapshot    - Added default value (null) for AutoPlaceRequest's layer_list * 1.1.0    - Added /v1/view/snapshots for a faster all in one snapshot list    - Filter lists by properties:       - /v1/nodes       - /v1/resource-definitions       - /v1/resource-groups       - /v1/view/storage-pools       - /v1/view/resources * 1.0.16    - Added CacheResource and CacheVolume schemas    - AutSelectFilter arrays are now null per default * 1.0.15   - Added connections map to the DRBD resource layer data   - Added support for Openflex * 1.0.14   - Added /v1/controller/config, that gives you the controller config information * 1.0.13   - Fixed broken volume definition modify `flags` handling   - Added flags to volume groups (create/modify) * 1.0.12   - Added WritecacheResource and WritecacheVolume schemas.   - Removed support for swordfish   - Added `with_storage_pool` to PhysicalStorageCreate post request, allowing to create linstor storage pools too   - Added `gross` flag for volume-definition size   - Added flags to VolumeDefinitionModify (so that `gross` flag can be changed)   - Added query-max-volume-size to resource-groups * 1.0.11   - Added /v1/physical-storage endpoint, that lets you query and create lvm/zfs pools   - Extended Node with list of supported providers and layers as well as lists of reasons for     unsupported providers and layers * 1.0.10   - Added `reports` array field to Volume object, contains ApiCallRcs for problems   - Changed `ResourceDefinitions` can now include `VolumeDefinitions` in `volume_definitions` field   - Added various filter query parameters * 1.0.9   - Added supports_snapshots to StoragePool * 1.0.8   - Added /v1/resource-groups   - Added /v1/resource-groups/{rscgrp}/volume-groups   - Moved AutoSelectFilter::place_count default indirectly to create resource implementation   - Added diskless_on_remaining to AutoSelectFilter   - Changed /v1/view/resources return type to ResourceWithVolumes     ResourceWithVolumes is now a child type of Resource (removed volumes from Resource) * 1.0.7   - Added ext_meta_stor_pool to DrbdVolume   - Added is_active field to the NetInterface type * 1.0.6   - Added /v1/resource-definitions/{rscName}/resources/{nodeName}/volumes/{vlmnr} PUT * 1.0.5   - Added `reports` field to StoragePool object * 1.0.4   - Added /v1/view/storage-pools overview path   - Added uuid fields for objects * 1.0.3   - Added /v1/view/resources overview path   - documentation schema extraction * 1.0.2   - Added /v1/storage-pool-definitions object path   - added NVME layer object type * 1.0.1   - Documentation review and updates   - no functional changes * 1.0.0   - Initial REST API v1 
 *
 * OpenAPI spec version: 1.6.0
 * Contact: rene.peinthor@linbit.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.linbit.linstor.api;

import com.linbit.linstor.api.model.ApiCallRcList;
import com.linbit.linstor.api.model.AutoPlaceRequest;
import com.linbit.linstor.api.model.AutoSelectFilter;
import com.linbit.linstor.api.model.ControllerConfig;
import com.linbit.linstor.api.model.ControllerPropsModify;
import com.linbit.linstor.api.model.ControllerVersion;
import com.linbit.linstor.api.model.DrbdProxyEnable;
import com.linbit.linstor.api.model.DrbdProxyModify;
import com.linbit.linstor.api.model.ErrorReport;
import com.linbit.linstor.api.model.ErrorReportDelete;
import com.linbit.linstor.api.model.InlineResponse200;
import com.linbit.linstor.api.model.KeyValueStore;
import com.linbit.linstor.api.model.KeyValueStoreModify;
import com.linbit.linstor.api.model.MaxVolumeSizes;
import com.linbit.linstor.api.model.NetInterface;
import com.linbit.linstor.api.model.Node;
import com.linbit.linstor.api.model.NodeModify;
import com.linbit.linstor.api.model.PassPhraseCreate;
import com.linbit.linstor.api.model.PhysicalStorage;
import com.linbit.linstor.api.model.PhysicalStorageCreate;
import com.linbit.linstor.api.model.Properties;
import com.linbit.linstor.api.model.Resource;
import com.linbit.linstor.api.model.ResourceConnection;
import com.linbit.linstor.api.model.ResourceConnectionModify;
import com.linbit.linstor.api.model.ResourceCreate;
import com.linbit.linstor.api.model.ResourceDefinition;
import com.linbit.linstor.api.model.ResourceDefinitionCreate;
import com.linbit.linstor.api.model.ResourceDefinitionModify;
import com.linbit.linstor.api.model.ResourceGroup;
import com.linbit.linstor.api.model.ResourceGroupModify;
import com.linbit.linstor.api.model.ResourceGroupSpawn;
import com.linbit.linstor.api.model.ResourceModify;
import com.linbit.linstor.api.model.ResourceWithVolumes;
import com.linbit.linstor.api.model.SatelliteConfig;
import com.linbit.linstor.api.model.Snapshot;
import com.linbit.linstor.api.model.SnapshotRestore;
import com.linbit.linstor.api.model.SnapshotShipping;
import com.linbit.linstor.api.model.SnapshotShippingStatus;
import com.linbit.linstor.api.model.StoragePool;
import com.linbit.linstor.api.model.StoragePoolDefinition;
import com.linbit.linstor.api.model.StoragePoolDefinitionModify;
import com.linbit.linstor.api.model.Volume;
import com.linbit.linstor.api.model.VolumeDefinition;
import com.linbit.linstor.api.model.VolumeDefinitionCreate;
import com.linbit.linstor.api.model.VolumeDefinitionModify;
import com.linbit.linstor.api.model.VolumeGroup;
import com.linbit.linstor.api.model.VolumeGroupModify;
import com.linbit.linstor.api.model.VolumeModify;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for DevelopersApi
 */
public class DevelopersApiTest {

    private final DevelopersApi api;

    public DevelopersApiTest() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        Map<String, String> env = System.getenv();
        apiClient.setBasePath(
            String.format("http://%s:%s",
                env.getOrDefault("LINSTOR_CONTROLLER_HOST", "localhost"),
                env.getOrDefault("LINSTOR_CONTROLLER_PORT", "3370")));
        api = new DevelopersApi(apiClient);
    }

    /**
     * show controller config
     *
     * Show Controller config
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void controllerConfigTest() throws ApiException {
        ControllerConfig response = api.controllerConfig();

        // TODO: test validations
    }
    /**
     * Deletes a controller property
     *
     * Delete a controller property
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void controllerPropertyDeleteTest() throws ApiException {
        String key = null;
        ApiCallRcList response = api.controllerPropertyDelete(key);

        // TODO: test validations
    }
    /**
     * lists all controller properties
     *
     * Lists all controller properties. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void controllerPropertyListTest() throws ApiException {
        Properties response = api.controllerPropertyList();

        Assert.assertTrue(response.size() > 0);
    }
    /**
     * sets or modifies controller properties
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void controllerPropertyModifyTest() throws ApiException {
        ControllerPropsModify body = null;
        ApiCallRcList response = api.controllerPropertyModify(body);

        // TODO: test validations
    }
    /**
     * show controller version info
     *
     * Show Controller version info 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void controllerVersionTest() throws ApiException {
        ControllerVersion response = api.controllerVersion();

        Assert.assertTrue(response.getRestApiVersion().startsWith("1"));
    }
    /**
     * creates an LVM, LVM-thin or ZFS pool, optional VDO under it
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void createDevicePoolTest() throws ApiException {
        String node = null;
        PhysicalStorageCreate body = null;
        ApiCallRcList response = api.createDevicePool(node, body);

        // TODO: test validations
    }
    /**
     * creates a SOS report in the log directory of the controller
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void createSOSReportTest() throws ApiException {
        String node = null;
        Long since = null;
        ApiCallRcList response = api.createSOSReport(node, since);

        // TODO: test validations
    }
    /**
     * modify controller config
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void ctrlSetConfigTest() throws ApiException {
        ControllerConfig body = null;
        ApiCallRcList response = api.ctrlSetConfig(body);

        // TODO: test validations
    }
    /**
     * request sos report to download
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void downloadSOSReportTest() throws ApiException {
        String node = null;
        Long since = null;
        File response = api.downloadSOSReport(node, since);

        // TODO: test validations
    }
    /**
     * create a encryption passphrase
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void encryptionPassphraseCreateTest() throws ApiException {
        PassPhraseCreate body = null;
        ApiCallRcList response = api.encryptionPassphraseCreate(body);

        // TODO: test validations
    }
    /**
     * enter the encryption passphrase
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void encryptionPassphraseEnterTest() throws ApiException {
        String body = null;
        ApiCallRcList response = api.encryptionPassphraseEnter(body);

        // TODO: test validations
    }
    /**
     * modifies the encryption passphrase
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void encryptionPassphraseModifyTest() throws ApiException {
        PassPhraseCreate body = null;
        ApiCallRcList response = api.encryptionPassphraseModify(body);

        // TODO: test validations
    }
    /**
     * Deletes a range of error-reports
     *
     * Deletes a range of error-reports
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void errorReportDeleteTest() throws ApiException {
        ErrorReportDelete body = null;
        ApiCallRcList response = api.errorReportDelete(body);

        // TODO: test validations
    }
    /**
     * Deletes a single error-report
     *
     * Deletes a single error-report
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void errorReportDeleteSingleTest() throws ApiException {
        String reportid = null;
        ApiCallRcList response = api.errorReportDeleteSingle(reportid);

        // TODO: test validations
    }
    /**
     * list all error reports
     *
     * List all error reports
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void errorReportListTest() throws ApiException {
        String node = null;
        Long since = null;
        Long to = null;
        Boolean withContent = null;
        Integer offset = null;
        Integer limit = null;
        List<ErrorReport> response = api.errorReportList(node, since, to, withContent, offset, limit);

        Assert.assertEquals(0, response.size());
    }
    /**
     * query the specified reportid
     *
     * Query the specified reportid
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void errorReportShowTest() throws ApiException {
        String reportid = null;
        String node = null;
        Long since = null;
        Long to = null;
        Boolean withContent = null;
        Integer offset = null;
        Integer limit = null;
        List<ErrorReport> response = api.errorReportShow(reportid, node, since, to, withContent, offset, limit);

        // TODO: test validations
    }
    /**
     * delete a key value store
     *
     * Delete a key value store
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void keyValueStoreDeleteTest() throws ApiException {
        String instance = null;
        ApiCallRcList response = api.keyValueStoreDelete(instance);

        // TODO: test validations
    }
    /**
     * list all key value stores
     *
     * List all known key value store instances
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void keyValueStoreListTest() throws ApiException {
        String instance = null;
        List<KeyValueStore> response = api.keyValueStoreList(instance);

        // TODO: test validations
    }
    /**
     * modify a key value store
     *
     * Modify a key value store
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void keyValueStoreModifyTest() throws ApiException {
        String instance = null;
        KeyValueStoreModify body = null;
        ApiCallRcList response = api.keyValueStoreModify(instance, body);

        // TODO: test validations
    }
    /**
     * list all key value stores
     *
     * List all known key value store instances
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void keyValueStoresListTest() throws ApiException {
        List<KeyValueStore> response = api.keyValueStoresList();

        Assert.assertEquals(0, response.size());
    }
    /**
     * create a netinterface on a node
     *
     * Create a netinterface on a node
     * If satellite_port and satellite_encryption_type are given the netinterface can also work as connection to the controller
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void netinterfaceCreateTest() throws ApiException {
        String node = null;
        NetInterface body = null;
        ApiCallRcList response = api.netinterfaceCreate(node, body);

        // TODO: test validations
    }
    /**
     * delete a netinterface from a node
     *
     * Delete a netinterface from a node
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void netinterfaceDeleteTest() throws ApiException {
        String node = null;
        String netinterface = null;
        ApiCallRcList response = api.netinterfaceDelete(node, netinterface);

        // TODO: test validations
    }
    /**
     * return the list of net-interfaces
     *
     * Returns the list of netinterfaces for this node
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void netinterfaceListTest() throws ApiException {
        String node = null;
        Integer offset = null;
        Integer limit = null;
        List<NetInterface> response = api.netinterfaceList(node, offset, limit);

        // TODO: test validations
    }
    /**
     * modify a netinterface from a node
     *
     * Modify a netinterface from a node
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void netinterfaceModifiedTest() throws ApiException {
        String node = null;
        String netinterface = null;
        NetInterface body = null;
        ApiCallRcList response = api.netinterfaceModified(node, netinterface, body);

        // TODO: test validations
    }
    /**
     * add a node to Linstor
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void nodeAddTest() throws ApiException {
        Node body = null;
        ApiCallRcList response = api.nodeAdd(body);

        // TODO: test validations
    }
    /**
     * delete a node
     *
     * Delete a node from Linstor
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void nodeDeleteTest() throws ApiException {
        String node = null;
        ApiCallRcList response = api.nodeDelete(node);

        // TODO: test validations
    }
    /**
     * Lists nodes registered to the controller
     *
     * Returns an array of all nodes registered to Linstor. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void nodeListTest() throws ApiException {
        List<String> nodes = null;
        List<String> props = null;
        Integer offset = null;
        Integer limit = null;
        List<Node> response = api.nodeList(nodes, props, offset, limit);

        Assert.assertEquals(0, response.size());
    }
    /**
     * delete an unrecoverable node
     *
     * Delete an unrecoverable node
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void nodeLostTest() throws ApiException {
        String node = null;
        ApiCallRcList response = api.nodeLost(node);

        // TODO: test validations
    }
    /**
     * modify a node
     *
     * Sets or modifies properties
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void nodeModifyTest() throws ApiException {
        String node = null;
        NodeModify body = null;
        ApiCallRcList response = api.nodeModify(node, body);

        // TODO: test validations
    }
    /**
     * reconnect a node to the controller
     *
     * Reconnect a node to the controller
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void nodeReconnectTest() throws ApiException {
        String node = null;
        ApiCallRcList response = api.nodeReconnect(node);

        // TODO: test validations
    }
    /**
     * creates a new storage pool on this node
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void nodeStoragePoolCreateTest() throws ApiException {
        String node = null;
        StoragePool body = null;
        ApiCallRcList response = api.nodeStoragePoolCreate(node, body);

        // TODO: test validations
    }
    /**
     * delete a storage pool
     *
     * Delete a storage pool
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void nodeStoragePoolDeleteTest() throws ApiException {
        String node = null;
        String storagepool = null;
        ApiCallRcList response = api.nodeStoragePoolDelete(node, storagepool);

        // TODO: test validations
    }
    /**
     * lists all storage pools for a node
     *
     * Lists all storage pools of a node
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void nodeStoragePoolListTest() throws ApiException {
        String node = null;
        List<String> nodes = null;
        List<String> storagePools = null;
        Integer offset = null;
        Integer limit = null;
        List<StoragePool> response = api.nodeStoragePoolList(node, nodes, storagePools, offset, limit);

        // TODO: test validations
    }
    /**
     * modify a storage pool
     *
     * Sets or modifies properties
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void nodeStoragePoolModifyTest() throws ApiException {
        String node = null;
        String storagepool = null;
        StoragePoolDefinitionModify body = null;
        ApiCallRcList response = api.nodeStoragePoolModify(node, storagepool, body);

        // TODO: test validations
    }
    /**
     * query the maximum volume size
     *
     * Query the maximum possible volume size storage pools
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void queryMaxVolumeSizeTest() throws ApiException {
        AutoSelectFilter body = null;
        MaxVolumeSizes response = api.queryMaxVolumeSize(body);

        // TODO: test validations
    }
    /**
     * query the maximum volume size from a given resource group
     *
     * Query the maximum possible volume size storage pools
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void queryMaxVolumeSizeFromRscGrpTest() throws ApiException {
        String resourceGroup = null;
        MaxVolumeSizes response = api.queryMaxVolumeSizeFromRscGrp(resourceGroup);

        // TODO: test validations
    }
    /**
     * autoplace resource
     *
     * Auto place the resource on the specified place_count redundency. If place_count isn&#x27;t given 2 is the default. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void resourceAutoplaceTest() throws ApiException {
        String resource = null;
        AutoPlaceRequest body = null;
        ApiCallRcList response = api.resourceAutoplace(resource, body);

        // TODO: test validations
    }
    /**
     * show the specified resource connection
     *
     * show the specified resource connection
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void resourceConnectionListTest() throws ApiException {
        String resource = null;
        String nodeA = null;
        String nodeB = null;
        List<ResourceConnection> response = api.resourceConnectionList(resource, nodeA, nodeB);

        // TODO: test validations
    }
    /**
     * modify a resource connection
     *
     * Sets or modifies properties
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void resourceConnectionModifyTest() throws ApiException {
        String resource = null;
        String nodeA = null;
        String nodeB = null;
        ResourceConnectionModify body = null;
        ApiCallRcList response = api.resourceConnectionModify(resource, nodeA, nodeB, body);

        // TODO: test validations
    }
    /**
     * list all resource connections for resource
     *
     * List all resource connections for resource
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void resourceConnectionsListTest() throws ApiException {
        String resource = null;
        List<ResourceConnection> response = api.resourceConnectionsList(resource);

        // TODO: test validations
    }
    /**
     * create one or more resources.
     *
     * Adds one or more resource(s). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void resourceCreateTest() throws ApiException {
        String resource = null;
        List<ResourceCreate> body = null;
        ApiCallRcList response = api.resourceCreate(resource, body);

        // TODO: test validations
    }
    /**
     * create a resource on a node
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void resourceCreateOnNodeTest() throws ApiException {
        String resource = null;
        String node = null;
        ResourceCreate body = null;
        ApiCallRcList response = api.resourceCreateOnNode(resource, node, body);

        // TODO: test validations
    }
    /**
     * add a resource-definition
     *
     * Adds a resource-definition.  Only required property is the name of the resource definition. All other properties are optional. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void resourceDefinitionCreateTest() throws ApiException {
        ResourceDefinitionCreate body = null;
        ApiCallRcList response = api.resourceDefinitionCreate(body);

        // TODO: test validations
    }
    /**
     * delete a resource-definition
     *
     * Delete a resource-definition
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void resourceDefinitionDeleteTest() throws ApiException {
        String resource = null;
        ApiCallRcList response = api.resourceDefinitionDelete(resource);

        // TODO: test validations
    }
    /**
     * lists all resource-definitions
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void resourceDefinitionListTest() throws ApiException {
        List<String> resourceDefinitions = null;
        List<String> props = null;
        Integer offset = null;
        Integer limit = null;
        List<ResourceDefinition> response = api.resourceDefinitionList(resourceDefinitions, props, offset, limit);

        // TODO: test validations
    }
    /**
     * modify a resource-definition
     *
     * Sets or modifies properties
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void resourceDefinitionModifyTest() throws ApiException {
        String resource = null;
        ResourceDefinitionModify body = null;
        ApiCallRcList response = api.resourceDefinitionModify(resource, body);

        // TODO: test validations
    }
    /**
     * delete a resource
     *
     * Delete a resource on a node
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void resourceDeleteTest() throws ApiException {
        String resource = null;
        String node = null;
        ApiCallRcList response = api.resourceDelete(resource, node);

        // TODO: test validations
    }
    /**
     * disables a drbd proxy on a node connection
     *
     * Disables a drbd proxy on a node connection
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void resourceDrbdProxyDisableTest() throws ApiException {
        String resource = null;
        String nodeA = null;
        String nodeB = null;
        ApiCallRcList response = api.resourceDrbdProxyDisable(resource, nodeA, nodeB);

        // TODO: test validations
    }
    /**
     * enable a drbd proxy on a node connection
     *
     * Enables a drbd proxy on a node connection
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void resourceDrbdProxyEnableTest() throws ApiException {
        String resource = null;
        String nodeA = null;
        String nodeB = null;
        DrbdProxyEnable body = null;
        ApiCallRcList response = api.resourceDrbdProxyEnable(resource, nodeA, nodeB, body);

        // TODO: test validations
    }
    /**
     * modify drbd proxy option properties
     *
     * Sets or modifies properties
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void resourceDrbdProxyModifyTest() throws ApiException {
        String resource = null;
        DrbdProxyModify body = null;
        ApiCallRcList response = api.resourceDrbdProxyModify(resource, body);

        // TODO: test validations
    }
    /**
     * add a resource-group
     *
     * Adds a resource-group.  Only required property is the name of the resource group. All other properties are optional. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void resourceGroupCreateTest() throws ApiException {
        ResourceGroup body = null;
        ApiCallRcList response = api.resourceGroupCreate(body);

        // TODO: test validations
    }
    /**
     * delete a resource-group
     *
     * Delete a resource-group
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void resourceGroupDeleteTest() throws ApiException {
        String resourceGroup = null;
        ApiCallRcList response = api.resourceGroupDelete(resourceGroup);

        // TODO: test validations
    }
    /**
     * lists all resource-groups
     *
     * Lists all resource groups.  A single resource group can be queried by adding its name to the resource string like:  /v1/resource-groups/rscgrp1 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void resourceGroupListTest() throws ApiException {
        List<String> resourceGroups = null;
        List<String> props = null;
        Integer offset = null;
        Integer limit = null;
        List<ResourceGroup> response = api.resourceGroupList(resourceGroups, props, offset, limit);

        // TODO: test validations
    }
    /**
     * modify a resource-group
     *
     * Sets or modifies properties
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void resourceGroupModifyTest() throws ApiException {
        String resourceGroup = null;
        ResourceGroupModify body = null;
        ApiCallRcList response = api.resourceGroupModify(resourceGroup, body);

        // TODO: test validations
    }
    /**
     * create a new resource-definition based on the given resource-group
     *
     * Creates a new resource-definition and auto-deploys if configured to do so. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void resourceGroupSpawnTest() throws ApiException {
        String resourceGroup = "DfltRscGrp";
        ResourceGroupSpawn body = new ResourceGroupSpawn();
        body.addVolumeSizesItem(100L*1024);
        body.setResourceDefinitionName("java-linstor");
        ApiCallRcList response = api.resourceGroupSpawn(resourceGroup, body);

        // TODO: test validations
    }
    /**
     * lists all resources for a resource-definition
     *
     * Lists all resources for a resource-definition.
     * A single resource can be queried by adding its name to the resource string like:  /v1/resource-definitions/rsc1/resources/nodeA
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void resourceListTest() throws ApiException {
        String resource = null;
        Integer offset = null;
        Integer limit = null;
        List<Resource> response = api.resourceList(resource, offset, limit);

        // TODO: test validations
    }
    /**
     * migrate a resource to another node
     *
     * migrate a resource to another node without reducing the redundancy count 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void resourceMigrateDiskTest() throws ApiException {
        String resource = null;
        String node = null;
        String fromnode = null;
        ApiCallRcList response = api.resourceMigrateDisk(resource, node, fromnode);

        // TODO: test validations
    }
    /**
     * migrate a resource to another node
     *
     * migrate a resource to another node without reducing the redundency count 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void resourceMigrateDiskStoragepoolTest() throws ApiException {
        String resource = null;
        String node = null;
        String fromnode = null;
        String storagepool = null;
        ApiCallRcList response = api.resourceMigrateDiskStoragepool(resource, node, fromnode, storagepool);

        // TODO: test validations
    }
    /**
     * modify a resource
     *
     * Sets or modifies properties
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void resourceModifyTest() throws ApiException {
        String resource = null;
        String node = null;
        ResourceModify body = null;
        ApiCallRcList response = api.resourceModify(resource, node, body);

        // TODO: test validations
    }
    /**
     * create a snapshot
     *
     * Create a snapshot for a resource
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void resourceSnapshotCreateTest() throws ApiException {
        String resource = null;
        Snapshot body = null;
        ApiCallRcList response = api.resourceSnapshotCreate(resource, body);

        // TODO: test validations
    }
    /**
     * delete a snapshot
     *
     * Delete a snapshot
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void resourceSnapshotDeleteTest() throws ApiException {
        String resource = null;
        String snapshot = null;
        ApiCallRcList response = api.resourceSnapshotDelete(resource, snapshot);

        // TODO: test validations
    }
    /**
     * list a specific snapshot
     *
     * List the given snapshot for a resource
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void resourceSnapshotListTest() throws ApiException {
        String resource = null;
        String snapshot = null;
        Snapshot response = api.resourceSnapshotList(resource, snapshot);

        // TODO: test validations
    }
    /**
     * restore a snapshot
     *
     * Restore a snapshot to a new resource
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void resourceSnapshotRestoreTest() throws ApiException {
        String resource = null;
        String snapshot = null;
        SnapshotRestore body = null;
        ApiCallRcList response = api.resourceSnapshotRestore(resource, snapshot, body);

        // TODO: test validations
    }
    /**
     * rollback a snapshot
     *
     * Rollback a resource to the snapshot state
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void resourceSnapshotRollbackTest() throws ApiException {
        String resource = null;
        String snapshot = null;
        ApiCallRcList response = api.resourceSnapshotRollback(resource, snapshot);

        // TODO: test validations
    }
    /**
     * list snapshots
     *
     * List snapshots for a resource
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void resourceSnapshotsListTest() throws ApiException {
        String resource = null;
        List<Snapshot> response = api.resourceSnapshotsList(resource);

        // TODO: test validations
    }
    /**
     * restore a snapshot volume definition
     *
     * Restore a snapshot volume definition to a new resource
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void resourceSnapshotsRestoreVolumeDefinitionTest() throws ApiException {
        String resource = null;
        String snapshot = null;
        SnapshotRestore body = null;
        ApiCallRcList response = api.resourceSnapshotsRestoreVolumeDefinition(resource, snapshot, body);

        // TODO: test validations
    }
    /**
     * toggle a resource to a diskful resource
     *
     * toggle a resource to a diskful resource using the default storage pool 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void resourceToggleDiskfulTest() throws ApiException {
        String resource = null;
        String node = null;
        ApiCallRcList response = api.resourceToggleDiskful(resource, node);

        // TODO: test validations
    }
    /**
     * toggle a resource to a diskful resource
     *
     * toggle a resource to a diskful resource
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void resourceToggleDiskfulStoragepoolTest() throws ApiException {
        String resource = null;
        String node = null;
        String storagepool = null;
        ApiCallRcList response = api.resourceToggleDiskfulStoragepool(resource, node, storagepool);

        // TODO: test validations
    }
    /**
     * toggle a resource to diskless
     *
     * toggle a resource to a diskless resource
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void resourceToggleDisklessTest() throws ApiException {
        String resource = null;
        String node = null;
        ApiCallRcList response = api.resourceToggleDiskless(resource, node);

        // TODO: test validations
    }
    /**
     * toggle a resource to diskless resource
     *
     * toggle a resource to a diskless. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void resourceToggleDisklessDisklesspoolTest() throws ApiException {
        String resource = null;
        String node = null;
        String disklesspool = null;
        ApiCallRcList response = api.resourceToggleDisklessDisklesspool(resource, node, disklesspool);

        // TODO: test validations
    }
    /**
     * lists all volumes of a resources
     *
     * Lists all volumes for a resource-definition.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void resourceVolumeListTest() throws ApiException {
        String resource = null;
        String node = null;
        Integer offset = null;
        Integer limit = null;
        List<Volume> response = api.resourceVolumeList(resource, node, offset, limit);

        for (Volume v : response) {
            System.out.println(v.getDevicePath());
        }

        // TODO: test validations
    }
    /**
     * show satellite config
     *
     * Show Satellite config 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void satelliteConfigTest() throws ApiException {
        String node = null;
        SatelliteConfig response = api.satelliteConfig(node);

        // TODO: test validations
    }
    /**
     * ship a snapshot
     *
     * Transfers the resource from one node to another based on snapshot-shipping
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void snapshotShippingTest() throws ApiException {
        String resource = null;
        SnapshotShipping body = null;
        ApiCallRcList response = api.snapshotShipping(resource, body);

        // TODO: test validations
    }
    /**
     * modify satellite config
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void stltSetConfigTest() throws ApiException {
        String node = null;
        SatelliteConfig body = null;
        ApiCallRcList response = api.stltSetConfig(node, body);

        // TODO: test validations
    }
    /**
     * modify a storage pool definition
     *
     * Sets or modifies properties
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void storPoolDfnModifyTest() throws ApiException {
        String storagepool = null;
        StoragePoolDefinitionModify body = null;
        ApiCallRcList response = api.storPoolDfnModify(storagepool, body);

        // TODO: test validations
    }
    /**
     * delete a storage pool definition
     *
     * Delete a storage pool definition from Linstor
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void storagePoolDefinitionDeleteTest() throws ApiException {
        String storagepool = null;
        ApiCallRcList response = api.storagePoolDefinitionDelete(storagepool);

        // TODO: test validations
    }
    /**
     * add a storage pool definition to Linstor
     *
     * Adds a storage pool definition to Linstor 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void storagePoolDfnAddTest() throws ApiException {
        StoragePoolDefinition body = null;
        ApiCallRcList response = api.storagePoolDfnAdd(body);

        // TODO: test validations
    }
    /**
     * Lists a specific storage pool definition
     *
     * Returns a specific storage pool definition
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void storagePoolDfnGetTest() throws ApiException {
        String storagepool = null;
        StoragePoolDefinition response = api.storagePoolDfnGet(storagepool);

        // TODO: test validations
    }
    /**
     * Lists storage pool definitions
     *
     * Returns an array of all storage pool definitions
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void storagePoolDfnListTest() throws ApiException {
        Integer offset = null;
        Integer limit = null;
        List<StoragePoolDefinition> response = api.storagePoolDfnList(offset, limit);

        // TODO: test validations
    }
    /**
     * drbd promotion event changes
     *
     * Notifies clients about changes in may_promote of resources
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void v1EventsDrbdPromotionGetTest() throws ApiException {
        InlineResponse200 response = api.v1EventsDrbdPromotionGet();

        // TODO: test validations
    }
    /**
     * show physical storage on nodes, to be used with LINSTOR
     *
     * Gives a grouped list of physical storage that can be turned into a LINSTOR storage-pool
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void viewPhysicaStorageTest() throws ApiException {
        Integer offset = null;
        Integer limit = null;
        List<PhysicalStorage> response = api.viewPhysicaStorage(offset, limit);

        // TODO: test validations
    }
    /**
     * query all resources with their volumes
     *
     * This REST-resource should be used if you want to get an overview of all resources with their volumes.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void viewResourcesTest() throws ApiException {
        List<String> nodes = null;
        List<String> resources = null;
        List<String> storagePools = null;
        List<String> props = null;
        Integer offset = null;
        Integer limit = null;
        List<ResourceWithVolumes> response = api.viewResources(nodes, resources, storagePools, props, offset, limit);

        for (ResourceWithVolumes r : response) {
            System.out.println(r.getName());
        }
        // TODO: test validations
    }
    /**
     * view current snapshot shippings
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void viewSnapshotShippingsTest() throws ApiException {
        List<String> nodes = null;
        List<String> resources = null;
        List<String> snapshots = null;
        List<String> status = null;
        Integer offset = null;
        Integer limit = null;
        List<SnapshotShippingStatus> response = api.viewSnapshotShippings(nodes, resources, snapshots, status, offset, limit);

        // TODO: test validations
    }
    /**
     * query all snapshots known to linstor
     *
     * This REST-resource should be used if you want to get an overview of all snapshots.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void viewSnapshotsTest() throws ApiException {
        List<String> nodes = null;
        List<String> resources = null;
        Integer offset = null;
        Integer limit = null;
        List<Snapshot> response = api.viewSnapshots(nodes, resources, offset, limit);

        // TODO: test validations
    }
    /**
     * query all storage pools
     *
     * This REST-resource should be used if you want to get an overview of all storage pools.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void viewStoragePoolsTest() throws ApiException {
        List<String> nodes = null;
        List<String> storagePools = null;
        List<String> props = null;
        Integer offset = null;
        Integer limit = null;
        List<StoragePool> response = api.viewStoragePools(nodes, storagePools, props, offset, limit);

        // TODO: test validations
    }
    /**
     * add a volume-definition to a resource
     *
     * Adds a volume-definition.  Required properties is only &#x60;size&#x60;, all other will be auto generated if not given. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void volumeDefinitionCreateTest() throws ApiException {
        String resource = null;
        VolumeDefinitionCreate body = null;
        ApiCallRcList response = api.volumeDefinitionCreate(resource, body);

        // TODO: test validations
    }
    /**
     * delete a volume-definition
     *
     * Delete a volume-definition
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void volumeDefinitionDeleteTest() throws ApiException {
        String resource = null;
        Integer volumeNumber = null;
        ApiCallRcList response = api.volumeDefinitionDelete(resource, volumeNumber);

        // TODO: test validations
    }
    /**
     * lists all volume-definitions
     *
     * Lists all volume definitions.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void volumeDefinitionListTest() throws ApiException {
        String resource = "muh";
        Integer offset = null;
        Integer limit = null;
        List<VolumeDefinition> response = api.volumeDefinitionList(resource, offset, limit);

        Assert.assertTrue(response.size() > 0);
        // TODO: test validations
    }
    /**
     * modify a volume-definition
     *
     * Sets or modifies properties
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void volumeDefinitionModifyTest() throws ApiException {
        String resource = null;
        Integer volumeNumber = null;
        VolumeDefinitionModify body = null;
        ApiCallRcList response = api.volumeDefinitionModify(resource, volumeNumber, body);

        // TODO: test validations
    }
    /**
     * add a volume-group to a resource-group
     *
     * Adds a volume-group. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void volumeGroupCreateTest() throws ApiException {
        String resourceGroup = null;
        VolumeGroup body = null;
        ApiCallRcList response = api.volumeGroupCreate(resourceGroup, body);

        // TODO: test validations
    }
    /**
     * delete a volume-group
     *
     * Delete a volume-group
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void volumeGroupDeleteTest() throws ApiException {
        String resourceGroup = null;
        Integer volumeNumber = null;
        ApiCallRcList response = api.volumeGroupDelete(resourceGroup, volumeNumber);

        // TODO: test validations
    }
    /**
     * lists all volume-groups
     *
     * Lists all volume groups.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void volumeGroupListTest() throws ApiException {
        String resourceGroup = null;
        Integer offset = null;
        Integer limit = null;
        List<VolumeGroup> response = api.volumeGroupList(resourceGroup, offset, limit);

        // TODO: test validations
    }
    /**
     * modify a volume-group
     *
     * Sets or modifies properties
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void volumeGroupModifyTest() throws ApiException {
        String resourceGroup = null;
        Integer volumeNumber = null;
        VolumeGroupModify body = null;
        ApiCallRcList response = api.volumeGroupModify(resourceGroup, volumeNumber, body);

        // TODO: test validations
    }
    /**
     * modify a volume
     *
     * Sets or modifies properties
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void volumeModifyTest() throws ApiException {
        String resource = null;
        String node = null;
        Integer volumeNumber = null;
        VolumeModify body = null;
        ApiCallRcList response = api.volumeModify(resource, node, volumeNumber, body);

        // TODO: test validations
    }
}
