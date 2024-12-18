package com.linbit.linstor.api;

import com.linbit.linstor.api.ApiException;
import com.linbit.linstor.api.ApiClient;
import com.linbit.linstor.api.Configuration;
import com.linbit.linstor.api.Pair;

import javax.ws.rs.core.GenericType;

import com.linbit.linstor.api.model.ApiCallRc;
import com.linbit.linstor.api.model.ApiCallRcList;
import com.linbit.linstor.api.model.AutoPlaceRequest;
import com.linbit.linstor.api.model.AutoSelectFilter;
import com.linbit.linstor.api.model.BackupAbort;
import com.linbit.linstor.api.model.BackupCreate;
import com.linbit.linstor.api.model.BackupInfo;
import com.linbit.linstor.api.model.BackupInfoRequest;
import com.linbit.linstor.api.model.BackupList;
import com.linbit.linstor.api.model.BackupQueues;
import com.linbit.linstor.api.model.BackupRestore;
import com.linbit.linstor.api.model.BackupSchedule;
import com.linbit.linstor.api.model.BackupShip;
import com.linbit.linstor.api.model.ControllerConfig;
import com.linbit.linstor.api.model.ControllerPropsModify;
import com.linbit.linstor.api.model.ControllerVersion;
import com.linbit.linstor.api.model.CreateMultiSnapshotRequest;
import com.linbit.linstor.api.model.DatabaseBackupRequest;
import com.linbit.linstor.api.model.DrbdProxyEnable;
import com.linbit.linstor.api.model.DrbdProxyModify;
import com.linbit.linstor.api.model.EbsRemote;
import com.linbit.linstor.api.model.ErrorReport;
import com.linbit.linstor.api.model.ErrorReportDelete;
import com.linbit.linstor.api.model.ErrorReportStats;
import com.linbit.linstor.api.model.ExosConnectionMap;
import com.linbit.linstor.api.model.ExosDefaults;
import com.linbit.linstor.api.model.ExosDefaultsModify;
import com.linbit.linstor.api.model.ExosEnclosure;
import com.linbit.linstor.api.model.ExosEnclosureEvent;
import com.linbit.linstor.api.model.ExosEnclosureHealth;
import com.linbit.linstor.api.model.ExtFileCheckResult;
import com.linbit.linstor.api.model.ExternalFile;
import java.io.File;
import com.linbit.linstor.api.model.InlineResponse200;
import com.linbit.linstor.api.model.InlineResponse2001;
import com.linbit.linstor.api.model.KeyValueStore;
import com.linbit.linstor.api.model.KeyValueStoreModify;
import com.linbit.linstor.api.model.LinstorRemote;
import com.linbit.linstor.api.model.MaxVolumeSizes;
import com.linbit.linstor.api.model.NetInterface;
import com.linbit.linstor.api.model.Node;
import com.linbit.linstor.api.model.NodeConnection;
import com.linbit.linstor.api.model.NodeConnectionModify;
import com.linbit.linstor.api.model.NodeCreateEbs;
import com.linbit.linstor.api.model.NodeModify;
import com.linbit.linstor.api.model.NodeStats;
import com.linbit.linstor.api.model.PassPhraseCreate;
import com.linbit.linstor.api.model.PhysicalStorage;
import com.linbit.linstor.api.model.PhysicalStorageCreate;
import com.linbit.linstor.api.model.PhysicalStorageNode;
import com.linbit.linstor.api.model.Properties;
import com.linbit.linstor.api.model.PropsInfo;
import com.linbit.linstor.api.model.QueryAllSizeInfoRequest;
import com.linbit.linstor.api.model.QueryAllSizeInfoResponse;
import com.linbit.linstor.api.model.QuerySizeInfoRequest;
import com.linbit.linstor.api.model.QuerySizeInfoResponse;
import com.linbit.linstor.api.model.RemoteList;
import com.linbit.linstor.api.model.Resource;
import com.linbit.linstor.api.model.ResourceConnection;
import com.linbit.linstor.api.model.ResourceConnectionModify;
import com.linbit.linstor.api.model.ResourceCreate;
import com.linbit.linstor.api.model.ResourceDefinition;
import com.linbit.linstor.api.model.ResourceDefinitionCloneRequest;
import com.linbit.linstor.api.model.ResourceDefinitionCloneStarted;
import com.linbit.linstor.api.model.ResourceDefinitionCloneStatus;
import com.linbit.linstor.api.model.ResourceDefinitionCreate;
import com.linbit.linstor.api.model.ResourceDefinitionModify;
import com.linbit.linstor.api.model.ResourceDefinitionStats;
import com.linbit.linstor.api.model.ResourceDefinitionSyncStatus;
import com.linbit.linstor.api.model.ResourceGroup;
import com.linbit.linstor.api.model.ResourceGroupAdjust;
import com.linbit.linstor.api.model.ResourceGroupModify;
import com.linbit.linstor.api.model.ResourceGroupSpawn;
import com.linbit.linstor.api.model.ResourceGroupStats;
import com.linbit.linstor.api.model.ResourceMakeAvailable;
import com.linbit.linstor.api.model.ResourceModify;
import com.linbit.linstor.api.model.ResourceStats;
import com.linbit.linstor.api.model.ResourceWithVolumes;
import com.linbit.linstor.api.model.S3Remote;
import com.linbit.linstor.api.model.SatelliteConfig;
import com.linbit.linstor.api.model.Schedule;
import com.linbit.linstor.api.model.ScheduleDetailsList;
import com.linbit.linstor.api.model.ScheduleList;
import com.linbit.linstor.api.model.ScheduleModify;
import com.linbit.linstor.api.model.ScheduledRscsList;
import com.linbit.linstor.api.model.Snapshot;
import com.linbit.linstor.api.model.SnapshotRestore;
import com.linbit.linstor.api.model.SnapshotShipping;
import com.linbit.linstor.api.model.SnapshotShippingStatus;
import com.linbit.linstor.api.model.StoragePool;
import com.linbit.linstor.api.model.StoragePoolDefinition;
import com.linbit.linstor.api.model.StoragePoolDefinitionModify;
import com.linbit.linstor.api.model.StoragePoolStats;
import com.linbit.linstor.api.model.ToggleDiskDiskful;
import com.linbit.linstor.api.model.Volume;
import com.linbit.linstor.api.model.VolumeDefinition;
import com.linbit.linstor.api.model.VolumeDefinitionCreate;
import com.linbit.linstor.api.model.VolumeDefinitionModify;
import com.linbit.linstor.api.model.VolumeDefinitionModifyPassphrase;
import com.linbit.linstor.api.model.VolumeGroup;
import com.linbit.linstor.api.model.VolumeGroupModify;
import com.linbit.linstor.api.model.VolumeModify;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-18T06:34:31.141535853Z[Etc/UTC]")
public class DevelopersApi {
  private ApiClient apiClient;
  private Map<String, String> headers;

  public DevelopersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DevelopersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public void setHeadersOverrides(Map<String, String> headers) {
    this.headers = headers;
  }

  /**
   * activates the resource
   * Activates the given resource if possible
   * @param resource resource to use (required)
   * @param node node to use (required)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList activateRsc(String resource, String node) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling activateRsc");
    }
    // verify the required parameter 'node' is set
    if (node == null) {
      throw new ApiException(400, "Missing the required parameter 'node' when calling activateRsc");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/resources/{node}/activate"
      .replaceAll("\\{" + "resource" + "\\}", apiClient.escapeString(resource.toString()))
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

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * create a database backup
   * create a h2 database backup. Currently only H2(embedded) db is working.
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList controllerBackupDB(DatabaseBackupRequest body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/v1/controller/backup/db";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * show controller config
   * Show Controller config 
   * @return ControllerConfig
   * @throws ApiException if fails to make API call
   */
  public ControllerConfig controllerConfig() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/v1/controller/config";

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

    GenericType<ControllerConfig> localVarReturnType = new GenericType<ControllerConfig>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Deletes a controller property
   * Delete a controller property
   * @param key Controller property key to delete (required)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList controllerPropertyDelete(String key) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling controllerPropertyDelete");
    }
    // create path and map variables
    String localVarPath = "/v1/controller/properties/{key}"
      .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key.toString()));

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

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * lists all controller properties
   * Lists all controller properties. 
   * @return Properties
   * @throws ApiException if fails to make API call
   */
  public Properties controllerPropertyList() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/v1/controller/properties";

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

    GenericType<Properties> localVarReturnType = new GenericType<Properties>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * sets or modifies controller properties
   * Sets or modifies properties  Possible properties are: - &#x60;TcpPortAutoRange&#x60; - regex[&#x60;[0-9]+-[0-9]+&#x60;]      Range for auto-allocation of resource TCP ports  - &#x60;MinorNrAutoRange&#x60; - regex[&#x60;[0-9]+-[0-9]+&#x60;]      Range for auto-allocation of volume minor numbers  - &#x60;PeerSlotsNewResource&#x60; - range[&#x60;1-31&#x60;]      DRBD peer slots to allocate for newly created resources (default 7), the number of peer slots cannot be changed once the resource is created, so allow sufficient slots to increase redundancy in the future  - &#x60;StorDriver/DMStats&#x60; - boolean_true_false      Enable dmstats on lvm create  - &#x60;REST/disable-http-metrics&#x60; - boolean_true_false      Disable Prometheus /metrics on HTTP, if HTTPS is enabled  - &#x60;DrbdOptions/AutoEvictAfterTime&#x60; - long      Time a node can be offline before it is declared EVICTED in minutes  - &#x60;DrbdOptions/AutoEvictMaxDisconnectedNodes&#x60; - range[&#x60;0-100&#x60;]      Percentage(0-100) of nodes that can disconnect at the same time without the controller stopping the max_offline_time timer  - &#x60;DrbdOptions/AutoEvictMinReplicaCount&#x60; - long      The minimum amount of replicas that should be present for a resource at all times.  - &#x60;DrbdOptions/AutoEvictAllowEviction&#x60; - boolean_true_false      If set to true on a node, it cannot be evicted anymore  - &#x60;NVMe/TRType&#x60; - enum      NVMe transportion type      * rdma     * tcp  - &#x60;NVMe/Port&#x60; - range[&#x60;1-65535&#x60;]      NVMe port  - &#x60;NVMe/PrefNic&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Preferred network interface to use  - &#x60;StorDriver/WaitTimeoutAfterCreate&#x60; - regex[&#x60;[0-9]+&#x60;] - &#x60;sys/fs/blkio_throttle_read&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.read_bps_device  - &#x60;sys/fs/blkio_throttle_write&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.write_bps_device  - &#x60;sys/fs/blkio_throttle_read_iops&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.read_iops_device  - &#x60;sys/fs/blkio_throttle_write_iops&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.write_iops_device  - &#x60;SearchDomain&#x60; - string      Search domain node names, if no FQDN is given.  - &#x60;ExtCmdWaitTimeout&#x60; - long      Wait timeout for an external command in milliseconds  - &#x60;DrbdOptions/auto-quorum&#x60; - enum      Enables automatic setting of the &#x27;quroum&#x27; and &#x27;on-no-quroum&#x27; property      * io-error     * suspend-io     * disabled  - &#x60;DrbdOptions/auto-add-quorum-tiebreaker&#x60; - boolean_true_false      Enables automatic management (creation and deletion) of tie breaking resource  - &#x60;DrbdOptions/auto-diskful&#x60; - long      Makes a resource diskful if it was continously diskless primary for X minutes  - &#x60;DrbdOptions/auto-diskful-allow-cleanup&#x60; - boolean_true_false      Allows this resource to be cleaned up after toggle-disk + resync is finished  - &#x60;Writecache/PoolName&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Linstor storage pool name for writecache  - &#x60;Writecache/Size&#x60; - regex[&#x60;^100%|[0-9]{1,2}([.][0-9]*)?%|[1-9][0-9]{2,}$&#x60;]      Size of the writecache in % (0-100) or KiB otherwise  - &#x60;Writecache/Options/StartSector&#x60; - long      offset from the start of cache device in 512-byte sectors  - &#x60;Writecache/Options/HighWatermark&#x60; - long      start writeback when the number of used blocks reach this watermark  - &#x60;Writecache/Options/LowWatermark&#x60; - long      stop writeback when the number of used blocks drops below this watermark  - &#x60;Writecache/Options/WritebackJobs&#x60; - long      limit the number of blocks that are in flight during writeback. Setting this value reduces writeback throughput, but it may improve latency of read requests  - &#x60;Writecache/Options/AutocommitBlocks&#x60; - long      when the application writes this amount of blocks without issuing the FLUSH request, the blocks are automatically commited  - &#x60;Writecache/Options/AutocommitTime&#x60; - long      autocommit time in milliseconds. The data is automatically commited if this time passes and no FLUSH request is received  - &#x60;Writecache/Options/Fua&#x60; - enum      \&quot;On\&quot; results in \&quot;fua\&quot; as argument, whereas the value \&quot;Off\&quot; results in \&quot;nofua\&quot; argument      * On     * Off  - &#x60;Writecache/Options/Additional&#x60; - string      Additional arguments passed through  - &#x60;Cache/OpMode&#x60; - enum      Operation mode      * writeback     * writethrough     * passthrough  - &#x60;Cache/MetaPool&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Name of the storage pool used for the cache metadata. If not specified, this will default to the CachePool property  - &#x60;Cache/Metasize&#x60; - regex[&#x60;^100%|[0-9]{1,2}([.][0-9]*)?%|[1-9][0-9]{2,}$&#x60;]      Size of the cache in % (0-100) or KiB otherwise.  - &#x60;Cache/CachePool&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Name of the storage pool used for the cache cache device  - &#x60;Cache/Cachesize&#x60; - regex[&#x60;^100%|[0-9]{1,2}([.][0-9]*)?%|[1-9][0-9]{2,}$&#x60;]      Size of the cache in % (0-100) or KiB otherwise.  - &#x60;Cache/Blocksize&#x60; - long      Block size  - &#x60;Cache/Policy&#x60; - enum      Replacemant policy      * mq     * smq     * cleaner  - &#x60;StorDriver/LvcreateOptions&#x60; - regex[&#x60;.*&#x60;]      Additional parameters added to every &#x27;lvcreate ... &#x27; command  - &#x60;StorDriver/ZfscreateOptions&#x60; - regex[&#x60;.*&#x60;]      Additional parameters added to every &#x27;zfs create ... &#x27; command  - &#x60;StorDriver/Openflex/ApiHost&#x60; - regex[&#x60;.+&#x60;]      Openflex API host name  - &#x60;StorDriver/Openflex/ApiPort&#x60; - regex[&#x60;[0-9]+&#x60;]      Openflex API port  - &#x60;StorDriver/Openflex/UserName&#x60; - regex[&#x60;.+&#x60;]      Openflex user name  - &#x60;StorDriver/Openflex/UserPassword&#x60; - regex[&#x60;.+&#x60;]      Openflex password  - &#x60;StorDriver/Openflex/JobWaitDelay&#x60; - regex[&#x60;[0-9]+&#x60;]      Delay in milliseconds linstor waits between fetching the job status  - &#x60;StorDriver/Openflex/JobWaitMaxCount&#x60; - regex[&#x60;[0-9]+&#x60;]      Maximum retries with wait delay until openflex fails  - &#x60;Autoplacer/Weights/MaxFreeSpace&#x60; - regex[&#x60;^[0-9]+([.][0-9]+)?&#x60;]      Weight of &#x27;MaxFreeSpace&#x27; autoplacer-strategy  - &#x60;Autoplacer/Weights/MinReservedSpace&#x60; - regex[&#x60;^[0-9]+([.][0-9]+)?&#x60;]      Weight of &#x27;MinReservedSpace&#x27; autoplacer-strategy  - &#x60;Autoplacer/Weights/MinRscCount&#x60; - regex[&#x60;^[0-9]+([.][0-9]+)?&#x60;]      Weight of &#x27;MinRscCount&#x27; autoplacer-strategy  - &#x60;Autoplacer/Weights/MaxThroughput&#x60; - regex[&#x60;^[0-9]+([.][0-9]+)?&#x60;]      Weight of &#x27;MaxThroughput&#x27; autoplacer-strategy  - &#x60;Autoplacer/PreSelectScript&#x60; - string      Filename of the preselection script. File must be in /etc/linstor/selector/  - &#x60;Autoplacer/PreSelectScriptTimeout&#x60; - long      Timeout in ms Linstor waits for the script to run.  - &#x60;Autoplacer/MaxThroughput&#x60; - long      The maximum throughput the given storage pool is capable of.  - &#x60;DrbdProxy/AutoEnable&#x60; - boolean_true_false - &#x60;Site&#x60; - string - &#x60;UpdateCacheInterval&#x60; - long      Interval for space cache background updates in seconds  - &#x60;SnapshotShipping/TcpPortRange&#x60; - regex[&#x60;[0-9]+-[0-9]+&#x60;]      Range for allocation of snapshot shipping TCP ports  - &#x60;DrbdOptions/Disk/on-io-error&#x60; - enum     * pass_on     * call-local-io-error     * detach  - &#x60;DrbdOptions/Disk/disk-barrier&#x60; - boolean - &#x60;DrbdOptions/Disk/disk-flushes&#x60; - boolean - &#x60;DrbdOptions/Disk/disk-drain&#x60; - boolean - &#x60;DrbdOptions/Disk/md-flushes&#x60; - boolean - &#x60;DrbdOptions/Disk/resync-after&#x60; - string - &#x60;DrbdOptions/Disk/al-extents&#x60; - range[&#x60;67-65534&#x60;] - &#x60;DrbdOptions/Disk/al-updates&#x60; - boolean - &#x60;DrbdOptions/Disk/discard-zeroes-if-aligned&#x60; - boolean - &#x60;DrbdOptions/Disk/disable-write-same&#x60; - boolean - &#x60;DrbdOptions/Disk/disk-timeout&#x60; - range[&#x60;0-6000&#x60;] - &#x60;DrbdOptions/Disk/read-balancing&#x60; - enum     * prefer-local     * prefer-remote     * round-robin     * least-pending     * when-congested-remote     * 32K-striping     * 64K-striping     * 128K-striping     * 256K-striping     * 512K-striping     * 1M-striping  - &#x60;DrbdOptions/Disk/rs-discard-granularity&#x60; - range[&#x60;0-1048576&#x60;] - &#x60;DrbdOptions/PeerDevice/resync-rate&#x60; - range[&#x60;1-8388608&#x60;] - &#x60;DrbdOptions/PeerDevice/c-plan-ahead&#x60; - range[&#x60;0-300&#x60;] - &#x60;DrbdOptions/PeerDevice/c-delay-target&#x60; - range[&#x60;1-100&#x60;] - &#x60;DrbdOptions/PeerDevice/c-fill-target&#x60; - range[&#x60;0-1048576&#x60;] - &#x60;DrbdOptions/PeerDevice/c-max-rate&#x60; - range[&#x60;250-4194304&#x60;] - &#x60;DrbdOptions/PeerDevice/c-min-rate&#x60; - range[&#x60;0-4194304&#x60;] - &#x60;DrbdOptions/PeerDevice/bitmap&#x60; - boolean - &#x60;DrbdOptions/Resource/cpu-mask&#x60; - string - &#x60;DrbdOptions/Resource/on-no-data-accessible&#x60; - enum     * io-error     * suspend-io  - &#x60;DrbdOptions/Resource/auto-promote&#x60; - boolean - &#x60;DrbdOptions/Resource/peer-ack-window&#x60; - range[&#x60;2048-204800&#x60;] - &#x60;DrbdOptions/Resource/peer-ack-delay&#x60; - range[&#x60;1-10000&#x60;] - &#x60;DrbdOptions/Resource/twopc-timeout&#x60; - range[&#x60;50-600&#x60;] - &#x60;DrbdOptions/Resource/twopc-retry-timeout&#x60; - range[&#x60;1-50&#x60;] - &#x60;DrbdOptions/Resource/auto-promote-timeout&#x60; - range[&#x60;0-600&#x60;] - &#x60;DrbdOptions/Resource/max-io-depth&#x60; - range[&#x60;4-4294967295&#x60;] - &#x60;DrbdOptions/Resource/quorum&#x60; - enum [&#x60;1-32&#x60;]     * off     * majority     * all  - &#x60;DrbdOptions/Resource/on-no-quorum&#x60; - enum     * io-error     * suspend-io  - &#x60;DrbdOptions/Resource/quorum-minimum-redundancy&#x60; - enum [&#x60;1-32&#x60;]     * off     * majority     * all  - &#x60;DrbdOptions/Net/transport&#x60; - string - &#x60;DrbdOptions/Net/protocol&#x60; - enum     * A     * B     * C  - &#x60;DrbdOptions/Net/timeout&#x60; - range[&#x60;1-600&#x60;] - &#x60;DrbdOptions/Net/max-epoch-size&#x60; - range[&#x60;1-20000&#x60;] - &#x60;DrbdOptions/Net/connect-int&#x60; - range[&#x60;1-120&#x60;] - &#x60;DrbdOptions/Net/ping-int&#x60; - range[&#x60;1-120&#x60;] - &#x60;DrbdOptions/Net/sndbuf-size&#x60; - range[&#x60;0-10485760&#x60;] - &#x60;DrbdOptions/Net/rcvbuf-size&#x60; - range[&#x60;0-10485760&#x60;] - &#x60;DrbdOptions/Net/ko-count&#x60; - range[&#x60;0-200&#x60;] - &#x60;DrbdOptions/Net/allow-two-primaries&#x60; - boolean - &#x60;DrbdOptions/Net/cram-hmac-alg&#x60; - string - &#x60;DrbdOptions/Net/shared-secret&#x60; - string - &#x60;DrbdOptions/Net/after-sb-0pri&#x60; - enum     * disconnect     * discard-younger-primary     * discard-older-primary     * discard-zero-changes     * discard-least-changes     * discard-local     * discard-remote  - &#x60;DrbdOptions/Net/after-sb-1pri&#x60; - enum     * disconnect     * consensus     * discard-secondary     * call-pri-lost-after-sb     * violently-as0p  - &#x60;DrbdOptions/Net/after-sb-2pri&#x60; - enum     * disconnect     * call-pri-lost-after-sb     * violently-as0p  - &#x60;DrbdOptions/Net/always-asbp&#x60; - boolean - &#x60;DrbdOptions/Net/rr-conflict&#x60; - enum     * disconnect     * call-pri-lost     * violently     * retry-connect  - &#x60;DrbdOptions/Net/ping-timeout&#x60; - range[&#x60;1-300&#x60;] - &#x60;DrbdOptions/Net/data-integrity-alg&#x60; - string - &#x60;DrbdOptions/Net/tcp-cork&#x60; - boolean - &#x60;DrbdOptions/Net/on-congestion&#x60; - enum     * block     * pull-ahead     * disconnect  - &#x60;DrbdOptions/Net/congestion-fill&#x60; - range[&#x60;0-20971520&#x60;] - &#x60;DrbdOptions/Net/congestion-extents&#x60; - range[&#x60;67-65534&#x60;] - &#x60;DrbdOptions/Net/csums-alg&#x60; - string - &#x60;DrbdOptions/Net/csums-after-crash-only&#x60; - boolean - &#x60;DrbdOptions/Net/verify-alg&#x60; - string - &#x60;DrbdOptions/Net/use-rle&#x60; - boolean - &#x60;DrbdOptions/Net/socket-check-timeout&#x60; - range[&#x60;0-300&#x60;] - &#x60;DrbdOptions/Net/fencing&#x60; - enum     * dont-care     * resource-only     * resource-and-stonith  - &#x60;DrbdOptions/Net/max-buffers&#x60; - range[&#x60;32-131072&#x60;] - &#x60;DrbdOptions/Net/allow-remote-read&#x60; - boolean - &#x60;DrbdOptions/Handlers/after-resync-target&#x60; - string - &#x60;DrbdOptions/Handlers/before-resync-target&#x60; - string - &#x60;DrbdOptions/Handlers/before-resync-source&#x60; - string - &#x60;DrbdOptions/Handlers/out-of-sync&#x60; - string - &#x60;DrbdOptions/Handlers/quorum-lost&#x60; - string - &#x60;DrbdOptions/Handlers/fence-peer&#x60; - string - &#x60;DrbdOptions/Handlers/unfence-peer&#x60; - string - &#x60;DrbdOptions/Handlers/initial-split-brain&#x60; - string - &#x60;DrbdOptions/Handlers/local-io-error&#x60; - string - &#x60;DrbdOptions/Handlers/pri-lost&#x60; - string - &#x60;DrbdOptions/Handlers/pri-lost-after-sb&#x60; - string - &#x60;DrbdOptions/Handlers/pri-on-incon-degr&#x60; - string - &#x60;DrbdOptions/Handlers/split-brain&#x60; - string 
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList controllerPropertyModify(ControllerPropsModify body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/v1/controller/properties";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * show controller version info
   * Show Controller version info 
   * @return ControllerVersion
   * @throws ApiException if fails to make API call
   */
  public ControllerVersion controllerVersion() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/v1/controller/version";

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

    GenericType<ControllerVersion> localVarReturnType = new GenericType<ControllerVersion>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * creates an LVM, LVM-thin or ZFS pool, optional VDO under it
   * Creates a LVM/LVM-thin, ZFS pool on the given device and if supported VDO(optional) under it. logcal_size_kib parameter is only needed if LVM-thin or vdo is used. Also note VDO can only used with LVM-fat. 
   * @param node node to use (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList createDevicePool(String node, PhysicalStorageCreate body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'node' is set
    if (node == null) {
      throw new ApiException(400, "Missing the required parameter 'node' when calling createDevicePool");
    }
    // create path and map variables
    String localVarPath = "/v1/physical-storage/{node}"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * creates one snapshot for multiple resources each
   * Suspends IO for all given resources before taking the snapshots on all participating nodes before resuming IO again. 
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList createMultiSnapshot(CreateMultiSnapshotRequest body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/v1/actions/snapshot/multi";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * creates a SOS report in the log directory of the controller
   * 
   * @param nodes nodes to use (optional)
   * @param rscs use nodes where any given rsc is deployed (optional)
   * @param exclude do not use the given nodes (optional)
   * @param includeCtrl include logs from ctrl (optional)
   * @param since Unix epoch milliseconds (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList createSOSReport(List<String> nodes, List<String> rscs, List<String> exclude, Boolean includeCtrl, Long since) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/v1/sos-report";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "nodes", nodes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "rscs", rscs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "exclude", exclude));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include-ctrl", includeCtrl));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "since", since));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * modify controller config
   * 
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList ctrlSetConfig(ControllerConfig body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/v1/controller/config";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * deactivates the resource
   * Deactivates the given resource if possible
   * @param resource resource to use (required)
   * @param node node to use (required)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList deactivateRsc(String resource, String node) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling deactivateRsc");
    }
    // verify the required parameter 'node' is set
    if (node == null) {
      throw new ApiException(400, "Missing the required parameter 'node' when calling deactivateRsc");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/resources/{node}/deactivate"
      .replaceAll("\\{" + "resource" + "\\}", apiClient.escapeString(resource.toString()))
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

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * request sos report to download
   * 
   * @param nodes nodes to use (optional)
   * @param rscs use nodes where any given rsc is deployed (optional)
   * @param exclude do not use the given nodes (optional)
   * @param includeCtrl include logs from ctrl (optional)
   * @param since Unix epoch milliseconds (optional)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File downloadSOSReport(List<String> nodes, List<String> rscs, List<String> exclude, Boolean includeCtrl, Long since) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/v1/sos-report/download";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "nodes", nodes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "rscs", rscs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "exclude", exclude));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include-ctrl", includeCtrl));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "since", since));


    final String[] localVarAccepts = {
      "application/octet-stream", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<File> localVarReturnType = new GenericType<File>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * create a encryption passphrase
   * 
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList encryptionPassphraseCreate(PassPhraseCreate body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/v1/encryption/passphrase";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * enter the encryption passphrase
   * 
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList encryptionPassphraseEnter(String body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/v1/encryption/passphrase";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * modifies the encryption passphrase
   * 
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList encryptionPassphraseModify(PassPhraseCreate body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/v1/encryption/passphrase";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Deletes a range of error-reports
   * Deletes a range of error-reports
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList errorReportDelete(ErrorReportDelete body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/v1/error-reports";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Deletes a single error-report
   * Deletes a single error-report
   * @param reportid Error id to select (required)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList errorReportDeleteSingle(String reportid) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'reportid' is set
    if (reportid == null) {
      throw new ApiException(400, "Missing the required parameter 'reportid' when calling errorReportDeleteSingle");
    }
    // create path and map variables
    String localVarPath = "/v1/error-reports/{reportid}"
      .replaceAll("\\{" + "reportid" + "\\}", apiClient.escapeString(reportid.toString()));

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

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * list all error reports
   * List all error reports
   * @param node Only show error reports of this node (optional)
   * @param since Unix epoch milliseconds (optional)
   * @param to Unix timestamp to the ending interval (optional)
   * @param withContent Include error report text in response. (optional, default to false)
   * @param offset number of records to skip for pagination (optional)
   * @param limit maximum number of records to return (optional)
   * @return List&lt;ErrorReport&gt;
   * @throws ApiException if fails to make API call
   */
  public List<ErrorReport> errorReportList(String node, Long since, Long to, Boolean withContent, Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/v1/error-reports";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "node", node));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "since", since));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "withContent", withContent));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<ErrorReport>> localVarReturnType = new GenericType<List<ErrorReport>>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * query the specified reportid
   * Query the specified reportid
   * @param reportid Error id to select (required)
   * @param node Only show error reports of this node (optional)
   * @param since Unix epoch milliseconds (optional)
   * @param to Unix timestamp to the ending interval (optional)
   * @param withContent Include error report text in response. (optional, default to true)
   * @param offset number of records to skip for pagination (optional)
   * @param limit maximum number of records to return (optional)
   * @return List&lt;ErrorReport&gt;
   * @throws ApiException if fails to make API call
   */
  public List<ErrorReport> errorReportShow(String reportid, String node, Long since, Long to, Boolean withContent, Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'reportid' is set
    if (reportid == null) {
      throw new ApiException(400, "Missing the required parameter 'reportid' when calling errorReportShow");
    }
    // create path and map variables
    String localVarPath = "/v1/error-reports/{reportid}"
      .replaceAll("\\{" + "reportid" + "\\}", apiClient.escapeString(reportid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "node", node));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "since", since));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "withContent", withContent));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<ErrorReport>> localVarReturnType = new GenericType<List<ErrorReport>>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Return stats of all error-reports.
   * Returns a error report stats object. 
   * @return ErrorReportStats
   * @throws ApiException if fails to make API call
   */
  public ErrorReportStats errorReportStats() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/v1/stats/error-reports";

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

    GenericType<ErrorReportStats> localVarReturnType = new GenericType<ErrorReportStats>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * creates a new enclosure
   * Creates a new enclosure unless it already exists
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public ApiCallRcList exosCreate(ExosEnclosure body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/v1/vendor/seagate/exos/enclosures";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * modifies an existing enclosure
   * Deletes an existing enclosure
   * @param enclosure Name of the enclosure (required)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public ApiCallRcList exosDelete(String enclosure) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'enclosure' is set
    if (enclosure == null) {
      throw new ApiException(400, "Missing the required parameter 'enclosure' when calling exosDelete");
    }
    // create path and map variables
    String localVarPath = "/v1/vendor/seagate/exos/enclosures/{enclosure}"
      .replaceAll("\\{" + "enclosure" + "\\}", apiClient.escapeString(enclosure.toString()));

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

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Returns the last EXOS events
   * Lists the most current X events
   * @param enclosure Name of the enclosure (required)
   * @param count Number of events to fetch (optional)
   * @return List&lt;ExosEnclosureEvent&gt;
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public List<ExosEnclosureEvent> exosDescribe(String enclosure, Integer count) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'enclosure' is set
    if (enclosure == null) {
      throw new ApiException(400, "Missing the required parameter 'enclosure' when calling exosDescribe");
    }
    // create path and map variables
    String localVarPath = "/v1/vendor/seagate/exos/{enclosure}/events"
      .replaceAll("\\{" + "enclosure" + "\\}", apiClient.escapeString(enclosure.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<ExosEnclosureEvent>> localVarReturnType = new GenericType<List<ExosEnclosureEvent>>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Lists all EXOS Ports connected to each Linstor Node
   * Lists the connection-mesh of EXOS Ports to Linstor Nodes
   * @return List&lt;ExosConnectionMap&gt;
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public List<ExosConnectionMap> exosMap() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/v1/vendor/seagate/exos/map";

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

    GenericType<List<ExosConnectionMap>> localVarReturnType = new GenericType<List<ExosConnectionMap>>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * modifies an existing enclosure
   * Modifies an existing enclosure
   * @param enclosure Name of the enclosure (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public ApiCallRcList exosModify(String enclosure, ExosEnclosure body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'enclosure' is set
    if (enclosure == null) {
      throw new ApiException(400, "Missing the required parameter 'enclosure' when calling exosModify");
    }
    // create path and map variables
    String localVarPath = "/v1/vendor/seagate/exos/enclosures/{enclosure}"
      .replaceAll("\\{" + "enclosure" + "\\}", apiClient.escapeString(enclosure.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * modify default settings of EXOS configurations
   * Sets or modifies default username / password for EXOS enclosures 
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public ApiCallRcList exosModifyDefault(ExosDefaultsModify body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/v1/vendor/seagate/exos/defaults";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * show physical storage on a single node
   * Gives a complete list of physical storage that can be turned into a LINSTOR storage-pool. 
   * @param node node to use (required)
   * @return List&lt;PhysicalStorageNode&gt;
   * @throws ApiException if fails to make API call
   */
  public List<PhysicalStorageNode> getPhysicalStorage(String node) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'node' is set
    if (node == null) {
      throw new ApiException(400, "Missing the required parameter 'node' when calling getPhysicalStorage");
    }
    // create path and map variables
    String localVarPath = "/v1/physical-storage/{node}"
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

    GenericType<List<PhysicalStorageNode>> localVarReturnType = new GenericType<List<PhysicalStorageNode>>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * delete a key value store
   * Delete a key value store
   * @param instance name of the key value store (required)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList keyValueStoreDelete(String instance) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'instance' is set
    if (instance == null) {
      throw new ApiException(400, "Missing the required parameter 'instance' when calling keyValueStoreDelete");
    }
    // create path and map variables
    String localVarPath = "/v1/key-value-store/{instance}"
      .replaceAll("\\{" + "instance" + "\\}", apiClient.escapeString(instance.toString()));

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

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * list all key value stores
   * List all known key value store instances
   * @param instance name of the key value store (required)
   * @return List&lt;KeyValueStore&gt;
   * @throws ApiException if fails to make API call
   */
  public List<KeyValueStore> keyValueStoreList(String instance) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'instance' is set
    if (instance == null) {
      throw new ApiException(400, "Missing the required parameter 'instance' when calling keyValueStoreList");
    }
    // create path and map variables
    String localVarPath = "/v1/key-value-store/{instance}"
      .replaceAll("\\{" + "instance" + "\\}", apiClient.escapeString(instance.toString()));

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

    GenericType<List<KeyValueStore>> localVarReturnType = new GenericType<List<KeyValueStore>>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * modify a key value store
   * Modify a key value store
   * @param instance name of the key value store (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList keyValueStoreModify(String instance, KeyValueStoreModify body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'instance' is set
    if (instance == null) {
      throw new ApiException(400, "Missing the required parameter 'instance' when calling keyValueStoreModify");
    }
    // create path and map variables
    String localVarPath = "/v1/key-value-store/{instance}"
      .replaceAll("\\{" + "instance" + "\\}", apiClient.escapeString(instance.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * list all key value stores
   * List all known key value store instances
   * @return List&lt;KeyValueStore&gt;
   * @throws ApiException if fails to make API call
   */
  public List<KeyValueStore> keyValueStoresList() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/v1/key-value-store";

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

    GenericType<List<KeyValueStore>> localVarReturnType = new GenericType<List<KeyValueStore>>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * create a netinterface on a node
   * Create a netinterface on a node  If satellite_port and satellite_encryption_type are given the netinterface can also work as connection to the controller 
   * @param node node to use (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList netinterfaceCreate(String node, NetInterface body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'node' is set
    if (node == null) {
      throw new ApiException(400, "Missing the required parameter 'node' when calling netinterfaceCreate");
    }
    // create path and map variables
    String localVarPath = "/v1/nodes/{node}/net-interfaces"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * delete a netinterface from a node
   * Delete a netinterface from a node
   * @param node node to use (required)
   * @param netinterface netinterface name to use (required)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList netinterfaceDelete(String node, String netinterface) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'node' is set
    if (node == null) {
      throw new ApiException(400, "Missing the required parameter 'node' when calling netinterfaceDelete");
    }
    // verify the required parameter 'netinterface' is set
    if (netinterface == null) {
      throw new ApiException(400, "Missing the required parameter 'netinterface' when calling netinterfaceDelete");
    }
    // create path and map variables
    String localVarPath = "/v1/nodes/{node}/net-interfaces/{netinterface}"
      .replaceAll("\\{" + "node" + "\\}", apiClient.escapeString(node.toString()))
      .replaceAll("\\{" + "netinterface" + "\\}", apiClient.escapeString(netinterface.toString()));

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

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * return the list of net-interfaces
   * Returns the list of netinterfaces for this node
   * @param node node to use (required)
   * @param offset number of records to skip for pagination (optional)
   * @param limit maximum number of records to return (optional)
   * @return List&lt;NetInterface&gt;
   * @throws ApiException if fails to make API call
   */
  public List<NetInterface> netinterfaceList(String node, Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'node' is set
    if (node == null) {
      throw new ApiException(400, "Missing the required parameter 'node' when calling netinterfaceList");
    }
    // create path and map variables
    String localVarPath = "/v1/nodes/{node}/net-interfaces"
      .replaceAll("\\{" + "node" + "\\}", apiClient.escapeString(node.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<NetInterface>> localVarReturnType = new GenericType<List<NetInterface>>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * modify a netinterface from a node
   * Modify a netinterface from a node
   * @param node node to use (required)
   * @param netinterface netinterface name to use (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList netinterfaceModified(String node, String netinterface, NetInterface body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'node' is set
    if (node == null) {
      throw new ApiException(400, "Missing the required parameter 'node' when calling netinterfaceModified");
    }
    // verify the required parameter 'netinterface' is set
    if (netinterface == null) {
      throw new ApiException(400, "Missing the required parameter 'netinterface' when calling netinterfaceModified");
    }
    // create path and map variables
    String localVarPath = "/v1/nodes/{node}/net-interfaces/{netinterface}"
      .replaceAll("\\{" + "node" + "\\}", apiClient.escapeString(node.toString()))
      .replaceAll("\\{" + "netinterface" + "\\}", apiClient.escapeString(netinterface.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * add a node to Linstor
   * Adds a node to Linstor  If only one net-interface is specified and it is does not specify a &#x60;satellite_port&#x60; it will apply the default port and &#x60;satellite_encryption_type&#x60; for this net-interface. 
   * @param body Node to add to Linstor (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList nodeAdd(Node body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/v1/nodes";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * add an EBS (special) node to Linstor
   * Adds an EBS node to Linstor
   * @param body Node to add to Linstor (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList nodeAddEbs(NodeCreateEbs body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/v1/nodes/ebs";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * modify a node connection
   * Sets or modifies properties 
   * @param nodeA source node of the connection (required)
   * @param nodeB target node of the connection (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList nodeConnectionModify(String nodeA, String nodeB, NodeConnectionModify body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'nodeA' is set
    if (nodeA == null) {
      throw new ApiException(400, "Missing the required parameter 'nodeA' when calling nodeConnectionModify");
    }
    // verify the required parameter 'nodeB' is set
    if (nodeB == null) {
      throw new ApiException(400, "Missing the required parameter 'nodeB' when calling nodeConnectionModify");
    }
    // create path and map variables
    String localVarPath = "/v1/node-connections/{node_a}/{node_b}"
      .replaceAll("\\{" + "node_a" + "\\}", apiClient.escapeString(nodeA.toString()))
      .replaceAll("\\{" + "node_b" + "\\}", apiClient.escapeString(nodeB.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * list all node connections
   * List all node connections resource
   * @param nodeA Filter only for node-connections from or to the given node (optional)
   * @param nodeB Filter only for node-connections from or to the given node (optional)
   * @return List&lt;NodeConnection&gt;
   * @throws ApiException if fails to make API call
   */
  public List<NodeConnection> nodeConnectionsList(String nodeA, String nodeB) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/v1/node-connections";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "node_a", nodeA));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "node_b", nodeB));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<NodeConnection>> localVarReturnType = new GenericType<List<NodeConnection>>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * delete a node
   * Delete a node from Linstor
   * @param node node to use (required)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList nodeDelete(String node) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'node' is set
    if (node == null) {
      throw new ApiException(400, "Missing the required parameter 'node' when calling nodeDelete");
    }
    // create path and map variables
    String localVarPath = "/v1/nodes/{node}"
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

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * evacuates the node
   * Evacuates DRBD resources from the given node to other available nodes and deletes the evacuated resources once the sync is complete. Additionally sets the Node into EVACUATE state (no new resources allowed) 
   * @param node node to use (required)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList nodeEvacuate(String node) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'node' is set
    if (node == null) {
      throw new ApiException(400, "Missing the required parameter 'node' when calling nodeEvacuate");
    }
    // create path and map variables
    String localVarPath = "/v1/nodes/{node}/evacuate"
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

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Lists nodes registered to the controller
   * Returns an array of all nodes registered to Linstor. 
   * @param nodes Filter only for the specified nodes, if not specified, no filtering. (optional)
   * @param props filter by given properties, full property path (optional)
   * @param offset number of records to skip for pagination (optional)
   * @param limit maximum number of records to return (optional)
   * @return List&lt;Node&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Node> nodeList(List<String> nodes, List<String> props, Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/v1/nodes";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "nodes", nodes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "props", props));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Node>> localVarReturnType = new GenericType<List<Node>>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * delete an unrecoverable node
   * Delete an unrecoverable node
   * @param node node to use (required)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList nodeLost(String node) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'node' is set
    if (node == null) {
      throw new ApiException(400, "Missing the required parameter 'node' when calling nodeLost");
    }
    // create path and map variables
    String localVarPath = "/v1/nodes/{node}/lost"
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

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * modify a node
   * Sets or modifies properties  Possible properties are: - &#x60;PrefNic&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Preferred network interface to use  - &#x60;StorPoolName&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Linstor storage pool name to use.  - &#x60;StorPoolNameDrbdMeta&#x60; - regex[&#x60;^|.internal|[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Linstor storage pool name to use for external metadata.  - &#x60;sys/fs/blkio_throttle_read&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.read_bps_device  - &#x60;sys/fs/blkio_throttle_write&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.write_bps_device  - &#x60;sys/fs/blkio_throttle_read_iops&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.read_iops_device  - &#x60;sys/fs/blkio_throttle_write_iops&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.write_iops_device  - &#x60;DrbdOptions/AutoEvictAfterTime&#x60; - long      Time a node can be offline before it is declared EVICTED in minutes  - &#x60;DrbdOptions/AutoEvictAllowEviction&#x60; - boolean_true_false      If set to true on a node, it cannot be evicted anymore  - &#x60;Writecache/PoolName&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Linstor storage pool name for writecache  - &#x60;Writecache/Size&#x60; - regex[&#x60;^100%|[0-9]{1,2}([.][0-9]*)?%|[1-9][0-9]{2,}$&#x60;]      Size of the writecache in % (0-100) or KiB otherwise  - &#x60;Writecache/Options/StartSector&#x60; - long      offset from the start of cache device in 512-byte sectors  - &#x60;Writecache/Options/HighWatermark&#x60; - long      start writeback when the number of used blocks reach this watermark  - &#x60;Writecache/Options/LowWatermark&#x60; - long      stop writeback when the number of used blocks drops below this watermark  - &#x60;Writecache/Options/WritebackJobs&#x60; - long      limit the number of blocks that are in flight during writeback. Setting this value reduces writeback throughput, but it may improve latency of read requests  - &#x60;Writecache/Options/AutocommitBlocks&#x60; - long      when the application writes this amount of blocks without issuing the FLUSH request, the blocks are automatically commited  - &#x60;Writecache/Options/AutocommitTime&#x60; - long      autocommit time in milliseconds. The data is automatically commited if this time passes and no FLUSH request is received  - &#x60;Writecache/Options/Fua&#x60; - enum      \&quot;On\&quot; results in \&quot;fua\&quot; as argument, whereas the value \&quot;Off\&quot; results in \&quot;nofua\&quot; argument      * On     * Off  - &#x60;Writecache/Options/Additional&#x60; - string      Additional arguments passed through  - &#x60;Cache/OpMode&#x60; - enum      Operation mode      * writeback     * writethrough     * passthrough  - &#x60;Cache/MetaPool&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Name of the storage pool used for the cache metadata. If not specified, this will default to the CachePool property  - &#x60;Cache/Metasize&#x60; - regex[&#x60;^100%|[0-9]{1,2}([.][0-9]*)?%|[1-9][0-9]{2,}$&#x60;]      Size of the cache in % (0-100) or KiB otherwise.  - &#x60;Cache/CachePool&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Name of the storage pool used for the cache cache device  - &#x60;Cache/Cachesize&#x60; - regex[&#x60;^100%|[0-9]{1,2}([.][0-9]*)?%|[1-9][0-9]{2,}$&#x60;]      Size of the cache in % (0-100) or KiB otherwise.  - &#x60;Cache/Blocksize&#x60; - long      Block size  - &#x60;Cache/Policy&#x60; - enum      Replacemant policy      * mq     * smq     * cleaner  - &#x60;StorDriver/LvcreateOptions&#x60; - regex[&#x60;.*&#x60;]      Additional parameters added to every &#x27;lvcreate ... &#x27; command  - &#x60;StorDriver/ZfscreateOptions&#x60; - regex[&#x60;.*&#x60;]      Additional parameters added to every &#x27;zfs create ... &#x27; command  - &#x60;StorDriver/Openflex/ApiHost&#x60; - regex[&#x60;.+&#x60;]      Openflex API host name  - &#x60;StorDriver/Openflex/ApiPort&#x60; - regex[&#x60;[0-9]+&#x60;]      Openflex API port  - &#x60;StorDriver/Openflex/UserName&#x60; - regex[&#x60;.+&#x60;]      Openflex user name  - &#x60;StorDriver/Openflex/UserPassword&#x60; - regex[&#x60;.+&#x60;]      Openflex password  - &#x60;StorDriver/Openflex/StorDev&#x60; - regex[&#x60;.+&#x60;]      Openflex storage device  - &#x60;StorDriver/Openflex/StorDevHost&#x60; - regex[&#x60;.+&#x60;]      Openflex storage device host  - &#x60;StorDriver/Openflex/JobWaitDelay&#x60; - regex[&#x60;[0-9]+&#x60;]      Delay in milliseconds linstor waits between fetching the job status  - &#x60;StorDriver/Openflex/JobWaitMaxCount&#x60; - regex[&#x60;[0-9]+&#x60;]      Maximum retries with wait delay until openflex fails  - &#x60;Autoplacer/MaxThroughput&#x60; - long      The maximum throughput the given storage pool is capable of.  - &#x60;DrbdProxy/AutoEnable&#x60; - boolean_true_false - &#x60;Site&#x60; - string - &#x60;DrbdOptions/auto-diskful-allow-cleanup&#x60; - boolean_true_false      Allows this resource to be cleaned up after toggle-disk + resync is finished 
   * @param node node to use (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList nodeModify(String node, NodeModify body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'node' is set
    if (node == null) {
      throw new ApiException(400, "Missing the required parameter 'node' when calling nodeModify");
    }
    // create path and map variables
    String localVarPath = "/v1/nodes/{node}"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * reconnect a node to the controller
   * Reconnect a node to the controller
   * @param node node to use (required)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList nodeReconnect(String node) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'node' is set
    if (node == null) {
      throw new ApiException(400, "Missing the required parameter 'node' when calling nodeReconnect");
    }
    // create path and map variables
    String localVarPath = "/v1/nodes/{node}/reconnect"
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

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Return stats of all nodes.
   * Returns a node stats object. 
   * @return NodeStats
   * @throws ApiException if fails to make API call
   */
  public NodeStats nodeStats() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/v1/stats/nodes";

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

    GenericType<NodeStats> localVarReturnType = new GenericType<NodeStats>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * creates a new storage pool on this node
   * Creates a new storage pool on this node.  &#x60;provider_kind&#x60; has to be specified and additional to that the linked &#x60;StorDriver&#x60; property that has the value to the backing pool:    * &#x60;LVM&#x60;: &#x60;StorDriver/LvmVg&#x60;   * &#x60;LVM_THIN&#x60;: &#x60;StorDriver/LvmVg&#x60; and &#x60;StorDriver/ThinPool&#x60;   * &#x60;ZFS&#x60;: &#x60;StorDriver/ZPool&#x60;   * &#x60;ZFS_THIN&#x60;: &#x60;StorDriver/ZPoolThin&#x60;   * &#x60;DISKLESS&#x60;: Does not need a property as it has no backing pool 
   * @param node node to use (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList nodeStoragePoolCreate(String node, StoragePool body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'node' is set
    if (node == null) {
      throw new ApiException(400, "Missing the required parameter 'node' when calling nodeStoragePoolCreate");
    }
    // create path and map variables
    String localVarPath = "/v1/nodes/{node}/storage-pools"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * delete a storage pool
   * Delete a storage pool
   * @param node node to use (required)
   * @param storagepool Storage pool to use (required)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList nodeStoragePoolDelete(String node, String storagepool) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'node' is set
    if (node == null) {
      throw new ApiException(400, "Missing the required parameter 'node' when calling nodeStoragePoolDelete");
    }
    // verify the required parameter 'storagepool' is set
    if (storagepool == null) {
      throw new ApiException(400, "Missing the required parameter 'storagepool' when calling nodeStoragePoolDelete");
    }
    // create path and map variables
    String localVarPath = "/v1/nodes/{node}/storage-pools/{storagepool}"
      .replaceAll("\\{" + "node" + "\\}", apiClient.escapeString(node.toString()))
      .replaceAll("\\{" + "storagepool" + "\\}", apiClient.escapeString(storagepool.toString()));

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

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * lists all storage pools for a node
   * Lists all storage pools of a node
   * @param node node to use (required)
   * @param nodes Filter only for the specified nodes, if not specified, no filtering. (optional)
   * @param storagePools Filter only for the specified storage pools, if not specified no filtering. (optional)
   * @param offset number of records to skip for pagination (optional)
   * @param limit maximum number of records to return (optional)
   * @param cached query data from cache if available (optional)
   * @return List&lt;StoragePool&gt;
   * @throws ApiException if fails to make API call
   */
  public List<StoragePool> nodeStoragePoolList(String node, List<String> nodes, List<String> storagePools, Integer offset, Integer limit, Boolean cached) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'node' is set
    if (node == null) {
      throw new ApiException(400, "Missing the required parameter 'node' when calling nodeStoragePoolList");
    }
    // create path and map variables
    String localVarPath = "/v1/nodes/{node}/storage-pools"
      .replaceAll("\\{" + "node" + "\\}", apiClient.escapeString(node.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "nodes", nodes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "storage_pools", storagePools));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cached", cached));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<StoragePool>> localVarReturnType = new GenericType<List<StoragePool>>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * modify a storage pool
   * Sets or modifies properties  Possible properties are: - &#x60;StorDriver/StorPoolName&#x60; - regex[&#x60;[a-zA-Z0-9_/-]+&#x60;] - &#x60;StorDriver/LvmVg&#x60; - regex[&#x60;[a-zA-Z0-9_-]+&#x60;] - &#x60;StorDriver/ThinPool&#x60; - regex[&#x60;[a-zA-Z0-9_-]+&#x60;] - &#x60;StorDriver/ZPool&#x60; - regex[&#x60;[a-zA-Z0-9_/-]+&#x60;] - &#x60;StorDriver/ZPoolThin&#x60; - regex[&#x60;[a-zA-Z0-9_/-]+&#x60;] - &#x60;StorDriver/FileDir&#x60; - regex[&#x60;.*&#x60;] - &#x60;PrefNic&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Preferred network interface to use  - &#x60;NVMe/PrefNic&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Preferred network interface to use  - &#x60;StorDriver/LvcreateType&#x60; - enum     * linear     * striped     * mirror     * raid0     * raid1     * raid4     * raid5     * raid6     * raid10     * lzma     * lz4  - &#x60;StorDriver/LvcreateOptions&#x60; - regex[&#x60;.*&#x60;]      Additional parameters added to every &#x27;lvcreate ... &#x27; command  - &#x60;StorDriver/ZfscreateOptions&#x60; - regex[&#x60;.*&#x60;]      Additional parameters added to every &#x27;zfs create ... &#x27; command  - &#x60;StorDriver/WaitTimeoutAfterCreate&#x60; - regex[&#x60;[0-9]+&#x60;] - &#x60;sys/fs/blkio_throttle_read&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.read_bps_device  - &#x60;sys/fs/blkio_throttle_write&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.write_bps_device  - &#x60;sys/fs/blkio_throttle_read_iops&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.read_iops_device  - &#x60;sys/fs/blkio_throttle_write_iops&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.write_iops_device  - &#x60;StorDriver/Openflex/ApiHost&#x60; - regex[&#x60;.+&#x60;]      Openflex API host name  - &#x60;StorDriver/Openflex/ApiPort&#x60; - regex[&#x60;[0-9]+&#x60;]      Openflex API port  - &#x60;StorDriver/Openflex/UserName&#x60; - regex[&#x60;.+&#x60;]      Openflex user name  - &#x60;StorDriver/Openflex/UserPassword&#x60; - regex[&#x60;.+&#x60;]      Openflex password  - &#x60;StorDriver/Openflex/StorDev&#x60; - regex[&#x60;.+&#x60;]      Openflex storage device  - &#x60;StorDriver/Openflex/StorDevHost&#x60; - regex[&#x60;.+&#x60;]      Openflex storage device host  - &#x60;StorDriver/Openflex/StorPool&#x60; - regex[&#x60;[0-9]+&#x60;]      Openflex storage pool name  - &#x60;Autoplacer/MaxThroughput&#x60; - long      The maximum throughput the given storage pool is capable of. 
   * @param node node to use (required)
   * @param storagepool Storage pool to use (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList nodeStoragePoolModify(String node, String storagepool, StoragePoolDefinitionModify body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'node' is set
    if (node == null) {
      throw new ApiException(400, "Missing the required parameter 'node' when calling nodeStoragePoolModify");
    }
    // verify the required parameter 'storagepool' is set
    if (storagepool == null) {
      throw new ApiException(400, "Missing the required parameter 'storagepool' when calling nodeStoragePoolModify");
    }
    // create path and map variables
    String localVarPath = "/v1/nodes/{node}/storage-pools/{storagepool}"
      .replaceAll("\\{" + "node" + "\\}", apiClient.escapeString(node.toString()))
      .replaceAll("\\{" + "storagepool" + "\\}", apiClient.escapeString(storagepool.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Queries size information from all available resource groups
   * Unlike /v1/resource-groups/{resource_group}/query-size-info, this API returns the QSI result for all currently available resource groups 
   * @param body  (optional)
   * @return QueryAllSizeInfoResponse
   * @throws ApiException if fails to make API call
   */
  public QueryAllSizeInfoResponse qryAllSizeInfo(QueryAllSizeInfoRequest body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/v1/queries/resource-groups/query-all-size-info";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<QueryAllSizeInfoResponse> localVarReturnType = new GenericType<QueryAllSizeInfoResponse>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * query the maximum volume size
   * Query the maximum possible volume size storage pools
   * @param body  (optional)
   * @return MaxVolumeSizes
   * @throws ApiException if fails to make API call
   */
  public MaxVolumeSizes queryMaxVolumeSize(AutoSelectFilter body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/v1/query-max-volume-size";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<MaxVolumeSizes> localVarReturnType = new GenericType<MaxVolumeSizes>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "OPTIONS", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * query the maximum volume size from a given resource group
   * Query the maximum possible volume size storage pools
   * @param resourceGroup resource group to use (required)
   * @return MaxVolumeSizes
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public MaxVolumeSizes queryMaxVolumeSizeFromRscGrp(String resourceGroup) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'resourceGroup' is set
    if (resourceGroup == null) {
      throw new ApiException(400, "Missing the required parameter 'resourceGroup' when calling queryMaxVolumeSizeFromRscGrp");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-groups/{resource_group}/query-max-volume-size"
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

    GenericType<MaxVolumeSizes> localVarReturnType = new GenericType<MaxVolumeSizes>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * query size information of the current resource group
   * Query size information like maximum volume size for the next spawn command. The result will include the selected storage pools. 
   * @param resourceGroup resource group to use (required)
   * @param body  (optional)
   * @return QuerySizeInfoResponse
   * @throws ApiException if fails to make API call
   */
  public QuerySizeInfoResponse querySizeInfo(String resourceGroup, QuerySizeInfoRequest body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'resourceGroup' is set
    if (resourceGroup == null) {
      throw new ApiException(400, "Missing the required parameter 'resourceGroup' when calling querySizeInfo");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-groups/{resource_group}/query-size-info"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<QuerySizeInfoResponse> localVarReturnType = new GenericType<QuerySizeInfoResponse>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * autoplace resource
   * Auto place the resource on the specified place_count redundency. If place_count isn&#x27;t given 2 is the default. 
   * @param resource resource to use (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList resourceAutoplace(String resource, AutoPlaceRequest body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling resourceAutoplace");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/autoplace"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * show the specified resource connection
   * show the specified resource connection
   * @param resource resource to use (required)
   * @param nodeA source node of the connection (required)
   * @param nodeB target node of the connection (required)
   * @return List&lt;ResourceConnection&gt;
   * @throws ApiException if fails to make API call
   */
  public List<ResourceConnection> resourceConnectionList(String resource, String nodeA, String nodeB) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling resourceConnectionList");
    }
    // verify the required parameter 'nodeA' is set
    if (nodeA == null) {
      throw new ApiException(400, "Missing the required parameter 'nodeA' when calling resourceConnectionList");
    }
    // verify the required parameter 'nodeB' is set
    if (nodeB == null) {
      throw new ApiException(400, "Missing the required parameter 'nodeB' when calling resourceConnectionList");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/resource-connections/{node_a}/{node_b}"
      .replaceAll("\\{" + "resource" + "\\}", apiClient.escapeString(resource.toString()))
      .replaceAll("\\{" + "node_a" + "\\}", apiClient.escapeString(nodeA.toString()))
      .replaceAll("\\{" + "node_b" + "\\}", apiClient.escapeString(nodeB.toString()));

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

    GenericType<List<ResourceConnection>> localVarReturnType = new GenericType<List<ResourceConnection>>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * modify a resource connection
   * Sets or modifies properties  Possible properties are: - &#x60;DrbdOptions/PeerDevice/resync-rate&#x60; - range[&#x60;1-8388608&#x60;] - &#x60;DrbdOptions/PeerDevice/c-plan-ahead&#x60; - range[&#x60;0-300&#x60;] - &#x60;DrbdOptions/PeerDevice/c-delay-target&#x60; - range[&#x60;1-100&#x60;] - &#x60;DrbdOptions/PeerDevice/c-fill-target&#x60; - range[&#x60;0-1048576&#x60;] - &#x60;DrbdOptions/PeerDevice/c-max-rate&#x60; - range[&#x60;250-4194304&#x60;] - &#x60;DrbdOptions/PeerDevice/c-min-rate&#x60; - range[&#x60;0-4194304&#x60;] - &#x60;DrbdOptions/PeerDevice/bitmap&#x60; - boolean - &#x60;DrbdOptions/Net/transport&#x60; - string - &#x60;DrbdOptions/Net/protocol&#x60; - enum     * A     * B     * C  - &#x60;DrbdOptions/Net/timeout&#x60; - range[&#x60;1-600&#x60;] - &#x60;DrbdOptions/Net/max-epoch-size&#x60; - range[&#x60;1-20000&#x60;] - &#x60;DrbdOptions/Net/connect-int&#x60; - range[&#x60;1-120&#x60;] - &#x60;DrbdOptions/Net/ping-int&#x60; - range[&#x60;1-120&#x60;] - &#x60;DrbdOptions/Net/sndbuf-size&#x60; - range[&#x60;0-10485760&#x60;] - &#x60;DrbdOptions/Net/rcvbuf-size&#x60; - range[&#x60;0-10485760&#x60;] - &#x60;DrbdOptions/Net/ko-count&#x60; - range[&#x60;0-200&#x60;] - &#x60;DrbdOptions/Net/allow-two-primaries&#x60; - boolean - &#x60;DrbdOptions/Net/cram-hmac-alg&#x60; - string - &#x60;DrbdOptions/Net/shared-secret&#x60; - string - &#x60;DrbdOptions/Net/after-sb-0pri&#x60; - enum     * disconnect     * discard-younger-primary     * discard-older-primary     * discard-zero-changes     * discard-least-changes     * discard-local     * discard-remote  - &#x60;DrbdOptions/Net/after-sb-1pri&#x60; - enum     * disconnect     * consensus     * discard-secondary     * call-pri-lost-after-sb     * violently-as0p  - &#x60;DrbdOptions/Net/after-sb-2pri&#x60; - enum     * disconnect     * call-pri-lost-after-sb     * violently-as0p  - &#x60;DrbdOptions/Net/always-asbp&#x60; - boolean - &#x60;DrbdOptions/Net/rr-conflict&#x60; - enum     * disconnect     * call-pri-lost     * violently     * retry-connect  - &#x60;DrbdOptions/Net/ping-timeout&#x60; - range[&#x60;1-300&#x60;] - &#x60;DrbdOptions/Net/data-integrity-alg&#x60; - string - &#x60;DrbdOptions/Net/tcp-cork&#x60; - boolean - &#x60;DrbdOptions/Net/on-congestion&#x60; - enum     * block     * pull-ahead     * disconnect  - &#x60;DrbdOptions/Net/congestion-fill&#x60; - range[&#x60;0-20971520&#x60;] - &#x60;DrbdOptions/Net/congestion-extents&#x60; - range[&#x60;67-65534&#x60;] - &#x60;DrbdOptions/Net/csums-alg&#x60; - string - &#x60;DrbdOptions/Net/csums-after-crash-only&#x60; - boolean - &#x60;DrbdOptions/Net/verify-alg&#x60; - string - &#x60;DrbdOptions/Net/use-rle&#x60; - boolean - &#x60;DrbdOptions/Net/socket-check-timeout&#x60; - range[&#x60;0-300&#x60;] - &#x60;DrbdOptions/Net/fencing&#x60; - enum     * dont-care     * resource-only     * resource-and-stonith  - &#x60;DrbdOptions/Net/max-buffers&#x60; - range[&#x60;32-131072&#x60;] - &#x60;DrbdOptions/Net/allow-remote-read&#x60; - boolean 
   * @param resource resource to use (required)
   * @param nodeA source node of the connection (required)
   * @param nodeB target node of the connection (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList resourceConnectionModify(String resource, String nodeA, String nodeB, ResourceConnectionModify body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling resourceConnectionModify");
    }
    // verify the required parameter 'nodeA' is set
    if (nodeA == null) {
      throw new ApiException(400, "Missing the required parameter 'nodeA' when calling resourceConnectionModify");
    }
    // verify the required parameter 'nodeB' is set
    if (nodeB == null) {
      throw new ApiException(400, "Missing the required parameter 'nodeB' when calling resourceConnectionModify");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/resource-connections/{node_a}/{node_b}"
      .replaceAll("\\{" + "resource" + "\\}", apiClient.escapeString(resource.toString()))
      .replaceAll("\\{" + "node_a" + "\\}", apiClient.escapeString(nodeA.toString()))
      .replaceAll("\\{" + "node_b" + "\\}", apiClient.escapeString(nodeB.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * list all resource connections for resource
   * List all resource connections for resource
   * @param resource resource to use (required)
   * @return List&lt;ResourceConnection&gt;
   * @throws ApiException if fails to make API call
   */
  public List<ResourceConnection> resourceConnectionsList(String resource) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling resourceConnectionsList");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/resource-connections"
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

    GenericType<List<ResourceConnection>> localVarReturnType = new GenericType<List<ResourceConnection>>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * create one or more resources.
   * Adds one or more resource(s). 
   * @param resource resource to use (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList resourceCreate(String resource, List<ResourceCreate> body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling resourceCreate");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/resources"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * create a resource on a node
   * Adds a resource on a node.  To use a specific storage pool add the &#x60;StorPoolName&#x60; property and use the storage pool name as value. If the &#x60;StorPoolName&#x60; property is not set, the &#x60;DfltStorPool&#x60; will be used.  To create a diskless resource you have to set the \&quot;DISKLESS\&quot; flag in the flags list. &#x60;&#x60;&#x60; {   \&quot;resource\&quot;: {     \&quot;flags\&quot;: [\&quot;DISKLESS\&quot;]   } } &#x60;&#x60;&#x60; 
   * @param resource resource to use (required)
   * @param node node to use (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList resourceCreateOnNode(String resource, String node, ResourceCreate body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling resourceCreateOnNode");
    }
    // verify the required parameter 'node' is set
    if (node == null) {
      throw new ApiException(400, "Missing the required parameter 'node' when calling resourceCreateOnNode");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/resources/{node}"
      .replaceAll("\\{" + "resource" + "\\}", apiClient.escapeString(resource.toString()))
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * clones a resource definition with all resources
   * Clones the resource definition with all resources and volume with the current data and the best/fastest possible clone method. Clone method depends on storage pool type:   * LVM -&gt; dd   * LVM-thin -&gt; snapshot -&gt; logical volume   * ZFS -&gt; zfs send/recieve 
   * @param resource resource to use (required)
   * @param body  (optional)
   * @return ResourceDefinitionCloneStarted
   * @throws ApiException if fails to make API call
   */
  public ResourceDefinitionCloneStarted resourceDefinitionClone(String resource, ResourceDefinitionCloneRequest body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling resourceDefinitionClone");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/clone"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ResourceDefinitionCloneStarted> localVarReturnType = new GenericType<ResourceDefinitionCloneStarted>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * retrieve status of the current clone process
   * Get info of the current clone status. e.g. if completed. 
   * @param resource resource to use (required)
   * @param resourceClone resource clone name (required)
   * @return ResourceDefinitionCloneStatus
   * @throws ApiException if fails to make API call
   */
  public ResourceDefinitionCloneStatus resourceDefinitionCloneStatus(String resource, String resourceClone) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling resourceDefinitionCloneStatus");
    }
    // verify the required parameter 'resourceClone' is set
    if (resourceClone == null) {
      throw new ApiException(400, "Missing the required parameter 'resourceClone' when calling resourceDefinitionCloneStatus");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/clone/{resourceClone}"
      .replaceAll("\\{" + "resource" + "\\}", apiClient.escapeString(resource.toString()))
      .replaceAll("\\{" + "resourceClone" + "\\}", apiClient.escapeString(resourceClone.toString()));

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

    GenericType<ResourceDefinitionCloneStatus> localVarReturnType = new GenericType<ResourceDefinitionCloneStatus>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * add a resource-definition
   * Adds a resource-definition.  Only required property is the name of the resource definition. All other properties are optional. 
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList resourceDefinitionCreate(ResourceDefinitionCreate body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/v1/resource-definitions";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * delete a resource-definition
   * Delete a resource-definition
   * @param resource resource to use (required)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList resourceDefinitionDelete(String resource) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling resourceDefinitionDelete");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}"
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

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * lists all resource-definitions
   * Lists all resource definitions.  A single resource definition can be queried by adding its name to the resource string like:  /v1/resource-definitions/rsc1 
   * @param resourceDefinitions Filter only for the specified resource definitions, if not specified no filtering. (optional)
   * @param props filter by given properties, full property path (optional)
   * @param offset number of records to skip for pagination (optional)
   * @param limit maximum number of records to return (optional)
   * @return List&lt;ResourceDefinition&gt;
   * @throws ApiException if fails to make API call
   */
  public List<ResourceDefinition> resourceDefinitionList(List<String> resourceDefinitions, List<String> props, Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/v1/resource-definitions";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "resource_definitions", resourceDefinitions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "props", props));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<ResourceDefinition>> localVarReturnType = new GenericType<List<ResourceDefinition>>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * modify a resource-definition
   * Sets or modifies properties  Possible properties are: - &#x60;StorPoolName&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Linstor storage pool name to use.  - &#x60;StorPoolNameDrbdMeta&#x60; - regex[&#x60;^|.internal|[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Linstor storage pool name to use for external metadata.  - &#x60;PeerSlotsNewResource&#x60; - range[&#x60;1-31&#x60;]      DRBD peer slots to allocate for newly created resources (default 7), the number of peer slots cannot be changed once the resource is created, so allow sufficient slots to increase redundancy in the future  - &#x60;DrbdProxy/CompressionType&#x60; - enum     * zlib     * lzma     * lz4     * zstd  - &#x60;DrbdOptions/AutoEvictMinReplicaCount&#x60; - long      The minimum amount of replicas that should be present for a resource at all times.  - &#x60;FileSystem/Type&#x60; - enum      File system type to use      * ext4     * xfs  - &#x60;FileSystem/MkfsParams&#x60; - string      Additional parameters for the mkfs command  - &#x60;NVMe/TRType&#x60; - enum      NVMe transportion type      * rdma     * tcp  - &#x60;NVMe/Port&#x60; - range[&#x60;1-65535&#x60;]      NVMe port  - &#x60;StorDriver/LvcreateType&#x60; - enum     * linear     * striped     * mirror     * raid0     * raid1     * raid4     * raid5     * raid6     * raid10     * lzma     * lz4  - &#x60;StorDriver/LvcreateOptions&#x60; - regex[&#x60;.*&#x60;]      Additional parameters added to every &#x27;lvcreate ... &#x27; command  - &#x60;StorDriver/ZfscreateOptions&#x60; - regex[&#x60;.*&#x60;]      Additional parameters added to every &#x27;zfs create ... &#x27; command  - &#x60;sys/fs/blkio_throttle_read&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.read_bps_device  - &#x60;sys/fs/blkio_throttle_write&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.write_bps_device  - &#x60;sys/fs/blkio_throttle_read_iops&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.read_iops_device  - &#x60;sys/fs/blkio_throttle_write_iops&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.write_iops_device  - &#x60;DrbdOptions/auto-quorum&#x60; - enum      Enables automatic setting of the &#x27;quroum&#x27; and &#x27;on-no-quroum&#x27; property      * io-error     * suspend-io     * disabled  - &#x60;DrbdOptions/auto-add-quorum-tiebreaker&#x60; - boolean_true_false      Enables automatic management (creation and deletion) of tie breaking resource  - &#x60;DrbdOptions/auto-diskful&#x60; - long      Makes a resource diskful if it was continously diskless primary for X minutes  - &#x60;DrbdOptions/auto-diskful-allow-cleanup&#x60; - boolean_true_false      Allows this resource to be cleaned up after toggle-disk + resync is finished  - &#x60;Writecache/PoolName&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Linstor storage pool name for writecache  - &#x60;Writecache/Size&#x60; - regex[&#x60;^100%|[0-9]{1,2}([.][0-9]*)?%|[1-9][0-9]{2,}$&#x60;]      Size of the writecache in % (0-100) or KiB otherwise  - &#x60;Writecache/Options/StartSector&#x60; - long      offset from the start of cache device in 512-byte sectors  - &#x60;Writecache/Options/HighWatermark&#x60; - long      start writeback when the number of used blocks reach this watermark  - &#x60;Writecache/Options/LowWatermark&#x60; - long      stop writeback when the number of used blocks drops below this watermark  - &#x60;Writecache/Options/WritebackJobs&#x60; - long      limit the number of blocks that are in flight during writeback. Setting this value reduces writeback throughput, but it may improve latency of read requests  - &#x60;Writecache/Options/AutocommitBlocks&#x60; - long      when the application writes this amount of blocks without issuing the FLUSH request, the blocks are automatically commited  - &#x60;Writecache/Options/AutocommitTime&#x60; - long      autocommit time in milliseconds. The data is automatically commited if this time passes and no FLUSH request is received  - &#x60;Writecache/Options/Fua&#x60; - enum      \&quot;On\&quot; results in \&quot;fua\&quot; as argument, whereas the value \&quot;Off\&quot; results in \&quot;nofua\&quot; argument      * On     * Off  - &#x60;Writecache/Options/Additional&#x60; - string      Additional arguments passed through  - &#x60;Cache/OpMode&#x60; - enum      Operation mode      * writeback     * writethrough     * passthrough  - &#x60;Cache/MetaPool&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Name of the storage pool used for the cache metadata. If not specified, this will default to the CachePool property  - &#x60;Cache/Metasize&#x60; - regex[&#x60;^100%|[0-9]{1,2}([.][0-9]*)?%|[1-9][0-9]{2,}$&#x60;]      Size of the cache in % (0-100) or KiB otherwise.  - &#x60;Cache/CachePool&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Name of the storage pool used for the cache cache device  - &#x60;Cache/Cachesize&#x60; - regex[&#x60;^100%|[0-9]{1,2}([.][0-9]*)?%|[1-9][0-9]{2,}$&#x60;]      Size of the cache in % (0-100) or KiB otherwise.  - &#x60;Cache/Blocksize&#x60; - long      Block size  - &#x60;Cache/Policy&#x60; - enum      Replacemant policy      * mq     * smq     * cleaner  - &#x60;SnapshotShipping/SourceNode&#x60; - string      Node name of the snapshot shipping source  - &#x60;SnapshotShipping/TargetNode&#x60; - string      Node name of the snapshot shipping target  - &#x60;SnapshotShipping/RunEvery&#x60; - long      Runs every X minutes an auto-snapshot-shipping unless the current snapshot-shipping is still running. In this case a new one will be started asap.  - &#x60;SnapshotShipping/Keep&#x60; - long      Keeps the last X shipped snapshots. Removing this property or having a value &lt;&#x3D; 0 disables auto-cleanup, all auto-snapshots will be kept  - &#x60;AutoSnapshot/RunEvery&#x60; - long      Runs every X minutes an snapshot-creation. Removing this property or having a value &lt;&#x3D; 0 disables auto-snapshotting.  - &#x60;AutoSnapshot/Keep&#x60; - long      Keeps the last X auto-snapshots. Removing this property or having a value &lt;&#x3D; 0 disables auto-cleanup, all auto-snapshots will be kept  - &#x60;AutoSnapshot/NextAutoId&#x60; - long      The next ID to try for auto-snapshots  - &#x60;DrbdOptions/Disk/on-io-error&#x60; - enum     * pass_on     * call-local-io-error     * detach  - &#x60;DrbdOptions/Disk/disk-barrier&#x60; - boolean - &#x60;DrbdOptions/Disk/disk-flushes&#x60; - boolean - &#x60;DrbdOptions/Disk/disk-drain&#x60; - boolean - &#x60;DrbdOptions/Disk/md-flushes&#x60; - boolean - &#x60;DrbdOptions/Disk/resync-after&#x60; - string - &#x60;DrbdOptions/Disk/al-extents&#x60; - range[&#x60;67-65534&#x60;] - &#x60;DrbdOptions/Disk/al-updates&#x60; - boolean - &#x60;DrbdOptions/Disk/discard-zeroes-if-aligned&#x60; - boolean - &#x60;DrbdOptions/Disk/disable-write-same&#x60; - boolean - &#x60;DrbdOptions/Disk/disk-timeout&#x60; - range[&#x60;0-6000&#x60;] - &#x60;DrbdOptions/Disk/read-balancing&#x60; - enum     * prefer-local     * prefer-remote     * round-robin     * least-pending     * when-congested-remote     * 32K-striping     * 64K-striping     * 128K-striping     * 256K-striping     * 512K-striping     * 1M-striping  - &#x60;DrbdOptions/Disk/rs-discard-granularity&#x60; - range[&#x60;0-1048576&#x60;] - &#x60;DrbdOptions/PeerDevice/resync-rate&#x60; - range[&#x60;1-8388608&#x60;] - &#x60;DrbdOptions/PeerDevice/c-plan-ahead&#x60; - range[&#x60;0-300&#x60;] - &#x60;DrbdOptions/PeerDevice/c-delay-target&#x60; - range[&#x60;1-100&#x60;] - &#x60;DrbdOptions/PeerDevice/c-fill-target&#x60; - range[&#x60;0-1048576&#x60;] - &#x60;DrbdOptions/PeerDevice/c-max-rate&#x60; - range[&#x60;250-4194304&#x60;] - &#x60;DrbdOptions/PeerDevice/c-min-rate&#x60; - range[&#x60;0-4194304&#x60;] - &#x60;DrbdOptions/PeerDevice/bitmap&#x60; - boolean - &#x60;DrbdOptions/Resource/cpu-mask&#x60; - string - &#x60;DrbdOptions/Resource/on-no-data-accessible&#x60; - enum     * io-error     * suspend-io  - &#x60;DrbdOptions/Resource/auto-promote&#x60; - boolean - &#x60;DrbdOptions/Resource/peer-ack-window&#x60; - range[&#x60;2048-204800&#x60;] - &#x60;DrbdOptions/Resource/peer-ack-delay&#x60; - range[&#x60;1-10000&#x60;] - &#x60;DrbdOptions/Resource/twopc-timeout&#x60; - range[&#x60;50-600&#x60;] - &#x60;DrbdOptions/Resource/twopc-retry-timeout&#x60; - range[&#x60;1-50&#x60;] - &#x60;DrbdOptions/Resource/auto-promote-timeout&#x60; - range[&#x60;0-600&#x60;] - &#x60;DrbdOptions/Resource/max-io-depth&#x60; - range[&#x60;4-4294967295&#x60;] - &#x60;DrbdOptions/Resource/quorum&#x60; - enum [&#x60;1-32&#x60;]     * off     * majority     * all  - &#x60;DrbdOptions/Resource/on-no-quorum&#x60; - enum     * io-error     * suspend-io  - &#x60;DrbdOptions/Resource/quorum-minimum-redundancy&#x60; - enum [&#x60;1-32&#x60;]     * off     * majority     * all  - &#x60;DrbdOptions/Net/transport&#x60; - string - &#x60;DrbdOptions/Net/protocol&#x60; - enum     * A     * B     * C  - &#x60;DrbdOptions/Net/timeout&#x60; - range[&#x60;1-600&#x60;] - &#x60;DrbdOptions/Net/max-epoch-size&#x60; - range[&#x60;1-20000&#x60;] - &#x60;DrbdOptions/Net/connect-int&#x60; - range[&#x60;1-120&#x60;] - &#x60;DrbdOptions/Net/ping-int&#x60; - range[&#x60;1-120&#x60;] - &#x60;DrbdOptions/Net/sndbuf-size&#x60; - range[&#x60;0-10485760&#x60;] - &#x60;DrbdOptions/Net/rcvbuf-size&#x60; - range[&#x60;0-10485760&#x60;] - &#x60;DrbdOptions/Net/ko-count&#x60; - range[&#x60;0-200&#x60;] - &#x60;DrbdOptions/Net/allow-two-primaries&#x60; - boolean - &#x60;DrbdOptions/Net/cram-hmac-alg&#x60; - string - &#x60;DrbdOptions/Net/shared-secret&#x60; - string - &#x60;DrbdOptions/Net/after-sb-0pri&#x60; - enum     * disconnect     * discard-younger-primary     * discard-older-primary     * discard-zero-changes     * discard-least-changes     * discard-local     * discard-remote  - &#x60;DrbdOptions/Net/after-sb-1pri&#x60; - enum     * disconnect     * consensus     * discard-secondary     * call-pri-lost-after-sb     * violently-as0p  - &#x60;DrbdOptions/Net/after-sb-2pri&#x60; - enum     * disconnect     * call-pri-lost-after-sb     * violently-as0p  - &#x60;DrbdOptions/Net/always-asbp&#x60; - boolean - &#x60;DrbdOptions/Net/rr-conflict&#x60; - enum     * disconnect     * call-pri-lost     * violently     * retry-connect  - &#x60;DrbdOptions/Net/ping-timeout&#x60; - range[&#x60;1-300&#x60;] - &#x60;DrbdOptions/Net/data-integrity-alg&#x60; - string - &#x60;DrbdOptions/Net/tcp-cork&#x60; - boolean - &#x60;DrbdOptions/Net/on-congestion&#x60; - enum     * block     * pull-ahead     * disconnect  - &#x60;DrbdOptions/Net/congestion-fill&#x60; - range[&#x60;0-20971520&#x60;] - &#x60;DrbdOptions/Net/congestion-extents&#x60; - range[&#x60;67-65534&#x60;] - &#x60;DrbdOptions/Net/csums-alg&#x60; - string - &#x60;DrbdOptions/Net/csums-after-crash-only&#x60; - boolean - &#x60;DrbdOptions/Net/verify-alg&#x60; - string - &#x60;DrbdOptions/Net/use-rle&#x60; - boolean - &#x60;DrbdOptions/Net/socket-check-timeout&#x60; - range[&#x60;0-300&#x60;] - &#x60;DrbdOptions/Net/fencing&#x60; - enum     * dont-care     * resource-only     * resource-and-stonith  - &#x60;DrbdOptions/Net/max-buffers&#x60; - range[&#x60;32-131072&#x60;] - &#x60;DrbdOptions/Net/allow-remote-read&#x60; - boolean - &#x60;DrbdOptions/Handlers/after-resync-target&#x60; - string - &#x60;DrbdOptions/Handlers/before-resync-target&#x60; - string - &#x60;DrbdOptions/Handlers/before-resync-source&#x60; - string - &#x60;DrbdOptions/Handlers/out-of-sync&#x60; - string - &#x60;DrbdOptions/Handlers/quorum-lost&#x60; - string - &#x60;DrbdOptions/Handlers/fence-peer&#x60; - string - &#x60;DrbdOptions/Handlers/unfence-peer&#x60; - string - &#x60;DrbdOptions/Handlers/initial-split-brain&#x60; - string - &#x60;DrbdOptions/Handlers/local-io-error&#x60; - string - &#x60;DrbdOptions/Handlers/pri-lost&#x60; - string - &#x60;DrbdOptions/Handlers/pri-lost-after-sb&#x60; - string - &#x60;DrbdOptions/Handlers/pri-on-incon-degr&#x60; - string - &#x60;DrbdOptions/Handlers/split-brain&#x60; - string 
   * @param resource resource to use (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList resourceDefinitionModify(String resource, ResourceDefinitionModify body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling resourceDefinitionModify");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Return stats of all resource definitions.
   * Returns a resource definition stats object. 
   * @return ResourceDefinitionStats
   * @throws ApiException if fails to make API call
   */
  public ResourceDefinitionStats resourceDefinitionStats() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/v1/stats/resource-definitions";

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

    GenericType<ResourceDefinitionStats> localVarReturnType = new GenericType<ResourceDefinitionStats>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * check if a resource is currently synced on all nodes
   * Get info if the resource is synced on all nodes 
   * @param resource resource to use (required)
   * @return ResourceDefinitionSyncStatus
   * @throws ApiException if fails to make API call
   */
  public ResourceDefinitionSyncStatus resourceDefinitionSyncStatus(String resource) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling resourceDefinitionSyncStatus");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/sync-status"
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

    GenericType<ResourceDefinitionSyncStatus> localVarReturnType = new GenericType<ResourceDefinitionSyncStatus>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * delete a resource
   * Delete a resource on a node
   * @param resource resource to use (required)
   * @param node node to use (required)
   * @param keepTiebreaker Ensures that the tiebreaker resource is kept, possibly not deleting the given resource (optional, default to false)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList resourceDelete(String resource, String node, Boolean keepTiebreaker) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling resourceDelete");
    }
    // verify the required parameter 'node' is set
    if (node == null) {
      throw new ApiException(400, "Missing the required parameter 'node' when calling resourceDelete");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/resources/{node}"
      .replaceAll("\\{" + "resource" + "\\}", apiClient.escapeString(resource.toString()))
      .replaceAll("\\{" + "node" + "\\}", apiClient.escapeString(node.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "keep_tiebreaker", keepTiebreaker));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * enables deployment of an external file for the given resource
   * Enables deployment of a previously created external file for a resource definition. This has the effect that the external file will be created in a host&#x27;s file system whenever &#x60;resource&#x60; is deployed on that host. 
   * @param resource resource to use (required)
   * @param extFileName Name of an external file. Must be an absolute path in URL-encoding (required)
   * @throws ApiException if fails to make API call
   */
  public void resourceDeploy(String resource, String extFileName) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling resourceDeploy");
    }
    // verify the required parameter 'extFileName' is set
    if (extFileName == null) {
      throw new ApiException(400, "Missing the required parameter 'extFileName' when calling resourceDeploy");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/files/{extFileName}"
      .replaceAll("\\{" + "resource" + "\\}", apiClient.escapeString(resource.toString()))
      .replaceAll("\\{" + "extFileName" + "\\}", apiClient.escapeString(extFileName.toString()));

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


    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * disables a drbd proxy on a node connection
   * Disables a drbd proxy on a node connection
   * @param resource resource to use (required)
   * @param nodeA source node of the connection (required)
   * @param nodeB target node of the connection (required)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList resourceDrbdProxyDisable(String resource, String nodeA, String nodeB) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling resourceDrbdProxyDisable");
    }
    // verify the required parameter 'nodeA' is set
    if (nodeA == null) {
      throw new ApiException(400, "Missing the required parameter 'nodeA' when calling resourceDrbdProxyDisable");
    }
    // verify the required parameter 'nodeB' is set
    if (nodeB == null) {
      throw new ApiException(400, "Missing the required parameter 'nodeB' when calling resourceDrbdProxyDisable");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/drbd-proxy/disable/{node_a}/{node_b}"
      .replaceAll("\\{" + "resource" + "\\}", apiClient.escapeString(resource.toString()))
      .replaceAll("\\{" + "node_a" + "\\}", apiClient.escapeString(nodeA.toString()))
      .replaceAll("\\{" + "node_b" + "\\}", apiClient.escapeString(nodeB.toString()));

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

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * enable a drbd proxy on a node connection
   * Enables a drbd proxy on a node connection
   * @param resource resource to use (required)
   * @param nodeA source node of the connection (required)
   * @param nodeB target node of the connection (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList resourceDrbdProxyEnable(String resource, String nodeA, String nodeB, DrbdProxyEnable body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling resourceDrbdProxyEnable");
    }
    // verify the required parameter 'nodeA' is set
    if (nodeA == null) {
      throw new ApiException(400, "Missing the required parameter 'nodeA' when calling resourceDrbdProxyEnable");
    }
    // verify the required parameter 'nodeB' is set
    if (nodeB == null) {
      throw new ApiException(400, "Missing the required parameter 'nodeB' when calling resourceDrbdProxyEnable");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/drbd-proxy/enable/{node_a}/{node_b}"
      .replaceAll("\\{" + "resource" + "\\}", apiClient.escapeString(resource.toString()))
      .replaceAll("\\{" + "node_a" + "\\}", apiClient.escapeString(nodeA.toString()))
      .replaceAll("\\{" + "node_b" + "\\}", apiClient.escapeString(nodeB.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * modify drbd proxy option properties
   * Sets or modifies properties  Possible properties are: - &#x60;DrbdOptions/Proxy/memlimit&#x60; - range[&#x60;16777216-9223372036854775807&#x60;] - &#x60;DrbdOptions/Proxy/read-loops&#x60; - range[&#x60;0-2147483647&#x60;] - &#x60;DrbdOptions/Proxy/sndbuf-size&#x60; - range[&#x60;0-10485760&#x60;] - &#x60;DrbdOptions/Proxy/rcvbuf-size&#x60; - range[&#x60;0-10485760&#x60;] - &#x60;DrbdOptions/Proxy/ping-timeout&#x60; - range[&#x60;1-300&#x60;] - &#x60;DrbdOptions/ProxyCompression/dict-size&#x60; - range[&#x60;4096-1610612736&#x60;] - &#x60;DrbdOptions/ProxyCompression/lc&#x60; - range[&#x60;0-4&#x60;] - &#x60;DrbdOptions/ProxyCompression/lp&#x60; - range[&#x60;0-4&#x60;] - &#x60;DrbdOptions/ProxyCompression/pb&#x60; - range[&#x60;0-4&#x60;] - &#x60;DrbdOptions/ProxyCompression/nice-len&#x60; - range[&#x60;0-273&#x60;] - &#x60;DrbdOptions/ProxyCompression/mf&#x60; - enum     * hc4     * hc3     * bt2     * bt3     * bt4  - &#x60;DrbdOptions/ProxyCompression/mode&#x60; - enum     * fast     * normal  - &#x60;DrbdOptions/ProxyCompression/depth&#x60; - range[&#x60;0-1000&#x60;] - &#x60;DrbdOptions/ProxyCompression/level&#x60; - range[&#x60;1-9&#x60;] - &#x60;DrbdOptions/ProxyCompression/contexts&#x60; - range[&#x60;1-253&#x60;] - &#x60;DrbdOptions/ProxyCompression/fallback-to-zlib&#x60; - enum     * off     * on  - &#x60;DrbdOptions/ProxyCompression/numa-threshold&#x60; - range[&#x60;0-253&#x60;] - &#x60;DrbdOptions/ProxyCompression/level&#x60; - range[&#x60;1-9&#x60;] - &#x60;DrbdOptions/ProxyCompression/level&#x60; - range[&#x60;1-22&#x60;] 
   * @param resource resource to use (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList resourceDrbdProxyModify(String resource, DrbdProxyModify body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling resourceDrbdProxyModify");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/drbd-proxy"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * adjusts (calls autoplace for) all resource-definitions of the given resource-group
   * Adjusts (calls autoplace for) all resource-definitions of the given resource-group 
   * @param resourceGroup resource group to use (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList resourceGroupAdjust(String resourceGroup, ResourceGroupAdjust body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'resourceGroup' is set
    if (resourceGroup == null) {
      throw new ApiException(400, "Missing the required parameter 'resourceGroup' when calling resourceGroupAdjust");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-groups/{resource_group}/adjust"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * adjusts (calls autoplace for) all resource-definitions of all resource-groups
   * Adjusts (calls autoplace for) all resource-definitions of all resource-groups 
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList resourceGroupAdjustAll(ResourceGroupAdjust body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/v1/resource-groups/adjustall";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * add a resource-group
   * Adds a resource-group.  Only required property is the name of the resource group. All other properties are optional. 
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList resourceGroupCreate(ResourceGroup body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/v1/resource-groups";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * delete a resource-group
   * Delete a resource-group
   * @param resourceGroup resource group to use (required)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList resourceGroupDelete(String resourceGroup) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'resourceGroup' is set
    if (resourceGroup == null) {
      throw new ApiException(400, "Missing the required parameter 'resourceGroup' when calling resourceGroupDelete");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-groups/{resource_group}"
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

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * lists all resource-groups
   * Lists all resource groups.  A single resource group can be queried by adding its name to the resource string like:  /v1/resource-groups/rscgrp1 
   * @param resourceGroups Filter only for the specified resource groups, if not specified no filtering. (optional)
   * @param props filter by given properties, full property path (optional)
   * @param offset number of records to skip for pagination (optional)
   * @param limit maximum number of records to return (optional)
   * @return List&lt;ResourceGroup&gt;
   * @throws ApiException if fails to make API call
   */
  public List<ResourceGroup> resourceGroupList(List<String> resourceGroups, List<String> props, Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/v1/resource-groups";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "resource_groups", resourceGroups));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "props", props));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<ResourceGroup>> localVarReturnType = new GenericType<List<ResourceGroup>>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * modify a resource-group
   * Sets or modifies properties  Possible properties are: - &#x60;StorPoolName&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Linstor storage pool name to use.  - &#x60;PeerSlotsNewResource&#x60; - range[&#x60;1-31&#x60;]      DRBD peer slots to allocate for newly created resources (default 7), the number of peer slots cannot be changed once the resource is created, so allow sufficient slots to increase redundancy in the future  - &#x60;DrbdProxy/CompressionType&#x60; - enum     * zlib     * lzma     * lz4  - &#x60;FileSystem/Type&#x60; - enum      File system type to use      * ext4     * xfs  - &#x60;FileSystem/MkfsParams&#x60; - string      Additional parameters for the mkfs command  - &#x60;NVMe/enabled&#x60; - enum     * rdma     * tcp  - &#x60;NVMe/enabled&#x60; - range[&#x60;1-65535&#x60;] - &#x60;DrbdOptions/Disk/read-balancing&#x60; - enum     * prefer-local     * prefer-remote     * round-robin     * least-pending     * when-congested-remote     * 32K-striping     * 64K-striping     * 128K-striping     * 256K-striping     * 512K-striping     * 1M-striping  - &#x60;DrbdOptions/Disk/on-io-error&#x60; - enum     * pass_on     * call-local-io-error     * detach  - &#x60;DrbdOptions/Disk/disk-drain&#x60; - boolean - &#x60;DrbdOptions/Disk/resync-after&#x60; - string - &#x60;DrbdOptions/Disk/disk-timeout&#x60; - range[&#x60;0-6000&#x60;] - &#x60;DrbdOptions/Disk/disable-write-same&#x60; - boolean - &#x60;DrbdOptions/Disk/rs-discard-granularity&#x60; - range[&#x60;0-1048576&#x60;] - &#x60;DrbdOptions/Disk/disk-flushes&#x60; - boolean - &#x60;DrbdOptions/Disk/al-extents&#x60; - range[&#x60;67-65534&#x60;] - &#x60;DrbdOptions/Disk/al-updates&#x60; - boolean - &#x60;DrbdOptions/Disk/md-flushes&#x60; - boolean - &#x60;DrbdOptions/Disk/disk-barrier&#x60; - boolean - &#x60;DrbdOptions/Disk/discard-zeroes-if-aligned&#x60; - boolean - &#x60;DrbdOptions/PeerDevice/c-fill-target&#x60; - range[&#x60;0-1048576&#x60;] - &#x60;DrbdOptions/PeerDevice/c-max-rate&#x60; - range[&#x60;250-4194304&#x60;] - &#x60;DrbdOptions/PeerDevice/resync-rate&#x60; - range[&#x60;1-8388608&#x60;] - &#x60;DrbdOptions/PeerDevice/c-delay-target&#x60; - range[&#x60;1-100&#x60;] - &#x60;DrbdOptions/PeerDevice/c-min-rate&#x60; - range[&#x60;0-4194304&#x60;] - &#x60;DrbdOptions/PeerDevice/bitmap&#x60; - boolean - &#x60;DrbdOptions/PeerDevice/c-plan-ahead&#x60; - range[&#x60;0-300&#x60;] - &#x60;DrbdOptions/Resource/peer-ack-delay&#x60; - range[&#x60;1-10000&#x60;] - &#x60;DrbdOptions/Resource/quorum-minimum-redundancy&#x60; - enum [&#x60;1-32&#x60;]     * off     * majority     * all  - &#x60;DrbdOptions/Resource/max-io-depth&#x60; - range[&#x60;4-4294967295&#x60;] - &#x60;DrbdOptions/Resource/auto-promote-timeout&#x60; - range[&#x60;0-600&#x60;] - &#x60;DrbdOptions/Resource/quorum&#x60; - enum [&#x60;1-32&#x60;]     * off     * majority     * all  - &#x60;DrbdOptions/Resource/on-no-data-accessible&#x60; - enum     * io-error     * suspend-io  - &#x60;DrbdOptions/Resource/auto-promote&#x60; - boolean - &#x60;DrbdOptions/Resource/cpu-mask&#x60; - string - &#x60;DrbdOptions/Resource/twopc-timeout&#x60; - range[&#x60;50-600&#x60;] - &#x60;DrbdOptions/Resource/twopc-retry-timeout&#x60; - range[&#x60;1-50&#x60;] - &#x60;DrbdOptions/Resource/peer-ack-window&#x60; - range[&#x60;2048-204800&#x60;] - &#x60;DrbdOptions/Resource/on-no-quorum&#x60; - enum     * io-error     * suspend-io  - &#x60;DrbdOptions/Net/max-epoch-size&#x60; - range[&#x60;1-20000&#x60;] - &#x60;DrbdOptions/Net/protocol&#x60; - enum     * A     * B     * C  - &#x60;DrbdOptions/Net/allow-two-primaries&#x60; - boolean - &#x60;DrbdOptions/Net/after-sb-0pri&#x60; - enum     * disconnect     * discard-younger-primary     * discard-older-primary     * discard-zero-changes     * discard-least-changes     * discard-local     * discard-remote  - &#x60;DrbdOptions/Net/ko-count&#x60; - range[&#x60;0-200&#x60;] - &#x60;DrbdOptions/Net/data-integrity-alg&#x60; - string - &#x60;DrbdOptions/Net/ping-timeout&#x60; - range[&#x60;1-300&#x60;] - &#x60;DrbdOptions/Net/sndbuf-size&#x60; - range[&#x60;0-10485760&#x60;] - &#x60;DrbdOptions/Net/transport&#x60; - string - &#x60;DrbdOptions/Net/rcvbuf-size&#x60; - range[&#x60;0-10485760&#x60;] - &#x60;DrbdOptions/Net/max-buffers&#x60; - range[&#x60;32-131072&#x60;] - &#x60;DrbdOptions/Net/fencing&#x60; - enum     * dont-care     * resource-only     * resource-and-stonith  - &#x60;DrbdOptions/Net/csums-alg&#x60; - string - &#x60;DrbdOptions/Net/always-asbp&#x60; - boolean - &#x60;DrbdOptions/Net/congestion-extents&#x60; - range[&#x60;67-65534&#x60;] - &#x60;DrbdOptions/Net/on-congestion&#x60; - enum     * block     * pull-ahead     * disconnect  - &#x60;DrbdOptions/Net/ping-int&#x60; - range[&#x60;1-120&#x60;] - &#x60;DrbdOptions/Net/rr-conflict&#x60; - enum     * disconnect     * call-pri-lost     * violently  - &#x60;DrbdOptions/Net/tcp-cork&#x60; - boolean - &#x60;DrbdOptions/Net/use-rle&#x60; - boolean - &#x60;DrbdOptions/Net/csums-after-crash-only&#x60; - boolean - &#x60;DrbdOptions/Net/socket-check-timeout&#x60; - range[&#x60;0-300&#x60;] - &#x60;DrbdOptions/Net/congestion-fill&#x60; - range[&#x60;0-20971520&#x60;] - &#x60;DrbdOptions/Net/cram-hmac-alg&#x60; - string - &#x60;DrbdOptions/Net/verify-alg&#x60; - string - &#x60;DrbdOptions/Net/shared-secret&#x60; - string - &#x60;DrbdOptions/Net/connect-int&#x60; - range[&#x60;1-120&#x60;] - &#x60;DrbdOptions/Net/timeout&#x60; - range[&#x60;1-600&#x60;] - &#x60;DrbdOptions/Net/after-sb-2pri&#x60; - enum     * disconnect     * call-pri-lost-after-sb     * violently-as0p  - &#x60;DrbdOptions/Net/after-sb-1pri&#x60; - enum     * disconnect     * consensus     * discard-secondary     * call-pri-lost-after-sb     * violently-as0p  - &#x60;DrbdOptions/Handlers/after-resync-target&#x60; - string - &#x60;DrbdOptions/Handlers/before-resync-target&#x60; - string - &#x60;DrbdOptions/Handlers/before-resync-source&#x60; - string - &#x60;DrbdOptions/Handlers/out-of-sync&#x60; - string - &#x60;DrbdOptions/Handlers/quorum-lost&#x60; - string - &#x60;DrbdOptions/Handlers/fence-peer&#x60; - string - &#x60;DrbdOptions/Handlers/unfence-peer&#x60; - string - &#x60;DrbdOptions/Handlers/initial-split-brain&#x60; - string - &#x60;DrbdOptions/Handlers/local-io-error&#x60; - string - &#x60;DrbdOptions/Handlers/pri-lost&#x60; - string - &#x60;DrbdOptions/Handlers/pri-lost-after-sb&#x60; - string - &#x60;DrbdOptions/Handlers/pri-on-incon-degr&#x60; - string - &#x60;DrbdOptions/Handlers/split-brain&#x60; - string 
   * @param resourceGroup resource group to use (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList resourceGroupModify(String resourceGroup, ResourceGroupModify body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'resourceGroup' is set
    if (resourceGroup == null) {
      throw new ApiException(400, "Missing the required parameter 'resourceGroup' when calling resourceGroupModify");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-groups/{resource_group}"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * create a new resource-definition based on the given resource-group
   * Creates a new resource-definition and auto-deploys if configured to do so. 
   * @param resourceGroup resource group to use (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList resourceGroupSpawn(String resourceGroup, ResourceGroupSpawn body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'resourceGroup' is set
    if (resourceGroup == null) {
      throw new ApiException(400, "Missing the required parameter 'resourceGroup' when calling resourceGroupSpawn");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-groups/{resource_group}/spawn"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Return stats of all resource groups.
   * Returns a resource group stats object. 
   * @return ResourceGroupStats
   * @throws ApiException if fails to make API call
   */
  public ResourceGroupStats resourceGroupStats() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/v1/stats/resource-groups";

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

    GenericType<ResourceGroupStats> localVarReturnType = new GenericType<ResourceGroupStats>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * lists all resources for a resource-definition
   * Lists all resources for a resource-definition.  A single resource can be queried by adding its name to the resource string like:  /v1/resource-definitions/rsc1/resources/nodeA 
   * @param resource resource to use (required)
   * @param offset number of records to skip for pagination (optional)
   * @param limit maximum number of records to return (optional)
   * @return List&lt;Resource&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Resource> resourceList(String resource, Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling resourceList");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/resources"
      .replaceAll("\\{" + "resource" + "\\}", apiClient.escapeString(resource.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Resource>> localVarReturnType = new GenericType<List<Resource>>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * creates the resource if not already deployed
   * Adds a resource on a node if not already deployed.  New resources will be diskless, if possible. To force creation of a diskful resource, set &#x60;diskful&#x60; to &#x60;true&#x60; in the request body.  Optionally, you can override the layer stack for the created resource. If not given, the default configuration for the resource definition is used.  The storage pool will be selected by the autoplacer. 
   * @param resource resource to use (required)
   * @param node node to use (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList resourceMakeAvailableOnNode(String resource, String node, ResourceMakeAvailable body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling resourceMakeAvailableOnNode");
    }
    // verify the required parameter 'node' is set
    if (node == null) {
      throw new ApiException(400, "Missing the required parameter 'node' when calling resourceMakeAvailableOnNode");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/resources/{node}/make-available"
      .replaceAll("\\{" + "resource" + "\\}", apiClient.escapeString(resource.toString()))
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * migrate a resource to another node
   * migrate a resource to another node without reducing the redundancy count 
   * @param resource resource to use (required)
   * @param node node to use (required)
   * @param fromnode node that should be deleted after the successful migrate (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList resourceMigrateDisk(String resource, String node, String fromnode, ToggleDiskDiskful body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling resourceMigrateDisk");
    }
    // verify the required parameter 'node' is set
    if (node == null) {
      throw new ApiException(400, "Missing the required parameter 'node' when calling resourceMigrateDisk");
    }
    // verify the required parameter 'fromnode' is set
    if (fromnode == null) {
      throw new ApiException(400, "Missing the required parameter 'fromnode' when calling resourceMigrateDisk");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/resources/{node}/migrate-disk/{fromnode}"
      .replaceAll("\\{" + "resource" + "\\}", apiClient.escapeString(resource.toString()))
      .replaceAll("\\{" + "node" + "\\}", apiClient.escapeString(node.toString()))
      .replaceAll("\\{" + "fromnode" + "\\}", apiClient.escapeString(fromnode.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * migrate a resource to another node
   * migrate a resource to another node without reducing the redundency count 
   * @param resource resource to use (required)
   * @param node node to use (required)
   * @param fromnode node that should be deleted after the successful migrate (required)
   * @param storagepool Storage pool to use (required)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList resourceMigrateDiskStoragepool(String resource, String node, String fromnode, String storagepool) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling resourceMigrateDiskStoragepool");
    }
    // verify the required parameter 'node' is set
    if (node == null) {
      throw new ApiException(400, "Missing the required parameter 'node' when calling resourceMigrateDiskStoragepool");
    }
    // verify the required parameter 'fromnode' is set
    if (fromnode == null) {
      throw new ApiException(400, "Missing the required parameter 'fromnode' when calling resourceMigrateDiskStoragepool");
    }
    // verify the required parameter 'storagepool' is set
    if (storagepool == null) {
      throw new ApiException(400, "Missing the required parameter 'storagepool' when calling resourceMigrateDiskStoragepool");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/resources/{node}/migrate-disk/{fromnode}/{storagepool}"
      .replaceAll("\\{" + "resource" + "\\}", apiClient.escapeString(resource.toString()))
      .replaceAll("\\{" + "node" + "\\}", apiClient.escapeString(node.toString()))
      .replaceAll("\\{" + "fromnode" + "\\}", apiClient.escapeString(fromnode.toString()))
      .replaceAll("\\{" + "storagepool" + "\\}", apiClient.escapeString(storagepool.toString()));

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

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * modify a resource
   * Sets or modifies properties  Possible properties are: - &#x60;StorPoolName&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Linstor storage pool name to use.  - &#x60;StorPoolNameDrbdMeta&#x60; - regex[&#x60;^|.internal|[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Linstor storage pool name to use for external metadata.  - &#x60;PrefNic&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Preferred network interface to use  - &#x60;PeerSlots&#x60; - range[&#x60;1-31&#x60;]      DRBD peer slots present on resource  - &#x60;FileSystem/Type&#x60; - enum      File system type to use      * ext4     * xfs  - &#x60;FileSystem/MkfsParams&#x60; - string      Additional parameters for the mkfs command  - &#x60;NVMe/PrefNic&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Preferred network interface to use  - &#x60;sys/fs/blkio_throttle_read&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.read_bps_device  - &#x60;sys/fs/blkio_throttle_write&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.write_bps_device  - &#x60;sys/fs/blkio_throttle_read_iops&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.read_iops_device  - &#x60;sys/fs/blkio_throttle_write_iops&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.write_iops_device  - &#x60;DrbdOptions/auto-diskful-allow-cleanup&#x60; - boolean_true_false      Allows this resource to be cleaned up after toggle-disk + resync is finished  
   * @param resource resource to use (required)
   * @param node node to use (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList resourceModify(String resource, String node, ResourceModify body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling resourceModify");
    }
    // verify the required parameter 'node' is set
    if (node == null) {
      throw new ApiException(400, "Missing the required parameter 'node' when calling resourceModify");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/resources/{node}"
      .replaceAll("\\{" + "resource" + "\\}", apiClient.escapeString(resource.toString()))
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * create a snapshot
   * Create a snapshot for a resource
   * @param resource resource to use (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList resourceSnapshotCreate(String resource, Snapshot body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling resourceSnapshotCreate");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/snapshots"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * delete a snapshot
   * Delete a snapshot
   * @param resource resource to use (required)
   * @param snapshot Snapshot name to use (required)
   * @param nodes Only delete snapshots of the given nodes. (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList resourceSnapshotDelete(String resource, String snapshot, List<String> nodes) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling resourceSnapshotDelete");
    }
    // verify the required parameter 'snapshot' is set
    if (snapshot == null) {
      throw new ApiException(400, "Missing the required parameter 'snapshot' when calling resourceSnapshotDelete");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/snapshots/{snapshot}"
      .replaceAll("\\{" + "resource" + "\\}", apiClient.escapeString(resource.toString()))
      .replaceAll("\\{" + "snapshot" + "\\}", apiClient.escapeString(snapshot.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "nodes", nodes));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * list a specific snapshot
   * List the given snapshot for a resource
   * @param resource resource to use (required)
   * @param snapshot Snapshot name to use (required)
   * @return Snapshot
   * @throws ApiException if fails to make API call
   */
  public Snapshot resourceSnapshotList(String resource, String snapshot) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling resourceSnapshotList");
    }
    // verify the required parameter 'snapshot' is set
    if (snapshot == null) {
      throw new ApiException(400, "Missing the required parameter 'snapshot' when calling resourceSnapshotList");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/snapshots/{snapshot}"
      .replaceAll("\\{" + "resource" + "\\}", apiClient.escapeString(resource.toString()))
      .replaceAll("\\{" + "snapshot" + "\\}", apiClient.escapeString(snapshot.toString()));

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

    GenericType<Snapshot> localVarReturnType = new GenericType<Snapshot>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * restore a snapshot
   * Restore a snapshot to a new resource
   * @param resource resource to use (required)
   * @param snapshot Snapshot name to use (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList resourceSnapshotRestore(String resource, String snapshot, SnapshotRestore body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling resourceSnapshotRestore");
    }
    // verify the required parameter 'snapshot' is set
    if (snapshot == null) {
      throw new ApiException(400, "Missing the required parameter 'snapshot' when calling resourceSnapshotRestore");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/snapshot-restore-resource/{snapshot}"
      .replaceAll("\\{" + "resource" + "\\}", apiClient.escapeString(resource.toString()))
      .replaceAll("\\{" + "snapshot" + "\\}", apiClient.escapeString(snapshot.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * rollback a snapshot
   * Rollback a resource to the snapshot state
   * @param resource resource to use (required)
   * @param snapshot Snapshot name to use (required)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList resourceSnapshotRollback(String resource, String snapshot) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling resourceSnapshotRollback");
    }
    // verify the required parameter 'snapshot' is set
    if (snapshot == null) {
      throw new ApiException(400, "Missing the required parameter 'snapshot' when calling resourceSnapshotRollback");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/snapshot-rollback/{snapshot}"
      .replaceAll("\\{" + "resource" + "\\}", apiClient.escapeString(resource.toString()))
      .replaceAll("\\{" + "snapshot" + "\\}", apiClient.escapeString(snapshot.toString()));

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

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * list snapshots
   * List snapshots for a resource
   * @param resource resource to use (required)
   * @return List&lt;Snapshot&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Snapshot> resourceSnapshotsList(String resource) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling resourceSnapshotsList");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/snapshots"
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

    GenericType<List<Snapshot>> localVarReturnType = new GenericType<List<Snapshot>>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * restore a snapshot volume definition
   * Restore a snapshot volume definition to a new resource
   * @param resource resource to use (required)
   * @param snapshot Snapshot name to use (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList resourceSnapshotsRestoreVolumeDefinition(String resource, String snapshot, SnapshotRestore body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling resourceSnapshotsRestoreVolumeDefinition");
    }
    // verify the required parameter 'snapshot' is set
    if (snapshot == null) {
      throw new ApiException(400, "Missing the required parameter 'snapshot' when calling resourceSnapshotsRestoreVolumeDefinition");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/snapshot-restore-volume-definition/{snapshot}"
      .replaceAll("\\{" + "resource" + "\\}", apiClient.escapeString(resource.toString()))
      .replaceAll("\\{" + "snapshot" + "\\}", apiClient.escapeString(snapshot.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * toggle a resource to a diskful resource
   * toggle a resource to a diskful resource using the default storage pool 
   * @param resource resource to use (required)
   * @param node node to use (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList resourceToggleDiskful(String resource, String node, ToggleDiskDiskful body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling resourceToggleDiskful");
    }
    // verify the required parameter 'node' is set
    if (node == null) {
      throw new ApiException(400, "Missing the required parameter 'node' when calling resourceToggleDiskful");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/resources/{node}/toggle-disk/diskful"
      .replaceAll("\\{" + "resource" + "\\}", apiClient.escapeString(resource.toString()))
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * toggle a resource to a diskful resource
   * toggle a resource to a diskful resource
   * @param resource resource to use (required)
   * @param node node to use (required)
   * @param storagepool Storage pool to use (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList resourceToggleDiskfulStoragepool(String resource, String node, String storagepool, ToggleDiskDiskful body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling resourceToggleDiskfulStoragepool");
    }
    // verify the required parameter 'node' is set
    if (node == null) {
      throw new ApiException(400, "Missing the required parameter 'node' when calling resourceToggleDiskfulStoragepool");
    }
    // verify the required parameter 'storagepool' is set
    if (storagepool == null) {
      throw new ApiException(400, "Missing the required parameter 'storagepool' when calling resourceToggleDiskfulStoragepool");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/resources/{node}/toggle-disk/diskful/{storagepool}"
      .replaceAll("\\{" + "resource" + "\\}", apiClient.escapeString(resource.toString()))
      .replaceAll("\\{" + "node" + "\\}", apiClient.escapeString(node.toString()))
      .replaceAll("\\{" + "storagepool" + "\\}", apiClient.escapeString(storagepool.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * toggle a resource to diskless
   * toggle a resource to a diskless resource
   * @param resource resource to use (required)
   * @param node node to use (required)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList resourceToggleDiskless(String resource, String node) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling resourceToggleDiskless");
    }
    // verify the required parameter 'node' is set
    if (node == null) {
      throw new ApiException(400, "Missing the required parameter 'node' when calling resourceToggleDiskless");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/resources/{node}/toggle-disk/diskless"
      .replaceAll("\\{" + "resource" + "\\}", apiClient.escapeString(resource.toString()))
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

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * toggle a resource to diskless resource
   * toggle a resource to a diskless. 
   * @param resource resource to use (required)
   * @param node node to use (required)
   * @param disklesspool diskless pool to use. (required)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList resourceToggleDisklessDisklesspool(String resource, String node, String disklesspool) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling resourceToggleDisklessDisklesspool");
    }
    // verify the required parameter 'node' is set
    if (node == null) {
      throw new ApiException(400, "Missing the required parameter 'node' when calling resourceToggleDisklessDisklesspool");
    }
    // verify the required parameter 'disklesspool' is set
    if (disklesspool == null) {
      throw new ApiException(400, "Missing the required parameter 'disklesspool' when calling resourceToggleDisklessDisklesspool");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/resources/{node}/toggle-disk/diskless/{disklesspool}"
      .replaceAll("\\{" + "resource" + "\\}", apiClient.escapeString(resource.toString()))
      .replaceAll("\\{" + "node" + "\\}", apiClient.escapeString(node.toString()))
      .replaceAll("\\{" + "disklesspool" + "\\}", apiClient.escapeString(disklesspool.toString()));

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

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * disables deployment of an external file for the given resource
   * Removes the requirement from this resource definition to create the given external file. If nothing requires the external file to exist on a satellite, the satellite also will delete the external file from the host&#x27;s file system. 
   * @param resource resource to use (required)
   * @param extFileName Name of an external file. Must be an absolute path in URL-encoding (required)
   * @throws ApiException if fails to make API call
   */
  public void resourceUndeploy(String resource, String extFileName) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling resourceUndeploy");
    }
    // verify the required parameter 'extFileName' is set
    if (extFileName == null) {
      throw new ApiException(400, "Missing the required parameter 'extFileName' when calling resourceUndeploy");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/files/{extFileName}"
      .replaceAll("\\{" + "resource" + "\\}", apiClient.escapeString(resource.toString()))
      .replaceAll("\\{" + "extFileName" + "\\}", apiClient.escapeString(extFileName.toString()));

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


    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * lists all volumes of a resources
   * Lists all volumes for a resource-definition.  A single volume can be queried by adding its volume number to the resource string like:  /v1/resource-definitions/rsc1/resources/nodeA/volumes/0 
   * @param resource resource to use (required)
   * @param node node to use (required)
   * @param offset number of records to skip for pagination (optional)
   * @param limit maximum number of records to return (optional)
   * @return List&lt;Volume&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Volume> resourceVolumeList(String resource, String node, Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling resourceVolumeList");
    }
    // verify the required parameter 'node' is set
    if (node == null) {
      throw new ApiException(400, "Missing the required parameter 'node' when calling resourceVolumeList");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/resources/{node}/volumes"
      .replaceAll("\\{" + "resource" + "\\}", apiClient.escapeString(resource.toString()))
      .replaceAll("\\{" + "node" + "\\}", apiClient.escapeString(node.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Volume>> localVarReturnType = new GenericType<List<Volume>>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Return stats of all resources.
   * Returns a resource stats object. 
   * @return ResourceStats
   * @throws ApiException if fails to make API call
   */
  public ResourceStats resourcesStats() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/v1/stats/resources";

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

    GenericType<ResourceStats> localVarReturnType = new GenericType<ResourceStats>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * show satellite config
   * Show Satellite config 
   * @param node node to use (required)
   * @return SatelliteConfig
   * @throws ApiException if fails to make API call
   */
  public SatelliteConfig satelliteConfig(String node) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'node' is set
    if (node == null) {
      throw new ApiException(400, "Missing the required parameter 'node' when calling satelliteConfig");
    }
    // create path and map variables
    String localVarPath = "/v1/nodes/{node}/config"
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

    GenericType<SatelliteConfig> localVarReturnType = new GenericType<SatelliteConfig>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * ship a snapshot
   * Transfers the resource from one node to another based on snapshot-shipping
   * @param resource resource to use (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList snapshotShipping(String resource, SnapshotShipping body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling snapshotShipping");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/snapshot-shipping"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * modify satellite config
   * 
   * @param node node to use (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList stltSetConfig(String node, SatelliteConfig body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'node' is set
    if (node == null) {
      throw new ApiException(400, "Missing the required parameter 'node' when calling stltSetConfig");
    }
    // create path and map variables
    String localVarPath = "/v1/nodes/{node}/config"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * modify a storage pool definition
   * Sets or modifies properties  Possible properties are: - &#x60;MaxOversubscriptionRatio&#x60; - range[&#x60;1-1000&#x60;] 
   * @param storagepool Storage pool to use (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList storPoolDfnModify(String storagepool, StoragePoolDefinitionModify body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'storagepool' is set
    if (storagepool == null) {
      throw new ApiException(400, "Missing the required parameter 'storagepool' when calling storPoolDfnModify");
    }
    // create path and map variables
    String localVarPath = "/v1/storage-pool-definitions/{storagepool}"
      .replaceAll("\\{" + "storagepool" + "\\}", apiClient.escapeString(storagepool.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * delete a storage pool definition
   * Delete a storage pool definition from Linstor
   * @param storagepool Storage pool to use (required)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList storagePoolDefinitionDelete(String storagepool) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'storagepool' is set
    if (storagepool == null) {
      throw new ApiException(400, "Missing the required parameter 'storagepool' when calling storagePoolDefinitionDelete");
    }
    // create path and map variables
    String localVarPath = "/v1/storage-pool-definitions/{storagepool}"
      .replaceAll("\\{" + "storagepool" + "\\}", apiClient.escapeString(storagepool.toString()));

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

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * add a storage pool definition to Linstor
   * Adds a storage pool definition to Linstor 
   * @param body Storage pool definition to add (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList storagePoolDfnAdd(StoragePoolDefinition body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/v1/storage-pool-definitions";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Lists a specific storage pool definition
   * Returns a specific storage pool definition
   * @param storagepool Storage pool to use (required)
   * @return StoragePoolDefinition
   * @throws ApiException if fails to make API call
   */
  public StoragePoolDefinition storagePoolDfnGet(String storagepool) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'storagepool' is set
    if (storagepool == null) {
      throw new ApiException(400, "Missing the required parameter 'storagepool' when calling storagePoolDfnGet");
    }
    // create path and map variables
    String localVarPath = "/v1/storage-pool-definitions/{storagepool}"
      .replaceAll("\\{" + "storagepool" + "\\}", apiClient.escapeString(storagepool.toString()));

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

    GenericType<StoragePoolDefinition> localVarReturnType = new GenericType<StoragePoolDefinition>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Lists storage pool definitions
   * Returns an array of all storage pool definitions
   * @param offset number of records to skip for pagination (optional)
   * @param limit maximum number of records to return (optional)
   * @return List&lt;StoragePoolDefinition&gt;
   * @throws ApiException if fails to make API call
   */
  public List<StoragePoolDefinition> storagePoolDfnList(Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/v1/storage-pool-definitions";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<StoragePoolDefinition>> localVarReturnType = new GenericType<List<StoragePoolDefinition>>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Return stats of all storage pools.
   * Returns a storage pool stats object. 
   * @return StoragePoolStats
   * @throws ApiException if fails to make API call
   */
  public StoragePoolStats storagePoolsStats() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/v1/stats/storage-pools";

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

    GenericType<StoragePoolStats> localVarReturnType = new GenericType<StoragePoolStats>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * List all properties of all entities
   * List all properties, including their names and descriptions, that can be set for any entity in the cluster. This includes the controller, resource definitions, resource groups, connections, volumes, etc. 
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

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * List all controller properties
   * List all properties, including their names and descriptions, that can be set for the LINSTOR controller. 
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

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * drbd promotion event changes
   * Notifies clients about changes in may_promote of resources
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public InlineResponse200 v1EventsDrbdPromotionGet() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/v1/events/drbd/promotion";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "text/event-stream"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<InlineResponse200> localVarReturnType = new GenericType<InlineResponse200>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * server sent event stream for nodes
   * Notifies clients about changes with nodes
   * @return InlineResponse2001
   * @throws ApiException if fails to make API call
   */
  public InlineResponse2001 v1EventsNodesGet() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/v1/events/nodes";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "text/event-stream"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<InlineResponse2001> localVarReturnType = new GenericType<InlineResponse2001>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * checks whether an extFile can be written
   * checks whether the given extFile can be written on the given node
   * @param extFileName Name of an external file. Must be an absolute path in URL-encoding (required)
   * @param node node to use (required)
   * @return ExtFileCheckResult
   * @throws ApiException if fails to make API call
   */
  public ExtFileCheckResult v1FilesExtFileNameCheckNodeGet(String extFileName, String node) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'extFileName' is set
    if (extFileName == null) {
      throw new ApiException(400, "Missing the required parameter 'extFileName' when calling v1FilesExtFileNameCheckNodeGet");
    }
    // verify the required parameter 'node' is set
    if (node == null) {
      throw new ApiException(400, "Missing the required parameter 'node' when calling v1FilesExtFileNameCheckNodeGet");
    }
    // create path and map variables
    String localVarPath = "/v1/files/{extFileName}/check/{node}"
      .replaceAll("\\{" + "extFileName" + "\\}", apiClient.escapeString(extFileName.toString()))
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

    GenericType<ExtFileCheckResult> localVarReturnType = new GenericType<ExtFileCheckResult>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * delete the given external file
   * Deletes the given external file. This effectively also deletes the file on all satellites 
   * @param extFileName Name of an external file. Must be an absolute path in URL-encoding (required)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList v1FilesExtFileNameDelete(String extFileName) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'extFileName' is set
    if (extFileName == null) {
      throw new ApiException(400, "Missing the required parameter 'extFileName' when calling v1FilesExtFileNameDelete");
    }
    // create path and map variables
    String localVarPath = "/v1/files/{extFileName}"
      .replaceAll("\\{" + "extFileName" + "\\}", apiClient.escapeString(extFileName.toString()));

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

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * shows the requested external file including its content
   * Shows the requested external file including its content
   * @param extFileName Name of an external file. Must be an absolute path in URL-encoding (required)
   * @return ExternalFile
   * @throws ApiException if fails to make API call
   */
  public ExternalFile v1FilesExtFileNameGet(String extFileName) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'extFileName' is set
    if (extFileName == null) {
      throw new ApiException(400, "Missing the required parameter 'extFileName' when calling v1FilesExtFileNameGet");
    }
    // create path and map variables
    String localVarPath = "/v1/files/{extFileName}"
      .replaceAll("\\{" + "extFileName" + "\\}", apiClient.escapeString(extFileName.toString()));

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

    GenericType<ExternalFile> localVarReturnType = new GenericType<ExternalFile>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * register or modify a previously registered external file
   * Register or modify a previously registered external file
   * @param extFileName Name of an external file. Must be an absolute path in URL-encoding (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList v1FilesExtFileNamePut(String extFileName, ExternalFile body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'extFileName' is set
    if (extFileName == null) {
      throw new ApiException(400, "Missing the required parameter 'extFileName' when calling v1FilesExtFileNamePut");
    }
    // create path and map variables
    String localVarPath = "/v1/files/{extFileName}"
      .replaceAll("\\{" + "extFileName" + "\\}", apiClient.escapeString(extFileName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * list registered external files
   * Get a list of previously registered external files. File contents are not included, unless the \&quot;content\&quot; query parameter is explicitly set to true. 
   * @param content Include file content in response. If not given, defaults to false. (optional, default to false)
   * @return List&lt;ExternalFile&gt;
   * @throws ApiException if fails to make API call
   */
  public List<ExternalFile> v1FilesGet(Boolean content) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/v1/files";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "content", content));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<ExternalFile>> localVarReturnType = new GenericType<List<ExternalFile>>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * List all storage-pool properties
   * List all properties, including their names and descriptions, that can be set for any given storage pool on a particular node. 
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

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * List all node properties
   * List all properties, including their names and descriptions, that can be set for any given node. 
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

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * delete a remote
   * delete the given remote
   * @param remoteName name of the remote (required)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList v1RemotesDelete(String remoteName) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'remoteName' is set
    if (remoteName == null) {
      throw new ApiException(400, "Missing the required parameter 'remoteName' when calling v1RemotesDelete");
    }
    // create path and map variables
    String localVarPath = "/v1/remotes";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "remote_name", remoteName));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * list all EBS remotes
   * list of all known EBS remotes on this cluster
   * @return List&lt;EbsRemote&gt;
   * @throws ApiException if fails to make API call
   */
  public List<EbsRemote> v1RemotesEbsGet() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/v1/remotes/ebs";

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

    GenericType<List<EbsRemote>> localVarReturnType = new GenericType<List<EbsRemote>>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * creates a new EBS remote
   * Creates a new EBS remote unless it already exists
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList v1RemotesEbsPost(EbsRemote body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/v1/remotes/ebs";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * modify a EBS remote
   * modify an existing EBS remote
   * @param remoteName name of the remote (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList v1RemotesEbsRemoteNamePut(String remoteName, EbsRemote body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'remoteName' is set
    if (remoteName == null) {
      throw new ApiException(400, "Missing the required parameter 'remoteName' when calling v1RemotesEbsRemoteNamePut");
    }
    // create path and map variables
    String localVarPath = "/v1/remotes/ebs/{remoteName}"
      .replaceAll("\\{" + "remoteName" + "\\}", apiClient.escapeString(remoteName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * list all remotes
   * list of all known remotes on this cluster
   * @return List&lt;RemoteList&gt;
   * @throws ApiException if fails to make API call
   */
  public List<RemoteList> v1RemotesGet() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/v1/remotes";

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

    GenericType<List<RemoteList>> localVarReturnType = new GenericType<List<RemoteList>>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * list all linstor remotes
   * list of all known linstor remotes on this cluster
   * @return List&lt;LinstorRemote&gt;
   * @throws ApiException if fails to make API call
   */
  public List<LinstorRemote> v1RemotesLinstorGet() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/v1/remotes/linstor";

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

    GenericType<List<LinstorRemote>> localVarReturnType = new GenericType<List<LinstorRemote>>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * creates a new linstor remote
   * Creates a new linstor remote unless it already exists
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList v1RemotesLinstorPost(LinstorRemote body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/v1/remotes/linstor";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * modify a linstor remote
   * modify an existing linstor remote
   * @param remoteName name of the remote (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList v1RemotesLinstorRemoteNamePut(String remoteName, LinstorRemote body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'remoteName' is set
    if (remoteName == null) {
      throw new ApiException(400, "Missing the required parameter 'remoteName' when calling v1RemotesLinstorRemoteNamePut");
    }
    // create path and map variables
    String localVarPath = "/v1/remotes/linstor/{remoteName}"
      .replaceAll("\\{" + "remoteName" + "\\}", apiClient.escapeString(remoteName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * abort backups
   * abort all backups of the given resource
   * @param remoteName The remote to abort the backups from (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList v1RemotesRemoteNameBackupsAbortPost(String remoteName, BackupAbort body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'remoteName' is set
    if (remoteName == null) {
      throw new ApiException(400, "Missing the required parameter 'remoteName' when calling v1RemotesRemoteNameBackupsAbortPost");
    }
    // create path and map variables
    String localVarPath = "/v1/remotes/{remote_name}/backups/abort"
      .replaceAll("\\{" + "remote_name" + "\\}", apiClient.escapeString(remoteName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * delete backups
   * delete the specified backups
   * @param remoteName The remote to delete the backups from (required)
   * @param id ID of the specific backup to be deleted (optional)
   * @param idPrefix ID prefix of possibly multiple backups to be deleted (optional)
   * @param cascading deletes the specified backup(s) and all backups depending on it (optional)
   * @param timestamp deletes all backups that were made before the given timestamp (optional)
   * @param resourceName deletes all backups made from the specified resource (optional)
   * @param nodeName deletes all backups made from the specified node (optional)
   * @param allLocalCluster deletes all backups made from the current cluster (optional)
   * @param all deletes ALL backups (optional)
   * @param s3key deletes the backup associated with the s3key if it fits the naming-criteria (optional)
   * @param s3keyForce deletes the s3key - regardless of whether it is a backup or not (optional)
   * @param dryrun does not delete anything but returns an ApiCallRc with all entries that would be deleted (optional)
   * @param keepSnaps makes sure the snapshots the backups originated from are not deleted (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList v1RemotesRemoteNameBackupsDelete(String remoteName, String id, String idPrefix, Boolean cascading, String timestamp, String resourceName, String nodeName, Boolean allLocalCluster, Boolean all, String s3key, String s3keyForce, Boolean dryrun, Boolean keepSnaps) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'remoteName' is set
    if (remoteName == null) {
      throw new ApiException(400, "Missing the required parameter 'remoteName' when calling v1RemotesRemoteNameBackupsDelete");
    }
    // create path and map variables
    String localVarPath = "/v1/remotes/{remote_name}/backups"
      .replaceAll("\\{" + "remote_name" + "\\}", apiClient.escapeString(remoteName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id_prefix", idPrefix));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cascading", cascading));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "timestamp", timestamp));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "resource_name", resourceName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "node_name", nodeName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "all_local_cluster", allLocalCluster));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "all", all));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "s3key", s3key));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "s3key_force", s3keyForce));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "dryrun", dryrun));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "keep_snaps", keepSnaps));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * list all backups
   * list all backups in a single bucket
   * @param remoteName The remote to list the backups from (required)
   * @param rscName Only show backups of this resource (optional)
   * @param snapName Only show backups with this snapshot name (optional)
   * @return BackupList
   * @throws ApiException if fails to make API call
   */
  public BackupList v1RemotesRemoteNameBackupsGet(String remoteName, String rscName, String snapName) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'remoteName' is set
    if (remoteName == null) {
      throw new ApiException(400, "Missing the required parameter 'remoteName' when calling v1RemotesRemoteNameBackupsGet");
    }
    // create path and map variables
    String localVarPath = "/v1/remotes/{remote_name}/backups"
      .replaceAll("\\{" + "remote_name" + "\\}", apiClient.escapeString(remoteName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "rsc_name", rscName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "snap_name", snapName));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<BackupList> localVarReturnType = new GenericType<BackupList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * list info about a backup
   * get info about the storpools a backup uses and the size it needs
   * @param remoteName The remote to get the info from (required)
   * @param body  (optional)
   * @return BackupInfo
   * @throws ApiException if fails to make API call
   */
  public BackupInfo v1RemotesRemoteNameBackupsInfoPost(String remoteName, BackupInfoRequest body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'remoteName' is set
    if (remoteName == null) {
      throw new ApiException(400, "Missing the required parameter 'remoteName' when calling v1RemotesRemoteNameBackupsInfoPost");
    }
    // create path and map variables
    String localVarPath = "/v1/remotes/{remote_name}/backups/info"
      .replaceAll("\\{" + "remote_name" + "\\}", apiClient.escapeString(remoteName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<BackupInfo> localVarReturnType = new GenericType<BackupInfo>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * create a full or incremental backup
   * create and ship a full backup to the target system
   * @param remoteName The remote to ship the backups to (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList v1RemotesRemoteNameBackupsPost(String remoteName, BackupCreate body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'remoteName' is set
    if (remoteName == null) {
      throw new ApiException(400, "Missing the required parameter 'remoteName' when calling v1RemotesRemoteNameBackupsPost");
    }
    // create path and map variables
    String localVarPath = "/v1/remotes/{remote_name}/backups"
      .replaceAll("\\{" + "remote_name" + "\\}", apiClient.escapeString(remoteName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * restore backups
   * restore the specified backups
   * @param remoteName The remote to restore the backup from (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList v1RemotesRemoteNameBackupsRestorePost(String remoteName, BackupRestore body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'remoteName' is set
    if (remoteName == null) {
      throw new ApiException(400, "Missing the required parameter 'remoteName' when calling v1RemotesRemoteNameBackupsRestorePost");
    }
    // create path and map variables
    String localVarPath = "/v1/remotes/{remote_name}/backups/restore"
      .replaceAll("\\{" + "remote_name" + "\\}", apiClient.escapeString(remoteName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * delete backup schedule
   * delete backups to be scheduled to a specific remote
   * @param remoteName The remote to ship the backup to (required)
   * @param scheduleName the schedule with which the backup is being shipped (required)
   * @param rscDfnName the resource definition the schedule is assigned to (optional)
   * @param rscGrpName the resource group the schedule is assigned to (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList v1RemotesRemoteNameBackupsScheduleScheduleNameDeleteDelete(String remoteName, String scheduleName, String rscDfnName, String rscGrpName) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'remoteName' is set
    if (remoteName == null) {
      throw new ApiException(400, "Missing the required parameter 'remoteName' when calling v1RemotesRemoteNameBackupsScheduleScheduleNameDeleteDelete");
    }
    // verify the required parameter 'scheduleName' is set
    if (scheduleName == null) {
      throw new ApiException(400, "Missing the required parameter 'scheduleName' when calling v1RemotesRemoteNameBackupsScheduleScheduleNameDeleteDelete");
    }
    // create path and map variables
    String localVarPath = "/v1/remotes/{remote_name}/backups/schedule/{schedule_name}/delete"
      .replaceAll("\\{" + "remote_name" + "\\}", apiClient.escapeString(remoteName.toString()))
      .replaceAll("\\{" + "schedule_name" + "\\}", apiClient.escapeString(scheduleName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "rsc_dfn_name", rscDfnName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "rsc_grp_name", rscGrpName));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * disable backup schedule
   * disable backups to be scheduled to a specific remote
   * @param remoteName The remote to ship the backup to (required)
   * @param scheduleName the schedule with which the backup is being shipped (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList v1RemotesRemoteNameBackupsScheduleScheduleNameDisablePut(String remoteName, String scheduleName, BackupSchedule body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'remoteName' is set
    if (remoteName == null) {
      throw new ApiException(400, "Missing the required parameter 'remoteName' when calling v1RemotesRemoteNameBackupsScheduleScheduleNameDisablePut");
    }
    // verify the required parameter 'scheduleName' is set
    if (scheduleName == null) {
      throw new ApiException(400, "Missing the required parameter 'scheduleName' when calling v1RemotesRemoteNameBackupsScheduleScheduleNameDisablePut");
    }
    // create path and map variables
    String localVarPath = "/v1/remotes/{remote_name}/backups/schedule/{schedule_name}/disable"
      .replaceAll("\\{" + "remote_name" + "\\}", apiClient.escapeString(remoteName.toString()))
      .replaceAll("\\{" + "schedule_name" + "\\}", apiClient.escapeString(scheduleName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * enable backup schedule
   * enable backups to be scheduled to a specific remote
   * @param remoteName The remote to ship the backup to (required)
   * @param scheduleName the schedule with which the backup should be shipped (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList v1RemotesRemoteNameBackupsScheduleScheduleNameEnablePut(String remoteName, String scheduleName, BackupSchedule body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'remoteName' is set
    if (remoteName == null) {
      throw new ApiException(400, "Missing the required parameter 'remoteName' when calling v1RemotesRemoteNameBackupsScheduleScheduleNameEnablePut");
    }
    // verify the required parameter 'scheduleName' is set
    if (scheduleName == null) {
      throw new ApiException(400, "Missing the required parameter 'scheduleName' when calling v1RemotesRemoteNameBackupsScheduleScheduleNameEnablePut");
    }
    // create path and map variables
    String localVarPath = "/v1/remotes/{remote_name}/backups/schedule/{schedule_name}/enable"
      .replaceAll("\\{" + "remote_name" + "\\}", apiClient.escapeString(remoteName.toString()))
      .replaceAll("\\{" + "schedule_name" + "\\}", apiClient.escapeString(scheduleName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * ships a backup from one Linstor cluster to another
   * ships a backup from one Linstor cluster to another
   * @param remoteName The remote to ship the backup to (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList v1RemotesRemoteNameBackupsShipPost(String remoteName, BackupShip body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'remoteName' is set
    if (remoteName == null) {
      throw new ApiException(400, "Missing the required parameter 'remoteName' when calling v1RemotesRemoteNameBackupsShipPost");
    }
    // create path and map variables
    String localVarPath = "/v1/remotes/{remote_name}/backups/ship"
      .replaceAll("\\{" + "remote_name" + "\\}", apiClient.escapeString(remoteName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * list all s3 remotes
   * list of all known s3 remotes on this cluster
   * @return List&lt;S3Remote&gt;
   * @throws ApiException if fails to make API call
   */
  public List<S3Remote> v1RemotesS3Get() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/v1/remotes/s3";

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

    GenericType<List<S3Remote>> localVarReturnType = new GenericType<List<S3Remote>>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * creates a new s3 remote
   * Creates a new s3 remote unless it already exists
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList v1RemotesS3Post(S3Remote body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/v1/remotes/s3";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * modify a s3 remote
   * modify an existing s3 remote
   * @param remoteName name of the remote (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList v1RemotesS3RemoteNamePut(String remoteName, S3Remote body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'remoteName' is set
    if (remoteName == null) {
      throw new ApiException(400, "Missing the required parameter 'remoteName' when calling v1RemotesS3RemoteNamePut");
    }
    // create path and map variables
    String localVarPath = "/v1/remotes/s3/{remoteName}"
      .replaceAll("\\{" + "remoteName" + "\\}", apiClient.escapeString(remoteName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * List all resource-definition properties
   * List all properties, including their names and descriptions, that can be set for any given resource definition. 
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

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * List all drbd-proxy properties
   * List all properties, including their names and descriptions, that can be set for DRBD proxy on a given resource definition. 
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

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * List all resource-connection properties
   * List all properties, including their names and descriptions, that can be set for any given connection of a particular resource. 
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

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * List all volume properties
   * List all properties, including their names and descriptions, that can be set for any given volume of a particular resource on a particular node. 
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

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * List all resource properties
   * List all properties, including their names and descriptions, that can be set for any given resource in a particular resource definition. 
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

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * List all volume-definition properties
   * List all properties, including their names and descriptions, that can be set for any given volume definition of a particular resource. 
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

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * List all resource-group properties
   * List all properties, including their names and descriptions, that can be set for any given resource group. 
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

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * List all volume-group properties
   * List all properties, including their names and descriptions, that can be set for any given volume group of a particular resource group. 
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

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * list all schedules
   * list of all known schedules on this cluster
   * @return ScheduleList
   * @throws ApiException if fails to make API call
   */
  public ScheduleList v1SchedulesGet() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/v1/schedules";

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

    GenericType<ScheduleList> localVarReturnType = new GenericType<ScheduleList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * creates a new schedule
   * Creates a new schedule unless it already exists
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList v1SchedulesPost(Schedule body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/v1/schedules";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * delete a schedule
   * delete the given schedule
   * @param scheduleName name of the schedule (required)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList v1SchedulesScheduleNameDelete(String scheduleName) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'scheduleName' is set
    if (scheduleName == null) {
      throw new ApiException(400, "Missing the required parameter 'scheduleName' when calling v1SchedulesScheduleNameDelete");
    }
    // create path and map variables
    String localVarPath = "/v1/schedules/{scheduleName}"
      .replaceAll("\\{" + "scheduleName" + "\\}", apiClient.escapeString(scheduleName.toString()));

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

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * modify a schedule
   * modify an existing schedule
   * @param scheduleName name of the schedule (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList v1SchedulesScheduleNamePut(String scheduleName, ScheduleModify body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'scheduleName' is set
    if (scheduleName == null) {
      throw new ApiException(400, "Missing the required parameter 'scheduleName' when calling v1SchedulesScheduleNamePut");
    }
    // create path and map variables
    String localVarPath = "/v1/schedules/{scheduleName}"
      .replaceAll("\\{" + "scheduleName" + "\\}", apiClient.escapeString(scheduleName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * List all storage-pool-definition properties
   * List all properties, including their names and descriptions, that can be set for any given storage pool definition. 
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

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Lists default setting for all EXOS enclosures
   * Lists default setting for all EXOS enclosures
   * @return List&lt;ExosDefaults&gt;
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public List<ExosDefaults> v1VendorSeagateExosDefaultsGet() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/v1/vendor/seagate/exos/defaults";

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

    GenericType<List<ExosDefaults>> localVarReturnType = new GenericType<List<ExosDefaults>>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * List of EXOS enclosures
   * Lists EXOS enclosures including controller IP and health status
   * @param nocache Force recaching before response (optional)
   * @return List&lt;ExosEnclosureHealth&gt;
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public List<ExosEnclosureHealth> v1VendorSeagateExosEnclosuresGet(Boolean nocache) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/v1/vendor/seagate/exos/enclosures";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "nocache", nocache));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<ExosEnclosureHealth>> localVarReturnType = new GenericType<List<ExosEnclosureHealth>>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * list queued snapshots
   * list which snaps are queued on which node
   * @param nodes filter by nodes (optional)
   * @param snapshots filter by snapshots (optional)
   * @param resources filter by resources (optional)
   * @param remotes filter by remotes (optional)
   * @param snapToNode group the result by snaps instead of by nodes (optional)
   * @return BackupQueues
   * @throws ApiException if fails to make API call
   */
  public BackupQueues v1ViewBackupQueueGet(List<String> nodes, List<String> snapshots, List<String> resources, List<String> remotes, Boolean snapToNode) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/v1/view/backup/queue";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "nodes", nodes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "snapshots", snapshots));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "resources", resources));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "remotes", remotes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "snap_to_node", snapToNode));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<BackupQueues> localVarReturnType = new GenericType<BackupQueues>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * list rscDfn-schedule-remote-triples
   * list all schedule-remote-rscDfn-triples
   * @param rsc filter by rsc-name (optional)
   * @param remote filter by remote-name (optional)
   * @param schedule filter by schedule-name (optional)
   * @param activeOnly only list active schedules (optional)
   * @return ScheduledRscsList
   * @throws ApiException if fails to make API call
   */
  public ScheduledRscsList v1ViewSchedulesByResourceGet(String rsc, String remote, String schedule, Boolean activeOnly) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/v1/view/schedules-by-resource";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "rsc", rsc));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "remote", remote));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "schedule", schedule));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "active-only", activeOnly));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ScheduledRscsList> localVarReturnType = new GenericType<ScheduledRscsList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * list schedule-details
   * list the details of all schedules set on a specific rscDfn
   * @param rscName the rscDfn you want to see the schedule-details from (required)
   * @return ScheduleDetailsList
   * @throws ApiException if fails to make API call
   */
  public ScheduleDetailsList v1ViewSchedulesByResourceRscNameGet(String rscName) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'rscName' is set
    if (rscName == null) {
      throw new ApiException(400, "Missing the required parameter 'rscName' when calling v1ViewSchedulesByResourceRscNameGet");
    }
    // create path and map variables
    String localVarPath = "/v1/view/schedules-by-resource/{rscName}"
      .replaceAll("\\{" + "rscName" + "\\}", apiClient.escapeString(rscName.toString()));

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

    GenericType<ScheduleDetailsList> localVarReturnType = new GenericType<ScheduleDetailsList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * show physical storage on nodes, to be used with LINSTOR
   * Gives a grouped list of physical storage that can be turned into a LINSTOR storage-pool
   * @param offset number of records to skip for pagination (optional)
   * @param limit maximum number of records to return (optional)
   * @return List&lt;PhysicalStorage&gt;
   * @throws ApiException if fails to make API call
   */
  public List<PhysicalStorage> viewPhysicaStorage(Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/v1/physical-storage";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<PhysicalStorage>> localVarReturnType = new GenericType<List<PhysicalStorage>>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * query all resources with their volumes
   * This REST-resource should be used if you want to get an overview of all resources with their volumes.
   * @param nodes Filter only for the specified nodes, if not specified, no filtering. (optional)
   * @param resources Filter only for the specified resources, if not specified, no filtering. (optional)
   * @param storagePools Filter only for the specified storage pools, if not specified no filtering. (optional)
   * @param props filter by given properties, full property path (optional)
   * @param offset number of records to skip for pagination (optional)
   * @param limit maximum number of records to return (optional)
   * @return List&lt;ResourceWithVolumes&gt;
   * @throws ApiException if fails to make API call
   */
  public List<ResourceWithVolumes> viewResources(List<String> nodes, List<String> resources, List<String> storagePools, List<String> props, Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/v1/view/resources";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "nodes", nodes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "resources", resources));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "storage_pools", storagePools));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "props", props));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<ResourceWithVolumes>> localVarReturnType = new GenericType<List<ResourceWithVolumes>>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * view current snapshot shippings
   * 
   * @param nodes Filter only for the specified nodes, if not specified, no filtering. (optional)
   * @param resources Filter only for the specified resources, if not specified, no filtering. (optional)
   * @param snapshots Filter only for the specified snapshots, if not specified, no filtering. (optional)
   * @param status Filter only for the specified status, if not specified, no filtering. (optional)
   * @param offset number of records to skip for pagination (optional)
   * @param limit maximum number of records to return (optional)
   * @return List&lt;SnapshotShippingStatus&gt;
   * @throws ApiException if fails to make API call
   */
  public List<SnapshotShippingStatus> viewSnapshotShippings(List<String> nodes, List<String> resources, List<String> snapshots, List<String> status, Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/v1/view/snapshot-shippings";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "nodes", nodes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "resources", resources));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "snapshots", snapshots));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<SnapshotShippingStatus>> localVarReturnType = new GenericType<List<SnapshotShippingStatus>>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * query all snapshots known to linstor
   * This REST-resource should be used if you want to get an overview of all snapshots.
   * @param nodes Filter only for the specified nodes, if not specified, no filtering. (optional)
   * @param resources Filter only for the specified resources, if not specified, no filtering. (optional)
   * @param offset number of records to skip for pagination (optional)
   * @param limit maximum number of records to return (optional)
   * @return List&lt;Snapshot&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Snapshot> viewSnapshots(List<String> nodes, List<String> resources, Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/v1/view/snapshots";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "nodes", nodes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "resources", resources));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Snapshot>> localVarReturnType = new GenericType<List<Snapshot>>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * query all storage pools
   * This REST-resource should be used if you want to get an overview of all storage pools.
   * @param nodes Filter only for the specified nodes, if not specified, no filtering. (optional)
   * @param storagePools Filter only for the specified storage pools, if not specified no filtering. (optional)
   * @param props filter by given properties, full property path (optional)
   * @param offset number of records to skip for pagination (optional)
   * @param limit maximum number of records to return (optional)
   * @param cached query data from cache if available (optional)
   * @return List&lt;StoragePool&gt;
   * @throws ApiException if fails to make API call
   */
  public List<StoragePool> viewStoragePools(List<String> nodes, List<String> storagePools, List<String> props, Integer offset, Integer limit, Boolean cached) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/v1/view/storage-pools";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "nodes", nodes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "storage_pools", storagePools));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "props", props));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cached", cached));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<StoragePool>> localVarReturnType = new GenericType<List<StoragePool>>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * add a volume-definition to a resource
   * Adds a volume-definition.  Required properties is only &#x60;size&#x60;, all other will be auto generated if not given. 
   * @param resource resource to use (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList volumeDefinitionCreate(String resource, VolumeDefinitionCreate body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling volumeDefinitionCreate");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/volume-definitions"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * delete a volume-definition
   * Delete a volume-definition
   * @param resource resource to use (required)
   * @param volumeNumber Volume number of the definition (required)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList volumeDefinitionDelete(String resource, Integer volumeNumber) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling volumeDefinitionDelete");
    }
    // verify the required parameter 'volumeNumber' is set
    if (volumeNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'volumeNumber' when calling volumeDefinitionDelete");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/volume-definitions/{volume_number}"
      .replaceAll("\\{" + "resource" + "\\}", apiClient.escapeString(resource.toString()))
      .replaceAll("\\{" + "volume_number" + "\\}", apiClient.escapeString(volumeNumber.toString()));

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

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * lists all volume-definitions
   * Lists all volume definitions.  A single volume definition can be queried by adding its name to the resource string like:  /v1/resource-definitions/rsc1/volume-definitions/0 
   * @param resource resource to use (required)
   * @param offset number of records to skip for pagination (optional)
   * @param limit maximum number of records to return (optional)
   * @return List&lt;VolumeDefinition&gt;
   * @throws ApiException if fails to make API call
   */
  public List<VolumeDefinition> volumeDefinitionList(String resource, Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling volumeDefinitionList");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/volume-definitions"
      .replaceAll("\\{" + "resource" + "\\}", apiClient.escapeString(resource.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<VolumeDefinition>> localVarReturnType = new GenericType<List<VolumeDefinition>>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * modify a volume-definition
   * Sets or modifies properties  Possible properties are: - &#x60;StorPoolName&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Linstor storage pool name to use.  - &#x60;StorPoolNameDrbdMeta&#x60; - regex[&#x60;^|.internal|[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Linstor storage pool name to use for external metadata.  - &#x60;OverrideVlmId&#x60; - regex[&#x60;.*&#x60;]      Overwrites the generated &#x27;&lt;resource-name&gt;_&lt;5 digit volume number&gt;&#x27; volume name for migration purposes  - &#x60;FileSystem/Type&#x60; - enum      File system type to use      * ext4     * xfs  - &#x60;FileSystem/MkfsParams&#x60; - string      Additional parameters for the mkfs command  - &#x60;StorDriver/LvcreateType&#x60; - enum     * linear     * striped     * mirror     * raid0     * raid1     * raid4     * raid5     * raid6     * raid10     * lzma     * lz4  - &#x60;StorDriver/LvcreateOptions&#x60; - regex[&#x60;.*&#x60;]      Additional parameters added to every &#x27;lvcreate ... &#x27; command  - &#x60;StorDriver/ZfscreateOptions&#x60; - regex[&#x60;.*&#x60;]      Additional parameters added to every &#x27;zfs create ... &#x27; command  - &#x60;DrbdCurrentGi&#x60; - regex[&#x60;[a-fA-F0-9]{16}&#x60;]      Initial DRBD generation id, if initial sync is skipped, this ID will be set  - &#x60;sys/fs/blkio_throttle_read&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.read_bps_device  - &#x60;sys/fs/blkio_throttle_write&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.write_bps_device  - &#x60;sys/fs/blkio_throttle_read_iops&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.read_iops_device  - &#x60;sys/fs/blkio_throttle_write_iops&#x60; - long      Sets the /sys/fs/cgroup/blkio/blkio.throttle.write_iops_device  - &#x60;Writecache/PoolName&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Linstor storage pool name for writecache  - &#x60;Writecache/Size&#x60; - regex[&#x60;^100%|[0-9]{1,2}([.][0-9]*)?%|[1-9][0-9]{2,}$&#x60;]      Size of the writecache in % (0-100) or KiB otherwise  - &#x60;Writecache/Options/StartSector&#x60; - long      offset from the start of cache device in 512-byte sectors  - &#x60;Writecache/Options/HighWatermark&#x60; - long      start writeback when the number of used blocks reach this watermark  - &#x60;Writecache/Options/LowWatermark&#x60; - long      stop writeback when the number of used blocks drops below this watermark  - &#x60;Writecache/Options/WritebackJobs&#x60; - long      limit the number of blocks that are in flight during writeback. Setting this value reduces writeback throughput, but it may improve latency of read requests  - &#x60;Writecache/Options/AutocommitBlocks&#x60; - long      when the application writes this amount of blocks without issuing the FLUSH request, the blocks are automatically commited  - &#x60;Writecache/Options/AutocommitTime&#x60; - long      autocommit time in milliseconds. The data is automatically commited if this time passes and no FLUSH request is received  - &#x60;Writecache/Options/Fua&#x60; - enum      \&quot;On\&quot; results in \&quot;fua\&quot; as argument, whereas the value \&quot;Off\&quot; results in \&quot;nofua\&quot; argument      * On     * Off  - &#x60;Writecache/Options/Additional&#x60; - string      Additional arguments passed through  - &#x60;Cache/OpMode&#x60; - enum      Operation mode      * writeback     * writethrough     * passthrough  - &#x60;Cache/MetaPool&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Name of the storage pool used for the cache metadata. If not specified, this will default to the CachePool property  - &#x60;Cache/Metasize&#x60; - regex[&#x60;^100%|[0-9]{1,2}([.][0-9]*)?%|[1-9][0-9]{2,}$&#x60;]      Size of the cache in % (0-100) or KiB otherwise.  - &#x60;Cache/CachePool&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Name of the storage pool used for the cache cache device  - &#x60;Cache/Cachesize&#x60; - regex[&#x60;^100%|[0-9]{1,2}([.][0-9]*)?%|[1-9][0-9]{2,}$&#x60;]      Size of the cache in % (0-100) or KiB otherwise.  - &#x60;Cache/Blocksize&#x60; - long      Block size  - &#x60;Cache/Policy&#x60; - enum      Replacemant policy      * mq     * smq     * cleaner  - &#x60;DrbdOptions/Disk/on-io-error&#x60; - enum     * pass_on     * call-local-io-error     * detach  - &#x60;DrbdOptions/Disk/disk-barrier&#x60; - boolean - &#x60;DrbdOptions/Disk/disk-flushes&#x60; - boolean - &#x60;DrbdOptions/Disk/disk-drain&#x60; - boolean - &#x60;DrbdOptions/Disk/md-flushes&#x60; - boolean - &#x60;DrbdOptions/Disk/resync-after&#x60; - string - &#x60;DrbdOptions/Disk/al-extents&#x60; - range[&#x60;67-65534&#x60;] - &#x60;DrbdOptions/Disk/al-updates&#x60; - boolean - &#x60;DrbdOptions/Disk/discard-zeroes-if-aligned&#x60; - boolean - &#x60;DrbdOptions/Disk/disable-write-same&#x60; - boolean - &#x60;DrbdOptions/Disk/disk-timeout&#x60; - range[&#x60;0-6000&#x60;] - &#x60;DrbdOptions/Disk/read-balancing&#x60; - enum     * prefer-local     * prefer-remote     * round-robin     * least-pending     * when-congested-remote     * 32K-striping     * 64K-striping     * 128K-striping     * 256K-striping     * 512K-striping     * 1M-striping  - &#x60;DrbdOptions/Disk/rs-discard-granularity&#x60; - range[&#x60;0-1048576&#x60;] 
   * @param resource resource to use (required)
   * @param volumeNumber Volume number of the definition (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList volumeDefinitionModify(String resource, Integer volumeNumber, VolumeDefinitionModify body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling volumeDefinitionModify");
    }
    // verify the required parameter 'volumeNumber' is set
    if (volumeNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'volumeNumber' when calling volumeDefinitionModify");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/volume-definitions/{volume_number}"
      .replaceAll("\\{" + "resource" + "\\}", apiClient.escapeString(resource.toString()))
      .replaceAll("\\{" + "volume_number" + "\\}", apiClient.escapeString(volumeNumber.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * modify encryption passphrase for a volume definition
   * Sets a new user provied encryption passphrase
   * @param resource resource to use (required)
   * @param volumeNumber Volume number of the definition (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList volumeDefinitionModifyPassphrase(String resource, Integer volumeNumber, VolumeDefinitionModifyPassphrase body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling volumeDefinitionModifyPassphrase");
    }
    // verify the required parameter 'volumeNumber' is set
    if (volumeNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'volumeNumber' when calling volumeDefinitionModifyPassphrase");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/volume-definitions/{volume_number}/encryption-passphrase"
      .replaceAll("\\{" + "resource" + "\\}", apiClient.escapeString(resource.toString()))
      .replaceAll("\\{" + "volume_number" + "\\}", apiClient.escapeString(volumeNumber.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * add a volume-group to a resource-group
   * Adds a volume-group. 
   * @param resourceGroup resource group to use (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList volumeGroupCreate(String resourceGroup, VolumeGroup body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'resourceGroup' is set
    if (resourceGroup == null) {
      throw new ApiException(400, "Missing the required parameter 'resourceGroup' when calling volumeGroupCreate");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-groups/{resource_group}/volume-groups"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * delete a volume-group
   * Delete a volume-group
   * @param resourceGroup resource group to use (required)
   * @param volumeNumber Volume number of the definition (required)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList volumeGroupDelete(String resourceGroup, Integer volumeNumber) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'resourceGroup' is set
    if (resourceGroup == null) {
      throw new ApiException(400, "Missing the required parameter 'resourceGroup' when calling volumeGroupDelete");
    }
    // verify the required parameter 'volumeNumber' is set
    if (volumeNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'volumeNumber' when calling volumeGroupDelete");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-groups/{resource_group}/volume-groups/{volume_number}"
      .replaceAll("\\{" + "resource_group" + "\\}", apiClient.escapeString(resourceGroup.toString()))
      .replaceAll("\\{" + "volume_number" + "\\}", apiClient.escapeString(volumeNumber.toString()));

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

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * lists all volume-groups
   * Lists all volume groups.  A single volume group can be queried by adding its name to the resource string like:  /v1/resource-groups/rscgrp1/volume-groups/0 
   * @param resourceGroup resource group to use (required)
   * @param offset number of records to skip for pagination (optional)
   * @param limit maximum number of records to return (optional)
   * @return List&lt;VolumeGroup&gt;
   * @throws ApiException if fails to make API call
   */
  public List<VolumeGroup> volumeGroupList(String resourceGroup, Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'resourceGroup' is set
    if (resourceGroup == null) {
      throw new ApiException(400, "Missing the required parameter 'resourceGroup' when calling volumeGroupList");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-groups/{resource_group}/volume-groups"
      .replaceAll("\\{" + "resource_group" + "\\}", apiClient.escapeString(resourceGroup.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<VolumeGroup>> localVarReturnType = new GenericType<List<VolumeGroup>>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * modify a volume-group
   * Sets or modifies properties  Possible properties are: - &#x60;StorPoolName&#x60; - regex[&#x60;^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,47}$&#x60;]      Linstor storage pool name to use.  - &#x60;OverrideVlmId&#x60; - regex[&#x60;.*&#x60;]      Overwrites the generated &#x27;&lt;resource-name&gt;_&lt;5 digit volume number&gt;&#x27; volume name for migration purposes  - &#x60;AllowLargerVolumeSize&#x60; - boolean_true_false      Do not fail when the underlying volume is larger than expected  - &#x60;FileSystem/Type&#x60; - enum      File system type to use      * ext4     * xfs  - &#x60;FileSystem/MkfsParams&#x60; - string      Additional parameters for the mkfs command  - &#x60;StorDriver/LvcreateType&#x60; - enum     * linear     * striped     * mirror     * raid0     * raid1     * raid4     * raid5     * raid6     * raid10     * lzma     * lz4  - &#x60;DrbdCurrentGi&#x60; - regex[&#x60;[a-fA-F0-9]{16}&#x60;] - &#x60;DrbdOptions/Disk/read-balancing&#x60; - enum     * prefer-local     * prefer-remote     * round-robin     * least-pending     * when-congested-remote     * 32K-striping     * 64K-striping     * 128K-striping     * 256K-striping     * 512K-striping     * 1M-striping  - &#x60;DrbdOptions/Disk/on-io-error&#x60; - enum     * pass_on     * call-local-io-error     * detach  - &#x60;DrbdOptions/Disk/disk-drain&#x60; - boolean - &#x60;DrbdOptions/Disk/resync-after&#x60; - string - &#x60;DrbdOptions/Disk/disk-timeout&#x60; - range[&#x60;0-6000&#x60;] - &#x60;DrbdOptions/Disk/disable-write-same&#x60; - boolean - &#x60;DrbdOptions/Disk/rs-discard-granularity&#x60; - range[&#x60;0-1048576&#x60;] - &#x60;DrbdOptions/Disk/disk-flushes&#x60; - boolean - &#x60;DrbdOptions/Disk/al-extents&#x60; - range[&#x60;67-65534&#x60;] - &#x60;DrbdOptions/Disk/al-updates&#x60; - boolean - &#x60;DrbdOptions/Disk/md-flushes&#x60; - boolean - &#x60;DrbdOptions/Disk/disk-barrier&#x60; - boolean - &#x60;DrbdOptions/Disk/discard-zeroes-if-aligned&#x60; - boolean 
   * @param resourceGroup resource group to use (required)
   * @param volumeNumber Volume number of the definition (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList volumeGroupModify(String resourceGroup, Integer volumeNumber, VolumeGroupModify body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'resourceGroup' is set
    if (resourceGroup == null) {
      throw new ApiException(400, "Missing the required parameter 'resourceGroup' when calling volumeGroupModify");
    }
    // verify the required parameter 'volumeNumber' is set
    if (volumeNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'volumeNumber' when calling volumeGroupModify");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-groups/{resource_group}/volume-groups/{volume_number}"
      .replaceAll("\\{" + "resource_group" + "\\}", apiClient.escapeString(resourceGroup.toString()))
      .replaceAll("\\{" + "volume_number" + "\\}", apiClient.escapeString(volumeNumber.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * modify a volume
   * Sets or modifies properties  Possible properties are: - &#x60;sys/fs/blkio_throttle_read&#x60; - number - &#x60;sys/fs/blkio_throttle_write&#x60; - number 
   * @param resource resource to use (required)
   * @param node node to use (required)
   * @param volumeNumber Volume number of the definition (required)
   * @param body  (optional)
   * @return ApiCallRcList
   * @throws ApiException if fails to make API call
   */
  public ApiCallRcList volumeModify(String resource, String node, Integer volumeNumber, VolumeModify body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'resource' is set
    if (resource == null) {
      throw new ApiException(400, "Missing the required parameter 'resource' when calling volumeModify");
    }
    // verify the required parameter 'node' is set
    if (node == null) {
      throw new ApiException(400, "Missing the required parameter 'node' when calling volumeModify");
    }
    // verify the required parameter 'volumeNumber' is set
    if (volumeNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'volumeNumber' when calling volumeModify");
    }
    // create path and map variables
    String localVarPath = "/v1/resource-definitions/{resource}/resources/{node}/volumes/{volume_number}"
      .replaceAll("\\{" + "resource" + "\\}", apiClient.escapeString(resource.toString()))
      .replaceAll("\\{" + "node" + "\\}", apiClient.escapeString(node.toString()))
      .replaceAll("\\{" + "volume_number" + "\\}", apiClient.escapeString(volumeNumber.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiCallRcList> localVarReturnType = new GenericType<ApiCallRcList>() {};

    if (headers != null) {
      localVarHeaderParams.putAll(headers);
    }

    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
