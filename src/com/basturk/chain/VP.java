package com.basturk.chain;

import java.io.PrintStream;

public class VP
  extends Handler
{
  public void handleRequest(Request request)
  {
    if (request.getRequestType() == RequestType.PURCHASE) {
      if (request.getAmount() < 1500.0D) {
        System.out.println("VPs can approve purchases below 1500");
      } else {
        this.successor.handleRequest(request);
      }
    }
  }
}
