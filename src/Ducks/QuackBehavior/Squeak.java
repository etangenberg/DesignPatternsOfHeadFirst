package Ducks.QuackBehavior;

import Ducks.IQuackBehavior;
import Interfaces.IOutputString;

public class Squeak implements IQuackBehavior {
    private final IOutputString output;

    public Squeak(IOutputString output) {
        this.output = output;
    }

    @Override
    public void Quack() {
        output.Out("Squeak!");
    }
}
