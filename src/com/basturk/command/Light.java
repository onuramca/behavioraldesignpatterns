package com.basturk.command;

import java.io.PrintStream;

public class Light
{
  private boolean isOn = false;
  
  public boolean isOn()
  {
    return this.isOn;
  }
  
  public void toggle()
  {
    if (this.isOn)
    {
      off();
      this.isOn = false;
    }
    else
    {
      on();
      this.isOn = true;
    }
  }
  
  public void on()
  {
    System.out.println("Light switched on.");
  }
  
  public void off()
  {
    System.out.println("Light switched off.");
  }
}
