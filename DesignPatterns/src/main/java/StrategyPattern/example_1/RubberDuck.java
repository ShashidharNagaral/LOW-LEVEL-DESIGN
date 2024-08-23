package StrategyPattern.example_1;

public class RubberDuck extends Duck{
    public RubberDuck() {
        super(new NoFly(), new Squeak());
    }

    @Override
    public void display() {
        System.out.println("Rubber Duck!");
    }
}
