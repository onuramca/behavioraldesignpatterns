package com.basturk.chain;

public class Director
  extends Handler
{
  public void handleRequest(Request request)
  {
    if (request.getRequestType() == RequestType.CONFERENCE) {
      System.out.println("Directors can approve conferences");
    } else {
      this.successor.handleRequest(request);
    }
  }
}
