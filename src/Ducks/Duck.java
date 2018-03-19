package Ducks;

import Interfaces.IOutputString;

public abstract class Duck {
    private final IOutputString output;
    private IFlyBehavior flyBehavior;
    private IQuackBehavior quackBehavior;

    public Duck(IOutputString output)
    {
        this.output = output;
    }

    public void performFly(){
        flyBehavior.Fly();
    }

    public void performQuack(){
        quackBehavior.Quack();
    }

    public void Swim(){
        output.Out("Swimming...");
    }

    public void setQuackBehavior(IQuackBehavior behavior){
        quackBehavior = behavior;
    }

    public void setFlyBehavior(IFlyBehavior behavior){
        flyBehavior = behavior;
    }
}
