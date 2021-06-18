/*
 * Linstor REST API
 *
 *
 * OpenAPI spec version: 1.8.0
 * Contact: rene.peinthor@linbit.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.linbit.linstor.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * EXOS event
 */
@Schema(description = "EXOS event")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-18T05:15:14.614Z[GMT]")
public class ExosEnclosureEvent {
  @JsonProperty("severity")
  private String severity = null;

  @JsonProperty("event_id")
  private String eventId = null;

  @JsonProperty("controller")
  private String controller = null;

  @JsonProperty("time_stamp")
  private String timeStamp = null;

  @JsonProperty("time_stamp_numeric")
  private Long timeStampNumeric = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("additional_information")
  private String additionalInformation = null;

  @JsonProperty("recommended_action")
  private String recommendedAction = null;

  public ExosEnclosureEvent severity(String severity) {
    this.severity = severity;
    return this;
  }

   /**
   * Get severity
   * @return severity
  **/
  @Schema(description = "")
  public String getSeverity() {
    return severity;
  }

  public void setSeverity(String severity) {
    this.severity = severity;
  }

  public ExosEnclosureEvent eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * Get eventId
   * @return eventId
  **/
  @Schema(description = "")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public ExosEnclosureEvent controller(String controller) {
    this.controller = controller;
    return this;
  }

   /**
   * Get controller
   * @return controller
  **/
  @Schema(description = "")
  public String getController() {
    return controller;
  }

  public void setController(String controller) {
    this.controller = controller;
  }

  public ExosEnclosureEvent timeStamp(String timeStamp) {
    this.timeStamp = timeStamp;
    return this;
  }

   /**
   * Get timeStamp
   * @return timeStamp
  **/
  @Schema(description = "")
  public String getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(String timeStamp) {
    this.timeStamp = timeStamp;
  }

  public ExosEnclosureEvent timeStampNumeric(Long timeStampNumeric) {
    this.timeStampNumeric = timeStampNumeric;
    return this;
  }

   /**
   * Get timeStampNumeric
   * @return timeStampNumeric
  **/
  @Schema(description = "")
  public Long getTimeStampNumeric() {
    return timeStampNumeric;
  }

  public void setTimeStampNumeric(Long timeStampNumeric) {
    this.timeStampNumeric = timeStampNumeric;
  }

  public ExosEnclosureEvent message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(description = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ExosEnclosureEvent additionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

   /**
   * Get additionalInformation
   * @return additionalInformation
  **/
  @Schema(description = "")
  public String getAdditionalInformation() {
    return additionalInformation;
  }

  public void setAdditionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
  }

  public ExosEnclosureEvent recommendedAction(String recommendedAction) {
    this.recommendedAction = recommendedAction;
    return this;
  }

   /**
   * Get recommendedAction
   * @return recommendedAction
  **/
  @Schema(description = "")
  public String getRecommendedAction() {
    return recommendedAction;
  }

  public void setRecommendedAction(String recommendedAction) {
    this.recommendedAction = recommendedAction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExosEnclosureEvent exosEnclosureEvent = (ExosEnclosureEvent) o;
    return Objects.equals(this.severity, exosEnclosureEvent.severity) &&
        Objects.equals(this.eventId, exosEnclosureEvent.eventId) &&
        Objects.equals(this.controller, exosEnclosureEvent.controller) &&
        Objects.equals(this.timeStamp, exosEnclosureEvent.timeStamp) &&
        Objects.equals(this.timeStampNumeric, exosEnclosureEvent.timeStampNumeric) &&
        Objects.equals(this.message, exosEnclosureEvent.message) &&
        Objects.equals(this.additionalInformation, exosEnclosureEvent.additionalInformation) &&
        Objects.equals(this.recommendedAction, exosEnclosureEvent.recommendedAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(severity, eventId, controller, timeStamp, timeStampNumeric, message, additionalInformation, recommendedAction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExosEnclosureEvent {\n");
    
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    controller: ").append(toIndentedString(controller)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    timeStampNumeric: ").append(toIndentedString(timeStampNumeric)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
    sb.append("    recommendedAction: ").append(toIndentedString(recommendedAction)).append("\n");
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
