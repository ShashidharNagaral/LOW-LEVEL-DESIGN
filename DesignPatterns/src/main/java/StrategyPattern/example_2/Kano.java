package StrategyPattern.example_2;

import StrategyPattern.example_2.KickImpl.JumpingKick;
import StrategyPattern.example_2.PunchImpl.StraightPunch;

public class Kano extends Fighter{
    public Kano(Kick kick, Punch punch) {
        super(kick, punch);
    }

    public Kano() {
        super(new JumpingKick(), new StraightPunch());
    }
}
