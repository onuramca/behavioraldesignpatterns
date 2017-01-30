package com.basturk.chain;

public class ChainOfResponsibilityDemo
{
  public static void main(String[] args)
  {
    Director bryan = new Director();
    VP crystal = new VP();
    CEO jeff = new CEO();
    
    bryan.setSuccessor(crystal);
    crystal.setSuccessor(jeff);
    
    Request request = new Request(RequestType.CONFERENCE, 500.0D);
    bryan.handleRequest(request);
    
    request = new Request(RequestType.PURCHASE, 1000.0D);
    bryan.handleRequest(request);
    
    request = new Request(RequestType.PURCHASE, 2000.0D);
    bryan.handleRequest(request);
  }
}
