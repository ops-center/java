
# V1alpha1NodeAlertSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alertInterval** | **String** | How frequently notifications will be send |  [optional]
**check** | **String** | Icinga CheckCommand name |  [optional]
**checkInterval** | **String** | How frequently Icinga Service will be checked |  [optional]
**nodeName** | **String** |  |  [optional]
**notifierSecretName** | **String** | Secret containing notifier credentials |  [optional]
**paused** | **Boolean** | Indicates that Check is paused Icinga Services are removed |  [optional]
**receivers** | [**List&lt;V1alpha1Receiver&gt;**](V1alpha1Receiver.md) | NotifierParams contains information to send notifications for Incident State, UserUid, Method |  [optional]
**selector** | **Map&lt;String, String&gt;** |  |  [optional]
**vars** | **Map&lt;String, String&gt;** | Vars contains Icinga Service variables to be used in CheckCommand |  [optional]



