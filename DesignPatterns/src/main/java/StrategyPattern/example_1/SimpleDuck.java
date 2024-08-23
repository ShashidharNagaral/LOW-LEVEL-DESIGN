package StrategyPattern.example_1;

public class SimpleDuck extends Duck{
    public SimpleDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }
}
