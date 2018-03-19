package StarBuzz;

import Interfaces.IOutputString;

public class PrintBeverage {
    private final IOutputString output;

    public PrintBeverage(IOutputString output) {
        this.output = output;
    }

    public void Out(IBeverage beverage){
        String text = beverage.getDescription() + " $" + beverage.cost();
        this.output.Out(text);
    }
}
