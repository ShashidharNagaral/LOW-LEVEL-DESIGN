package DecoratorPattern;

public class Butter extends BeverageDecorator{

    public Butter(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        double cost = super.cost() + 4;
        if(beverage instanceof Espresso) {
            System.out.println("it is instance of espresso");
            return cost*0.95;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }
}
