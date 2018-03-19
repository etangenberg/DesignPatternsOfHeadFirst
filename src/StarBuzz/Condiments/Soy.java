package StarBuzz.Condiments;

import StarBuzz.Condiment;
import StarBuzz.IBeverage;

public class Soy extends Condiment {
    public Soy(IBeverage beverage) {
        super(beverage, "Soy", 0.15);
    }
}
