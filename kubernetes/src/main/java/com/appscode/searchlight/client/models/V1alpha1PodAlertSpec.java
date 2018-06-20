/*
 * stash-server
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v0
 * Contact: hello@appscode.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.appscode.searchlight.client.models;

import java.util.Objects;
import com.appscode.searchlight.client.models.V1alpha1Receiver;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.models.V1LabelSelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * PodAlertSpec describes the PodAlert the user wishes to create.
 */
@ApiModel(description = "PodAlertSpec describes the PodAlert the user wishes to create.")

public class V1alpha1PodAlertSpec {
  @SerializedName("alertInterval")
  private String alertInterval = null;

  @SerializedName("check")
  private String check = null;

  @SerializedName("checkInterval")
  private String checkInterval = null;

  @SerializedName("notifierSecretName")
  private String notifierSecretName = null;

  @SerializedName("paused")
  private Boolean paused = null;

  @SerializedName("podName")
  private String podName = null;

  @SerializedName("receivers")
  private List<V1alpha1Receiver> receivers = null;

  @SerializedName("selector")
  private V1LabelSelector selector = null;

  @SerializedName("vars")
  private Map<String, String> vars = null;

  public V1alpha1PodAlertSpec alertInterval(String alertInterval) {
    this.alertInterval = alertInterval;
    return this;
  }

   /**
   * How frequently notifications will be send
   * @return alertInterval
  **/
  @ApiModelProperty(value = "How frequently notifications will be send")
  public String getAlertInterval() {
    return alertInterval;
  }

  public void setAlertInterval(String alertInterval) {
    this.alertInterval = alertInterval;
  }

  public V1alpha1PodAlertSpec check(String check) {
    this.check = check;
    return this;
  }

   /**
   * Icinga CheckCommand name
   * @return check
  **/
  @ApiModelProperty(value = "Icinga CheckCommand name")
  public String getCheck() {
    return check;
  }

  public void setCheck(String check) {
    this.check = check;
  }

  public V1alpha1PodAlertSpec checkInterval(String checkInterval) {
    this.checkInterval = checkInterval;
    return this;
  }

   /**
   * How frequently Icinga Service will be checked
   * @return checkInterval
  **/
  @ApiModelProperty(value = "How frequently Icinga Service will be checked")
  public String getCheckInterval() {
    return checkInterval;
  }

  public void setCheckInterval(String checkInterval) {
    this.checkInterval = checkInterval;
  }

  public V1alpha1PodAlertSpec notifierSecretName(String notifierSecretName) {
    this.notifierSecretName = notifierSecretName;
    return this;
  }

   /**
   * Secret containing notifier credentials
   * @return notifierSecretName
  **/
  @ApiModelProperty(value = "Secret containing notifier credentials")
  public String getNotifierSecretName() {
    return notifierSecretName;
  }

  public void setNotifierSecretName(String notifierSecretName) {
    this.notifierSecretName = notifierSecretName;
  }

  public V1alpha1PodAlertSpec paused(Boolean paused) {
    this.paused = paused;
    return this;
  }

   /**
   * Indicates that Check is paused Icinga Services are removed
   * @return paused
  **/
  @ApiModelProperty(value = "Indicates that Check is paused Icinga Services are removed")
  public Boolean isPaused() {
    return paused;
  }

  public void setPaused(Boolean paused) {
    this.paused = paused;
  }

  public V1alpha1PodAlertSpec podName(String podName) {
    this.podName = podName;
    return this;
  }

   /**
   * Get podName
   * @return podName
  **/
  @ApiModelProperty(value = "")
  public String getPodName() {
    return podName;
  }

  public void setPodName(String podName) {
    this.podName = podName;
  }

  public V1alpha1PodAlertSpec receivers(List<V1alpha1Receiver> receivers) {
    this.receivers = receivers;
    return this;
  }

  public V1alpha1PodAlertSpec addReceiversItem(V1alpha1Receiver receiversItem) {
    if (this.receivers == null) {
      this.receivers = new ArrayList<V1alpha1Receiver>();
    }
    this.receivers.add(receiversItem);
    return this;
  }

   /**
   * NotifierParams contains information to send notifications for Incident State, UserUid, Method
   * @return receivers
  **/
  @ApiModelProperty(value = "NotifierParams contains information to send notifications for Incident State, UserUid, Method")
  public List<V1alpha1Receiver> getReceivers() {
    return receivers;
  }

  public void setReceivers(List<V1alpha1Receiver> receivers) {
    this.receivers = receivers;
  }

  public V1alpha1PodAlertSpec selector(V1LabelSelector selector) {
    this.selector = selector;
    return this;
  }

   /**
   * Get selector
   * @return selector
  **/
  @ApiModelProperty(value = "")
  public V1LabelSelector getSelector() {
    return selector;
  }

  public void setSelector(V1LabelSelector selector) {
    this.selector = selector;
  }

  public V1alpha1PodAlertSpec vars(Map<String, String> vars) {
    this.vars = vars;
    return this;
  }

  public V1alpha1PodAlertSpec putVarsItem(String key, String varsItem) {
    if (this.vars == null) {
      this.vars = new HashMap<String, String>();
    }
    this.vars.put(key, varsItem);
    return this;
  }

   /**
   * Vars contains Icinga Service variables to be used in CheckCommand
   * @return vars
  **/
  @ApiModelProperty(value = "Vars contains Icinga Service variables to be used in CheckCommand")
  public Map<String, String> getVars() {
    return vars;
  }

  public void setVars(Map<String, String> vars) {
    this.vars = vars;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1PodAlertSpec v1alpha1PodAlertSpec = (V1alpha1PodAlertSpec) o;
    return Objects.equals(this.alertInterval, v1alpha1PodAlertSpec.alertInterval) &&
        Objects.equals(this.check, v1alpha1PodAlertSpec.check) &&
        Objects.equals(this.checkInterval, v1alpha1PodAlertSpec.checkInterval) &&
        Objects.equals(this.notifierSecretName, v1alpha1PodAlertSpec.notifierSecretName) &&
        Objects.equals(this.paused, v1alpha1PodAlertSpec.paused) &&
        Objects.equals(this.podName, v1alpha1PodAlertSpec.podName) &&
        Objects.equals(this.receivers, v1alpha1PodAlertSpec.receivers) &&
        Objects.equals(this.selector, v1alpha1PodAlertSpec.selector) &&
        Objects.equals(this.vars, v1alpha1PodAlertSpec.vars);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertInterval, check, checkInterval, notifierSecretName, paused, podName, receivers, selector, vars);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1PodAlertSpec {\n");
    
    sb.append("    alertInterval: ").append(toIndentedString(alertInterval)).append("\n");
    sb.append("    check: ").append(toIndentedString(check)).append("\n");
    sb.append("    checkInterval: ").append(toIndentedString(checkInterval)).append("\n");
    sb.append("    notifierSecretName: ").append(toIndentedString(notifierSecretName)).append("\n");
    sb.append("    paused: ").append(toIndentedString(paused)).append("\n");
    sb.append("    podName: ").append(toIndentedString(podName)).append("\n");
    sb.append("    receivers: ").append(toIndentedString(receivers)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    vars: ").append(toIndentedString(vars)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
