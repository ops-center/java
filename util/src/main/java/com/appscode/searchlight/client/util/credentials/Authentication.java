package com.appscode.searchlight.client.util.credentials;

import com.appscode.searchlight.client.ApiClient;
import com.appscode.searchlight.client.util.ClientBuilder;

/**
 * Allows the implementation of different authentication mechanisms for the Kubernetes API.
 *
 * @see ClientBuilder#setAuthentication(Authentication)
 */
public interface Authentication {

  void provide(ApiClient client);
}
