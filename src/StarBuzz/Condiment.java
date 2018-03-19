package StarBuzz;

public abstract class Condiment implements IBeverage {
    private final IBeverage beverage;
    private final double cost;
    private final String description;

    public Condiment(IBeverage beverage, String description, double cost) {
        this.beverage = beverage;
        this.cost = cost;
        this.description = description;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + description;
    }

    @Override
    public double cost() {
        return beverage.cost() + cost;
    }
}
