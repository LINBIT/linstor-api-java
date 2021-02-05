# ErrorReport

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nodeName** | **String** |  |  [optional]
**errorTime** | **Long** |  | 
**filename** | **String** | Filename of the error report on the server.  Format is: &#x60;&#x60;&#x60;ErrorReport-{instanceid}-{nodeid}-{sequencenumber}.log&#x60;&#x60;&#x60;  |  [optional]
**text** | **String** | Contains the full text of the error report file. |  [optional]
**module** | **String** | Which module this error occurred. |  [optional]
**version** | **String** | Linstor version this error report was created. |  [optional]
**peer** | **String** | Peer client that was involved. |  [optional]
**exception** | **String** | Exception that occurred |  [optional]
**exceptionMessage** | **String** | Exception message |  [optional]
**originFile** | **String** | Origin file of the exception |  [optional]
**originMethod** | **String** | Origin method where the exception occurred |  [optional]
**originLine** | **Integer** | Origin line number |  [optional]
