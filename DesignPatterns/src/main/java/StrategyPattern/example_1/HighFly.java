package StrategyPattern.example_1;

public class HighFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Fly at high altitude");
    }
}
