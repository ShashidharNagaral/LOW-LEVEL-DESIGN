package StrategyPattern.example_2;

import StrategyPattern.example_2.KickImpl.FrontKick;
import StrategyPattern.example_2.PunchImpl.StraightPunch;

public class Scorpion extends Fighter{

    public Scorpion() {
        super(new FrontKick(), new StraightPunch());
    }
    public Scorpion(Kick kick, Punch punch) {
        super(kick, punch);
    }
}
