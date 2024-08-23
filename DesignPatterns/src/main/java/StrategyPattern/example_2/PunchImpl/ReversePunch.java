package StrategyPattern.example_2.PunchImpl;

import StrategyPattern.example_2.Punch;

public class ReversePunch implements Punch {
    @Override
    public void punch() {
        System.out.println("Reverse Punch!");
    }
}
