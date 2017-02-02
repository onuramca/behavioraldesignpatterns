package com.basturk.mediator;

/**
 * Created by basturk
 * Date: 02.02.2017.
 */
public class TurnOffAllLightsCommand implements Command {

    private Mediator med;

    public TurnOffAllLightsCommand(Mediator med) {
        this.med = med;
    }

    @Override
    public void execute() {
        med.turnOffAllLights();
    }

}
