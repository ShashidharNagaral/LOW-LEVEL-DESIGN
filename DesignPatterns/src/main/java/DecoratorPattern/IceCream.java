package DecoratorPattern;

public abstract class IceCream {
    private int cost;

    public IceCream(int cost) {
        this.cost = cost;
    }

    public abstract String getDescription();

    public int getPrice() {
        return this.cost;
    }
}
