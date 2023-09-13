package StrategyPattern;

import StrategyPattern.KickImpl.FrontKick;
import StrategyPattern.PunchImpl.ReversePunch;
import StrategyPattern.PunchImpl.StraightPunch;

public class Scorpion extends Fighter{

    public Scorpion() {
        super(new FrontKick(), new StraightPunch());
    }
    public Scorpion(Kick kick, Punch punch) {
        super(kick, punch);
    }
}
