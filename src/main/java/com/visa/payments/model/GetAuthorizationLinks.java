package com.visa.payments.model;

import java.util.*;
import com.visa.payments.model.Link;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class GetAuthorizationLinks   {
  
  private Link self = null;
  private List<Link> capture = new ArrayList<Link>();

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("self")
  public Link getSelf() {
    return self;
  }
  public void setSelf(Link self) {
    this.self = self;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("capture")
  public List<Link> getCapture() {
    return capture;
  }
  public void setCapture(List<Link> capture) {
    this.capture = capture;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAuthorizationLinks {\n");
    
    sb.append("  self: ").append(self).append("\n");
    sb.append("  capture: ").append(capture).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}