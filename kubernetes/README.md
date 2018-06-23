# client-java

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.appscode.searchlight</groupId>
    <artifactId>client-java</artifactId>
    <version>0.1.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.appscode.searchlight:client-java:0.1.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/client-java-0.1.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.appscode.searchlight.client.*;
import com.appscode.searchlight.client.auth.*;
import com.appscode.searchlight.client.models.*;
import com.appscode.searchlight.client.apis.ApisApi;

import java.io.File;
import java.util.*;

public class ApisApiExample {

    public static void main(String[] args) {
        
        ApisApi apiInstance = new ApisApi();
        try {
            V1APIGroupList result = apiInstance.getAPIVersions();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApisApi#getAPIVersions");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApisApi* | [**getAPIVersions**](docs/ApisApi.md#getAPIVersions) | **GET** /apis/ | 
*IncidentsMonitoringAppscodeComApi* | [**getAPIGroup**](docs/IncidentsMonitoringAppscodeComApi.md#getAPIGroup) | **GET** /apis/incidents.monitoring.appscode.com/ | 
*IncidentsMonitoringAppscodeComV1alpha1Api* | [**createNamespacedAcknowledgement**](docs/IncidentsMonitoringAppscodeComV1alpha1Api.md#createNamespacedAcknowledgement) | **POST** /apis/incidents.monitoring.appscode.com/v1alpha1/namespaces/{namespace}/acknowledgements | 
*IncidentsMonitoringAppscodeComV1alpha1Api* | [**deleteNamespacedAcknowledgement**](docs/IncidentsMonitoringAppscodeComV1alpha1Api.md#deleteNamespacedAcknowledgement) | **DELETE** /apis/incidents.monitoring.appscode.com/v1alpha1/namespaces/{namespace}/acknowledgements/{name} | 
*IncidentsMonitoringAppscodeComV1alpha1Api* | [**getAPIResources**](docs/IncidentsMonitoringAppscodeComV1alpha1Api.md#getAPIResources) | **GET** /apis/incidents.monitoring.appscode.com/v1alpha1/ | 
*MonitoringAppscodeComApi* | [**getAPIGroup**](docs/MonitoringAppscodeComApi.md#getAPIGroup) | **GET** /apis/monitoring.appscode.com/ | 
*MonitoringAppscodeComV1alpha1Api* | [**createNamespacedClusterAlert**](docs/MonitoringAppscodeComV1alpha1Api.md#createNamespacedClusterAlert) | **POST** /apis/monitoring.appscode.com/v1alpha1/namespaces/{namespace}/clusteralerts | 
*MonitoringAppscodeComV1alpha1Api* | [**createNamespacedIncident**](docs/MonitoringAppscodeComV1alpha1Api.md#createNamespacedIncident) | **POST** /apis/monitoring.appscode.com/v1alpha1/namespaces/{namespace}/incidents | 
*MonitoringAppscodeComV1alpha1Api* | [**createNamespacedNodeAlert**](docs/MonitoringAppscodeComV1alpha1Api.md#createNamespacedNodeAlert) | **POST** /apis/monitoring.appscode.com/v1alpha1/namespaces/{namespace}/nodealerts | 
*MonitoringAppscodeComV1alpha1Api* | [**createNamespacedPodAlert**](docs/MonitoringAppscodeComV1alpha1Api.md#createNamespacedPodAlert) | **POST** /apis/monitoring.appscode.com/v1alpha1/namespaces/{namespace}/podalerts | 
*MonitoringAppscodeComV1alpha1Api* | [**createNamespacedSearchlightPlugin**](docs/MonitoringAppscodeComV1alpha1Api.md#createNamespacedSearchlightPlugin) | **POST** /apis/monitoring.appscode.com/v1alpha1/namespaces/{namespace}/searchlightplugins | 
*MonitoringAppscodeComV1alpha1Api* | [**deleteCollectionNamespacedClusterAlert**](docs/MonitoringAppscodeComV1alpha1Api.md#deleteCollectionNamespacedClusterAlert) | **DELETE** /apis/monitoring.appscode.com/v1alpha1/namespaces/{namespace}/clusteralerts | 
*MonitoringAppscodeComV1alpha1Api* | [**deleteCollectionNamespacedIncident**](docs/MonitoringAppscodeComV1alpha1Api.md#deleteCollectionNamespacedIncident) | **DELETE** /apis/monitoring.appscode.com/v1alpha1/namespaces/{namespace}/incidents | 
*MonitoringAppscodeComV1alpha1Api* | [**deleteCollectionNamespacedNodeAlert**](docs/MonitoringAppscodeComV1alpha1Api.md#deleteCollectionNamespacedNodeAlert) | **DELETE** /apis/monitoring.appscode.com/v1alpha1/namespaces/{namespace}/nodealerts | 
*MonitoringAppscodeComV1alpha1Api* | [**deleteCollectionNamespacedPodAlert**](docs/MonitoringAppscodeComV1alpha1Api.md#deleteCollectionNamespacedPodAlert) | **DELETE** /apis/monitoring.appscode.com/v1alpha1/namespaces/{namespace}/podalerts | 
*MonitoringAppscodeComV1alpha1Api* | [**deleteCollectionNamespacedSearchlightPlugin**](docs/MonitoringAppscodeComV1alpha1Api.md#deleteCollectionNamespacedSearchlightPlugin) | **DELETE** /apis/monitoring.appscode.com/v1alpha1/namespaces/{namespace}/searchlightplugins | 
*MonitoringAppscodeComV1alpha1Api* | [**deleteNamespacedClusterAlert**](docs/MonitoringAppscodeComV1alpha1Api.md#deleteNamespacedClusterAlert) | **DELETE** /apis/monitoring.appscode.com/v1alpha1/namespaces/{namespace}/clusteralerts/{name} | 
*MonitoringAppscodeComV1alpha1Api* | [**deleteNamespacedIncident**](docs/MonitoringAppscodeComV1alpha1Api.md#deleteNamespacedIncident) | **DELETE** /apis/monitoring.appscode.com/v1alpha1/namespaces/{namespace}/incidents/{name} | 
*MonitoringAppscodeComV1alpha1Api* | [**deleteNamespacedNodeAlert**](docs/MonitoringAppscodeComV1alpha1Api.md#deleteNamespacedNodeAlert) | **DELETE** /apis/monitoring.appscode.com/v1alpha1/namespaces/{namespace}/nodealerts/{name} | 
*MonitoringAppscodeComV1alpha1Api* | [**deleteNamespacedPodAlert**](docs/MonitoringAppscodeComV1alpha1Api.md#deleteNamespacedPodAlert) | **DELETE** /apis/monitoring.appscode.com/v1alpha1/namespaces/{namespace}/podalerts/{name} | 
*MonitoringAppscodeComV1alpha1Api* | [**deleteNamespacedSearchlightPlugin**](docs/MonitoringAppscodeComV1alpha1Api.md#deleteNamespacedSearchlightPlugin) | **DELETE** /apis/monitoring.appscode.com/v1alpha1/namespaces/{namespace}/searchlightplugins/{name} | 
*MonitoringAppscodeComV1alpha1Api* | [**getAPIResources**](docs/MonitoringAppscodeComV1alpha1Api.md#getAPIResources) | **GET** /apis/monitoring.appscode.com/v1alpha1/ | 
*MonitoringAppscodeComV1alpha1Api* | [**listClusterAlertForAllNamespaces**](docs/MonitoringAppscodeComV1alpha1Api.md#listClusterAlertForAllNamespaces) | **GET** /apis/monitoring.appscode.com/v1alpha1/clusteralerts | 
*MonitoringAppscodeComV1alpha1Api* | [**listIncidentForAllNamespaces**](docs/MonitoringAppscodeComV1alpha1Api.md#listIncidentForAllNamespaces) | **GET** /apis/monitoring.appscode.com/v1alpha1/incidents | 
*MonitoringAppscodeComV1alpha1Api* | [**listNamespacedClusterAlert**](docs/MonitoringAppscodeComV1alpha1Api.md#listNamespacedClusterAlert) | **GET** /apis/monitoring.appscode.com/v1alpha1/namespaces/{namespace}/clusteralerts | 
*MonitoringAppscodeComV1alpha1Api* | [**listNamespacedIncident**](docs/MonitoringAppscodeComV1alpha1Api.md#listNamespacedIncident) | **GET** /apis/monitoring.appscode.com/v1alpha1/namespaces/{namespace}/incidents | 
*MonitoringAppscodeComV1alpha1Api* | [**listNamespacedNodeAlert**](docs/MonitoringAppscodeComV1alpha1Api.md#listNamespacedNodeAlert) | **GET** /apis/monitoring.appscode.com/v1alpha1/namespaces/{namespace}/nodealerts | 
*MonitoringAppscodeComV1alpha1Api* | [**listNamespacedPodAlert**](docs/MonitoringAppscodeComV1alpha1Api.md#listNamespacedPodAlert) | **GET** /apis/monitoring.appscode.com/v1alpha1/namespaces/{namespace}/podalerts | 
*MonitoringAppscodeComV1alpha1Api* | [**listNamespacedSearchlightPlugin**](docs/MonitoringAppscodeComV1alpha1Api.md#listNamespacedSearchlightPlugin) | **GET** /apis/monitoring.appscode.com/v1alpha1/namespaces/{namespace}/searchlightplugins | 
*MonitoringAppscodeComV1alpha1Api* | [**listNodeAlertForAllNamespaces**](docs/MonitoringAppscodeComV1alpha1Api.md#listNodeAlertForAllNamespaces) | **GET** /apis/monitoring.appscode.com/v1alpha1/nodealerts | 
*MonitoringAppscodeComV1alpha1Api* | [**listPodAlertForAllNamespaces**](docs/MonitoringAppscodeComV1alpha1Api.md#listPodAlertForAllNamespaces) | **GET** /apis/monitoring.appscode.com/v1alpha1/podalerts | 
*MonitoringAppscodeComV1alpha1Api* | [**listSearchlightPluginForAllNamespaces**](docs/MonitoringAppscodeComV1alpha1Api.md#listSearchlightPluginForAllNamespaces) | **GET** /apis/monitoring.appscode.com/v1alpha1/searchlightplugins | 
*MonitoringAppscodeComV1alpha1Api* | [**patchNamespacedClusterAlert**](docs/MonitoringAppscodeComV1alpha1Api.md#patchNamespacedClusterAlert) | **PATCH** /apis/monitoring.appscode.com/v1alpha1/namespaces/{namespace}/clusteralerts/{name} | 
*MonitoringAppscodeComV1alpha1Api* | [**patchNamespacedIncident**](docs/MonitoringAppscodeComV1alpha1Api.md#patchNamespacedIncident) | **PATCH** /apis/monitoring.appscode.com/v1alpha1/namespaces/{namespace}/incidents/{name} | 
*MonitoringAppscodeComV1alpha1Api* | [**patchNamespacedNodeAlert**](docs/MonitoringAppscodeComV1alpha1Api.md#patchNamespacedNodeAlert) | **PATCH** /apis/monitoring.appscode.com/v1alpha1/namespaces/{namespace}/nodealerts/{name} | 
*MonitoringAppscodeComV1alpha1Api* | [**patchNamespacedPodAlert**](docs/MonitoringAppscodeComV1alpha1Api.md#patchNamespacedPodAlert) | **PATCH** /apis/monitoring.appscode.com/v1alpha1/namespaces/{namespace}/podalerts/{name} | 
*MonitoringAppscodeComV1alpha1Api* | [**patchNamespacedSearchlightPlugin**](docs/MonitoringAppscodeComV1alpha1Api.md#patchNamespacedSearchlightPlugin) | **PATCH** /apis/monitoring.appscode.com/v1alpha1/namespaces/{namespace}/searchlightplugins/{name} | 
*MonitoringAppscodeComV1alpha1Api* | [**readNamespacedClusterAlert**](docs/MonitoringAppscodeComV1alpha1Api.md#readNamespacedClusterAlert) | **GET** /apis/monitoring.appscode.com/v1alpha1/namespaces/{namespace}/clusteralerts/{name} | 
*MonitoringAppscodeComV1alpha1Api* | [**readNamespacedIncident**](docs/MonitoringAppscodeComV1alpha1Api.md#readNamespacedIncident) | **GET** /apis/monitoring.appscode.com/v1alpha1/namespaces/{namespace}/incidents/{name} | 
*MonitoringAppscodeComV1alpha1Api* | [**readNamespacedNodeAlert**](docs/MonitoringAppscodeComV1alpha1Api.md#readNamespacedNodeAlert) | **GET** /apis/monitoring.appscode.com/v1alpha1/namespaces/{namespace}/nodealerts/{name} | 
*MonitoringAppscodeComV1alpha1Api* | [**readNamespacedPodAlert**](docs/MonitoringAppscodeComV1alpha1Api.md#readNamespacedPodAlert) | **GET** /apis/monitoring.appscode.com/v1alpha1/namespaces/{namespace}/podalerts/{name} | 
*MonitoringAppscodeComV1alpha1Api* | [**readNamespacedSearchlightPlugin**](docs/MonitoringAppscodeComV1alpha1Api.md#readNamespacedSearchlightPlugin) | **GET** /apis/monitoring.appscode.com/v1alpha1/namespaces/{namespace}/searchlightplugins/{name} | 
*MonitoringAppscodeComV1alpha1Api* | [**replaceNamespacedClusterAlert**](docs/MonitoringAppscodeComV1alpha1Api.md#replaceNamespacedClusterAlert) | **PUT** /apis/monitoring.appscode.com/v1alpha1/namespaces/{namespace}/clusteralerts/{name} | 
*MonitoringAppscodeComV1alpha1Api* | [**replaceNamespacedIncident**](docs/MonitoringAppscodeComV1alpha1Api.md#replaceNamespacedIncident) | **PUT** /apis/monitoring.appscode.com/v1alpha1/namespaces/{namespace}/incidents/{name} | 
*MonitoringAppscodeComV1alpha1Api* | [**replaceNamespacedNodeAlert**](docs/MonitoringAppscodeComV1alpha1Api.md#replaceNamespacedNodeAlert) | **PUT** /apis/monitoring.appscode.com/v1alpha1/namespaces/{namespace}/nodealerts/{name} | 
*MonitoringAppscodeComV1alpha1Api* | [**replaceNamespacedPodAlert**](docs/MonitoringAppscodeComV1alpha1Api.md#replaceNamespacedPodAlert) | **PUT** /apis/monitoring.appscode.com/v1alpha1/namespaces/{namespace}/podalerts/{name} | 
*MonitoringAppscodeComV1alpha1Api* | [**replaceNamespacedSearchlightPlugin**](docs/MonitoringAppscodeComV1alpha1Api.md#replaceNamespacedSearchlightPlugin) | **PUT** /apis/monitoring.appscode.com/v1alpha1/namespaces/{namespace}/searchlightplugins/{name} | 


## Documentation for Models

 - [V1alpha1Acknowledgement](docs/V1alpha1Acknowledgement.md)
 - [V1alpha1AcknowledgementRequest](docs/V1alpha1AcknowledgementRequest.md)
 - [V1alpha1AcknowledgementResponse](docs/V1alpha1AcknowledgementResponse.md)
 - [V1alpha1ClusterAlert](docs/V1alpha1ClusterAlert.md)
 - [V1alpha1ClusterAlertList](docs/V1alpha1ClusterAlertList.md)
 - [V1alpha1ClusterAlertSpec](docs/V1alpha1ClusterAlertSpec.md)
 - [V1alpha1Incident](docs/V1alpha1Incident.md)
 - [V1alpha1IncidentList](docs/V1alpha1IncidentList.md)
 - [V1alpha1IncidentNotification](docs/V1alpha1IncidentNotification.md)
 - [V1alpha1IncidentStatus](docs/V1alpha1IncidentStatus.md)
 - [V1alpha1NodeAlert](docs/V1alpha1NodeAlert.md)
 - [V1alpha1NodeAlertList](docs/V1alpha1NodeAlertList.md)
 - [V1alpha1NodeAlertSpec](docs/V1alpha1NodeAlertSpec.md)
 - [V1alpha1PluginArguments](docs/V1alpha1PluginArguments.md)
 - [V1alpha1PluginVarField](docs/V1alpha1PluginVarField.md)
 - [V1alpha1PluginVars](docs/V1alpha1PluginVars.md)
 - [V1alpha1PodAlert](docs/V1alpha1PodAlert.md)
 - [V1alpha1PodAlertList](docs/V1alpha1PodAlertList.md)
 - [V1alpha1PodAlertSpec](docs/V1alpha1PodAlertSpec.md)
 - [V1alpha1Receiver](docs/V1alpha1Receiver.md)
 - [V1alpha1SearchlightPlugin](docs/V1alpha1SearchlightPlugin.md)
 - [V1alpha1SearchlightPluginList](docs/V1alpha1SearchlightPluginList.md)
 - [V1alpha1SearchlightPluginSpec](docs/V1alpha1SearchlightPluginSpec.md)
 - [V1alpha1WebhookServiceSpec](docs/V1alpha1WebhookServiceSpec.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

hello@appscode.com

