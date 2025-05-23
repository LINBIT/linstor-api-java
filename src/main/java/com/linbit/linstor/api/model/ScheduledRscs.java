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

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * ScheduledRscs
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-05-08T11:58:50.875992750Z[Etc/UTC]")

public class ScheduledRscs {
  @JsonProperty("rsc_name")
  private String rscName = null;

  @JsonProperty("remote_name")
  private String remoteName = null;

  @JsonProperty("schedule_name")
  private String scheduleName = null;

  @JsonProperty("reason")
  private String reason = null;

  @JsonProperty("last_snap_time")
  private Long lastSnapTime = null;

  @JsonProperty("last_snap_inc")
  private Boolean lastSnapInc = null;

  @JsonProperty("next_exec_time")
  private Long nextExecTime = null;

  @JsonProperty("next_exec_inc")
  private Boolean nextExecInc = null;

  @JsonProperty("next_planned_full")
  private Long nextPlannedFull = null;

  @JsonProperty("next_planned_inc")
  private Long nextPlannedInc = null;

  public ScheduledRscs rscName(String rscName) {
    this.rscName = rscName;
    return this;
  }

   /**
   * Get rscName
   * @return rscName
  **/
  @Schema(required = true, description = "")
  public String getRscName() {
    return rscName;
  }

  public void setRscName(String rscName) {
    this.rscName = rscName;
  }

  public ScheduledRscs remoteName(String remoteName) {
    this.remoteName = remoteName;
    return this;
  }

   /**
   * Get remoteName
   * @return remoteName
  **/
  @Schema(required = true, description = "")
  public String getRemoteName() {
    return remoteName;
  }

  public void setRemoteName(String remoteName) {
    this.remoteName = remoteName;
  }

  public ScheduledRscs scheduleName(String scheduleName) {
    this.scheduleName = scheduleName;
    return this;
  }

   /**
   * Get scheduleName
   * @return scheduleName
  **/
  @Schema(required = true, description = "")
  public String getScheduleName() {
    return scheduleName;
  }

  public void setScheduleName(String scheduleName) {
    this.scheduleName = scheduleName;
  }

  public ScheduledRscs reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * The reason for why this rscDfn has no active schedules. If this is set, ignore all long and boolean parameters. 
   * @return reason
  **/
  @Schema(description = "The reason for why this rscDfn has no active schedules. If this is set, ignore all long and boolean parameters. ")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public ScheduledRscs lastSnapTime(Long lastSnapTime) {
    this.lastSnapTime = lastSnapTime;
    return this;
  }

   /**
   * The time at which the last scheduled shipping was shipped. If negative, no scheduled shipping has happened yet. 
   * @return lastSnapTime
  **/
  @Schema(description = "The time at which the last scheduled shipping was shipped. If negative, no scheduled shipping has happened yet. ")
  public Long getLastSnapTime() {
    return lastSnapTime;
  }

  public void setLastSnapTime(Long lastSnapTime) {
    this.lastSnapTime = lastSnapTime;
  }

  public ScheduledRscs lastSnapInc(Boolean lastSnapInc) {
    this.lastSnapInc = lastSnapInc;
    return this;
  }

   /**
   * Whether the last shipping was incremental or not. Ignore this value if last_snap_time is negative. 
   * @return lastSnapInc
  **/
  @Schema(description = "Whether the last shipping was incremental or not. Ignore this value if last_snap_time is negative. ")
  public Boolean isLastSnapInc() {
    return lastSnapInc;
  }

  public void setLastSnapInc(Boolean lastSnapInc) {
    this.lastSnapInc = lastSnapInc;
  }

  public ScheduledRscs nextExecTime(Long nextExecTime) {
    this.nextExecTime = nextExecTime;
    return this;
  }

   /**
   * The time at which the next scheduled shipping will happen. If negative, the shipping is currently running. 
   * @return nextExecTime
  **/
  @Schema(description = "The time at which the next scheduled shipping will happen. If negative, the shipping is currently running. ")
  public Long getNextExecTime() {
    return nextExecTime;
  }

  public void setNextExecTime(Long nextExecTime) {
    this.nextExecTime = nextExecTime;
  }

  public ScheduledRscs nextExecInc(Boolean nextExecInc) {
    this.nextExecInc = nextExecInc;
    return this;
  }

   /**
   * Whether the next scheduled shipping will be incremental or not. Ignore if next_exec_time is negative 
   * @return nextExecInc
  **/
  @Schema(description = "Whether the next scheduled shipping will be incremental or not. Ignore if next_exec_time is negative ")
  public Boolean isNextExecInc() {
    return nextExecInc;
  }

  public void setNextExecInc(Boolean nextExecInc) {
    this.nextExecInc = nextExecInc;
  }

  public ScheduledRscs nextPlannedFull(Long nextPlannedFull) {
    this.nextPlannedFull = nextPlannedFull;
    return this;
  }

   /**
   * The time at which the next scheduled full backup should happen. If negative, the time could not be computed 
   * @return nextPlannedFull
  **/
  @Schema(description = "The time at which the next scheduled full backup should happen. If negative, the time could not be computed ")
  public Long getNextPlannedFull() {
    return nextPlannedFull;
  }

  public void setNextPlannedFull(Long nextPlannedFull) {
    this.nextPlannedFull = nextPlannedFull;
  }

  public ScheduledRscs nextPlannedInc(Long nextPlannedInc) {
    this.nextPlannedInc = nextPlannedInc;
    return this;
  }

   /**
   * The time at which the next scheduled incremental backup should happen. If negative, either there is no cron for incremental backups or the time could not be computed 
   * @return nextPlannedInc
  **/
  @Schema(description = "The time at which the next scheduled incremental backup should happen. If negative, either there is no cron for incremental backups or the time could not be computed ")
  public Long getNextPlannedInc() {
    return nextPlannedInc;
  }

  public void setNextPlannedInc(Long nextPlannedInc) {
    this.nextPlannedInc = nextPlannedInc;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduledRscs scheduledRscs = (ScheduledRscs) o;
    return Objects.equals(this.rscName, scheduledRscs.rscName) &&
        Objects.equals(this.remoteName, scheduledRscs.remoteName) &&
        Objects.equals(this.scheduleName, scheduledRscs.scheduleName) &&
        Objects.equals(this.reason, scheduledRscs.reason) &&
        Objects.equals(this.lastSnapTime, scheduledRscs.lastSnapTime) &&
        Objects.equals(this.lastSnapInc, scheduledRscs.lastSnapInc) &&
        Objects.equals(this.nextExecTime, scheduledRscs.nextExecTime) &&
        Objects.equals(this.nextExecInc, scheduledRscs.nextExecInc) &&
        Objects.equals(this.nextPlannedFull, scheduledRscs.nextPlannedFull) &&
        Objects.equals(this.nextPlannedInc, scheduledRscs.nextPlannedInc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rscName, remoteName, scheduleName, reason, lastSnapTime, lastSnapInc, nextExecTime, nextExecInc, nextPlannedFull, nextPlannedInc);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduledRscs {\n");
    
    sb.append("    rscName: ").append(toIndentedString(rscName)).append("\n");
    sb.append("    remoteName: ").append(toIndentedString(remoteName)).append("\n");
    sb.append("    scheduleName: ").append(toIndentedString(scheduleName)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    lastSnapTime: ").append(toIndentedString(lastSnapTime)).append("\n");
    sb.append("    lastSnapInc: ").append(toIndentedString(lastSnapInc)).append("\n");
    sb.append("    nextExecTime: ").append(toIndentedString(nextExecTime)).append("\n");
    sb.append("    nextExecInc: ").append(toIndentedString(nextExecInc)).append("\n");
    sb.append("    nextPlannedFull: ").append(toIndentedString(nextPlannedFull)).append("\n");
    sb.append("    nextPlannedInc: ").append(toIndentedString(nextPlannedInc)).append("\n");
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
