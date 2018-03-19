package Ducks.FlyBehaviors;

import Ducks.IFlyBehavior;
import Interfaces.IOutputString;

public class FlyWithWings implements IFlyBehavior {
    private IOutputString output;

    public FlyWithWings(IOutputString outputString) {
        this.output = outputString;
    }

    @Override
    public void Fly() {
        output.Out("Flying With wings!!");
    }
}
