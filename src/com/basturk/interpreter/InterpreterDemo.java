package com.basturk.interpreter;

import java.io.PrintStream;

public class InterpreterDemo
{
  static Expression buildInterpreterTree()
  {
    Expression terminal1 = new TerminalExpression("Lions");
    Expression terminal2 = new TerminalExpression("Tigers");
    Expression terminal3 = new TerminalExpression("Bears");
    
    Expression alternation1 = new AndExpression(terminal2, terminal3);
    
    Expression alternation2 = new OrExpression(terminal1, alternation1);
    
    return new AndExpression(terminal3, alternation2);
  }
  
  public static void main(String[] args)
  {
    String context = "Lions Bears";
    
    Expression define = buildInterpreterTree();
    System.out.println(context + " is " + define.interpret(context));
  }
}
