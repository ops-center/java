
# V1alpha1IncidentNotification

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**author** | **String** | name of user making comment |  [optional]
**checkOutput** | **String** | brief output of check command for the incident |  [optional]
**comment** | **String** | comment made by user |  [optional]
**firstTimestamp** | [**DateTime**](DateTime.md) | The time at which this notification was first recorded. (Time of server receipt is in TypeMeta.) |  [optional]
**lastTimestamp** | [**DateTime**](DateTime.md) | The time at which the most recent occurrence of this notification was recorded. |  [optional]
**state** | **String** | state of incident, such as Critical, Warning, OK, Unknown | 
**type** | **String** | incident notification type. | 



