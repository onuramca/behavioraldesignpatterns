package com.basturk.chain;

public class CEO
  extends Handler
{
  public void handleRequest(Request request)
  {
    System.out.println("CEOs can approve anything they want");
  }
}
