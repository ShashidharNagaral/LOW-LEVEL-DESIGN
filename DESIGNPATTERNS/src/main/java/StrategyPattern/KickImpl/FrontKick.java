package StrategyPattern.KickImpl;

import StrategyPattern.Kick;

public class FrontKick implements Kick {
    @Override
    public void kick() {
        System.out.println("Kick in Front Side!");
    }
}
