package DecoratorPattern;

public class Nuts extends Topping{
    public Nuts(int cost, IceCream iceCream) {
        super(cost, iceCream);
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " with Nuts";
    }

    @Override
    public int getPrice() {
        return iceCream.getPrice() + this.getPrice();
    }
}
