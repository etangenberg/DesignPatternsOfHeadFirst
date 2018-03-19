package StarBuzz.Condiments;

import StarBuzz.Condiment;
import StarBuzz.IBeverage;

public class Whip extends Condiment
{
    public Whip(IBeverage beverage) {
        super(beverage, "Whip", 0.10);
    }
}
