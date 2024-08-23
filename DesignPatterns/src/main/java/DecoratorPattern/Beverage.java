package DecoratorPattern;

public abstract class Beverage {
    public String getDescription() {
        return "Beverage!";
    }
    public abstract double cost();
}
