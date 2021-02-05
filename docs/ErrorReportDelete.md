# ErrorReportDelete

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**since** | **Long** | timestamp in millis start date to delete |  [optional]
**to** | **Long** | timestamp in millis for the end date to delete |  [optional]
**nodes** | **List&lt;String&gt;** | on which nodes to delete error-reports, if empty/null all nodes |  [optional]
**exception** | **String** | delete all error reports with the given exception |  [optional]
**version** | **String** | delete all error reports from the given version |  [optional]
**ids** | **List&lt;String&gt;** | error report ids to delete |  [optional]
