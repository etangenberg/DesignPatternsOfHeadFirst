package Ducks;

import Ducks.FlyBehaviors.NoFly;
import Ducks.QuackBehavior.Squeak;
import Interfaces.IOutputString;

public class RubberDuck extends Duck {

    public RubberDuck(IOutputString output) {
        super(output);
        setFlyBehavior(new NoFly(output));
        setQuackBehavior(new Squeak(output));
    }
}
