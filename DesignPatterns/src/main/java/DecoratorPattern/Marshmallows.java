package DecoratorPattern;

public class Marshmallows extends Topping{
    public Marshmallows(int cost, IceCream iceCream) {
        super(cost, iceCream);
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " with Marshmallows";
    }

    @Override
    public int getPrice() {
        return iceCream.getPrice() + super.getPrice();
    }
}
