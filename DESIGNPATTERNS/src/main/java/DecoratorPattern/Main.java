package DecoratorPattern;


public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage = new Mocha(beverage); // instance of espresso -> true

        beverage = new Butter(beverage); // instance of espresso -> false
        // NOTE: so down the line when we wrap the instance with new decorators we can only check for instance that is parent of it only
        System.out.println(beverage.getDescription() +" : "+beverage.cost());
    }
}
