package com.basturk.interpreter;

import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterpreterEverydayDemo
{
  public static void main(String[] args)
  {
    String input = "Lions, and tigers, and bears! oh, my!";
    
    Pattern p = Pattern.compile("(lion|cat|dog|wolf|bear|human|tiger|liger|Lion)");
    Matcher m = p.matcher(input);
    while (m.find()) {
      System.out.println("Found a " + m.group() + ".");
    }
  }
}
