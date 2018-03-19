package Ducks.FlyBehaviors;

import Ducks.IFlyBehavior;
import Interfaces.IOutputString;

public class FlyWithTurboJetEngine implements IFlyBehavior {
    private final IOutputString output;

    public FlyWithTurboJetEngine(IOutputString output) {
        this.output = output;
    }

    @Override
    public void Fly() {
        output.Out("Flying with a turbojet engine!!! Wow!");
    }
}
