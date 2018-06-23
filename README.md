# Searchlight Java Client

[![Build Status](https://travis-ci.org/searchlight-client/java.svg?branch=master)](https://travis-ci.org/searchlight-client/java)
[![Client Capabilities](https://img.shields.io/badge/Kubernetes%20client-Silver-blue.svg?style=flat&colorB=C0C0C0&colorA=306CE8)](http://bit.ly/kubernetes-client-capabilities-badge)
[![Maven Central](https://img.shields.io/maven-central/v/com.appscode.searchlight/client-java.svg?label=Maven%20Central)](http://search.maven.org/#search%7Cga%7C1%7Cg%3A%22com.appscode.searchlight%22%20a%3A%22client-java%22)

Official Java client for the [Searchlight by AppsCode](https://appscode.com/products/searchlight/).

## Installation

To install the Java client library to your local Maven repository, simply execute:

```shell
git clone --recursive https://github.com/searchlight-client/java
cd java
mvn install
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

```groovy
compile 'com.appscode.searchlight:client-java:0.1.0'
```

### Others

At first generate the JAR by executing:

```
git clone --recursive https://github.com/searchlight-client/java
cd java
mvn package
```

Then manually install the following JARs:

* target/client-java-1.0.0-SNAPSHOT.jar
* target/lib/*.jar

## Example

list all pods:

```java
import com.appscode.searchlight.client.ApiClient;
import com.appscode.searchlight.client.ApiException;
import com.appscode.searchlight.client.Configuration;
import com.appscode.searchlight.client.apis.MonitoringAppscodeComV1alpha1Api;
import com.appscode.searchlight.client.models.V1alpha1ClusterAlert;
import com.appscode.searchlight.client.models.V1alpha1ClusterAlertList;
import com.appscode.searchlight.client.util.Config;
import java.io.IOException;

public class Example {
  public static void main(String[] args) throws IOException, ApiException {
    ApiClient client = Config.defaultClient();
    Configuration.setDefaultApiClient(client);

    MonitoringAppscodeComV1alpha1Api api = new MonitoringAppscodeComV1alpha1Api();
    V1alpha1ClusterAlertList list =
        api.listClusterAlertForAllNamespaces(null, null, null, null, null, null, null, null, null);
    for (V1alpha1ClusterAlert item : list.getItems()) {
      System.out.println(item.getMetadata().getName());
    }
  }
}
```

watch on cluster alert object:

```java
import com.appscode.searchlight.client.ApiClient;
import com.appscode.searchlight.client.ApiException;
import com.appscode.searchlight.client.Configuration;
import com.appscode.searchlight.client.apis.MonitoringAppscodeComV1alpha1Api;
import com.appscode.searchlight.client.models.V1alpha1ClusterAlert;
import com.appscode.searchlight.client.util.Config;
import com.appscode.searchlight.client.util.Watch;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class WatchExample {
  public static void main(String[] args) throws IOException, ApiException {
    ApiClient client = Config.defaultClient();
    client.getHttpClient().setReadTimeout(60, TimeUnit.SECONDS);
    Configuration.setDefaultApiClient(client);

    MonitoringAppscodeComV1alpha1Api api = new MonitoringAppscodeComV1alpha1Api();

    Watch<V1alpha1ClusterAlert> watch =
        Watch.createWatch(
            client,
            api.listClusterAlertForAllNamespacesCall(
                null, null, null, null, null, "false", null, null, Boolean.TRUE, null, null),
            new TypeToken<Watch.Response<V1alpha1ClusterAlert>>() {}.getType());

    for (Watch.Response<V1alpha1ClusterAlert> item : watch) {
      System.out.printf("%s : %s%n", item.type, item.object.getMetadata().getName());
    }
  }
}
```

More examples can be found in [examples](examples/) folder. To run examples, run this command:

```shell
mvn exec:java -Dexec.mainClass="com.appscode.searchlight.client.examples.Example"
```

## Documentation

All APIs and Models' documentation can be found at the [Generated client's README file](kubernetes/README.md)

## Compatibility

|       | Kubernetes 1.4 | Kubernetes 1.5 | Kubernetes 1.6 | Kubernetes 1.7 | Kubernetes 1.8 | Kubernetes 1.9 |
|-------|----------------|----------------|----------------|----------------|----------------|----------------|
| 0.1.0 | +              | +              | +              | +              | ✓              | -              |

Key:

* `✓` Exactly the same features / API objects in both java-client and the Kubernetes
  version.
* `+` java-client has features or api objects that may not be present in the
  Kubernetes cluster, but everything they have in common will work.
* `-` The Kubernetes cluster has features the java-client library can't use
  (additional API objects, etc).

See the [CHANGELOG](./CHANGELOG.md) for a detailed description of changes
between java-client versions.

## Community, Support, Discussion

We use Slack for public discussions. To chit chat with us or the rest of the community, join us in the [AppsCode Slack team](https://appscode.slack.com/messages/C8M7LT2QK/details/) channel `#searchlight`. To sign up, use our [Slack inviter](https://slack.appscode.com/).

If you have any problem with the package or any suggestions, please file an [issue](https://github.com/searchlight-client/java/issues).

# Development

## Update client

To update the client clone the `gen` repo and run this command at the root of this repo:

```bash
../gen/openapi/autoupdate.sh
```
