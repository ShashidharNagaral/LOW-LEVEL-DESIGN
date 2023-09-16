package DecoratorPattern;

public class Espresso extends Beverage{

    @Override
    public String getDescription() {
        return "Espresso " + super.getDescription();
    }

    @Override
    public double cost() {
        return 12;
    }
}
