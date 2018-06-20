package com.appscode.searchlight.client.examples;

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

/** A simple example of how to use Watch API to watch changes in ClusterAlert list. */
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
