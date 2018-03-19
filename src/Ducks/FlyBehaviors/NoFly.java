package Ducks.FlyBehaviors;

import Ducks.IFlyBehavior;
import Interfaces.IOutputString;

public class NoFly implements IFlyBehavior {
    private IOutputString output;

    public NoFly(IOutputString output) {
        this.output = output;
    }

    @Override
    public void Fly() {
        output. Out("Cannot fly!");
    }
}
