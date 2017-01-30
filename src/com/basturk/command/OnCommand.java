package com.basturk.command;

public class OnCommand
  implements Command
{
  private Light light;
  
  public OnCommand(Light light)
  {
    this.light = light;
  }
  
  public void execute()
  {
    this.light.on();
  }
}
