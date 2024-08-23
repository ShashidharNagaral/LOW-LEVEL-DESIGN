package StrategyPattern.example_2.KickImpl;

import StrategyPattern.example_2.Kick;

public class FrontKick implements Kick {
    @Override
    public void kick() {
        System.out.println("Kick in Front Side!");
    }
}
