package DecoratorPattern;

public class Mocha extends BeverageDecorator{

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        if(beverage instanceof Espresso) {
            System.out.println("it is");
        }
        return super.cost() + 2;
    }

    @Override
    public String getDescription() {
        return "Mocha " + super.getDescription();
    }

}
