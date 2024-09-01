package DecoratorPattern;

public class Vanilla extends IceCream {
    public Vanilla(int cost) {
        super(cost);
    }

    @Override
    public String getDescription() {
        return "Vanilla IceCream";
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }
}
