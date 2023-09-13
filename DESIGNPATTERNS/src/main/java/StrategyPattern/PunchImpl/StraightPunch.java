package StrategyPattern.PunchImpl;

import StrategyPattern.Punch;

public class StraightPunch implements Punch {
    @Override
    public void punch() {
        System.out.println("Punch Straight!");
    }
}
