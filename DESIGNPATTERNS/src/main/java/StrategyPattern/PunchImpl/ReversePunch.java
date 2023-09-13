package StrategyPattern.PunchImpl;

import StrategyPattern.Punch;

public class ReversePunch implements Punch {
    @Override
    public void punch() {
        System.out.println("Reverse Punch!");
    }
}
