package DecoratorPattern;

public abstract class Topping extends IceCream{

    protected IceCream iceCream;

    public Topping(int cost, IceCream iceCream) {
        super(cost);
        this.iceCream = iceCream;
    }
}
