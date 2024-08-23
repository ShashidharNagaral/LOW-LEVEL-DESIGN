package StrategyPattern.example_1;

public class Main {
    public static void main(String[] args) {
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.fly();
        rubberDuck.quack();

        SimpleDuck simpleDuck = new SimpleDuck(new HighFly(), new Squeak());
        simpleDuck.quack(); // squeak sound!

        // change quack behavior
        simpleDuck.setQuackBehavior(new Quack());
        simpleDuck.quack(); // quack sound!
    }
}
