package DecoratorPattern;

public class Cone extends Topping {
    public Cone(int cost, IceCream iceCream) {
        super(cost, iceCream);
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " with Cone";
    }

    @Override
    public int getPrice() {
        return iceCream.getPrice() + super.getPrice();
    }
}
