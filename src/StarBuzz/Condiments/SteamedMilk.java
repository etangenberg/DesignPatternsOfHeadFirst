package StarBuzz.Condiments;

import StarBuzz.Condiment;
import StarBuzz.IBeverage;

public class SteamedMilk extends Condiment {
    public SteamedMilk(IBeverage beverage) {
        super(beverage, "Steamed milk", 0.10);
    }
}
