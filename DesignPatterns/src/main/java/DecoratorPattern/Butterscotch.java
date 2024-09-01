package DecoratorPattern;

public class Butterscotch extends IceCream{

    public Butterscotch(int cost) {
        super(cost);
    }

    @Override
    public String getDescription() {
        return "ButterScotch IceCream";
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }
}
