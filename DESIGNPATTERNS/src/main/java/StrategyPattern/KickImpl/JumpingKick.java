package StrategyPattern.KickImpl;

import StrategyPattern.Kick;

public class JumpingKick implements Kick {
    @Override
    public void kick() {
        System.out.println("Jump and Kick!");
    }
}
