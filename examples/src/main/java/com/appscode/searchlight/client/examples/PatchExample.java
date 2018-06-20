package com.appscode.searchlight.client.examples;

import com.appscode.searchlight.client.ApiClient;
import com.appscode.searchlight.client.ApiException;
import com.appscode.searchlight.client.Configuration;
import com.appscode.searchlight.client.apis.MonitoringAppscodeComV1alpha1Api;
import com.appscode.searchlight.client.models.V1alpha1ClusterAlert;
import com.appscode.searchlight.client.util.ClientBuilder;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.util.ArrayList;

/**
 * A simple Example of how to use the Java API.<br>
 * This example demonstrates patching of ClusterAlert using Json Patch.<br>
 * For generating Json Patches, refer <a href="http://jsonpatch.com/">http://jsonpatch.com</a>.
 *
 * <ul>
 *   <li>Creates ClusterAlert ca-cert-check with <b>spec.vars.critical</b> value as 72h.
 *   <li>Patches ClusterAlert ca-cert-check with <b>spec.vars.critical</b> value as 120h.
 * </ul>
 *
 * <p>Easiest way to run this: mvn exec:java
 * -Dexec.mainClass="com.appscode.searchlight.client.examples.PatchExample"
 *
 * <p>From inside $REPO_DIR/examples
 */
public class PatchExample {
  static String jsonPatchStr =
      "{\"op\":\"replace\",\"path\":\"/spec/vars/critical\",\"value\":\"120h\"}";
  static String jsonDepStr =
      "{\"apiVersion\":\"monitoring.appscode.com/v1alpha1\",\"kind\":\"ClusterAlert\",\"metadata\":{\"name\":\"ca-cert-check\",\"namespace\":\"default\"},\"spec\":{\"check\":\"ca-cert\",\"vars\":{\"warning\":\"240h\",\"critical\":\"72h\"},\"checkInterval\":\"30s\",\"alertInterval\":\"2m\",\"notifierSecretName\":\"notifier-config\",\"receivers\":[{\"notifier\":\"Mailgun\",\"state\":\"Critical\",\"to\":[\"ops@example.com\"]}]}}";

  public static void main(String[] args) throws IOException, ApiException {
    PatchExample example = new PatchExample();
    ApiClient client = ClientBuilder.defaultClient();
    Configuration.setDefaultApiClient(client);

    V1alpha1ClusterAlert body =
        (V1alpha1ClusterAlert) example.deserialize(jsonDepStr, V1alpha1ClusterAlert.class);
    V1alpha1ClusterAlert deploy1 = example.createClusterAlert("default", body, "false");
    System.out.println("original ClusterAlert" + deploy1);

    ArrayList<JsonObject> arr = new ArrayList<>();
    arr.add(((JsonElement) example.deserialize(jsonPatchStr, JsonElement.class)).getAsJsonObject());
    V1alpha1ClusterAlert deploy2 =
        example.PatchClusterAlert("ca-cert-check", "default", arr, "false");
    System.out.println("patched ClusterAlert" + deploy2);
  }

  public V1alpha1ClusterAlert createClusterAlert(
      String namespace, V1alpha1ClusterAlert body, String pretty) throws ApiException {
    MonitoringAppscodeComV1alpha1Api api = new MonitoringAppscodeComV1alpha1Api();
    V1alpha1ClusterAlert deploy = api.createNamespacedClusterAlert(namespace, body, pretty);
    return deploy;
  }

  public V1alpha1ClusterAlert PatchClusterAlert(
      String deployName, String namespace, Object body, String pretty) throws ApiException {
    MonitoringAppscodeComV1alpha1Api api = new MonitoringAppscodeComV1alpha1Api();
    V1alpha1ClusterAlert deploy =
        api.patchNamespacedClusterAlert(deployName, namespace, body, pretty);
    return deploy;
  }

  public Object deserialize(String jsonStr, Class<?> targetClass) {
    Object obj = (new Gson()).fromJson(jsonStr, targetClass);
    return obj;
  }
}
