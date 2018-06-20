# IncidentsMonitoringAppscodeComApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAPIGroup**](IncidentsMonitoringAppscodeComApi.md#getAPIGroup) | **GET** /apis/incidents.monitoring.appscode.com/ | 


<a name="getAPIGroup"></a>
# **getAPIGroup**
> V1APIGroup getAPIGroup()



get information of a group

### Example
```java
// Import classes:
//import com.appscode.searchlight.client.ApiException;
//import com.appscode.searchlight.client.apis.IncidentsMonitoringAppscodeComApi;


IncidentsMonitoringAppscodeComApi apiInstance = new IncidentsMonitoringAppscodeComApi();
try {
    V1APIGroup result = apiInstance.getAPIGroup();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IncidentsMonitoringAppscodeComApi#getAPIGroup");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**V1APIGroup**](V1APIGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/yaml, application/vnd.kubernetes.protobuf
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

