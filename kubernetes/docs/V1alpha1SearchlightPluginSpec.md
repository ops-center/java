
# V1alpha1SearchlightPluginSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alertKinds** | **List&lt;String&gt;** | AlertKinds refers to supports Alert kinds for this plugin | 
**arguments** | [**V1alpha1PluginArguments**](V1alpha1PluginArguments.md) | Supported arguments for SearchlightPlugin |  [optional]
**command** | **String** | Check Command |  [optional]
**states** | **List&lt;String&gt;** | Supported Icinga Service State | 
**webhook** | [**V1alpha1WebhookServiceSpec**](V1alpha1WebhookServiceSpec.md) | Webhook provides a reference to the service for this SearchlightPlugin. It must communicate on port 80 |  [optional]



