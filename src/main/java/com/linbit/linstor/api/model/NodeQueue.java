/*
 * Linstor REST API
 *
 *
 * OpenAPI spec version: 1.22.0
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
import com.linbit.linstor.api.model.SnapQueue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * NodeQueue
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-02T13:40:09.628252133Z[Etc/UTC]")

public class NodeQueue {
  @JsonProperty("node_name")
  private String nodeName = null;

  @JsonProperty("queue")
  private List<SnapQueue> queue = null;

  public NodeQueue nodeName(String nodeName) {
    this.nodeName = nodeName;
    return this;
  }

   /**
   * Get nodeName
   * @return nodeName
  **/
  @Schema(required = true, description = "")
  public String getNodeName() {
    return nodeName;
  }

  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }

  public NodeQueue queue(List<SnapQueue> queue) {
    this.queue = queue;
    return this;
  }

  public NodeQueue addQueueItem(SnapQueue queueItem) {
    if (this.queue == null) {
      this.queue = new ArrayList<>();
    }
    this.queue.add(queueItem);
    return this;
  }

   /**
   * The list of queued snapshots. Will be empty if this is an item of SnapQueue.queue 
   * @return queue
  **/
  @Schema(description = "The list of queued snapshots. Will be empty if this is an item of SnapQueue.queue ")
  public List<SnapQueue> getQueue() {
    return queue;
  }

  public void setQueue(List<SnapQueue> queue) {
    this.queue = queue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeQueue nodeQueue = (NodeQueue) o;
    return Objects.equals(this.nodeName, nodeQueue.nodeName) &&
        Objects.equals(this.queue, nodeQueue.queue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeName, queue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeQueue {\n");
    
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
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
