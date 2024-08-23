package StrategyPattern.example_1;

public class NoFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Cannot fly");
    }
}
