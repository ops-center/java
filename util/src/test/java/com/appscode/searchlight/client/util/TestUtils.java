package com.appscode.searchlight.client.util;

import com.appscode.searchlight.client.ApiClient;
import com.appscode.searchlight.client.auth.ApiKeyAuth;

public class TestUtils {

  public static ApiKeyAuth getApiKeyAuthFromClient(ApiClient client) {
    return (ApiKeyAuth) client.getAuthentications().get("BearerToken");
  }
}
