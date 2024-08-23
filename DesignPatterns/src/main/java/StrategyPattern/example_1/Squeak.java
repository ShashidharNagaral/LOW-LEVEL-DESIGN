package StrategyPattern.example_1;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Squeak sound!");
    }
}
