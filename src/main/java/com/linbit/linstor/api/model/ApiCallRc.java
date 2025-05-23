/*
 * Linstor REST API
 *
 *
 * OpenAPI spec version: 1.25.1
 * Contact: rene.peinthor@linbit.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.linbit.linstor.api.model;

import com.linbit.linstor.api.ApiConsts;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Common api reply structure
 */
@Schema(description = "Common api reply structure")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-05-08T11:58:50.875992750Z[Etc/UTC]")

public class ApiCallRc {
  @JsonProperty("ret_code")
  private Long retCode = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("cause")
  private String cause = null;

  @JsonProperty("details")
  private String details = null;

  @JsonProperty("correction")
  private String correction = null;

  @JsonProperty("error_report_ids")
  private List<String> errorReportIds = null;

  @JsonProperty("obj_refs")
  private Map<String, String> objRefs = null;

  @JsonProperty("created_at")
  private OffsetDateTime createdAt = null;

  public ApiCallRc retCode(Long retCode) {
    this.retCode = retCode;
    return this;
  }

   /**
   * A masked error number
   * @return retCode
  **/
  @Schema(required = true, description = "A masked error number")
  public Long getRetCode() {
    return retCode;
  }

  public void setRetCode(Long retCode) {
    this.retCode = retCode;
  }

  public ApiCallRc message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(example = "Operation result.", required = true, description = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ApiCallRc cause(String cause) {
    this.cause = cause;
    return this;
  }

   /**
   * Cause of the error
   * @return cause
  **/
  @Schema(description = "Cause of the error")
  public String getCause() {
    return cause;
  }

  public void setCause(String cause) {
    this.cause = cause;
  }

  public ApiCallRc details(String details) {
    this.details = details;
    return this;
  }

   /**
   * Details to the error message
   * @return details
  **/
  @Schema(description = "Details to the error message")
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public ApiCallRc correction(String correction) {
    this.correction = correction;
    return this;
  }

   /**
   * Possible correction options
   * @return correction
  **/
  @Schema(description = "Possible correction options")
  public String getCorrection() {
    return correction;
  }

  public void setCorrection(String correction) {
    this.correction = correction;
  }

  public ApiCallRc errorReportIds(List<String> errorReportIds) {
    this.errorReportIds = errorReportIds;
    return this;
  }

  public ApiCallRc addErrorReportIdsItem(String errorReportIdsItem) {
    if (this.errorReportIds == null) {
      this.errorReportIds = new ArrayList<>();
    }
    this.errorReportIds.add(errorReportIdsItem);
    return this;
  }

   /**
   * List of error report ids related to this api call return code.
   * @return errorReportIds
  **/
  @Schema(description = "List of error report ids related to this api call return code.")
  public List<String> getErrorReportIds() {
    return errorReportIds;
  }

  public void setErrorReportIds(List<String> errorReportIds) {
    this.errorReportIds = errorReportIds;
  }

  public ApiCallRc objRefs(Map<String, String> objRefs) {
    this.objRefs = objRefs;
    return this;
  }

  public ApiCallRc putObjRefsItem(String key, String objRefsItem) {
    if (this.objRefs == null) {
      this.objRefs = new HashMap<>();
    }
    this.objRefs.put(key, objRefsItem);
    return this;
  }

   /**
   * Map of objection that have been involved by the operation.
   * @return objRefs
  **/
  @Schema(description = "Map of objection that have been involved by the operation.")
  public Map<String, String> getObjRefs() {
    return objRefs;
  }

  public void setObjRefs(Map<String, String> objRefs) {
    this.objRefs = objRefs;
  }

  public ApiCallRc createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(description = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiCallRc apiCallRc = (ApiCallRc) o;
    return Objects.equals(this.retCode, apiCallRc.retCode) &&
        Objects.equals(this.message, apiCallRc.message) &&
        Objects.equals(this.cause, apiCallRc.cause) &&
        Objects.equals(this.details, apiCallRc.details) &&
        Objects.equals(this.correction, apiCallRc.correction) &&
        Objects.equals(this.errorReportIds, apiCallRc.errorReportIds) &&
        Objects.equals(this.objRefs, apiCallRc.objRefs) &&
        Objects.equals(this.createdAt, apiCallRc.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retCode, message, cause, details, correction, errorReportIds, objRefs, createdAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiCallRc {\n");
    
    sb.append("    retCode: ").append(toIndentedString(retCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    correction: ").append(toIndentedString(correction)).append("\n");
    sb.append("    errorReportIds: ").append(toIndentedString(errorReportIds)).append("\n");
    sb.append("    objRefs: ").append(toIndentedString(objRefs)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

  public boolean isError() {
    return (this.getRetCode() & ApiConsts.MASK_ERROR) == ApiConsts.MASK_ERROR;
  }

  public boolean isInfo() {
    return (this.getRetCode() & ApiConsts.MASK_INFO) == ApiConsts.MASK_INFO;
  }

  public boolean isWarning() {
    return (this.getRetCode() & ApiConsts.MASK_WARN) == ApiConsts.MASK_WARN;
  }

}
