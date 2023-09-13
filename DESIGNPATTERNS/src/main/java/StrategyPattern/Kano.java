package StrategyPattern;

import StrategyPattern.KickImpl.JumpingKick;
import StrategyPattern.PunchImpl.StraightPunch;

public class Kano extends Fighter{
    public Kano(Kick kick, Punch punch) {
        super(kick, punch);
    }

    public Kano() {
        super(new JumpingKick(), new StraightPunch());
    }
}
