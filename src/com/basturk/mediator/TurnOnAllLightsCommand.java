package com.basturk.mediator;

/**
 * Created by basturk
 * Date: 02.02.2017.
 */

// concrete command
public class TurnOnAllLightsCommand implements Command {

    private Mediator med;

    public TurnOnAllLightsCommand(Mediator med) {
        this.med = med;
    }

    @Override
    public void execute() {
        med.turnOnAllLights();
    }
}
