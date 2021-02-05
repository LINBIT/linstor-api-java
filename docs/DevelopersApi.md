# DevelopersApi

All URIs are relative to *http://localhost:3370*

Method | HTTP request | Description
------------- | ------------- | -------------
[**controllerConfig**](DevelopersApi.md#controllerConfig) | **GET** /v1/controller/config | show controller config
[**controllerPropertyDelete**](DevelopersApi.md#controllerPropertyDelete) | **DELETE** /v1/controller/properties/{key} | Deletes a controller property
[**controllerPropertyList**](DevelopersApi.md#controllerPropertyList) | **GET** /v1/controller/properties | lists all controller properties
[**controllerPropertyModify**](DevelopersApi.md#controllerPropertyModify) | **POST** /v1/controller/properties | sets or modifies controller properties
[**controllerVersion**](DevelopersApi.md#controllerVersion) | **GET** /v1/controller/version | show controller version info
[**createDevicePool**](DevelopersApi.md#createDevicePool) | **POST** /v1/physical-storage/{node} | creates an LVM, LVM-thin or ZFS pool, optional VDO under it
[**createSOSReport**](DevelopersApi.md#createSOSReport) | **GET** /v1/sos-report | creates a SOS report in the log directory of the controller
[**ctrlSetConfig**](DevelopersApi.md#ctrlSetConfig) | **PUT** /v1/controller/config | modify controller config
[**downloadSOSReport**](DevelopersApi.md#downloadSOSReport) | **GET** /v1/sos-report/download | request sos report to download
[**encryptionPassphraseCreate**](DevelopersApi.md#encryptionPassphraseCreate) | **POST** /v1/encryption/passphrase | create a encryption passphrase
[**encryptionPassphraseEnter**](DevelopersApi.md#encryptionPassphraseEnter) | **PATCH** /v1/encryption/passphrase | enter the encryption passphrase
[**encryptionPassphraseModify**](DevelopersApi.md#encryptionPassphraseModify) | **PUT** /v1/encryption/passphrase | modifies the encryption passphrase
[**errorReportDelete**](DevelopersApi.md#errorReportDelete) | **PATCH** /v1/error-reports | Deletes a range of error-reports
[**errorReportDeleteSingle**](DevelopersApi.md#errorReportDeleteSingle) | **DELETE** /v1/error-reports/{reportid} | Deletes a single error-report
[**errorReportList**](DevelopersApi.md#errorReportList) | **GET** /v1/error-reports | list all error reports
[**errorReportShow**](DevelopersApi.md#errorReportShow) | **GET** /v1/error-reports/{reportid} | query the specified reportid
[**keyValueStoreDelete**](DevelopersApi.md#keyValueStoreDelete) | **DELETE** /v1/key-value-store/{instance} | delete a key value store
[**keyValueStoreList**](DevelopersApi.md#keyValueStoreList) | **GET** /v1/key-value-store/{instance} | list all key value stores
[**keyValueStoreModify**](DevelopersApi.md#keyValueStoreModify) | **PUT** /v1/key-value-store/{instance} | modify a key value store
[**keyValueStoresList**](DevelopersApi.md#keyValueStoresList) | **GET** /v1/key-value-store | list all key value stores
[**netinterfaceCreate**](DevelopersApi.md#netinterfaceCreate) | **POST** /v1/nodes/{node}/net-interfaces | create a netinterface on a node
[**netinterfaceDelete**](DevelopersApi.md#netinterfaceDelete) | **DELETE** /v1/nodes/{node}/net-interfaces/{netinterface} | delete a netinterface from a node
[**netinterfaceList**](DevelopersApi.md#netinterfaceList) | **GET** /v1/nodes/{node}/net-interfaces | return the list of net-interfaces
[**netinterfaceModified**](DevelopersApi.md#netinterfaceModified) | **PUT** /v1/nodes/{node}/net-interfaces/{netinterface} | modify a netinterface from a node
[**nodeAdd**](DevelopersApi.md#nodeAdd) | **POST** /v1/nodes | add a node to Linstor
[**nodeDelete**](DevelopersApi.md#nodeDelete) | **DELETE** /v1/nodes/{node} | delete a node
[**nodeList**](DevelopersApi.md#nodeList) | **GET** /v1/nodes | Lists nodes registered to the controller
[**nodeLost**](DevelopersApi.md#nodeLost) | **DELETE** /v1/nodes/{node}/lost | delete an unrecoverable node
[**nodeModify**](DevelopersApi.md#nodeModify) | **PUT** /v1/nodes/{node} | modify a node
[**nodeReconnect**](DevelopersApi.md#nodeReconnect) | **PUT** /v1/nodes/{node}/reconnect | reconnect a node to the controller
[**nodeStoragePoolCreate**](DevelopersApi.md#nodeStoragePoolCreate) | **POST** /v1/nodes/{node}/storage-pools | creates a new storage pool on this node
[**nodeStoragePoolDelete**](DevelopersApi.md#nodeStoragePoolDelete) | **DELETE** /v1/nodes/{node}/storage-pools/{storagepool} | delete a storage pool
[**nodeStoragePoolList**](DevelopersApi.md#nodeStoragePoolList) | **GET** /v1/nodes/{node}/storage-pools | lists all storage pools for a node
[**nodeStoragePoolModify**](DevelopersApi.md#nodeStoragePoolModify) | **PUT** /v1/nodes/{node}/storage-pools/{storagepool} | modify a storage pool
[**queryMaxVolumeSize**](DevelopersApi.md#queryMaxVolumeSize) | **OPTIONS** /v1/query-max-volume-size | query the maximum volume size
[**queryMaxVolumeSizeFromRscGrp**](DevelopersApi.md#queryMaxVolumeSizeFromRscGrp) | **GET** /v1/resource-groups/{resource_group}/query-max-volume-size | query the maximum volume size from a given resource group
[**resourceAutoplace**](DevelopersApi.md#resourceAutoplace) | **POST** /v1/resource-definitions/{resource}/autoplace | autoplace resource
[**resourceConnectionList**](DevelopersApi.md#resourceConnectionList) | **GET** /v1/resource-definitions/{resource}/resource-connections/{node_a}/{node_b} | show the specified resource connection
[**resourceConnectionModify**](DevelopersApi.md#resourceConnectionModify) | **PUT** /v1/resource-definitions/{resource}/resource-connections/{node_a}/{node_b} | modify a resource connection
[**resourceConnectionsList**](DevelopersApi.md#resourceConnectionsList) | **GET** /v1/resource-definitions/{resource}/resource-connections | list all resource connections for resource
[**resourceCreate**](DevelopersApi.md#resourceCreate) | **POST** /v1/resource-definitions/{resource}/resources | create one or more resources.
[**resourceCreateOnNode**](DevelopersApi.md#resourceCreateOnNode) | **POST** /v1/resource-definitions/{resource}/resources/{node} | create a resource on a node
[**resourceDefinitionCreate**](DevelopersApi.md#resourceDefinitionCreate) | **POST** /v1/resource-definitions | add a resource-definition
[**resourceDefinitionDelete**](DevelopersApi.md#resourceDefinitionDelete) | **DELETE** /v1/resource-definitions/{resource} | delete a resource-definition
[**resourceDefinitionList**](DevelopersApi.md#resourceDefinitionList) | **GET** /v1/resource-definitions | lists all resource-definitions
[**resourceDefinitionModify**](DevelopersApi.md#resourceDefinitionModify) | **PUT** /v1/resource-definitions/{resource} | modify a resource-definition
[**resourceDelete**](DevelopersApi.md#resourceDelete) | **DELETE** /v1/resource-definitions/{resource}/resources/{node} | delete a resource
[**resourceDrbdProxyDisable**](DevelopersApi.md#resourceDrbdProxyDisable) | **POST** /v1/resource-definitions/{resource}/drbd-proxy/disable/{node_a}/{node_b} | disables a drbd proxy on a node connection
[**resourceDrbdProxyEnable**](DevelopersApi.md#resourceDrbdProxyEnable) | **POST** /v1/resource-definitions/{resource}/drbd-proxy/enable/{node_a}/{node_b} | enable a drbd proxy on a node connection
[**resourceDrbdProxyModify**](DevelopersApi.md#resourceDrbdProxyModify) | **PUT** /v1/resource-definitions/{resource}/drbd-proxy | modify drbd proxy option properties
[**resourceGroupCreate**](DevelopersApi.md#resourceGroupCreate) | **POST** /v1/resource-groups | add a resource-group
[**resourceGroupDelete**](DevelopersApi.md#resourceGroupDelete) | **DELETE** /v1/resource-groups/{resource_group} | delete a resource-group
[**resourceGroupList**](DevelopersApi.md#resourceGroupList) | **GET** /v1/resource-groups | lists all resource-groups
[**resourceGroupModify**](DevelopersApi.md#resourceGroupModify) | **PUT** /v1/resource-groups/{resource_group} | modify a resource-group
[**resourceGroupSpawn**](DevelopersApi.md#resourceGroupSpawn) | **POST** /v1/resource-groups/{resource_group}/spawn | create a new resource-definition based on the given resource-group
[**resourceList**](DevelopersApi.md#resourceList) | **GET** /v1/resource-definitions/{resource}/resources | lists all resources for a resource-definition
[**resourceMigrateDisk**](DevelopersApi.md#resourceMigrateDisk) | **PUT** /v1/resource-definitions/{resource}/resources/{node}/migrate-disk/{fromnode} | migrate a resource to another node
[**resourceMigrateDiskStoragepool**](DevelopersApi.md#resourceMigrateDiskStoragepool) | **PUT** /v1/resource-definitions/{resource}/resources/{node}/migrate-disk/{fromnode}/{storagepool} | migrate a resource to another node
[**resourceModify**](DevelopersApi.md#resourceModify) | **PUT** /v1/resource-definitions/{resource}/resources/{node} | modify a resource
[**resourceSnapshotCreate**](DevelopersApi.md#resourceSnapshotCreate) | **POST** /v1/resource-definitions/{resource}/snapshots | create a snapshot
[**resourceSnapshotDelete**](DevelopersApi.md#resourceSnapshotDelete) | **DELETE** /v1/resource-definitions/{resource}/snapshots/{snapshot} | delete a snapshot
[**resourceSnapshotList**](DevelopersApi.md#resourceSnapshotList) | **GET** /v1/resource-definitions/{resource}/snapshots/{snapshot} | list a specific snapshot
[**resourceSnapshotRestore**](DevelopersApi.md#resourceSnapshotRestore) | **POST** /v1/resource-definitions/{resource}/snapshot-restore-resource/{snapshot} | restore a snapshot
[**resourceSnapshotRollback**](DevelopersApi.md#resourceSnapshotRollback) | **POST** /v1/resource-definitions/{resource}/snapshot-rollback/{snapshot} | rollback a snapshot
[**resourceSnapshotsList**](DevelopersApi.md#resourceSnapshotsList) | **GET** /v1/resource-definitions/{resource}/snapshots | list snapshots
[**resourceSnapshotsRestoreVolumeDefinition**](DevelopersApi.md#resourceSnapshotsRestoreVolumeDefinition) | **POST** /v1/resource-definitions/{resource}/snapshot-restore-volume-definition/{snapshot} | restore a snapshot volume definition
[**resourceToggleDiskful**](DevelopersApi.md#resourceToggleDiskful) | **PUT** /v1/resource-definitions/{resource}/resources/{node}/toggle-disk/diskful | toggle a resource to a diskful resource
[**resourceToggleDiskfulStoragepool**](DevelopersApi.md#resourceToggleDiskfulStoragepool) | **PUT** /v1/resource-definitions/{resource}/resources/{node}/toggle-disk/diskful/{storagepool} | toggle a resource to a diskful resource
[**resourceToggleDiskless**](DevelopersApi.md#resourceToggleDiskless) | **PUT** /v1/resource-definitions/{resource}/resources/{node}/toggle-disk/diskless | toggle a resource to diskless
[**resourceToggleDisklessDisklesspool**](DevelopersApi.md#resourceToggleDisklessDisklesspool) | **PUT** /v1/resource-definitions/{resource}/resources/{node}/toggle-disk/diskless/{disklesspool} | toggle a resource to diskless resource
[**resourceVolumeList**](DevelopersApi.md#resourceVolumeList) | **GET** /v1/resource-definitions/{resource}/resources/{node}/volumes | lists all volumes of a resources
[**satelliteConfig**](DevelopersApi.md#satelliteConfig) | **GET** /v1/nodes/{node}/config | show satellite config
[**snapshotShipping**](DevelopersApi.md#snapshotShipping) | **POST** /v1/resource-definitions/{resource}/snapshot-shipping | ship a snapshot
[**stltSetConfig**](DevelopersApi.md#stltSetConfig) | **PUT** /v1/nodes/{node}/config | modify satellite config
[**storPoolDfnModify**](DevelopersApi.md#storPoolDfnModify) | **PUT** /v1/storage-pool-definitions/{storagepool} | modify a storage pool definition
[**storagePoolDefinitionDelete**](DevelopersApi.md#storagePoolDefinitionDelete) | **DELETE** /v1/storage-pool-definitions/{storagepool} | delete a storage pool definition
[**storagePoolDfnAdd**](DevelopersApi.md#storagePoolDfnAdd) | **POST** /v1/storage-pool-definitions | add a storage pool definition to Linstor
[**storagePoolDfnGet**](DevelopersApi.md#storagePoolDfnGet) | **GET** /v1/storage-pool-definitions/{storagepool} | Lists a specific storage pool definition
[**storagePoolDfnList**](DevelopersApi.md#storagePoolDfnList) | **GET** /v1/storage-pool-definitions | Lists storage pool definitions
[**v1EventsDrbdPromotionGet**](DevelopersApi.md#v1EventsDrbdPromotionGet) | **GET** /v1/events/drbd/promotion | drbd promotion event changes
[**viewPhysicaStorage**](DevelopersApi.md#viewPhysicaStorage) | **GET** /v1/physical-storage | show physical storage on nodes, to be used with LINSTOR
[**viewResources**](DevelopersApi.md#viewResources) | **GET** /v1/view/resources | query all resources with their volumes
[**viewSnapshotShippings**](DevelopersApi.md#viewSnapshotShippings) | **GET** /v1/view/snapshot-shippings | view current snapshot shippings
[**viewSnapshots**](DevelopersApi.md#viewSnapshots) | **GET** /v1/view/snapshots | query all snapshots known to linstor
[**viewStoragePools**](DevelopersApi.md#viewStoragePools) | **GET** /v1/view/storage-pools | query all storage pools
[**volumeDefinitionCreate**](DevelopersApi.md#volumeDefinitionCreate) | **POST** /v1/resource-definitions/{resource}/volume-definitions | add a volume-definition to a resource
[**volumeDefinitionDelete**](DevelopersApi.md#volumeDefinitionDelete) | **DELETE** /v1/resource-definitions/{resource}/volume-definitions/{volume_number} | delete a volume-definition
[**volumeDefinitionList**](DevelopersApi.md#volumeDefinitionList) | **GET** /v1/resource-definitions/{resource}/volume-definitions | lists all volume-definitions
[**volumeDefinitionModify**](DevelopersApi.md#volumeDefinitionModify) | **PUT** /v1/resource-definitions/{resource}/volume-definitions/{volume_number} | modify a volume-definition
[**volumeGroupCreate**](DevelopersApi.md#volumeGroupCreate) | **POST** /v1/resource-groups/{resource_group}/volume-groups | add a volume-group to a resource-group
[**volumeGroupDelete**](DevelopersApi.md#volumeGroupDelete) | **DELETE** /v1/resource-groups/{resource_group}/volume-groups/{volume_number} | delete a volume-group
[**volumeGroupList**](DevelopersApi.md#volumeGroupList) | **GET** /v1/resource-groups/{resource_group}/volume-groups | lists all volume-groups
[**volumeGroupModify**](DevelopersApi.md#volumeGroupModify) | **PUT** /v1/resource-groups/{resource_group}/volume-groups/{volume_number} | modify a volume-group
[**volumeModify**](DevelopersApi.md#volumeModify) | **PUT** /v1/resource-definitions/{resource}/resources/{node}/volumes/{volume_number} | modify a volume

<a name="controllerConfig"></a>
# **controllerConfig**
> ControllerConfig controllerConfig()

show controller config

Show Controller config 

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
try {
    ControllerConfig result = apiInstance.controllerConfig();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#controllerConfig");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ControllerConfig**](ControllerConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="controllerPropertyDelete"></a>
# **controllerPropertyDelete**
> ApiCallRcList controllerPropertyDelete(key)

Deletes a controller property

Delete a controller property

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String key = "key_example"; // String | Controller property key to delete
try {
    ApiCallRcList result = apiInstance.controllerPropertyDelete(key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#controllerPropertyDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| Controller property key to delete |

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="controllerPropertyList"></a>
# **controllerPropertyList**
> Properties controllerPropertyList()

lists all controller properties

Lists all controller properties. 

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
try {
    Properties result = apiInstance.controllerPropertyList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#controllerPropertyList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Properties**](Properties.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="controllerPropertyModify"></a>
# **controllerPropertyModify**
> ApiCallRcList controllerPropertyModify(body)

sets or modifies controller properties

Sets or modifies properties  Possible properties are: - &#x60;TcpPortAutoRange&#x60; - regex[&#x60;[0-9]+-[0-9]+&#x60;]      Range for auto-allocation of resource TCP ports  - &#x60;MinorNrAutoRange&#x60; - regex[&#x60;[0-9]+-[0-9]+&#x60;]      Range for auto-allocation of volume minor numbers  - &#x60;PeerSlotsNewResource&#x60; - range[&#x60;1-31&#x60;]      DRBD peer slots to allocate for newly created resources (default 7), the number of peer slots cannot be changed once the resource is created, so allow sufficient slots to increase redundancy in the future  - &#x60;StorDriver/DMStats&#x60; - boolean_true_false      Enable dmstats on lvm create  - &#x60;REST/disable-http-metrics&#x60; - boolean_true_false      Disable Prometheus /metrics on HTTP, if HTTPS is enabled  - &#x60;DrbdOptions/AutoEvictAfterTime&#x60; - long      Time a node can be offline before it is declared EVICTED in minutes  - &#x60;DrbdOptions/AutoEvictMaxDisconnectedNodes&#x60; - range[&#x60;0-100&#x60;]      Percentage(0-100) of nodes that can disconnect at the same time without the controller stopping the max_offline_time timer  - &#x60;DrbdOptions/AutoEvictMinReplicaCount&#x60; - long      The minimum amount of replicas that should be present for a resource at all times.  - &#x60;DrbdOptions/AutoEvictAllowEviction&#x60; - boolean_true_false      If set to true on a node, it cannot be evicted anymore  - &#x60;NVMe/TRType&#x60; - enum      NVMe transportion type      * rdma     * tcp  - &#x60;NVMe/Port&#x60; - range[&#x60;1-65535&#x60;]      NVMe port  - &#x60;NVMe/PrefNic&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Preferred network interface to use  - &#x60;StorDriver/WaitTimeoutAfterCreate&#x60; - regex[&#x60;[0-9]+&#x60;] - &#x60;sys/fs/blkio_throttle_read&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.read_bps_device  - &#x60;sys/fs/blkio_throttle_write&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.write_bps_device  - &#x60;sys/fs/blkio_throttle_read_iops&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.read_iops_device  - &#x60;sys/fs/blkio_throttle_write_iops&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.write_iops_device  - &#x60;SearchDomain&#x60; - string      Search domain node names, if no FQDN is given.  - &#x60;ExtCmdWaitTimeout&#x60; - long      Wait timeout for an external command in milliseconds  - &#x60;DrbdOptions/auto-quorum&#x60; - enum      Enables automatic setting of the &#x27;quroum&#x27; and &#x27;on-no-quroum&#x27; property      * io-error     * suspend-io     * disabled  - &#x60;DrbdOptions/auto-add-quorum-tiebreaker&#x60; - boolean_true_false      Enables automatic management (creation and deletion) of tie breaking resource  - &#x60;DrbdOptions/auto-diskful&#x60; - long      Makes a resource diskful if it was continously diskless primary for X minutes  - &#x60;DrbdOptions/auto-diskful-allow-cleanup&#x60; - boolean_true_false      Allows this resource to be cleaned up after toggle-disk + resync is finished  - &#x60;Writecache/PoolName&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Linstor storage pool name for writecache  - &#x60;Writecache/Size&#x60; - regex[&#x60;^100%|[0-9]{1,2}([.][0-9]*)?%|[1-9][0-9]{2,}$&#x60;]      Size of the writecache in % (0-100) or KiB otherwise  - &#x60;Writecache/Options/StartSector&#x60; - long      offset from the start of cache device in 512-byte sectors  - &#x60;Writecache/Options/HighWatermark&#x60; - long      start writeback when the number of used blocks reach this watermark  - &#x60;Writecache/Options/LowWatermark&#x60; - long      stop writeback when the number of used blocks drops below this watermark  - &#x60;Writecache/Options/WritebackJobs&#x60; - long      limit the number of blocks that are in flight during writeback. Setting this value reduces writeback throughput, but it may improve latency of read requests  - &#x60;Writecache/Options/AutocommitBlocks&#x60; - long      when the application writes this amount of blocks without issuing the FLUSH request, the blocks are automatically commited  - &#x60;Writecache/Options/AutocommitTime&#x60; - long      autocommit time in milliseconds. The data is automatically commited if this time passes and no FLUSH request is received  - &#x60;Writecache/Options/Fua&#x60; - enum      \&quot;On\&quot; results in \&quot;fua\&quot; as argument, whereas the value \&quot;Off\&quot; results in \&quot;nofua\&quot; argument      * On     * Off  - &#x60;Writecache/Options/Additional&#x60; - string      Additional arguments passed through  - &#x60;Cache/OpMode&#x60; - enum      Operation mode      * writeback     * writethrough     * passthrough  - &#x60;Cache/MetaPool&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Name of the storage pool used for the cache metadata. If not specified, this will default to the CachePool property  - &#x60;Cache/Metasize&#x60; - regex[&#x60;^100%|[0-9]{1,2}([.][0-9]*)?%|[1-9][0-9]{2,}$&#x60;]      Size of the cache in % (0-100) or KiB otherwise.  - &#x60;Cache/CachePool&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Name of the storage pool used for the cache cache device  - &#x60;Cache/Cachesize&#x60; - regex[&#x60;^100%|[0-9]{1,2}([.][0-9]*)?%|[1-9][0-9]{2,}$&#x60;]      Size of the cache in % (0-100) or KiB otherwise.  - &#x60;Cache/Blocksize&#x60; - long      Block size  - &#x60;Cache/Policy&#x60; - enum      Replacemant policy      * mq     * smq     * cleaner  - &#x60;StorDriver/LvcreateOptions&#x60; - regex[&#x60;.*&#x60;]      Additional parameters added to every &#x27;lvcreate ... &#x27; command  - &#x60;StorDriver/ZfscreateOptions&#x60; - regex[&#x60;.*&#x60;]      Additional parameters added to every &#x27;zfs create ... &#x27; command  - &#x60;StorDriver/Openflex/ApiHost&#x60; - regex[&#x60;.+&#x60;]      Openflex API host name  - &#x60;StorDriver/Openflex/ApiPort&#x60; - regex[&#x60;[0-9]+&#x60;]      Openflex API port  - &#x60;StorDriver/Openflex/UserName&#x60; - regex[&#x60;.+&#x60;]      Openflex user name  - &#x60;StorDriver/Openflex/UserPassword&#x60; - regex[&#x60;.+&#x60;]      Openflex password  - &#x60;StorDriver/Openflex/JobWaitDelay&#x60; - regex[&#x60;[0-9]+&#x60;]      Delay in milliseconds linstor waits between fetching the job status  - &#x60;StorDriver/Openflex/JobWaitMaxCount&#x60; - regex[&#x60;[0-9]+&#x60;]      Maximum retries with wait delay until openflex fails  - &#x60;Autoplacer/Weights/MaxFreeSpace&#x60; - regex[&#x60;^[0-9]+([.][0-9]+)?&#x60;]      Weight of &#x27;MaxFreeSpace&#x27; autoplacer-strategy  - &#x60;Autoplacer/Weights/MinReservedSpace&#x60; - regex[&#x60;^[0-9]+([.][0-9]+)?&#x60;]      Weight of &#x27;MinReservedSpace&#x27; autoplacer-strategy  - &#x60;Autoplacer/Weights/MinRscCount&#x60; - regex[&#x60;^[0-9]+([.][0-9]+)?&#x60;]      Weight of &#x27;MinRscCount&#x27; autoplacer-strategy  - &#x60;Autoplacer/Weights/MaxThroughput&#x60; - regex[&#x60;^[0-9]+([.][0-9]+)?&#x60;]      Weight of &#x27;MaxThroughput&#x27; autoplacer-strategy  - &#x60;Autoplacer/PreSelectScript&#x60; - string      Filename of the preselection script. File must be in /etc/linstor/selector/  - &#x60;Autoplacer/PreSelectScriptTimeout&#x60; - long      Timeout in ms Linstor waits for the script to run.  - &#x60;Autoplacer/MaxThroughput&#x60; - long      The maximum throughput the given storage pool is capable of.  - &#x60;DrbdProxy/AutoEnable&#x60; - boolean_true_false - &#x60;Site&#x60; - string - &#x60;UpdateCacheInterval&#x60; - long      Interval for space cache background updates in seconds  - &#x60;SnapshotShipping/TcpPortRange&#x60; - regex[&#x60;[0-9]+-[0-9]+&#x60;]      Range for allocation of snapshot shipping TCP ports  - &#x60;DrbdOptions/Disk/on-io-error&#x60; - enum     * pass_on     * call-local-io-error     * detach  - &#x60;DrbdOptions/Disk/disk-barrier&#x60; - boolean - &#x60;DrbdOptions/Disk/disk-flushes&#x60; - boolean - &#x60;DrbdOptions/Disk/disk-drain&#x60; - boolean - &#x60;DrbdOptions/Disk/md-flushes&#x60; - boolean - &#x60;DrbdOptions/Disk/resync-after&#x60; - string - &#x60;DrbdOptions/Disk/al-extents&#x60; - range[&#x60;67-65534&#x60;] - &#x60;DrbdOptions/Disk/al-updates&#x60; - boolean - &#x60;DrbdOptions/Disk/discard-zeroes-if-aligned&#x60; - boolean - &#x60;DrbdOptions/Disk/disable-write-same&#x60; - boolean - &#x60;DrbdOptions/Disk/disk-timeout&#x60; - range[&#x60;0-6000&#x60;] - &#x60;DrbdOptions/Disk/read-balancing&#x60; - enum     * prefer-local     * prefer-remote     * round-robin     * least-pending     * when-congested-remote     * 32K-striping     * 64K-striping     * 128K-striping     * 256K-striping     * 512K-striping     * 1M-striping  - &#x60;DrbdOptions/Disk/rs-discard-granularity&#x60; - range[&#x60;0-1048576&#x60;] - &#x60;DrbdOptions/PeerDevice/resync-rate&#x60; - range[&#x60;1-8388608&#x60;] - &#x60;DrbdOptions/PeerDevice/c-plan-ahead&#x60; - range[&#x60;0-300&#x60;] - &#x60;DrbdOptions/PeerDevice/c-delay-target&#x60; - range[&#x60;1-100&#x60;] - &#x60;DrbdOptions/PeerDevice/c-fill-target&#x60; - range[&#x60;0-1048576&#x60;] - &#x60;DrbdOptions/PeerDevice/c-max-rate&#x60; - range[&#x60;250-4194304&#x60;] - &#x60;DrbdOptions/PeerDevice/c-min-rate&#x60; - range[&#x60;0-4194304&#x60;] - &#x60;DrbdOptions/PeerDevice/bitmap&#x60; - boolean - &#x60;DrbdOptions/Resource/cpu-mask&#x60; - string - &#x60;DrbdOptions/Resource/on-no-data-accessible&#x60; - enum     * io-error     * suspend-io  - &#x60;DrbdOptions/Resource/auto-promote&#x60; - boolean - &#x60;DrbdOptions/Resource/peer-ack-window&#x60; - range[&#x60;2048-204800&#x60;] - &#x60;DrbdOptions/Resource/peer-ack-delay&#x60; - range[&#x60;1-10000&#x60;] - &#x60;DrbdOptions/Resource/twopc-timeout&#x60; - range[&#x60;50-600&#x60;] - &#x60;DrbdOptions/Resource/twopc-retry-timeout&#x60; - range[&#x60;1-50&#x60;] - &#x60;DrbdOptions/Resource/auto-promote-timeout&#x60; - range[&#x60;0-600&#x60;] - &#x60;DrbdOptions/Resource/max-io-depth&#x60; - range[&#x60;4-4294967295&#x60;] - &#x60;DrbdOptions/Resource/quorum&#x60; - enum [&#x60;1-32&#x60;]     * off     * majority     * all  - &#x60;DrbdOptions/Resource/on-no-quorum&#x60; - enum     * io-error     * suspend-io  - &#x60;DrbdOptions/Resource/quorum-minimum-redundancy&#x60; - enum [&#x60;1-32&#x60;]     * off     * majority     * all  - &#x60;DrbdOptions/Net/transport&#x60; - string - &#x60;DrbdOptions/Net/protocol&#x60; - enum     * A     * B     * C  - &#x60;DrbdOptions/Net/timeout&#x60; - range[&#x60;1-600&#x60;] - &#x60;DrbdOptions/Net/max-epoch-size&#x60; - range[&#x60;1-20000&#x60;] - &#x60;DrbdOptions/Net/connect-int&#x60; - range[&#x60;1-120&#x60;] - &#x60;DrbdOptions/Net/ping-int&#x60; - range[&#x60;1-120&#x60;] - &#x60;DrbdOptions/Net/sndbuf-size&#x60; - range[&#x60;0-10485760&#x60;] - &#x60;DrbdOptions/Net/rcvbuf-size&#x60; - range[&#x60;0-10485760&#x60;] - &#x60;DrbdOptions/Net/ko-count&#x60; - range[&#x60;0-200&#x60;] - &#x60;DrbdOptions/Net/allow-two-primaries&#x60; - boolean - &#x60;DrbdOptions/Net/cram-hmac-alg&#x60; - string - &#x60;DrbdOptions/Net/shared-secret&#x60; - string - &#x60;DrbdOptions/Net/after-sb-0pri&#x60; - enum     * disconnect     * discard-younger-primary     * discard-older-primary     * discard-zero-changes     * discard-least-changes     * discard-local     * discard-remote  - &#x60;DrbdOptions/Net/after-sb-1pri&#x60; - enum     * disconnect     * consensus     * discard-secondary     * call-pri-lost-after-sb     * violently-as0p  - &#x60;DrbdOptions/Net/after-sb-2pri&#x60; - enum     * disconnect     * call-pri-lost-after-sb     * violently-as0p  - &#x60;DrbdOptions/Net/always-asbp&#x60; - boolean - &#x60;DrbdOptions/Net/rr-conflict&#x60; - enum     * disconnect     * call-pri-lost     * violently     * retry-connect  - &#x60;DrbdOptions/Net/ping-timeout&#x60; - range[&#x60;1-300&#x60;] - &#x60;DrbdOptions/Net/data-integrity-alg&#x60; - string - &#x60;DrbdOptions/Net/tcp-cork&#x60; - boolean - &#x60;DrbdOptions/Net/on-congestion&#x60; - enum     * block     * pull-ahead     * disconnect  - &#x60;DrbdOptions/Net/congestion-fill&#x60; - range[&#x60;0-20971520&#x60;] - &#x60;DrbdOptions/Net/congestion-extents&#x60; - range[&#x60;67-65534&#x60;] - &#x60;DrbdOptions/Net/csums-alg&#x60; - string - &#x60;DrbdOptions/Net/csums-after-crash-only&#x60; - boolean - &#x60;DrbdOptions/Net/verify-alg&#x60; - string - &#x60;DrbdOptions/Net/use-rle&#x60; - boolean - &#x60;DrbdOptions/Net/socket-check-timeout&#x60; - range[&#x60;0-300&#x60;] - &#x60;DrbdOptions/Net/fencing&#x60; - enum     * dont-care     * resource-only     * resource-and-stonith  - &#x60;DrbdOptions/Net/max-buffers&#x60; - range[&#x60;32-131072&#x60;] - &#x60;DrbdOptions/Net/allow-remote-read&#x60; - boolean - &#x60;DrbdOptions/Handlers/after-resync-target&#x60; - string - &#x60;DrbdOptions/Handlers/before-resync-target&#x60; - string - &#x60;DrbdOptions/Handlers/before-resync-source&#x60; - string - &#x60;DrbdOptions/Handlers/out-of-sync&#x60; - string - &#x60;DrbdOptions/Handlers/quorum-lost&#x60; - string - &#x60;DrbdOptions/Handlers/fence-peer&#x60; - string - &#x60;DrbdOptions/Handlers/unfence-peer&#x60; - string - &#x60;DrbdOptions/Handlers/initial-split-brain&#x60; - string - &#x60;DrbdOptions/Handlers/local-io-error&#x60; - string - &#x60;DrbdOptions/Handlers/pri-lost&#x60; - string - &#x60;DrbdOptions/Handlers/pri-lost-after-sb&#x60; - string - &#x60;DrbdOptions/Handlers/pri-on-incon-degr&#x60; - string - &#x60;DrbdOptions/Handlers/split-brain&#x60; - string 

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
ControllerPropsModify body = new ControllerPropsModify(); // ControllerPropsModify | 
try {
    ApiCallRcList result = apiInstance.controllerPropertyModify(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#controllerPropertyModify");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ControllerPropsModify**](ControllerPropsModify.md)|  | [optional]

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="controllerVersion"></a>
# **controllerVersion**
> ControllerVersion controllerVersion()

show controller version info

Show Controller version info 

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
try {
    ControllerVersion result = apiInstance.controllerVersion();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#controllerVersion");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ControllerVersion**](ControllerVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createDevicePool"></a>
# **createDevicePool**
> ApiCallRcList createDevicePool(node, body)

creates an LVM, LVM-thin or ZFS pool, optional VDO under it

Creates a LVM/LVM-thin, ZFS pool on the given device and if supported VDO(optional) under it. logcal_size_kib parameter is only needed if LVM-thin or vdo is used. Also note VDO can only used with LVM-fat. 

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String node = "node_example"; // String | node to use
PhysicalStorageCreate body = new PhysicalStorageCreate(); // PhysicalStorageCreate | 
try {
    ApiCallRcList result = apiInstance.createDevicePool(node, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#createDevicePool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **node** | **String**| node to use |
 **body** | [**PhysicalStorageCreate**](PhysicalStorageCreate.md)|  | [optional]

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSOSReport"></a>
# **createSOSReport**
> ApiCallRcList createSOSReport(node, since)

creates a SOS report in the log directory of the controller

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String node = "node_example"; // String | node to use
Long since = 789L; // Long | Unix epoch milliseconds
try {
    ApiCallRcList result = apiInstance.createSOSReport(node, since);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#createSOSReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **node** | **String**| node to use | [optional]
 **since** | **Long**| Unix epoch milliseconds | [optional]

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ctrlSetConfig"></a>
# **ctrlSetConfig**
> ApiCallRcList ctrlSetConfig(body)

modify controller config

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
ControllerConfig body = new ControllerConfig(); // ControllerConfig | 
try {
    ApiCallRcList result = apiInstance.ctrlSetConfig(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#ctrlSetConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ControllerConfig**](ControllerConfig.md)|  | [optional]

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="downloadSOSReport"></a>
# **downloadSOSReport**
> File downloadSOSReport(node, since)

request sos report to download

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String node = "node_example"; // String | node to use
Long since = 789L; // Long | Unix epoch milliseconds
try {
    File result = apiInstance.downloadSOSReport(node, since);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#downloadSOSReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **node** | **String**| node to use | [optional]
 **since** | **Long**| Unix epoch milliseconds | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json

<a name="encryptionPassphraseCreate"></a>
# **encryptionPassphraseCreate**
> ApiCallRcList encryptionPassphraseCreate(body)

create a encryption passphrase

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
PassPhraseCreate body = new PassPhraseCreate(); // PassPhraseCreate | 
try {
    ApiCallRcList result = apiInstance.encryptionPassphraseCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#encryptionPassphraseCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PassPhraseCreate**](PassPhraseCreate.md)|  | [optional]

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="encryptionPassphraseEnter"></a>
# **encryptionPassphraseEnter**
> ApiCallRcList encryptionPassphraseEnter(body)

enter the encryption passphrase

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String body = "body_example"; // String | 
try {
    ApiCallRcList result = apiInstance.encryptionPassphraseEnter(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#encryptionPassphraseEnter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)|  | [optional]

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="encryptionPassphraseModify"></a>
# **encryptionPassphraseModify**
> ApiCallRcList encryptionPassphraseModify(body)

modifies the encryption passphrase

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
PassPhraseCreate body = new PassPhraseCreate(); // PassPhraseCreate | 
try {
    ApiCallRcList result = apiInstance.encryptionPassphraseModify(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#encryptionPassphraseModify");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PassPhraseCreate**](PassPhraseCreate.md)|  | [optional]

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="errorReportDelete"></a>
# **errorReportDelete**
> ApiCallRcList errorReportDelete(body)

Deletes a range of error-reports

Deletes a range of error-reports

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
ErrorReportDelete body = new ErrorReportDelete(); // ErrorReportDelete | 
try {
    ApiCallRcList result = apiInstance.errorReportDelete(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#errorReportDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ErrorReportDelete**](ErrorReportDelete.md)|  | [optional]

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="errorReportDeleteSingle"></a>
# **errorReportDeleteSingle**
> ApiCallRcList errorReportDeleteSingle(reportid)

Deletes a single error-report

Deletes a single error-report

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String reportid = "reportid_example"; // String | Error id to select
try {
    ApiCallRcList result = apiInstance.errorReportDeleteSingle(reportid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#errorReportDeleteSingle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportid** | **String**| Error id to select |

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="errorReportList"></a>
# **errorReportList**
> List&lt;ErrorReport&gt; errorReportList(node, since, to, withContent, offset, limit)

list all error reports

List all error reports

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String node = "node_example"; // String | Only show error reports of this node
Long since = 789L; // Long | Unix epoch milliseconds
Long to = 789L; // Long | Unix timestamp to the ending interval
Boolean withContent = false; // Boolean | Include error report text in response.
Integer offset = 56; // Integer | number of records to skip for pagination
Integer limit = 56; // Integer | maximum number of records to return
try {
    List<ErrorReport> result = apiInstance.errorReportList(node, since, to, withContent, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#errorReportList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **node** | **String**| Only show error reports of this node | [optional]
 **since** | **Long**| Unix epoch milliseconds | [optional]
 **to** | **Long**| Unix timestamp to the ending interval | [optional]
 **withContent** | **Boolean**| Include error report text in response. | [optional] [default to false]
 **offset** | **Integer**| number of records to skip for pagination | [optional] [enum: ]
 **limit** | **Integer**| maximum number of records to return | [optional] [enum: ]

### Return type

[**List&lt;ErrorReport&gt;**](ErrorReport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="errorReportShow"></a>
# **errorReportShow**
> List&lt;ErrorReport&gt; errorReportShow(reportid, node, since, to, withContent, offset, limit)

query the specified reportid

Query the specified reportid

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String reportid = "reportid_example"; // String | Error id to select
String node = "node_example"; // String | Only show error reports of this node
Long since = 789L; // Long | Unix epoch milliseconds
Long to = 789L; // Long | Unix timestamp to the ending interval
Boolean withContent = true; // Boolean | Include error report text in response.
Integer offset = 56; // Integer | number of records to skip for pagination
Integer limit = 56; // Integer | maximum number of records to return
try {
    List<ErrorReport> result = apiInstance.errorReportShow(reportid, node, since, to, withContent, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#errorReportShow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportid** | **String**| Error id to select |
 **node** | **String**| Only show error reports of this node | [optional]
 **since** | **Long**| Unix epoch milliseconds | [optional]
 **to** | **Long**| Unix timestamp to the ending interval | [optional]
 **withContent** | **Boolean**| Include error report text in response. | [optional] [default to true]
 **offset** | **Integer**| number of records to skip for pagination | [optional] [enum: ]
 **limit** | **Integer**| maximum number of records to return | [optional] [enum: ]

### Return type

[**List&lt;ErrorReport&gt;**](ErrorReport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="keyValueStoreDelete"></a>
# **keyValueStoreDelete**
> ApiCallRcList keyValueStoreDelete(instance)

delete a key value store

Delete a key value store

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String instance = "instance_example"; // String | name of the key value store
try {
    ApiCallRcList result = apiInstance.keyValueStoreDelete(instance);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#keyValueStoreDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instance** | **String**| name of the key value store |

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="keyValueStoreList"></a>
# **keyValueStoreList**
> List&lt;KeyValueStore&gt; keyValueStoreList(instance)

list all key value stores

List all known key value store instances

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String instance = "instance_example"; // String | name of the key value store
try {
    List<KeyValueStore> result = apiInstance.keyValueStoreList(instance);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#keyValueStoreList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instance** | **String**| name of the key value store |

### Return type

[**List&lt;KeyValueStore&gt;**](KeyValueStore.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="keyValueStoreModify"></a>
# **keyValueStoreModify**
> ApiCallRcList keyValueStoreModify(instance, body)

modify a key value store

Modify a key value store

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String instance = "instance_example"; // String | name of the key value store
KeyValueStoreModify body = new KeyValueStoreModify(); // KeyValueStoreModify | 
try {
    ApiCallRcList result = apiInstance.keyValueStoreModify(instance, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#keyValueStoreModify");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instance** | **String**| name of the key value store |
 **body** | [**KeyValueStoreModify**](KeyValueStoreModify.md)|  | [optional]

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="keyValueStoresList"></a>
# **keyValueStoresList**
> List&lt;KeyValueStore&gt; keyValueStoresList()

list all key value stores

List all known key value store instances

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
try {
    List<KeyValueStore> result = apiInstance.keyValueStoresList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#keyValueStoresList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;KeyValueStore&gt;**](KeyValueStore.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="netinterfaceCreate"></a>
# **netinterfaceCreate**
> ApiCallRcList netinterfaceCreate(node, body)

create a netinterface on a node

Create a netinterface on a node  If satellite_port and satellite_encryption_type are given the netinterface can also work as connection to the controller 

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String node = "node_example"; // String | node to use
NetInterface body = new NetInterface(); // NetInterface | 
try {
    ApiCallRcList result = apiInstance.netinterfaceCreate(node, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#netinterfaceCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **node** | **String**| node to use |
 **body** | [**NetInterface**](NetInterface.md)|  | [optional]

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="netinterfaceDelete"></a>
# **netinterfaceDelete**
> ApiCallRcList netinterfaceDelete(node, netinterface)

delete a netinterface from a node

Delete a netinterface from a node

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String node = "node_example"; // String | node to use
String netinterface = "netinterface_example"; // String | netinterface name to use
try {
    ApiCallRcList result = apiInstance.netinterfaceDelete(node, netinterface);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#netinterfaceDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **node** | **String**| node to use |
 **netinterface** | **String**| netinterface name to use |

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="netinterfaceList"></a>
# **netinterfaceList**
> List&lt;NetInterface&gt; netinterfaceList(node, offset, limit)

return the list of net-interfaces

Returns the list of netinterfaces for this node

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String node = "node_example"; // String | node to use
Integer offset = 56; // Integer | number of records to skip for pagination
Integer limit = 56; // Integer | maximum number of records to return
try {
    List<NetInterface> result = apiInstance.netinterfaceList(node, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#netinterfaceList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **node** | **String**| node to use |
 **offset** | **Integer**| number of records to skip for pagination | [optional] [enum: ]
 **limit** | **Integer**| maximum number of records to return | [optional] [enum: ]

### Return type

[**List&lt;NetInterface&gt;**](NetInterface.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="netinterfaceModified"></a>
# **netinterfaceModified**
> ApiCallRcList netinterfaceModified(node, netinterface, body)

modify a netinterface from a node

Modify a netinterface from a node

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String node = "node_example"; // String | node to use
String netinterface = "netinterface_example"; // String | netinterface name to use
NetInterface body = new NetInterface(); // NetInterface | 
try {
    ApiCallRcList result = apiInstance.netinterfaceModified(node, netinterface, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#netinterfaceModified");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **node** | **String**| node to use |
 **netinterface** | **String**| netinterface name to use |
 **body** | [**NetInterface**](NetInterface.md)|  | [optional]

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="nodeAdd"></a>
# **nodeAdd**
> ApiCallRcList nodeAdd(body)

add a node to Linstor

Adds a node to Linstor  If only one net-interface is specified and it is does not specify a &#x60;satellite_port&#x60; it will apply the default port and &#x60;satellite_encryption_type&#x60; for this net-interface. 

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
Node body = new Node(); // Node | Node to add to Linstor
try {
    ApiCallRcList result = apiInstance.nodeAdd(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#nodeAdd");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Node**](Node.md)| Node to add to Linstor | [optional]

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="nodeDelete"></a>
# **nodeDelete**
> ApiCallRcList nodeDelete(node)

delete a node

Delete a node from Linstor

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String node = "node_example"; // String | node to use
try {
    ApiCallRcList result = apiInstance.nodeDelete(node);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#nodeDelete");
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

<a name="nodeList"></a>
# **nodeList**
> List&lt;Node&gt; nodeList(nodes, props, offset, limit)

Lists nodes registered to the controller

Returns an array of all nodes registered to Linstor. 

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
List<String> nodes = Arrays.asList("nodes_example"); // List<String> | Filter only for the specified nodes, if not specified, no filtering.
List<String> props = Arrays.asList("props_example"); // List<String> | filter by given properties, full property path
Integer offset = 56; // Integer | number of records to skip for pagination
Integer limit = 56; // Integer | maximum number of records to return
try {
    List<Node> result = apiInstance.nodeList(nodes, props, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#nodeList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodes** | [**List&lt;String&gt;**](String.md)| Filter only for the specified nodes, if not specified, no filtering. | [optional]
 **props** | [**List&lt;String&gt;**](String.md)| filter by given properties, full property path | [optional]
 **offset** | **Integer**| number of records to skip for pagination | [optional] [enum: ]
 **limit** | **Integer**| maximum number of records to return | [optional] [enum: ]

### Return type

[**List&lt;Node&gt;**](Node.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="nodeLost"></a>
# **nodeLost**
> ApiCallRcList nodeLost(node)

delete an unrecoverable node

Delete an unrecoverable node

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String node = "node_example"; // String | node to use
try {
    ApiCallRcList result = apiInstance.nodeLost(node);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#nodeLost");
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

<a name="nodeModify"></a>
# **nodeModify**
> ApiCallRcList nodeModify(node, body)

modify a node

Sets or modifies properties  Possible properties are: - &#x60;PrefNic&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Preferred network interface to use  - &#x60;StorPoolName&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Linstor storage pool name to use.  - &#x60;StorPoolNameDrbdMeta&#x60; - regex[&#x60;^|.internal|[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Linstor storage pool name to use for external metadata.  - &#x60;sys/fs/blkio_throttle_read&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.read_bps_device  - &#x60;sys/fs/blkio_throttle_write&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.write_bps_device  - &#x60;sys/fs/blkio_throttle_read_iops&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.read_iops_device  - &#x60;sys/fs/blkio_throttle_write_iops&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.write_iops_device  - &#x60;DrbdOptions/AutoEvictAfterTime&#x60; - long      Time a node can be offline before it is declared EVICTED in minutes  - &#x60;DrbdOptions/AutoEvictAllowEviction&#x60; - boolean_true_false      If set to true on a node, it cannot be evicted anymore  - &#x60;Writecache/PoolName&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Linstor storage pool name for writecache  - &#x60;Writecache/Size&#x60; - regex[&#x60;^100%|[0-9]{1,2}([.][0-9]*)?%|[1-9][0-9]{2,}$&#x60;]      Size of the writecache in % (0-100) or KiB otherwise  - &#x60;Writecache/Options/StartSector&#x60; - long      offset from the start of cache device in 512-byte sectors  - &#x60;Writecache/Options/HighWatermark&#x60; - long      start writeback when the number of used blocks reach this watermark  - &#x60;Writecache/Options/LowWatermark&#x60; - long      stop writeback when the number of used blocks drops below this watermark  - &#x60;Writecache/Options/WritebackJobs&#x60; - long      limit the number of blocks that are in flight during writeback. Setting this value reduces writeback throughput, but it may improve latency of read requests  - &#x60;Writecache/Options/AutocommitBlocks&#x60; - long      when the application writes this amount of blocks without issuing the FLUSH request, the blocks are automatically commited  - &#x60;Writecache/Options/AutocommitTime&#x60; - long      autocommit time in milliseconds. The data is automatically commited if this time passes and no FLUSH request is received  - &#x60;Writecache/Options/Fua&#x60; - enum      \&quot;On\&quot; results in \&quot;fua\&quot; as argument, whereas the value \&quot;Off\&quot; results in \&quot;nofua\&quot; argument      * On     * Off  - &#x60;Writecache/Options/Additional&#x60; - string      Additional arguments passed through  - &#x60;Cache/OpMode&#x60; - enum      Operation mode      * writeback     * writethrough     * passthrough  - &#x60;Cache/MetaPool&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Name of the storage pool used for the cache metadata. If not specified, this will default to the CachePool property  - &#x60;Cache/Metasize&#x60; - regex[&#x60;^100%|[0-9]{1,2}([.][0-9]*)?%|[1-9][0-9]{2,}$&#x60;]      Size of the cache in % (0-100) or KiB otherwise.  - &#x60;Cache/CachePool&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Name of the storage pool used for the cache cache device  - &#x60;Cache/Cachesize&#x60; - regex[&#x60;^100%|[0-9]{1,2}([.][0-9]*)?%|[1-9][0-9]{2,}$&#x60;]      Size of the cache in % (0-100) or KiB otherwise.  - &#x60;Cache/Blocksize&#x60; - long      Block size  - &#x60;Cache/Policy&#x60; - enum      Replacemant policy      * mq     * smq     * cleaner  - &#x60;StorDriver/LvcreateOptions&#x60; - regex[&#x60;.*&#x60;]      Additional parameters added to every &#x27;lvcreate ... &#x27; command  - &#x60;StorDriver/ZfscreateOptions&#x60; - regex[&#x60;.*&#x60;]      Additional parameters added to every &#x27;zfs create ... &#x27; command  - &#x60;StorDriver/Openflex/ApiHost&#x60; - regex[&#x60;.+&#x60;]      Openflex API host name  - &#x60;StorDriver/Openflex/ApiPort&#x60; - regex[&#x60;[0-9]+&#x60;]      Openflex API port  - &#x60;StorDriver/Openflex/UserName&#x60; - regex[&#x60;.+&#x60;]      Openflex user name  - &#x60;StorDriver/Openflex/UserPassword&#x60; - regex[&#x60;.+&#x60;]      Openflex password  - &#x60;StorDriver/Openflex/StorDev&#x60; - regex[&#x60;.+&#x60;]      Openflex storage device  - &#x60;StorDriver/Openflex/StorDevHost&#x60; - regex[&#x60;.+&#x60;]      Openflex storage device host  - &#x60;StorDriver/Openflex/JobWaitDelay&#x60; - regex[&#x60;[0-9]+&#x60;]      Delay in milliseconds linstor waits between fetching the job status  - &#x60;StorDriver/Openflex/JobWaitMaxCount&#x60; - regex[&#x60;[0-9]+&#x60;]      Maximum retries with wait delay until openflex fails  - &#x60;Autoplacer/MaxThroughput&#x60; - long      The maximum throughput the given storage pool is capable of.  - &#x60;DrbdProxy/AutoEnable&#x60; - boolean_true_false - &#x60;Site&#x60; - string - &#x60;DrbdOptions/auto-diskful-allow-cleanup&#x60; - boolean_true_false      Allows this resource to be cleaned up after toggle-disk + resync is finished 

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String node = "node_example"; // String | node to use
NodeModify body = new NodeModify(); // NodeModify | 
try {
    ApiCallRcList result = apiInstance.nodeModify(node, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#nodeModify");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **node** | **String**| node to use |
 **body** | [**NodeModify**](NodeModify.md)|  | [optional]

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="nodeReconnect"></a>
# **nodeReconnect**
> ApiCallRcList nodeReconnect(node)

reconnect a node to the controller

Reconnect a node to the controller

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String node = "node_example"; // String | node to use
try {
    ApiCallRcList result = apiInstance.nodeReconnect(node);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#nodeReconnect");
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

<a name="nodeStoragePoolCreate"></a>
# **nodeStoragePoolCreate**
> ApiCallRcList nodeStoragePoolCreate(node, body)

creates a new storage pool on this node

Creates a new storage pool on this node.  &#x60;provider_kind&#x60; has to be specified and additional to that the linked &#x60;StorDriver&#x60; property that has the value to the backing pool:    * &#x60;LVM&#x60;: &#x60;StorDriver/LvmVg&#x60;   * &#x60;LVM_THIN&#x60;: &#x60;StorDriver/LvmVg&#x60; and &#x60;StorDriver/ThinPool&#x60;   * &#x60;ZFS&#x60;: &#x60;StorDriver/ZPool&#x60;   * &#x60;ZFS_THIN&#x60;: &#x60;StorDriver/ZPoolThin&#x60;   * &#x60;DISKLESS&#x60;: Does not need a property as it has no backing pool 

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String node = "node_example"; // String | node to use
StoragePool body = new StoragePool(); // StoragePool | 
try {
    ApiCallRcList result = apiInstance.nodeStoragePoolCreate(node, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#nodeStoragePoolCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **node** | **String**| node to use |
 **body** | [**StoragePool**](StoragePool.md)|  | [optional]

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="nodeStoragePoolDelete"></a>
# **nodeStoragePoolDelete**
> ApiCallRcList nodeStoragePoolDelete(node, storagepool)

delete a storage pool

Delete a storage pool

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String node = "node_example"; // String | node to use
String storagepool = "storagepool_example"; // String | Storage pool to use
try {
    ApiCallRcList result = apiInstance.nodeStoragePoolDelete(node, storagepool);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#nodeStoragePoolDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **node** | **String**| node to use |
 **storagepool** | **String**| Storage pool to use |

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="nodeStoragePoolList"></a>
# **nodeStoragePoolList**
> List&lt;StoragePool&gt; nodeStoragePoolList(node, nodes, storagePools, offset, limit)

lists all storage pools for a node

Lists all storage pools of a node

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String node = "node_example"; // String | node to use
List<String> nodes = Arrays.asList("nodes_example"); // List<String> | Filter only for the specified nodes, if not specified, no filtering.
List<String> storagePools = Arrays.asList("storagePools_example"); // List<String> | Filter only for the specified storage pools, if not specified no filtering.
Integer offset = 56; // Integer | number of records to skip for pagination
Integer limit = 56; // Integer | maximum number of records to return
try {
    List<StoragePool> result = apiInstance.nodeStoragePoolList(node, nodes, storagePools, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#nodeStoragePoolList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **node** | **String**| node to use |
 **nodes** | [**List&lt;String&gt;**](String.md)| Filter only for the specified nodes, if not specified, no filtering. | [optional]
 **storagePools** | [**List&lt;String&gt;**](String.md)| Filter only for the specified storage pools, if not specified no filtering. | [optional]
 **offset** | **Integer**| number of records to skip for pagination | [optional] [enum: ]
 **limit** | **Integer**| maximum number of records to return | [optional] [enum: ]

### Return type

[**List&lt;StoragePool&gt;**](StoragePool.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="nodeStoragePoolModify"></a>
# **nodeStoragePoolModify**
> ApiCallRcList nodeStoragePoolModify(node, storagepool, body)

modify a storage pool

Sets or modifies properties  Possible properties are: - &#x60;StorDriver/StorPoolName&#x60; - regex[&#x60;[a-zA-Z0-9_/-]+&#x60;] - &#x60;StorDriver/LvmVg&#x60; - regex[&#x60;[a-zA-Z0-9_-]+&#x60;] - &#x60;StorDriver/ThinPool&#x60; - regex[&#x60;[a-zA-Z0-9_-]+&#x60;] - &#x60;StorDriver/ZPool&#x60; - regex[&#x60;[a-zA-Z0-9_/-]+&#x60;] - &#x60;StorDriver/ZPoolThin&#x60; - regex[&#x60;[a-zA-Z0-9_/-]+&#x60;] - &#x60;StorDriver/FileDir&#x60; - regex[&#x60;.*&#x60;] - &#x60;PrefNic&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Preferred network interface to use  - &#x60;NVMe/PrefNic&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Preferred network interface to use  - &#x60;StorDriver/LvcreateType&#x60; - enum     * linear     * striped     * mirror     * raid0     * raid1     * raid4     * raid5     * raid6     * raid10     * lzma     * lz4  - &#x60;StorDriver/LvcreateOptions&#x60; - regex[&#x60;.*&#x60;]      Additional parameters added to every &#x27;lvcreate ... &#x27; command  - &#x60;StorDriver/ZfscreateOptions&#x60; - regex[&#x60;.*&#x60;]      Additional parameters added to every &#x27;zfs create ... &#x27; command  - &#x60;StorDriver/WaitTimeoutAfterCreate&#x60; - regex[&#x60;[0-9]+&#x60;] - &#x60;sys/fs/blkio_throttle_read&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.read_bps_device  - &#x60;sys/fs/blkio_throttle_write&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.write_bps_device  - &#x60;sys/fs/blkio_throttle_read_iops&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.read_iops_device  - &#x60;sys/fs/blkio_throttle_write_iops&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.write_iops_device  - &#x60;StorDriver/Openflex/ApiHost&#x60; - regex[&#x60;.+&#x60;]      Openflex API host name  - &#x60;StorDriver/Openflex/ApiPort&#x60; - regex[&#x60;[0-9]+&#x60;]      Openflex API port  - &#x60;StorDriver/Openflex/UserName&#x60; - regex[&#x60;.+&#x60;]      Openflex user name  - &#x60;StorDriver/Openflex/UserPassword&#x60; - regex[&#x60;.+&#x60;]      Openflex password  - &#x60;StorDriver/Openflex/StorDev&#x60; - regex[&#x60;.+&#x60;]      Openflex storage device  - &#x60;StorDriver/Openflex/StorDevHost&#x60; - regex[&#x60;.+&#x60;]      Openflex storage device host  - &#x60;StorDriver/Openflex/StorPool&#x60; - regex[&#x60;[0-9]+&#x60;]      Openflex storage pool name  - &#x60;Autoplacer/MaxThroughput&#x60; - long      The maximum throughput the given storage pool is capable of. 

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String node = "node_example"; // String | node to use
String storagepool = "storagepool_example"; // String | Storage pool to use
StoragePoolDefinitionModify body = new StoragePoolDefinitionModify(); // StoragePoolDefinitionModify | 
try {
    ApiCallRcList result = apiInstance.nodeStoragePoolModify(node, storagepool, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#nodeStoragePoolModify");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **node** | **String**| node to use |
 **storagepool** | **String**| Storage pool to use |
 **body** | [**StoragePoolDefinitionModify**](StoragePoolDefinitionModify.md)|  | [optional]

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="queryMaxVolumeSize"></a>
# **queryMaxVolumeSize**
> MaxVolumeSizes queryMaxVolumeSize(body)

query the maximum volume size

Query the maximum possible volume size storage pools

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
AutoSelectFilter body = new AutoSelectFilter(); // AutoSelectFilter | 
try {
    MaxVolumeSizes result = apiInstance.queryMaxVolumeSize(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#queryMaxVolumeSize");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AutoSelectFilter**](AutoSelectFilter.md)|  | [optional]

### Return type

[**MaxVolumeSizes**](MaxVolumeSizes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="queryMaxVolumeSizeFromRscGrp"></a>
# **queryMaxVolumeSizeFromRscGrp**
> MaxVolumeSizes queryMaxVolumeSizeFromRscGrp(resourceGroup)

query the maximum volume size from a given resource group

Query the maximum possible volume size storage pools

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String resourceGroup = "resourceGroup_example"; // String | resource group to use
try {
    MaxVolumeSizes result = apiInstance.queryMaxVolumeSizeFromRscGrp(resourceGroup);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#queryMaxVolumeSizeFromRscGrp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourceGroup** | **String**| resource group to use |

### Return type

[**MaxVolumeSizes**](MaxVolumeSizes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resourceAutoplace"></a>
# **resourceAutoplace**
> ApiCallRcList resourceAutoplace(resource, body)

autoplace resource

Auto place the resource on the specified place_count redundency. If place_count isn&#x27;t given 2 is the default. 

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String resource = "resource_example"; // String | resource to use
AutoPlaceRequest body = new AutoPlaceRequest(); // AutoPlaceRequest | 
try {
    ApiCallRcList result = apiInstance.resourceAutoplace(resource, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#resourceAutoplace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | **String**| resource to use |
 **body** | [**AutoPlaceRequest**](AutoPlaceRequest.md)|  | [optional]

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resourceConnectionList"></a>
# **resourceConnectionList**
> List&lt;ResourceConnection&gt; resourceConnectionList(resource, nodeA, nodeB)

show the specified resource connection

show the specified resource connection

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String resource = "resource_example"; // String | resource to use
String nodeA = "nodeA_example"; // String | source node of the connection
String nodeB = "nodeB_example"; // String | target node of the connection
try {
    List<ResourceConnection> result = apiInstance.resourceConnectionList(resource, nodeA, nodeB);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#resourceConnectionList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | **String**| resource to use |
 **nodeA** | **String**| source node of the connection |
 **nodeB** | **String**| target node of the connection |

### Return type

[**List&lt;ResourceConnection&gt;**](ResourceConnection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resourceConnectionModify"></a>
# **resourceConnectionModify**
> ApiCallRcList resourceConnectionModify(resource, nodeA, nodeB, body)

modify a resource connection

Sets or modifies properties  Possible properties are: - &#x60;DrbdOptions/PeerDevice/resync-rate&#x60; - range[&#x60;1-8388608&#x60;] - &#x60;DrbdOptions/PeerDevice/c-plan-ahead&#x60; - range[&#x60;0-300&#x60;] - &#x60;DrbdOptions/PeerDevice/c-delay-target&#x60; - range[&#x60;1-100&#x60;] - &#x60;DrbdOptions/PeerDevice/c-fill-target&#x60; - range[&#x60;0-1048576&#x60;] - &#x60;DrbdOptions/PeerDevice/c-max-rate&#x60; - range[&#x60;250-4194304&#x60;] - &#x60;DrbdOptions/PeerDevice/c-min-rate&#x60; - range[&#x60;0-4194304&#x60;] - &#x60;DrbdOptions/PeerDevice/bitmap&#x60; - boolean - &#x60;DrbdOptions/Net/transport&#x60; - string - &#x60;DrbdOptions/Net/protocol&#x60; - enum     * A     * B     * C  - &#x60;DrbdOptions/Net/timeout&#x60; - range[&#x60;1-600&#x60;] - &#x60;DrbdOptions/Net/max-epoch-size&#x60; - range[&#x60;1-20000&#x60;] - &#x60;DrbdOptions/Net/connect-int&#x60; - range[&#x60;1-120&#x60;] - &#x60;DrbdOptions/Net/ping-int&#x60; - range[&#x60;1-120&#x60;] - &#x60;DrbdOptions/Net/sndbuf-size&#x60; - range[&#x60;0-10485760&#x60;] - &#x60;DrbdOptions/Net/rcvbuf-size&#x60; - range[&#x60;0-10485760&#x60;] - &#x60;DrbdOptions/Net/ko-count&#x60; - range[&#x60;0-200&#x60;] - &#x60;DrbdOptions/Net/allow-two-primaries&#x60; - boolean - &#x60;DrbdOptions/Net/cram-hmac-alg&#x60; - string - &#x60;DrbdOptions/Net/shared-secret&#x60; - string - &#x60;DrbdOptions/Net/after-sb-0pri&#x60; - enum     * disconnect     * discard-younger-primary     * discard-older-primary     * discard-zero-changes     * discard-least-changes     * discard-local     * discard-remote  - &#x60;DrbdOptions/Net/after-sb-1pri&#x60; - enum     * disconnect     * consensus     * discard-secondary     * call-pri-lost-after-sb     * violently-as0p  - &#x60;DrbdOptions/Net/after-sb-2pri&#x60; - enum     * disconnect     * call-pri-lost-after-sb     * violently-as0p  - &#x60;DrbdOptions/Net/always-asbp&#x60; - boolean - &#x60;DrbdOptions/Net/rr-conflict&#x60; - enum     * disconnect     * call-pri-lost     * violently     * retry-connect  - &#x60;DrbdOptions/Net/ping-timeout&#x60; - range[&#x60;1-300&#x60;] - &#x60;DrbdOptions/Net/data-integrity-alg&#x60; - string - &#x60;DrbdOptions/Net/tcp-cork&#x60; - boolean - &#x60;DrbdOptions/Net/on-congestion&#x60; - enum     * block     * pull-ahead     * disconnect  - &#x60;DrbdOptions/Net/congestion-fill&#x60; - range[&#x60;0-20971520&#x60;] - &#x60;DrbdOptions/Net/congestion-extents&#x60; - range[&#x60;67-65534&#x60;] - &#x60;DrbdOptions/Net/csums-alg&#x60; - string - &#x60;DrbdOptions/Net/csums-after-crash-only&#x60; - boolean - &#x60;DrbdOptions/Net/verify-alg&#x60; - string - &#x60;DrbdOptions/Net/use-rle&#x60; - boolean - &#x60;DrbdOptions/Net/socket-check-timeout&#x60; - range[&#x60;0-300&#x60;] - &#x60;DrbdOptions/Net/fencing&#x60; - enum     * dont-care     * resource-only     * resource-and-stonith  - &#x60;DrbdOptions/Net/max-buffers&#x60; - range[&#x60;32-131072&#x60;] - &#x60;DrbdOptions/Net/allow-remote-read&#x60; - boolean 

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String resource = "resource_example"; // String | resource to use
String nodeA = "nodeA_example"; // String | source node of the connection
String nodeB = "nodeB_example"; // String | target node of the connection
ResourceConnectionModify body = new ResourceConnectionModify(); // ResourceConnectionModify | 
try {
    ApiCallRcList result = apiInstance.resourceConnectionModify(resource, nodeA, nodeB, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#resourceConnectionModify");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | **String**| resource to use |
 **nodeA** | **String**| source node of the connection |
 **nodeB** | **String**| target node of the connection |
 **body** | [**ResourceConnectionModify**](ResourceConnectionModify.md)|  | [optional]

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resourceConnectionsList"></a>
# **resourceConnectionsList**
> List&lt;ResourceConnection&gt; resourceConnectionsList(resource)

list all resource connections for resource

List all resource connections for resource

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String resource = "resource_example"; // String | resource to use
try {
    List<ResourceConnection> result = apiInstance.resourceConnectionsList(resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#resourceConnectionsList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | **String**| resource to use |

### Return type

[**List&lt;ResourceConnection&gt;**](ResourceConnection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resourceCreate"></a>
# **resourceCreate**
> ApiCallRcList resourceCreate(resource, body)

create one or more resources.

Adds one or more resource(s). 

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String resource = "resource_example"; // String | resource to use
List<ResourceCreate> body = Arrays.asList(new ResourceCreate()); // List<ResourceCreate> | 
try {
    ApiCallRcList result = apiInstance.resourceCreate(resource, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#resourceCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | **String**| resource to use |
 **body** | [**List&lt;ResourceCreate&gt;**](ResourceCreate.md)|  | [optional]

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resourceCreateOnNode"></a>
# **resourceCreateOnNode**
> ApiCallRcList resourceCreateOnNode(resource, node, body)

create a resource on a node

Adds a resource on a node.  To use a specific storage pool add the &#x60;StorPoolName&#x60; property and use the storage pool name as value. If the &#x60;StorPoolName&#x60; property is not set, the &#x60;DfltStorPool&#x60; will be used.  To create a diskless resource you have to set the \&quot;DISKLESS\&quot; flag in the flags list. &#x60;&#x60;&#x60; {   \&quot;resource\&quot;: {     \&quot;flags\&quot;: [\&quot;DISKLESS\&quot;]   } } &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String resource = "resource_example"; // String | resource to use
String node = "node_example"; // String | node to use
ResourceCreate body = new ResourceCreate(); // ResourceCreate | 
try {
    ApiCallRcList result = apiInstance.resourceCreateOnNode(resource, node, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#resourceCreateOnNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | **String**| resource to use |
 **node** | **String**| node to use |
 **body** | [**ResourceCreate**](ResourceCreate.md)|  | [optional]

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resourceDefinitionCreate"></a>
# **resourceDefinitionCreate**
> ApiCallRcList resourceDefinitionCreate(body)

add a resource-definition

Adds a resource-definition.  Only required property is the name of the resource definition. All other properties are optional. 

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
ResourceDefinitionCreate body = new ResourceDefinitionCreate(); // ResourceDefinitionCreate | 
try {
    ApiCallRcList result = apiInstance.resourceDefinitionCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#resourceDefinitionCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ResourceDefinitionCreate**](ResourceDefinitionCreate.md)|  | [optional]

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resourceDefinitionDelete"></a>
# **resourceDefinitionDelete**
> ApiCallRcList resourceDefinitionDelete(resource)

delete a resource-definition

Delete a resource-definition

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String resource = "resource_example"; // String | resource to use
try {
    ApiCallRcList result = apiInstance.resourceDefinitionDelete(resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#resourceDefinitionDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | **String**| resource to use |

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resourceDefinitionList"></a>
# **resourceDefinitionList**
> List&lt;ResourceDefinition&gt; resourceDefinitionList(resourceDefinitions, props, offset, limit)

lists all resource-definitions

Lists all resource definitions.  A single resource definition can be queried by adding its name to the resource string like:  /v1/resource-definitions/rsc1 

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
List<String> resourceDefinitions = Arrays.asList("resourceDefinitions_example"); // List<String> | Filter only for the specified resource definitions, if not specified no filtering.
List<String> props = Arrays.asList("props_example"); // List<String> | filter by given properties, full property path
Integer offset = 56; // Integer | number of records to skip for pagination
Integer limit = 56; // Integer | maximum number of records to return
try {
    List<ResourceDefinition> result = apiInstance.resourceDefinitionList(resourceDefinitions, props, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#resourceDefinitionList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourceDefinitions** | [**List&lt;String&gt;**](String.md)| Filter only for the specified resource definitions, if not specified no filtering. | [optional]
 **props** | [**List&lt;String&gt;**](String.md)| filter by given properties, full property path | [optional]
 **offset** | **Integer**| number of records to skip for pagination | [optional] [enum: ]
 **limit** | **Integer**| maximum number of records to return | [optional] [enum: ]

### Return type

[**List&lt;ResourceDefinition&gt;**](ResourceDefinition.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resourceDefinitionModify"></a>
# **resourceDefinitionModify**
> ApiCallRcList resourceDefinitionModify(resource, body)

modify a resource-definition

Sets or modifies properties  Possible properties are: - &#x60;StorPoolName&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Linstor storage pool name to use.  - &#x60;StorPoolNameDrbdMeta&#x60; - regex[&#x60;^|.internal|[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Linstor storage pool name to use for external metadata.  - &#x60;PeerSlotsNewResource&#x60; - range[&#x60;1-31&#x60;]      DRBD peer slots to allocate for newly created resources (default 7), the number of peer slots cannot be changed once the resource is created, so allow sufficient slots to increase redundancy in the future  - &#x60;DrbdProxy/CompressionType&#x60; - enum     * zlib     * lzma     * lz4     * zstd  - &#x60;DrbdOptions/AutoEvictMinReplicaCount&#x60; - long      The minimum amount of replicas that should be present for a resource at all times.  - &#x60;FileSystem/Type&#x60; - enum      File system type to use      * ext4     * xfs  - &#x60;FileSystem/MkfsParams&#x60; - string      Additional parameters for the mkfs command  - &#x60;NVMe/TRType&#x60; - enum      NVMe transportion type      * rdma     * tcp  - &#x60;NVMe/Port&#x60; - range[&#x60;1-65535&#x60;]      NVMe port  - &#x60;StorDriver/LvcreateType&#x60; - enum     * linear     * striped     * mirror     * raid0     * raid1     * raid4     * raid5     * raid6     * raid10     * lzma     * lz4  - &#x60;StorDriver/LvcreateOptions&#x60; - regex[&#x60;.*&#x60;]      Additional parameters added to every &#x27;lvcreate ... &#x27; command  - &#x60;StorDriver/ZfscreateOptions&#x60; - regex[&#x60;.*&#x60;]      Additional parameters added to every &#x27;zfs create ... &#x27; command  - &#x60;sys/fs/blkio_throttle_read&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.read_bps_device  - &#x60;sys/fs/blkio_throttle_write&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.write_bps_device  - &#x60;sys/fs/blkio_throttle_read_iops&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.read_iops_device  - &#x60;sys/fs/blkio_throttle_write_iops&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.write_iops_device  - &#x60;DrbdOptions/auto-quorum&#x60; - enum      Enables automatic setting of the &#x27;quroum&#x27; and &#x27;on-no-quroum&#x27; property      * io-error     * suspend-io     * disabled  - &#x60;DrbdOptions/auto-add-quorum-tiebreaker&#x60; - boolean_true_false      Enables automatic management (creation and deletion) of tie breaking resource  - &#x60;DrbdOptions/auto-diskful&#x60; - long      Makes a resource diskful if it was continously diskless primary for X minutes  - &#x60;DrbdOptions/auto-diskful-allow-cleanup&#x60; - boolean_true_false      Allows this resource to be cleaned up after toggle-disk + resync is finished  - &#x60;Writecache/PoolName&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Linstor storage pool name for writecache  - &#x60;Writecache/Size&#x60; - regex[&#x60;^100%|[0-9]{1,2}([.][0-9]*)?%|[1-9][0-9]{2,}$&#x60;]      Size of the writecache in % (0-100) or KiB otherwise  - &#x60;Writecache/Options/StartSector&#x60; - long      offset from the start of cache device in 512-byte sectors  - &#x60;Writecache/Options/HighWatermark&#x60; - long      start writeback when the number of used blocks reach this watermark  - &#x60;Writecache/Options/LowWatermark&#x60; - long      stop writeback when the number of used blocks drops below this watermark  - &#x60;Writecache/Options/WritebackJobs&#x60; - long      limit the number of blocks that are in flight during writeback. Setting this value reduces writeback throughput, but it may improve latency of read requests  - &#x60;Writecache/Options/AutocommitBlocks&#x60; - long      when the application writes this amount of blocks without issuing the FLUSH request, the blocks are automatically commited  - &#x60;Writecache/Options/AutocommitTime&#x60; - long      autocommit time in milliseconds. The data is automatically commited if this time passes and no FLUSH request is received  - &#x60;Writecache/Options/Fua&#x60; - enum      \&quot;On\&quot; results in \&quot;fua\&quot; as argument, whereas the value \&quot;Off\&quot; results in \&quot;nofua\&quot; argument      * On     * Off  - &#x60;Writecache/Options/Additional&#x60; - string      Additional arguments passed through  - &#x60;Cache/OpMode&#x60; - enum      Operation mode      * writeback     * writethrough     * passthrough  - &#x60;Cache/MetaPool&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Name of the storage pool used for the cache metadata. If not specified, this will default to the CachePool property  - &#x60;Cache/Metasize&#x60; - regex[&#x60;^100%|[0-9]{1,2}([.][0-9]*)?%|[1-9][0-9]{2,}$&#x60;]      Size of the cache in % (0-100) or KiB otherwise.  - &#x60;Cache/CachePool&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Name of the storage pool used for the cache cache device  - &#x60;Cache/Cachesize&#x60; - regex[&#x60;^100%|[0-9]{1,2}([.][0-9]*)?%|[1-9][0-9]{2,}$&#x60;]      Size of the cache in % (0-100) or KiB otherwise.  - &#x60;Cache/Blocksize&#x60; - long      Block size  - &#x60;Cache/Policy&#x60; - enum      Replacemant policy      * mq     * smq     * cleaner  - &#x60;SnapshotShipping/SourceNode&#x60; - string      Node name of the snapshot shipping source  - &#x60;SnapshotShipping/TargetNode&#x60; - string      Node name of the snapshot shipping target  - &#x60;SnapshotShipping/RunEvery&#x60; - long      Runs every X minutes an auto-snapshot-shipping unless the current snapshot-shipping is still running. In this case a new one will be started asap.  - &#x60;SnapshotShipping/Keep&#x60; - long      Keeps the last X sihpped snapshots. Removing this property or having a value &lt;&#x3D; 0 disables auto-cleanup, all auto-snapshots will be kept  - &#x60;AutoSnapshot/RunEvery&#x60; - long      Runs every X minutes an snapshot-creation. Removing this property or having a value &lt;&#x3D; 0 disables auto-snapshotting.  - &#x60;AutoSnapshot/Keep&#x60; - long      Keeps the last X auto-snapshots. Removing this property or having a value &lt;&#x3D; 0 disables auto-cleanup, all auto-snapshots will be kept  - &#x60;AutoSnapshot/NextAutoId&#x60; - long      The next ID to try for auto-snapshots  - &#x60;DrbdOptions/Disk/on-io-error&#x60; - enum     * pass_on     * call-local-io-error     * detach  - &#x60;DrbdOptions/Disk/disk-barrier&#x60; - boolean - &#x60;DrbdOptions/Disk/disk-flushes&#x60; - boolean - &#x60;DrbdOptions/Disk/disk-drain&#x60; - boolean - &#x60;DrbdOptions/Disk/md-flushes&#x60; - boolean - &#x60;DrbdOptions/Disk/resync-after&#x60; - string - &#x60;DrbdOptions/Disk/al-extents&#x60; - range[&#x60;67-65534&#x60;] - &#x60;DrbdOptions/Disk/al-updates&#x60; - boolean - &#x60;DrbdOptions/Disk/discard-zeroes-if-aligned&#x60; - boolean - &#x60;DrbdOptions/Disk/disable-write-same&#x60; - boolean - &#x60;DrbdOptions/Disk/disk-timeout&#x60; - range[&#x60;0-6000&#x60;] - &#x60;DrbdOptions/Disk/read-balancing&#x60; - enum     * prefer-local     * prefer-remote     * round-robin     * least-pending     * when-congested-remote     * 32K-striping     * 64K-striping     * 128K-striping     * 256K-striping     * 512K-striping     * 1M-striping  - &#x60;DrbdOptions/Disk/rs-discard-granularity&#x60; - range[&#x60;0-1048576&#x60;] - &#x60;DrbdOptions/PeerDevice/resync-rate&#x60; - range[&#x60;1-8388608&#x60;] - &#x60;DrbdOptions/PeerDevice/c-plan-ahead&#x60; - range[&#x60;0-300&#x60;] - &#x60;DrbdOptions/PeerDevice/c-delay-target&#x60; - range[&#x60;1-100&#x60;] - &#x60;DrbdOptions/PeerDevice/c-fill-target&#x60; - range[&#x60;0-1048576&#x60;] - &#x60;DrbdOptions/PeerDevice/c-max-rate&#x60; - range[&#x60;250-4194304&#x60;] - &#x60;DrbdOptions/PeerDevice/c-min-rate&#x60; - range[&#x60;0-4194304&#x60;] - &#x60;DrbdOptions/PeerDevice/bitmap&#x60; - boolean - &#x60;DrbdOptions/Resource/cpu-mask&#x60; - string - &#x60;DrbdOptions/Resource/on-no-data-accessible&#x60; - enum     * io-error     * suspend-io  - &#x60;DrbdOptions/Resource/auto-promote&#x60; - boolean - &#x60;DrbdOptions/Resource/peer-ack-window&#x60; - range[&#x60;2048-204800&#x60;] - &#x60;DrbdOptions/Resource/peer-ack-delay&#x60; - range[&#x60;1-10000&#x60;] - &#x60;DrbdOptions/Resource/twopc-timeout&#x60; - range[&#x60;50-600&#x60;] - &#x60;DrbdOptions/Resource/twopc-retry-timeout&#x60; - range[&#x60;1-50&#x60;] - &#x60;DrbdOptions/Resource/auto-promote-timeout&#x60; - range[&#x60;0-600&#x60;] - &#x60;DrbdOptions/Resource/max-io-depth&#x60; - range[&#x60;4-4294967295&#x60;] - &#x60;DrbdOptions/Resource/quorum&#x60; - enum [&#x60;1-32&#x60;]     * off     * majority     * all  - &#x60;DrbdOptions/Resource/on-no-quorum&#x60; - enum     * io-error     * suspend-io  - &#x60;DrbdOptions/Resource/quorum-minimum-redundancy&#x60; - enum [&#x60;1-32&#x60;]     * off     * majority     * all  - &#x60;DrbdOptions/Net/transport&#x60; - string - &#x60;DrbdOptions/Net/protocol&#x60; - enum     * A     * B     * C  - &#x60;DrbdOptions/Net/timeout&#x60; - range[&#x60;1-600&#x60;] - &#x60;DrbdOptions/Net/max-epoch-size&#x60; - range[&#x60;1-20000&#x60;] - &#x60;DrbdOptions/Net/connect-int&#x60; - range[&#x60;1-120&#x60;] - &#x60;DrbdOptions/Net/ping-int&#x60; - range[&#x60;1-120&#x60;] - &#x60;DrbdOptions/Net/sndbuf-size&#x60; - range[&#x60;0-10485760&#x60;] - &#x60;DrbdOptions/Net/rcvbuf-size&#x60; - range[&#x60;0-10485760&#x60;] - &#x60;DrbdOptions/Net/ko-count&#x60; - range[&#x60;0-200&#x60;] - &#x60;DrbdOptions/Net/allow-two-primaries&#x60; - boolean - &#x60;DrbdOptions/Net/cram-hmac-alg&#x60; - string - &#x60;DrbdOptions/Net/shared-secret&#x60; - string - &#x60;DrbdOptions/Net/after-sb-0pri&#x60; - enum     * disconnect     * discard-younger-primary     * discard-older-primary     * discard-zero-changes     * discard-least-changes     * discard-local     * discard-remote  - &#x60;DrbdOptions/Net/after-sb-1pri&#x60; - enum     * disconnect     * consensus     * discard-secondary     * call-pri-lost-after-sb     * violently-as0p  - &#x60;DrbdOptions/Net/after-sb-2pri&#x60; - enum     * disconnect     * call-pri-lost-after-sb     * violently-as0p  - &#x60;DrbdOptions/Net/always-asbp&#x60; - boolean - &#x60;DrbdOptions/Net/rr-conflict&#x60; - enum     * disconnect     * call-pri-lost     * violently     * retry-connect  - &#x60;DrbdOptions/Net/ping-timeout&#x60; - range[&#x60;1-300&#x60;] - &#x60;DrbdOptions/Net/data-integrity-alg&#x60; - string - &#x60;DrbdOptions/Net/tcp-cork&#x60; - boolean - &#x60;DrbdOptions/Net/on-congestion&#x60; - enum     * block     * pull-ahead     * disconnect  - &#x60;DrbdOptions/Net/congestion-fill&#x60; - range[&#x60;0-20971520&#x60;] - &#x60;DrbdOptions/Net/congestion-extents&#x60; - range[&#x60;67-65534&#x60;] - &#x60;DrbdOptions/Net/csums-alg&#x60; - string - &#x60;DrbdOptions/Net/csums-after-crash-only&#x60; - boolean - &#x60;DrbdOptions/Net/verify-alg&#x60; - string - &#x60;DrbdOptions/Net/use-rle&#x60; - boolean - &#x60;DrbdOptions/Net/socket-check-timeout&#x60; - range[&#x60;0-300&#x60;] - &#x60;DrbdOptions/Net/fencing&#x60; - enum     * dont-care     * resource-only     * resource-and-stonith  - &#x60;DrbdOptions/Net/max-buffers&#x60; - range[&#x60;32-131072&#x60;] - &#x60;DrbdOptions/Net/allow-remote-read&#x60; - boolean - &#x60;DrbdOptions/Handlers/after-resync-target&#x60; - string - &#x60;DrbdOptions/Handlers/before-resync-target&#x60; - string - &#x60;DrbdOptions/Handlers/before-resync-source&#x60; - string - &#x60;DrbdOptions/Handlers/out-of-sync&#x60; - string - &#x60;DrbdOptions/Handlers/quorum-lost&#x60; - string - &#x60;DrbdOptions/Handlers/fence-peer&#x60; - string - &#x60;DrbdOptions/Handlers/unfence-peer&#x60; - string - &#x60;DrbdOptions/Handlers/initial-split-brain&#x60; - string - &#x60;DrbdOptions/Handlers/local-io-error&#x60; - string - &#x60;DrbdOptions/Handlers/pri-lost&#x60; - string - &#x60;DrbdOptions/Handlers/pri-lost-after-sb&#x60; - string - &#x60;DrbdOptions/Handlers/pri-on-incon-degr&#x60; - string - &#x60;DrbdOptions/Handlers/split-brain&#x60; - string 

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String resource = "resource_example"; // String | resource to use
ResourceDefinitionModify body = new ResourceDefinitionModify(); // ResourceDefinitionModify | 
try {
    ApiCallRcList result = apiInstance.resourceDefinitionModify(resource, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#resourceDefinitionModify");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | **String**| resource to use |
 **body** | [**ResourceDefinitionModify**](ResourceDefinitionModify.md)|  | [optional]

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resourceDelete"></a>
# **resourceDelete**
> ApiCallRcList resourceDelete(resource, node)

delete a resource

Delete a resource on a node

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String resource = "resource_example"; // String | resource to use
String node = "node_example"; // String | node to use
try {
    ApiCallRcList result = apiInstance.resourceDelete(resource, node);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#resourceDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | **String**| resource to use |
 **node** | **String**| node to use |

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resourceDrbdProxyDisable"></a>
# **resourceDrbdProxyDisable**
> ApiCallRcList resourceDrbdProxyDisable(resource, nodeA, nodeB)

disables a drbd proxy on a node connection

Disables a drbd proxy on a node connection

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String resource = "resource_example"; // String | resource to use
String nodeA = "nodeA_example"; // String | source node of the connection
String nodeB = "nodeB_example"; // String | target node of the connection
try {
    ApiCallRcList result = apiInstance.resourceDrbdProxyDisable(resource, nodeA, nodeB);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#resourceDrbdProxyDisable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | **String**| resource to use |
 **nodeA** | **String**| source node of the connection |
 **nodeB** | **String**| target node of the connection |

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resourceDrbdProxyEnable"></a>
# **resourceDrbdProxyEnable**
> ApiCallRcList resourceDrbdProxyEnable(resource, nodeA, nodeB, body)

enable a drbd proxy on a node connection

Enables a drbd proxy on a node connection

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String resource = "resource_example"; // String | resource to use
String nodeA = "nodeA_example"; // String | source node of the connection
String nodeB = "nodeB_example"; // String | target node of the connection
DrbdProxyEnable body = new DrbdProxyEnable(); // DrbdProxyEnable | 
try {
    ApiCallRcList result = apiInstance.resourceDrbdProxyEnable(resource, nodeA, nodeB, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#resourceDrbdProxyEnable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | **String**| resource to use |
 **nodeA** | **String**| source node of the connection |
 **nodeB** | **String**| target node of the connection |
 **body** | [**DrbdProxyEnable**](DrbdProxyEnable.md)|  | [optional]

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resourceDrbdProxyModify"></a>
# **resourceDrbdProxyModify**
> ApiCallRcList resourceDrbdProxyModify(resource, body)

modify drbd proxy option properties

Sets or modifies properties  Possible properties are: - &#x60;DrbdOptions/Proxy/memlimit&#x60; - range[&#x60;16777216-9223372036854775807&#x60;] - &#x60;DrbdOptions/Proxy/read-loops&#x60; - range[&#x60;0-2147483647&#x60;] - &#x60;DrbdOptions/Proxy/sndbuf-size&#x60; - range[&#x60;0-10485760&#x60;] - &#x60;DrbdOptions/Proxy/rcvbuf-size&#x60; - range[&#x60;0-10485760&#x60;] - &#x60;DrbdOptions/Proxy/ping-timeout&#x60; - range[&#x60;1-300&#x60;] - &#x60;DrbdOptions/ProxyCompression/dict-size&#x60; - range[&#x60;4096-1610612736&#x60;] - &#x60;DrbdOptions/ProxyCompression/lc&#x60; - range[&#x60;0-4&#x60;] - &#x60;DrbdOptions/ProxyCompression/lp&#x60; - range[&#x60;0-4&#x60;] - &#x60;DrbdOptions/ProxyCompression/pb&#x60; - range[&#x60;0-4&#x60;] - &#x60;DrbdOptions/ProxyCompression/nice-len&#x60; - range[&#x60;0-273&#x60;] - &#x60;DrbdOptions/ProxyCompression/mf&#x60; - enum     * hc4     * hc3     * bt2     * bt3     * bt4  - &#x60;DrbdOptions/ProxyCompression/mode&#x60; - enum     * fast     * normal  - &#x60;DrbdOptions/ProxyCompression/depth&#x60; - range[&#x60;0-1000&#x60;] - &#x60;DrbdOptions/ProxyCompression/level&#x60; - range[&#x60;1-9&#x60;] - &#x60;DrbdOptions/ProxyCompression/contexts&#x60; - range[&#x60;1-253&#x60;] - &#x60;DrbdOptions/ProxyCompression/fallback-to-zlib&#x60; - enum     * off     * on  - &#x60;DrbdOptions/ProxyCompression/numa-threshold&#x60; - range[&#x60;0-253&#x60;] - &#x60;DrbdOptions/ProxyCompression/level&#x60; - range[&#x60;1-9&#x60;] - &#x60;DrbdOptions/ProxyCompression/level&#x60; - range[&#x60;1-22&#x60;] 

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String resource = "resource_example"; // String | resource to use
DrbdProxyModify body = new DrbdProxyModify(); // DrbdProxyModify | 
try {
    ApiCallRcList result = apiInstance.resourceDrbdProxyModify(resource, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#resourceDrbdProxyModify");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | **String**| resource to use |
 **body** | [**DrbdProxyModify**](DrbdProxyModify.md)|  | [optional]

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resourceGroupCreate"></a>
# **resourceGroupCreate**
> ApiCallRcList resourceGroupCreate(body)

add a resource-group

Adds a resource-group.  Only required property is the name of the resource group. All other properties are optional. 

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
ResourceGroup body = new ResourceGroup(); // ResourceGroup | 
try {
    ApiCallRcList result = apiInstance.resourceGroupCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#resourceGroupCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ResourceGroup**](ResourceGroup.md)|  | [optional]

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resourceGroupDelete"></a>
# **resourceGroupDelete**
> ApiCallRcList resourceGroupDelete(resourceGroup)

delete a resource-group

Delete a resource-group

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String resourceGroup = "resourceGroup_example"; // String | resource group to use
try {
    ApiCallRcList result = apiInstance.resourceGroupDelete(resourceGroup);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#resourceGroupDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourceGroup** | **String**| resource group to use |

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resourceGroupList"></a>
# **resourceGroupList**
> List&lt;ResourceGroup&gt; resourceGroupList(resourceGroups, props, offset, limit)

lists all resource-groups

Lists all resource groups.  A single resource group can be queried by adding its name to the resource string like:  /v1/resource-groups/rscgrp1 

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
List<String> resourceGroups = Arrays.asList("resourceGroups_example"); // List<String> | Filter only for the specified resource groups, if not specified no filtering.
List<String> props = Arrays.asList("props_example"); // List<String> | filter by given properties, full property path
Integer offset = 56; // Integer | number of records to skip for pagination
Integer limit = 56; // Integer | maximum number of records to return
try {
    List<ResourceGroup> result = apiInstance.resourceGroupList(resourceGroups, props, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#resourceGroupList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourceGroups** | [**List&lt;String&gt;**](String.md)| Filter only for the specified resource groups, if not specified no filtering. | [optional]
 **props** | [**List&lt;String&gt;**](String.md)| filter by given properties, full property path | [optional]
 **offset** | **Integer**| number of records to skip for pagination | [optional] [enum: ]
 **limit** | **Integer**| maximum number of records to return | [optional] [enum: ]

### Return type

[**List&lt;ResourceGroup&gt;**](ResourceGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resourceGroupModify"></a>
# **resourceGroupModify**
> ApiCallRcList resourceGroupModify(resourceGroup, body)

modify a resource-group

Sets or modifies properties  Possible properties are: - &#x60;StorPoolName&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Linstor storage pool name to use.  - &#x60;PeerSlotsNewResource&#x60; - range[&#x60;1-31&#x60;]      DRBD peer slots to allocate for newly created resources (default 7), the number of peer slots cannot be changed once the resource is created, so allow sufficient slots to increase redundancy in the future  - &#x60;DrbdProxy/CompressionType&#x60; - enum     * zlib     * lzma     * lz4  - &#x60;FileSystem/Type&#x60; - enum      File system type to use      * ext4     * xfs  - &#x60;FileSystem/MkfsParams&#x60; - string      Additional parameters for the mkfs command  - &#x60;NVMe/enabled&#x60; - enum     * rdma     * tcp  - &#x60;NVMe/enabled&#x60; - range[&#x60;1-65535&#x60;] - &#x60;DrbdOptions/Disk/read-balancing&#x60; - enum     * prefer-local     * prefer-remote     * round-robin     * least-pending     * when-congested-remote     * 32K-striping     * 64K-striping     * 128K-striping     * 256K-striping     * 512K-striping     * 1M-striping  - &#x60;DrbdOptions/Disk/on-io-error&#x60; - enum     * pass_on     * call-local-io-error     * detach  - &#x60;DrbdOptions/Disk/disk-drain&#x60; - boolean - &#x60;DrbdOptions/Disk/resync-after&#x60; - string - &#x60;DrbdOptions/Disk/disk-timeout&#x60; - range[&#x60;0-6000&#x60;] - &#x60;DrbdOptions/Disk/disable-write-same&#x60; - boolean - &#x60;DrbdOptions/Disk/rs-discard-granularity&#x60; - range[&#x60;0-1048576&#x60;] - &#x60;DrbdOptions/Disk/disk-flushes&#x60; - boolean - &#x60;DrbdOptions/Disk/al-extents&#x60; - range[&#x60;67-65534&#x60;] - &#x60;DrbdOptions/Disk/al-updates&#x60; - boolean - &#x60;DrbdOptions/Disk/md-flushes&#x60; - boolean - &#x60;DrbdOptions/Disk/disk-barrier&#x60; - boolean - &#x60;DrbdOptions/Disk/discard-zeroes-if-aligned&#x60; - boolean - &#x60;DrbdOptions/PeerDevice/c-fill-target&#x60; - range[&#x60;0-1048576&#x60;] - &#x60;DrbdOptions/PeerDevice/c-max-rate&#x60; - range[&#x60;250-4194304&#x60;] - &#x60;DrbdOptions/PeerDevice/resync-rate&#x60; - range[&#x60;1-8388608&#x60;] - &#x60;DrbdOptions/PeerDevice/c-delay-target&#x60; - range[&#x60;1-100&#x60;] - &#x60;DrbdOptions/PeerDevice/c-min-rate&#x60; - range[&#x60;0-4194304&#x60;] - &#x60;DrbdOptions/PeerDevice/bitmap&#x60; - boolean - &#x60;DrbdOptions/PeerDevice/c-plan-ahead&#x60; - range[&#x60;0-300&#x60;] - &#x60;DrbdOptions/Resource/peer-ack-delay&#x60; - range[&#x60;1-10000&#x60;] - &#x60;DrbdOptions/Resource/quorum-minimum-redundancy&#x60; - enum [&#x60;1-32&#x60;]     * off     * majority     * all  - &#x60;DrbdOptions/Resource/max-io-depth&#x60; - range[&#x60;4-4294967295&#x60;] - &#x60;DrbdOptions/Resource/auto-promote-timeout&#x60; - range[&#x60;0-600&#x60;] - &#x60;DrbdOptions/Resource/quorum&#x60; - enum [&#x60;1-32&#x60;]     * off     * majority     * all  - &#x60;DrbdOptions/Resource/on-no-data-accessible&#x60; - enum     * io-error     * suspend-io  - &#x60;DrbdOptions/Resource/auto-promote&#x60; - boolean - &#x60;DrbdOptions/Resource/cpu-mask&#x60; - string - &#x60;DrbdOptions/Resource/twopc-timeout&#x60; - range[&#x60;50-600&#x60;] - &#x60;DrbdOptions/Resource/twopc-retry-timeout&#x60; - range[&#x60;1-50&#x60;] - &#x60;DrbdOptions/Resource/peer-ack-window&#x60; - range[&#x60;2048-204800&#x60;] - &#x60;DrbdOptions/Resource/on-no-quorum&#x60; - enum     * io-error     * suspend-io  - &#x60;DrbdOptions/Net/max-epoch-size&#x60; - range[&#x60;1-20000&#x60;] - &#x60;DrbdOptions/Net/protocol&#x60; - enum     * A     * B     * C  - &#x60;DrbdOptions/Net/allow-two-primaries&#x60; - boolean - &#x60;DrbdOptions/Net/after-sb-0pri&#x60; - enum     * disconnect     * discard-younger-primary     * discard-older-primary     * discard-zero-changes     * discard-least-changes     * discard-local     * discard-remote  - &#x60;DrbdOptions/Net/ko-count&#x60; - range[&#x60;0-200&#x60;] - &#x60;DrbdOptions/Net/data-integrity-alg&#x60; - string - &#x60;DrbdOptions/Net/ping-timeout&#x60; - range[&#x60;1-300&#x60;] - &#x60;DrbdOptions/Net/sndbuf-size&#x60; - range[&#x60;0-10485760&#x60;] - &#x60;DrbdOptions/Net/transport&#x60; - string - &#x60;DrbdOptions/Net/rcvbuf-size&#x60; - range[&#x60;0-10485760&#x60;] - &#x60;DrbdOptions/Net/max-buffers&#x60; - range[&#x60;32-131072&#x60;] - &#x60;DrbdOptions/Net/fencing&#x60; - enum     * dont-care     * resource-only     * resource-and-stonith  - &#x60;DrbdOptions/Net/csums-alg&#x60; - string - &#x60;DrbdOptions/Net/always-asbp&#x60; - boolean - &#x60;DrbdOptions/Net/congestion-extents&#x60; - range[&#x60;67-65534&#x60;] - &#x60;DrbdOptions/Net/on-congestion&#x60; - enum     * block     * pull-ahead     * disconnect  - &#x60;DrbdOptions/Net/ping-int&#x60; - range[&#x60;1-120&#x60;] - &#x60;DrbdOptions/Net/rr-conflict&#x60; - enum     * disconnect     * call-pri-lost     * violently  - &#x60;DrbdOptions/Net/tcp-cork&#x60; - boolean - &#x60;DrbdOptions/Net/use-rle&#x60; - boolean - &#x60;DrbdOptions/Net/csums-after-crash-only&#x60; - boolean - &#x60;DrbdOptions/Net/socket-check-timeout&#x60; - range[&#x60;0-300&#x60;] - &#x60;DrbdOptions/Net/congestion-fill&#x60; - range[&#x60;0-20971520&#x60;] - &#x60;DrbdOptions/Net/cram-hmac-alg&#x60; - string - &#x60;DrbdOptions/Net/verify-alg&#x60; - string - &#x60;DrbdOptions/Net/shared-secret&#x60; - string - &#x60;DrbdOptions/Net/connect-int&#x60; - range[&#x60;1-120&#x60;] - &#x60;DrbdOptions/Net/timeout&#x60; - range[&#x60;1-600&#x60;] - &#x60;DrbdOptions/Net/after-sb-2pri&#x60; - enum     * disconnect     * call-pri-lost-after-sb     * violently-as0p  - &#x60;DrbdOptions/Net/after-sb-1pri&#x60; - enum     * disconnect     * consensus     * discard-secondary     * call-pri-lost-after-sb     * violently-as0p  - &#x60;DrbdOptions/Handlers/after-resync-target&#x60; - string - &#x60;DrbdOptions/Handlers/before-resync-target&#x60; - string - &#x60;DrbdOptions/Handlers/before-resync-source&#x60; - string - &#x60;DrbdOptions/Handlers/out-of-sync&#x60; - string - &#x60;DrbdOptions/Handlers/quorum-lost&#x60; - string - &#x60;DrbdOptions/Handlers/fence-peer&#x60; - string - &#x60;DrbdOptions/Handlers/unfence-peer&#x60; - string - &#x60;DrbdOptions/Handlers/initial-split-brain&#x60; - string - &#x60;DrbdOptions/Handlers/local-io-error&#x60; - string - &#x60;DrbdOptions/Handlers/pri-lost&#x60; - string - &#x60;DrbdOptions/Handlers/pri-lost-after-sb&#x60; - string - &#x60;DrbdOptions/Handlers/pri-on-incon-degr&#x60; - string - &#x60;DrbdOptions/Handlers/split-brain&#x60; - string 

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String resourceGroup = "resourceGroup_example"; // String | resource group to use
ResourceGroupModify body = new ResourceGroupModify(); // ResourceGroupModify | 
try {
    ApiCallRcList result = apiInstance.resourceGroupModify(resourceGroup, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#resourceGroupModify");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourceGroup** | **String**| resource group to use |
 **body** | [**ResourceGroupModify**](ResourceGroupModify.md)|  | [optional]

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resourceGroupSpawn"></a>
# **resourceGroupSpawn**
> ApiCallRcList resourceGroupSpawn(resourceGroup, body)

create a new resource-definition based on the given resource-group

Creates a new resource-definition and auto-deploys if configured to do so. 

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String resourceGroup = "resourceGroup_example"; // String | resource group to use
ResourceGroupSpawn body = new ResourceGroupSpawn(); // ResourceGroupSpawn | 
try {
    ApiCallRcList result = apiInstance.resourceGroupSpawn(resourceGroup, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#resourceGroupSpawn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourceGroup** | **String**| resource group to use |
 **body** | [**ResourceGroupSpawn**](ResourceGroupSpawn.md)|  | [optional]

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resourceList"></a>
# **resourceList**
> List&lt;Resource&gt; resourceList(resource, offset, limit)

lists all resources for a resource-definition

Lists all resources for a resource-definition.  A single resource can be queried by adding its name to the resource string like:  /v1/resource-definitions/rsc1/resources/nodeA 

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String resource = "resource_example"; // String | resource to use
Integer offset = 56; // Integer | number of records to skip for pagination
Integer limit = 56; // Integer | maximum number of records to return
try {
    List<Resource> result = apiInstance.resourceList(resource, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#resourceList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | **String**| resource to use |
 **offset** | **Integer**| number of records to skip for pagination | [optional] [enum: ]
 **limit** | **Integer**| maximum number of records to return | [optional] [enum: ]

### Return type

[**List&lt;Resource&gt;**](Resource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resourceMigrateDisk"></a>
# **resourceMigrateDisk**
> ApiCallRcList resourceMigrateDisk(resource, node, fromnode)

migrate a resource to another node

migrate a resource to another node without reducing the redundancy count 

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String resource = "resource_example"; // String | resource to use
String node = "node_example"; // String | node to use
String fromnode = "fromnode_example"; // String | node that should be deleted after the successful migrate
try {
    ApiCallRcList result = apiInstance.resourceMigrateDisk(resource, node, fromnode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#resourceMigrateDisk");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | **String**| resource to use |
 **node** | **String**| node to use |
 **fromnode** | **String**| node that should be deleted after the successful migrate |

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resourceMigrateDiskStoragepool"></a>
# **resourceMigrateDiskStoragepool**
> ApiCallRcList resourceMigrateDiskStoragepool(resource, node, fromnode, storagepool)

migrate a resource to another node

migrate a resource to another node without reducing the redundency count 

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String resource = "resource_example"; // String | resource to use
String node = "node_example"; // String | node to use
String fromnode = "fromnode_example"; // String | node that should be deleted after the successful migrate
String storagepool = "storagepool_example"; // String | Storage pool to use
try {
    ApiCallRcList result = apiInstance.resourceMigrateDiskStoragepool(resource, node, fromnode, storagepool);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#resourceMigrateDiskStoragepool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | **String**| resource to use |
 **node** | **String**| node to use |
 **fromnode** | **String**| node that should be deleted after the successful migrate |
 **storagepool** | **String**| Storage pool to use |

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resourceModify"></a>
# **resourceModify**
> ApiCallRcList resourceModify(resource, node, body)

modify a resource

Sets or modifies properties  Possible properties are: - &#x60;StorPoolName&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Linstor storage pool name to use.  - &#x60;StorPoolNameDrbdMeta&#x60; - regex[&#x60;^|.internal|[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Linstor storage pool name to use for external metadata.  - &#x60;PrefNic&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Preferred network interface to use  - &#x60;PeerSlots&#x60; - range[&#x60;1-31&#x60;]      DRBD peer slots present on resource  - &#x60;FileSystem/Type&#x60; - enum      File system type to use      * ext4     * xfs  - &#x60;FileSystem/MkfsParams&#x60; - string      Additional parameters for the mkfs command  - &#x60;NVMe/PrefNic&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Preferred network interface to use  - &#x60;sys/fs/blkio_throttle_read&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.read_bps_device  - &#x60;sys/fs/blkio_throttle_write&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.write_bps_device  - &#x60;sys/fs/blkio_throttle_read_iops&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.read_iops_device  - &#x60;sys/fs/blkio_throttle_write_iops&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.write_iops_device  - &#x60;DrbdOptions/auto-diskful-allow-cleanup&#x60; - boolean_true_false      Allows this resource to be cleaned up after toggle-disk + resync is finished  

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String resource = "resource_example"; // String | resource to use
String node = "node_example"; // String | node to use
ResourceModify body = new ResourceModify(); // ResourceModify | 
try {
    ApiCallRcList result = apiInstance.resourceModify(resource, node, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#resourceModify");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | **String**| resource to use |
 **node** | **String**| node to use |
 **body** | [**ResourceModify**](ResourceModify.md)|  | [optional]

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resourceSnapshotCreate"></a>
# **resourceSnapshotCreate**
> ApiCallRcList resourceSnapshotCreate(resource, body)

create a snapshot

Create a snapshot for a resource

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String resource = "resource_example"; // String | resource to use
Snapshot body = new Snapshot(); // Snapshot | 
try {
    ApiCallRcList result = apiInstance.resourceSnapshotCreate(resource, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#resourceSnapshotCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | **String**| resource to use |
 **body** | [**Snapshot**](Snapshot.md)|  | [optional]

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resourceSnapshotDelete"></a>
# **resourceSnapshotDelete**
> ApiCallRcList resourceSnapshotDelete(resource, snapshot)

delete a snapshot

Delete a snapshot

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String resource = "resource_example"; // String | resource to use
String snapshot = "snapshot_example"; // String | Snapshot name to use
try {
    ApiCallRcList result = apiInstance.resourceSnapshotDelete(resource, snapshot);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#resourceSnapshotDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | **String**| resource to use |
 **snapshot** | **String**| Snapshot name to use |

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resourceSnapshotList"></a>
# **resourceSnapshotList**
> Snapshot resourceSnapshotList(resource, snapshot)

list a specific snapshot

List the given snapshot for a resource

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String resource = "resource_example"; // String | resource to use
String snapshot = "snapshot_example"; // String | Snapshot name to use
try {
    Snapshot result = apiInstance.resourceSnapshotList(resource, snapshot);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#resourceSnapshotList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | **String**| resource to use |
 **snapshot** | **String**| Snapshot name to use |

### Return type

[**Snapshot**](Snapshot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resourceSnapshotRestore"></a>
# **resourceSnapshotRestore**
> ApiCallRcList resourceSnapshotRestore(resource, snapshot, body)

restore a snapshot

Restore a snapshot to a new resource

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String resource = "resource_example"; // String | resource to use
String snapshot = "snapshot_example"; // String | Snapshot name to use
SnapshotRestore body = new SnapshotRestore(); // SnapshotRestore | 
try {
    ApiCallRcList result = apiInstance.resourceSnapshotRestore(resource, snapshot, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#resourceSnapshotRestore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | **String**| resource to use |
 **snapshot** | **String**| Snapshot name to use |
 **body** | [**SnapshotRestore**](SnapshotRestore.md)|  | [optional]

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resourceSnapshotRollback"></a>
# **resourceSnapshotRollback**
> ApiCallRcList resourceSnapshotRollback(resource, snapshot)

rollback a snapshot

Rollback a resource to the snapshot state

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String resource = "resource_example"; // String | resource to use
String snapshot = "snapshot_example"; // String | Snapshot name to use
try {
    ApiCallRcList result = apiInstance.resourceSnapshotRollback(resource, snapshot);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#resourceSnapshotRollback");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | **String**| resource to use |
 **snapshot** | **String**| Snapshot name to use |

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resourceSnapshotsList"></a>
# **resourceSnapshotsList**
> List&lt;Snapshot&gt; resourceSnapshotsList(resource)

list snapshots

List snapshots for a resource

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String resource = "resource_example"; // String | resource to use
try {
    List<Snapshot> result = apiInstance.resourceSnapshotsList(resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#resourceSnapshotsList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | **String**| resource to use |

### Return type

[**List&lt;Snapshot&gt;**](Snapshot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resourceSnapshotsRestoreVolumeDefinition"></a>
# **resourceSnapshotsRestoreVolumeDefinition**
> ApiCallRcList resourceSnapshotsRestoreVolumeDefinition(resource, snapshot, body)

restore a snapshot volume definition

Restore a snapshot volume definition to a new resource

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String resource = "resource_example"; // String | resource to use
String snapshot = "snapshot_example"; // String | Snapshot name to use
SnapshotRestore body = new SnapshotRestore(); // SnapshotRestore | 
try {
    ApiCallRcList result = apiInstance.resourceSnapshotsRestoreVolumeDefinition(resource, snapshot, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#resourceSnapshotsRestoreVolumeDefinition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | **String**| resource to use |
 **snapshot** | **String**| Snapshot name to use |
 **body** | [**SnapshotRestore**](SnapshotRestore.md)|  | [optional]

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resourceToggleDiskful"></a>
# **resourceToggleDiskful**
> ApiCallRcList resourceToggleDiskful(resource, node)

toggle a resource to a diskful resource

toggle a resource to a diskful resource using the default storage pool 

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String resource = "resource_example"; // String | resource to use
String node = "node_example"; // String | node to use
try {
    ApiCallRcList result = apiInstance.resourceToggleDiskful(resource, node);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#resourceToggleDiskful");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | **String**| resource to use |
 **node** | **String**| node to use |

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resourceToggleDiskfulStoragepool"></a>
# **resourceToggleDiskfulStoragepool**
> ApiCallRcList resourceToggleDiskfulStoragepool(resource, node, storagepool)

toggle a resource to a diskful resource

toggle a resource to a diskful resource

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String resource = "resource_example"; // String | resource to use
String node = "node_example"; // String | node to use
String storagepool = "storagepool_example"; // String | Storage pool to use
try {
    ApiCallRcList result = apiInstance.resourceToggleDiskfulStoragepool(resource, node, storagepool);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#resourceToggleDiskfulStoragepool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | **String**| resource to use |
 **node** | **String**| node to use |
 **storagepool** | **String**| Storage pool to use |

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resourceToggleDiskless"></a>
# **resourceToggleDiskless**
> ApiCallRcList resourceToggleDiskless(resource, node)

toggle a resource to diskless

toggle a resource to a diskless resource

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String resource = "resource_example"; // String | resource to use
String node = "node_example"; // String | node to use
try {
    ApiCallRcList result = apiInstance.resourceToggleDiskless(resource, node);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#resourceToggleDiskless");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | **String**| resource to use |
 **node** | **String**| node to use |

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resourceToggleDisklessDisklesspool"></a>
# **resourceToggleDisklessDisklesspool**
> ApiCallRcList resourceToggleDisklessDisklesspool(resource, node, disklesspool)

toggle a resource to diskless resource

toggle a resource to a diskless. 

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String resource = "resource_example"; // String | resource to use
String node = "node_example"; // String | node to use
String disklesspool = "disklesspool_example"; // String | diskless pool to use.
try {
    ApiCallRcList result = apiInstance.resourceToggleDisklessDisklesspool(resource, node, disklesspool);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#resourceToggleDisklessDisklesspool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | **String**| resource to use |
 **node** | **String**| node to use |
 **disklesspool** | **String**| diskless pool to use. |

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resourceVolumeList"></a>
# **resourceVolumeList**
> List&lt;Volume&gt; resourceVolumeList(resource, node, offset, limit)

lists all volumes of a resources

Lists all volumes for a resource-definition.  A single volume can be queried by adding its volume number to the resource string like:  /v1/resource-definitions/rsc1/resources/nodeA/volumes/0 

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String resource = "resource_example"; // String | resource to use
String node = "node_example"; // String | node to use
Integer offset = 56; // Integer | number of records to skip for pagination
Integer limit = 56; // Integer | maximum number of records to return
try {
    List<Volume> result = apiInstance.resourceVolumeList(resource, node, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#resourceVolumeList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | **String**| resource to use |
 **node** | **String**| node to use |
 **offset** | **Integer**| number of records to skip for pagination | [optional] [enum: ]
 **limit** | **Integer**| maximum number of records to return | [optional] [enum: ]

### Return type

[**List&lt;Volume&gt;**](Volume.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="satelliteConfig"></a>
# **satelliteConfig**
> SatelliteConfig satelliteConfig(node)

show satellite config

Show Satellite config 

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String node = "node_example"; // String | node to use
try {
    SatelliteConfig result = apiInstance.satelliteConfig(node);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#satelliteConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **node** | **String**| node to use |

### Return type

[**SatelliteConfig**](SatelliteConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="snapshotShipping"></a>
# **snapshotShipping**
> ApiCallRcList snapshotShipping(resource, body)

ship a snapshot

Transfers the resource from one node to another based on snapshot-shipping

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String resource = "resource_example"; // String | resource to use
SnapshotShipping body = new SnapshotShipping(); // SnapshotShipping | 
try {
    ApiCallRcList result = apiInstance.snapshotShipping(resource, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#snapshotShipping");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | **String**| resource to use |
 **body** | [**SnapshotShipping**](SnapshotShipping.md)|  | [optional]

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stltSetConfig"></a>
# **stltSetConfig**
> ApiCallRcList stltSetConfig(node, body)

modify satellite config

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String node = "node_example"; // String | node to use
SatelliteConfig body = new SatelliteConfig(); // SatelliteConfig | 
try {
    ApiCallRcList result = apiInstance.stltSetConfig(node, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#stltSetConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **node** | **String**| node to use |
 **body** | [**SatelliteConfig**](SatelliteConfig.md)|  | [optional]

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="storPoolDfnModify"></a>
# **storPoolDfnModify**
> ApiCallRcList storPoolDfnModify(storagepool, body)

modify a storage pool definition

Sets or modifies properties  Possible properties are: - &#x60;MaxOversubscriptionRatio&#x60; - range[&#x60;1-1000&#x60;] 

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String storagepool = "storagepool_example"; // String | Storage pool to use
StoragePoolDefinitionModify body = new StoragePoolDefinitionModify(); // StoragePoolDefinitionModify | 
try {
    ApiCallRcList result = apiInstance.storPoolDfnModify(storagepool, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#storPoolDfnModify");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storagepool** | **String**| Storage pool to use |
 **body** | [**StoragePoolDefinitionModify**](StoragePoolDefinitionModify.md)|  | [optional]

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="storagePoolDefinitionDelete"></a>
# **storagePoolDefinitionDelete**
> ApiCallRcList storagePoolDefinitionDelete(storagepool)

delete a storage pool definition

Delete a storage pool definition from Linstor

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String storagepool = "storagepool_example"; // String | Storage pool to use
try {
    ApiCallRcList result = apiInstance.storagePoolDefinitionDelete(storagepool);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#storagePoolDefinitionDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storagepool** | **String**| Storage pool to use |

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="storagePoolDfnAdd"></a>
# **storagePoolDfnAdd**
> ApiCallRcList storagePoolDfnAdd(body)

add a storage pool definition to Linstor

Adds a storage pool definition to Linstor 

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
StoragePoolDefinition body = new StoragePoolDefinition(); // StoragePoolDefinition | Storage pool definition to add
try {
    ApiCallRcList result = apiInstance.storagePoolDfnAdd(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#storagePoolDfnAdd");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StoragePoolDefinition**](StoragePoolDefinition.md)| Storage pool definition to add | [optional]

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="storagePoolDfnGet"></a>
# **storagePoolDfnGet**
> StoragePoolDefinition storagePoolDfnGet(storagepool)

Lists a specific storage pool definition

Returns a specific storage pool definition

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String storagepool = "storagepool_example"; // String | Storage pool to use
try {
    StoragePoolDefinition result = apiInstance.storagePoolDfnGet(storagepool);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#storagePoolDfnGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storagepool** | **String**| Storage pool to use |

### Return type

[**StoragePoolDefinition**](StoragePoolDefinition.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="storagePoolDfnList"></a>
# **storagePoolDfnList**
> List&lt;StoragePoolDefinition&gt; storagePoolDfnList(offset, limit)

Lists storage pool definitions

Returns an array of all storage pool definitions

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
Integer offset = 56; // Integer | number of records to skip for pagination
Integer limit = 56; // Integer | maximum number of records to return
try {
    List<StoragePoolDefinition> result = apiInstance.storagePoolDfnList(offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#storagePoolDfnList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**| number of records to skip for pagination | [optional] [enum: ]
 **limit** | **Integer**| maximum number of records to return | [optional] [enum: ]

### Return type

[**List&lt;StoragePoolDefinition&gt;**](StoragePoolDefinition.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1EventsDrbdPromotionGet"></a>
# **v1EventsDrbdPromotionGet**
> InlineResponse200 v1EventsDrbdPromotionGet()

drbd promotion event changes

Notifies clients about changes in may_promote of resources

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
try {
    InlineResponse200 result = apiInstance.v1EventsDrbdPromotionGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#v1EventsDrbdPromotionGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/event-stream

<a name="viewPhysicaStorage"></a>
# **viewPhysicaStorage**
> List&lt;PhysicalStorage&gt; viewPhysicaStorage(offset, limit)

show physical storage on nodes, to be used with LINSTOR

Gives a grouped list of physical storage that can be turned into a LINSTOR storage-pool

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
Integer offset = 56; // Integer | number of records to skip for pagination
Integer limit = 56; // Integer | maximum number of records to return
try {
    List<PhysicalStorage> result = apiInstance.viewPhysicaStorage(offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#viewPhysicaStorage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**| number of records to skip for pagination | [optional] [enum: ]
 **limit** | **Integer**| maximum number of records to return | [optional] [enum: ]

### Return type

[**List&lt;PhysicalStorage&gt;**](PhysicalStorage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="viewResources"></a>
# **viewResources**
> List&lt;ResourceWithVolumes&gt; viewResources(nodes, resources, storagePools, props, offset, limit)

query all resources with their volumes

This REST-resource should be used if you want to get an overview of all resources with their volumes.

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
List<String> nodes = Arrays.asList("nodes_example"); // List<String> | Filter only for the specified nodes, if not specified, no filtering.
List<String> resources = Arrays.asList("resources_example"); // List<String> | Filter only for the specified resources, if not specified, no filtering.
List<String> storagePools = Arrays.asList("storagePools_example"); // List<String> | Filter only for the specified storage pools, if not specified no filtering.
List<String> props = Arrays.asList("props_example"); // List<String> | filter by given properties, full property path
Integer offset = 56; // Integer | number of records to skip for pagination
Integer limit = 56; // Integer | maximum number of records to return
try {
    List<ResourceWithVolumes> result = apiInstance.viewResources(nodes, resources, storagePools, props, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#viewResources");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodes** | [**List&lt;String&gt;**](String.md)| Filter only for the specified nodes, if not specified, no filtering. | [optional]
 **resources** | [**List&lt;String&gt;**](String.md)| Filter only for the specified resources, if not specified, no filtering. | [optional]
 **storagePools** | [**List&lt;String&gt;**](String.md)| Filter only for the specified storage pools, if not specified no filtering. | [optional]
 **props** | [**List&lt;String&gt;**](String.md)| filter by given properties, full property path | [optional]
 **offset** | **Integer**| number of records to skip for pagination | [optional] [enum: ]
 **limit** | **Integer**| maximum number of records to return | [optional] [enum: ]

### Return type

[**List&lt;ResourceWithVolumes&gt;**](ResourceWithVolumes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="viewSnapshotShippings"></a>
# **viewSnapshotShippings**
> List&lt;SnapshotShippingStatus&gt; viewSnapshotShippings(nodes, resources, snapshots, status, offset, limit)

view current snapshot shippings

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
List<String> nodes = Arrays.asList("nodes_example"); // List<String> | Filter only for the specified nodes, if not specified, no filtering.
List<String> resources = Arrays.asList("resources_example"); // List<String> | Filter only for the specified resources, if not specified, no filtering.
List<String> snapshots = Arrays.asList("snapshots_example"); // List<String> | Filter only for the specified snapshots, if not specified, no filtering.
List<String> status = Arrays.asList("status_example"); // List<String> | Filter only for the specified status, if not specified, no filtering.
Integer offset = 56; // Integer | number of records to skip for pagination
Integer limit = 56; // Integer | maximum number of records to return
try {
    List<SnapshotShippingStatus> result = apiInstance.viewSnapshotShippings(nodes, resources, snapshots, status, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#viewSnapshotShippings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodes** | [**List&lt;String&gt;**](String.md)| Filter only for the specified nodes, if not specified, no filtering. | [optional]
 **resources** | [**List&lt;String&gt;**](String.md)| Filter only for the specified resources, if not specified, no filtering. | [optional]
 **snapshots** | [**List&lt;String&gt;**](String.md)| Filter only for the specified snapshots, if not specified, no filtering. | [optional]
 **status** | [**List&lt;String&gt;**](String.md)| Filter only for the specified status, if not specified, no filtering. | [optional] [enum: running, complete]
 **offset** | **Integer**| number of records to skip for pagination | [optional] [enum: ]
 **limit** | **Integer**| maximum number of records to return | [optional] [enum: ]

### Return type

[**List&lt;SnapshotShippingStatus&gt;**](SnapshotShippingStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="viewSnapshots"></a>
# **viewSnapshots**
> List&lt;Snapshot&gt; viewSnapshots(nodes, resources, offset, limit)

query all snapshots known to linstor

This REST-resource should be used if you want to get an overview of all snapshots.

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
List<String> nodes = Arrays.asList("nodes_example"); // List<String> | Filter only for the specified nodes, if not specified, no filtering.
List<String> resources = Arrays.asList("resources_example"); // List<String> | Filter only for the specified resources, if not specified, no filtering.
Integer offset = 56; // Integer | number of records to skip for pagination
Integer limit = 56; // Integer | maximum number of records to return
try {
    List<Snapshot> result = apiInstance.viewSnapshots(nodes, resources, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#viewSnapshots");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodes** | [**List&lt;String&gt;**](String.md)| Filter only for the specified nodes, if not specified, no filtering. | [optional]
 **resources** | [**List&lt;String&gt;**](String.md)| Filter only for the specified resources, if not specified, no filtering. | [optional]
 **offset** | **Integer**| number of records to skip for pagination | [optional] [enum: ]
 **limit** | **Integer**| maximum number of records to return | [optional] [enum: ]

### Return type

[**List&lt;Snapshot&gt;**](Snapshot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="viewStoragePools"></a>
# **viewStoragePools**
> List&lt;StoragePool&gt; viewStoragePools(nodes, storagePools, props, offset, limit)

query all storage pools

This REST-resource should be used if you want to get an overview of all storage pools.

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
List<String> nodes = Arrays.asList("nodes_example"); // List<String> | Filter only for the specified nodes, if not specified, no filtering.
List<String> storagePools = Arrays.asList("storagePools_example"); // List<String> | Filter only for the specified storage pools, if not specified no filtering.
List<String> props = Arrays.asList("props_example"); // List<String> | filter by given properties, full property path
Integer offset = 56; // Integer | number of records to skip for pagination
Integer limit = 56; // Integer | maximum number of records to return
try {
    List<StoragePool> result = apiInstance.viewStoragePools(nodes, storagePools, props, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#viewStoragePools");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodes** | [**List&lt;String&gt;**](String.md)| Filter only for the specified nodes, if not specified, no filtering. | [optional]
 **storagePools** | [**List&lt;String&gt;**](String.md)| Filter only for the specified storage pools, if not specified no filtering. | [optional]
 **props** | [**List&lt;String&gt;**](String.md)| filter by given properties, full property path | [optional]
 **offset** | **Integer**| number of records to skip for pagination | [optional] [enum: ]
 **limit** | **Integer**| maximum number of records to return | [optional] [enum: ]

### Return type

[**List&lt;StoragePool&gt;**](StoragePool.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="volumeDefinitionCreate"></a>
# **volumeDefinitionCreate**
> ApiCallRcList volumeDefinitionCreate(resource, body)

add a volume-definition to a resource

Adds a volume-definition.  Required properties is only &#x60;size&#x60;, all other will be auto generated if not given. 

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String resource = "resource_example"; // String | resource to use
VolumeDefinitionCreate body = new VolumeDefinitionCreate(); // VolumeDefinitionCreate | 
try {
    ApiCallRcList result = apiInstance.volumeDefinitionCreate(resource, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#volumeDefinitionCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | **String**| resource to use |
 **body** | [**VolumeDefinitionCreate**](VolumeDefinitionCreate.md)|  | [optional]

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="volumeDefinitionDelete"></a>
# **volumeDefinitionDelete**
> ApiCallRcList volumeDefinitionDelete(resource, volumeNumber)

delete a volume-definition

Delete a volume-definition

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String resource = "resource_example"; // String | resource to use
Integer volumeNumber = 56; // Integer | Volume number of the definition
try {
    ApiCallRcList result = apiInstance.volumeDefinitionDelete(resource, volumeNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#volumeDefinitionDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | **String**| resource to use |
 **volumeNumber** | **Integer**| Volume number of the definition |

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="volumeDefinitionList"></a>
# **volumeDefinitionList**
> List&lt;VolumeDefinition&gt; volumeDefinitionList(resource, offset, limit)

lists all volume-definitions

Lists all volume definitions.  A single volume definition can be queried by adding its name to the resource string like:  /v1/resource-definitions/rsc1/volume-definitions/0 

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String resource = "resource_example"; // String | resource to use
Integer offset = 56; // Integer | number of records to skip for pagination
Integer limit = 56; // Integer | maximum number of records to return
try {
    List<VolumeDefinition> result = apiInstance.volumeDefinitionList(resource, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#volumeDefinitionList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | **String**| resource to use |
 **offset** | **Integer**| number of records to skip for pagination | [optional] [enum: ]
 **limit** | **Integer**| maximum number of records to return | [optional] [enum: ]

### Return type

[**List&lt;VolumeDefinition&gt;**](VolumeDefinition.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="volumeDefinitionModify"></a>
# **volumeDefinitionModify**
> ApiCallRcList volumeDefinitionModify(resource, volumeNumber, body)

modify a volume-definition

Sets or modifies properties  Possible properties are: - &#x60;StorPoolName&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Linstor storage pool name to use.  - &#x60;StorPoolNameDrbdMeta&#x60; - regex[&#x60;^|.internal|[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Linstor storage pool name to use for external metadata.  - &#x60;OverrideVlmId&#x60; - regex[&#x60;.*&#x60;]      Overwrites the generated &#x27;&lt;resource-name&gt;_&lt;5 digit volume number&gt;&#x27; volume name for migration purposes  - &#x60;FileSystem/Type&#x60; - enum      File system type to use      * ext4     * xfs  - &#x60;FileSystem/MkfsParams&#x60; - string      Additional parameters for the mkfs command  - &#x60;StorDriver/LvcreateType&#x60; - enum     * linear     * striped     * mirror     * raid0     * raid1     * raid4     * raid5     * raid6     * raid10     * lzma     * lz4  - &#x60;StorDriver/LvcreateOptions&#x60; - regex[&#x60;.*&#x60;]      Additional parameters added to every &#x27;lvcreate ... &#x27; command  - &#x60;StorDriver/ZfscreateOptions&#x60; - regex[&#x60;.*&#x60;]      Additional parameters added to every &#x27;zfs create ... &#x27; command  - &#x60;DrbdCurrentGi&#x60; - regex[&#x60;[a-fA-F0-9]{16}&#x60;]      Initial DRBD generation id, if initial sync is skipped, this ID will be set  - &#x60;sys/fs/blkio_throttle_read&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.read_bps_device  - &#x60;sys/fs/blkio_throttle_write&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.write_bps_device  - &#x60;sys/fs/blkio_throttle_read_iops&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.read_iops_device  - &#x60;sys/fs/blkio_throttle_write_iops&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.write_iops_device  - &#x60;Writecache/PoolName&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Linstor storage pool name for writecache  - &#x60;Writecache/Size&#x60; - regex[&#x60;^100%|[0-9]{1,2}([.][0-9]*)?%|[1-9][0-9]{2,}$&#x60;]      Size of the writecache in % (0-100) or KiB otherwise  - &#x60;Writecache/Options/StartSector&#x60; - long      offset from the start of cache device in 512-byte sectors  - &#x60;Writecache/Options/HighWatermark&#x60; - long      start writeback when the number of used blocks reach this watermark  - &#x60;Writecache/Options/LowWatermark&#x60; - long      stop writeback when the number of used blocks drops below this watermark  - &#x60;Writecache/Options/WritebackJobs&#x60; - long      limit the number of blocks that are in flight during writeback. Setting this value reduces writeback throughput, but it may improve latency of read requests  - &#x60;Writecache/Options/AutocommitBlocks&#x60; - long      when the application writes this amount of blocks without issuing the FLUSH request, the blocks are automatically commited  - &#x60;Writecache/Options/AutocommitTime&#x60; - long      autocommit time in milliseconds. The data is automatically commited if this time passes and no FLUSH request is received  - &#x60;Writecache/Options/Fua&#x60; - enum      \&quot;On\&quot; results in \&quot;fua\&quot; as argument, whereas the value \&quot;Off\&quot; results in \&quot;nofua\&quot; argument      * On     * Off  - &#x60;Writecache/Options/Additional&#x60; - string      Additional arguments passed through  - &#x60;Cache/OpMode&#x60; - enum      Operation mode      * writeback     * writethrough     * passthrough  - &#x60;Cache/MetaPool&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Name of the storage pool used for the cache metadata. If not specified, this will default to the CachePool property  - &#x60;Cache/Metasize&#x60; - regex[&#x60;^100%|[0-9]{1,2}([.][0-9]*)?%|[1-9][0-9]{2,}$&#x60;]      Size of the cache in % (0-100) or KiB otherwise.  - &#x60;Cache/CachePool&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Name of the storage pool used for the cache cache device  - &#x60;Cache/Cachesize&#x60; - regex[&#x60;^100%|[0-9]{1,2}([.][0-9]*)?%|[1-9][0-9]{2,}$&#x60;]      Size of the cache in % (0-100) or KiB otherwise.  - &#x60;Cache/Blocksize&#x60; - long      Block size  - &#x60;Cache/Policy&#x60; - enum      Replacemant policy      * mq     * smq     * cleaner  - &#x60;DrbdOptions/Disk/on-io-error&#x60; - enum     * pass_on     * call-local-io-error     * detach  - &#x60;DrbdOptions/Disk/disk-barrier&#x60; - boolean - &#x60;DrbdOptions/Disk/disk-flushes&#x60; - boolean - &#x60;DrbdOptions/Disk/disk-drain&#x60; - boolean - &#x60;DrbdOptions/Disk/md-flushes&#x60; - boolean - &#x60;DrbdOptions/Disk/resync-after&#x60; - string - &#x60;DrbdOptions/Disk/al-extents&#x60; - range[&#x60;67-65534&#x60;] - &#x60;DrbdOptions/Disk/al-updates&#x60; - boolean - &#x60;DrbdOptions/Disk/discard-zeroes-if-aligned&#x60; - boolean - &#x60;DrbdOptions/Disk/disable-write-same&#x60; - boolean - &#x60;DrbdOptions/Disk/disk-timeout&#x60; - range[&#x60;0-6000&#x60;] - &#x60;DrbdOptions/Disk/read-balancing&#x60; - enum     * prefer-local     * prefer-remote     * round-robin     * least-pending     * when-congested-remote     * 32K-striping     * 64K-striping     * 128K-striping     * 256K-striping     * 512K-striping     * 1M-striping  - &#x60;DrbdOptions/Disk/rs-discard-granularity&#x60; - range[&#x60;0-1048576&#x60;] 

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String resource = "resource_example"; // String | resource to use
Integer volumeNumber = 56; // Integer | Volume number of the definition
VolumeDefinitionModify body = new VolumeDefinitionModify(); // VolumeDefinitionModify | 
try {
    ApiCallRcList result = apiInstance.volumeDefinitionModify(resource, volumeNumber, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#volumeDefinitionModify");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | **String**| resource to use |
 **volumeNumber** | **Integer**| Volume number of the definition |
 **body** | [**VolumeDefinitionModify**](VolumeDefinitionModify.md)|  | [optional]

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="volumeGroupCreate"></a>
# **volumeGroupCreate**
> ApiCallRcList volumeGroupCreate(resourceGroup, body)

add a volume-group to a resource-group

Adds a volume-group. 

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String resourceGroup = "resourceGroup_example"; // String | resource group to use
VolumeGroup body = new VolumeGroup(); // VolumeGroup | 
try {
    ApiCallRcList result = apiInstance.volumeGroupCreate(resourceGroup, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#volumeGroupCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourceGroup** | **String**| resource group to use |
 **body** | [**VolumeGroup**](VolumeGroup.md)|  | [optional]

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="volumeGroupDelete"></a>
# **volumeGroupDelete**
> ApiCallRcList volumeGroupDelete(resourceGroup, volumeNumber)

delete a volume-group

Delete a volume-group

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String resourceGroup = "resourceGroup_example"; // String | resource group to use
Integer volumeNumber = 56; // Integer | Volume number of the definition
try {
    ApiCallRcList result = apiInstance.volumeGroupDelete(resourceGroup, volumeNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#volumeGroupDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourceGroup** | **String**| resource group to use |
 **volumeNumber** | **Integer**| Volume number of the definition |

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="volumeGroupList"></a>
# **volumeGroupList**
> List&lt;VolumeGroup&gt; volumeGroupList(resourceGroup, offset, limit)

lists all volume-groups

Lists all volume groups.  A single volume group can be queried by adding its name to the resource string like:  /v1/resource-groups/rscgrp1/volume-groups/0 

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String resourceGroup = "resourceGroup_example"; // String | resource group to use
Integer offset = 56; // Integer | number of records to skip for pagination
Integer limit = 56; // Integer | maximum number of records to return
try {
    List<VolumeGroup> result = apiInstance.volumeGroupList(resourceGroup, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#volumeGroupList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourceGroup** | **String**| resource group to use |
 **offset** | **Integer**| number of records to skip for pagination | [optional] [enum: ]
 **limit** | **Integer**| maximum number of records to return | [optional] [enum: ]

### Return type

[**List&lt;VolumeGroup&gt;**](VolumeGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="volumeGroupModify"></a>
# **volumeGroupModify**
> ApiCallRcList volumeGroupModify(resourceGroup, volumeNumber, body)

modify a volume-group

Sets or modifies properties  Possible properties are: - &#x60;StorPoolName&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Linstor storage pool name to use.  - &#x60;OverrideVlmId&#x60; - regex[&#x60;.*&#x60;]      Overwrites the generated &#x27;&lt;resource-name&gt;_&lt;5 digit volume number&gt;&#x27; volume name for migration purposes  - &#x60;AllowLargerVolumeSize&#x60; - boolean_true_false      Do not fail when the underlying volume is larger than expected  - &#x60;FileSystem/Type&#x60; - enum      File system type to use      * ext4     * xfs  - &#x60;FileSystem/MkfsParams&#x60; - string      Additional parameters for the mkfs command  - &#x60;StorDriver/LvcreateType&#x60; - enum     * linear     * striped     * mirror     * raid0     * raid1     * raid4     * raid5     * raid6     * raid10     * lzma     * lz4  - &#x60;DrbdCurrentGi&#x60; - regex[&#x60;[a-fA-F0-9]{16}&#x60;] - &#x60;DrbdOptions/Disk/read-balancing&#x60; - enum     * prefer-local     * prefer-remote     * round-robin     * least-pending     * when-congested-remote     * 32K-striping     * 64K-striping     * 128K-striping     * 256K-striping     * 512K-striping     * 1M-striping  - &#x60;DrbdOptions/Disk/on-io-error&#x60; - enum     * pass_on     * call-local-io-error     * detach  - &#x60;DrbdOptions/Disk/disk-drain&#x60; - boolean - &#x60;DrbdOptions/Disk/resync-after&#x60; - string - &#x60;DrbdOptions/Disk/disk-timeout&#x60; - range[&#x60;0-6000&#x60;] - &#x60;DrbdOptions/Disk/disable-write-same&#x60; - boolean - &#x60;DrbdOptions/Disk/rs-discard-granularity&#x60; - range[&#x60;0-1048576&#x60;] - &#x60;DrbdOptions/Disk/disk-flushes&#x60; - boolean - &#x60;DrbdOptions/Disk/al-extents&#x60; - range[&#x60;67-65534&#x60;] - &#x60;DrbdOptions/Disk/al-updates&#x60; - boolean - &#x60;DrbdOptions/Disk/md-flushes&#x60; - boolean - &#x60;DrbdOptions/Disk/disk-barrier&#x60; - boolean - &#x60;DrbdOptions/Disk/discard-zeroes-if-aligned&#x60; - boolean 

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String resourceGroup = "resourceGroup_example"; // String | resource group to use
Integer volumeNumber = 56; // Integer | Volume number of the definition
VolumeGroupModify body = new VolumeGroupModify(); // VolumeGroupModify | 
try {
    ApiCallRcList result = apiInstance.volumeGroupModify(resourceGroup, volumeNumber, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#volumeGroupModify");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourceGroup** | **String**| resource group to use |
 **volumeNumber** | **Integer**| Volume number of the definition |
 **body** | [**VolumeGroupModify**](VolumeGroupModify.md)|  | [optional]

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="volumeModify"></a>
# **volumeModify**
> ApiCallRcList volumeModify(resource, node, volumeNumber, body)

modify a volume

Sets or modifies properties  Possible properties are: - &#x60;sys/fs/blkio_throttle_read&#x60; - number - &#x60;sys/fs/blkio_throttle_write&#x60; - number 

### Example
```java
// Import classes:
//import com.linbit.linstor.api.ApiException;
//import com.linbit.linstor.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String resource = "resource_example"; // String | resource to use
String node = "node_example"; // String | node to use
Integer volumeNumber = 56; // Integer | Volume number of the definition
VolumeModify body = new VolumeModify(); // VolumeModify | 
try {
    ApiCallRcList result = apiInstance.volumeModify(resource, node, volumeNumber, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#volumeModify");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | **String**| resource to use |
 **node** | **String**| node to use |
 **volumeNumber** | **Integer**| Volume number of the definition |
 **body** | [**VolumeModify**](VolumeModify.md)|  | [optional]

### Return type

[**ApiCallRcList**](ApiCallRcList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

