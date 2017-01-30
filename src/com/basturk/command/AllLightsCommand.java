package com.basturk.command;

import java.util.List;

public class AllLightsCommand
  implements Command
{
  private List<Light> lights;
  
  public AllLightsCommand(List<Light> lights)
  {
    this.lights = lights;
  }
  
  public void execute()
  {
    for (Light light : this.lights) {
      if (light.isOn()) {
        light.toggle();
      }
    }
  }
}
