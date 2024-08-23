package StrategyPattern.example_2.PunchImpl;

import StrategyPattern.example_2.Punch;

public class StraightPunch implements Punch {
    @Override
    public void punch() {
        System.out.println("Punch Straight!");
    }
}
