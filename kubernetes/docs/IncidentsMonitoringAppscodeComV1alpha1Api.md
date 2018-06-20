# IncidentsMonitoringAppscodeComV1alpha1Api

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNamespacedAcknowledgement**](IncidentsMonitoringAppscodeComV1alpha1Api.md#createNamespacedAcknowledgement) | **POST** /apis/incidents.monitoring.appscode.com/v1alpha1/namespaces/{namespace}/acknowledgements | 
[**deleteNamespacedAcknowledgement**](IncidentsMonitoringAppscodeComV1alpha1Api.md#deleteNamespacedAcknowledgement) | **DELETE** /apis/incidents.monitoring.appscode.com/v1alpha1/namespaces/{namespace}/acknowledgements/{name} | 
[**getAPIResources**](IncidentsMonitoringAppscodeComV1alpha1Api.md#getAPIResources) | **GET** /apis/incidents.monitoring.appscode.com/v1alpha1/ | 


<a name="createNamespacedAcknowledgement"></a>
# **createNamespacedAcknowledgement**
> V1alpha1Acknowledgement createNamespacedAcknowledgement(namespace, body, pretty)



create an Acknowledgement

### Example
```java
// Import classes:
//import com.appscode.searchlight.client.ApiException;
//import com.appscode.searchlight.client.apis.IncidentsMonitoringAppscodeComV1alpha1Api;


IncidentsMonitoringAppscodeComV1alpha1Api apiInstance = new IncidentsMonitoringAppscodeComV1alpha1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
V1alpha1Acknowledgement body = new V1alpha1Acknowledgement(); // V1alpha1Acknowledgement | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1alpha1Acknowledgement result = apiInstance.createNamespacedAcknowledgement(namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IncidentsMonitoringAppscodeComV1alpha1Api#createNamespacedAcknowledgement");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**V1alpha1Acknowledgement**](V1alpha1Acknowledgement.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1alpha1Acknowledgement**](V1alpha1Acknowledgement.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="deleteNamespacedAcknowledgement"></a>
# **deleteNamespacedAcknowledgement**
> V1Status deleteNamespacedAcknowledgement(name, namespace, body, gracePeriodSeconds, orphanDependents, pretty, propagationPolicy)



delete an Acknowledgement

### Example
```java
// Import classes:
//import com.appscode.searchlight.client.ApiException;
//import com.appscode.searchlight.client.apis.IncidentsMonitoringAppscodeComV1alpha1Api;


IncidentsMonitoringAppscodeComV1alpha1Api apiInstance = new IncidentsMonitoringAppscodeComV1alpha1Api();
String name = "name_example"; // String | name of the Acknowledgement
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
V1DeleteOptions body = new V1DeleteOptions(); // V1DeleteOptions | 
Integer gracePeriodSeconds = 56; // Integer | The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately.
Boolean orphanDependents = true; // Boolean | Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \"orphan\" finalizer will be added to/removed from the object's finalizers list. Either this field or PropagationPolicy may be set, but not both.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String propagationPolicy = "propagationPolicy_example"; // String | Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: 'Orphan' - orphan the dependents; 'Background' - allow the garbage collector to delete the dependents in the background; 'Foreground' - a cascading policy that deletes all dependents in the foreground.
try {
    V1Status result = apiInstance.deleteNamespacedAcknowledgement(name, namespace, body, gracePeriodSeconds, orphanDependents, pretty, propagationPolicy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IncidentsMonitoringAppscodeComV1alpha1Api#deleteNamespacedAcknowledgement");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the Acknowledgement |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**V1DeleteOptions**](V1DeleteOptions.md)|  |
 **gracePeriodSeconds** | **Integer**| The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. | [optional]
 **orphanDependents** | **Boolean**| Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. | [optional]
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **propagationPolicy** | **String**| Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; - allow the garbage collector to delete the dependents in the background; &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground. | [optional]

### Return type

[**V1Status**](V1Status.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="getAPIResources"></a>
# **getAPIResources**
> V1APIResourceList getAPIResources()



get available resources

### Example
```java
// Import classes:
//import com.appscode.searchlight.client.ApiException;
//import com.appscode.searchlight.client.apis.IncidentsMonitoringAppscodeComV1alpha1Api;


IncidentsMonitoringAppscodeComV1alpha1Api apiInstance = new IncidentsMonitoringAppscodeComV1alpha1Api();
try {
    V1APIResourceList result = apiInstance.getAPIResources();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IncidentsMonitoringAppscodeComV1alpha1Api#getAPIResources");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**V1APIResourceList**](V1APIResourceList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/yaml, application/vnd.kubernetes.protobuf
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

