package StrategyPattern.example_2.KickImpl;

import StrategyPattern.example_2.Kick;

public class JumpingKick implements Kick {
    @Override
    public void kick() {
        System.out.println("Jump and Kick!");
    }
}
