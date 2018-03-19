package StarBuzz;

public abstract class Beverage implements IBeverage {
    private final String description;
    private final double cost;
    private DrinkSize size;

    protected Beverage(String description, double cost) {
        this.description = description;
        this.cost = cost;
        this.size = DrinkSize.Grande;
    }

    public void setSize(DrinkSize size){
        this.size = size;
    }

    public DrinkSize getSize(){
        return this.size;
    }
    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double cost() {
        return cost;
    }
}
