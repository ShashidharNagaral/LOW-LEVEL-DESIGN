package DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        IceCream iceCream = new Vanilla(40);
        iceCream = new Cone(10, iceCream);
        iceCream = new Marshmallows(10, iceCream);

        System.out.println(iceCream.getDescription());
        System.out.println(iceCream.getPrice());
    }
}
