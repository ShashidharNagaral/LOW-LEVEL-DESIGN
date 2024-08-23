package DecoratorPattern;

public class Mocha extends BeverageDecorator{

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        if(beverage instanceof Espresso) {
            return super.cost() + 1;
        }
        return super.cost() + 2;
    }

    @Override
    public String getDescription() {
        return "Mocha " + super.getDescription();
    }

}
