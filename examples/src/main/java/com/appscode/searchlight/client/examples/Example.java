package com.appscode.searchlight.client.examples;

import com.appscode.searchlight.client.ApiClient;
import com.appscode.searchlight.client.ApiException;
import com.appscode.searchlight.client.Configuration;
import com.appscode.searchlight.client.apis.MonitoringAppscodeComV1alpha1Api;
import com.appscode.searchlight.client.models.V1alpha1ClusterAlert;
import com.appscode.searchlight.client.models.V1alpha1ClusterAlertList;
import com.appscode.searchlight.client.util.Config;
import java.io.IOException;

/**
 * A simple example of how to use the Java API
 *
 * <p>Easiest way to run this: mvn exec:java
 * -Dexec.mainClass="com.appscode.searchlight.client.examples.Example"
 *
 * <p>From inside $REPO_DIR/examples
 */
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
