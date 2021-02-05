# DrbdProxyModify

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**overrideProps** | [**Properties**](Properties.md) |  |  [optional]
**deleteProps** | **List&lt;String&gt;** |  |  [optional]
**compressionType** | [**CompressionTypeEnum**](#CompressionTypeEnum) | Compression type used by the proxy.  |  [optional]
**compressionProps** | [**Properties**](Properties.md) |  |  [optional]

<a name="CompressionTypeEnum"></a>
## Enum: CompressionTypeEnum
Name | Value
---- | -----
NONE | &quot;none&quot;
ZLIB | &quot;zlib&quot;
LZMA | &quot;lzma&quot;
LZ4 | &quot;lz4&quot;
