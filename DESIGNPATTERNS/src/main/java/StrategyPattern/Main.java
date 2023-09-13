package StrategyPattern;

import StrategyPattern.KickImpl.FrontKick;
import StrategyPattern.KickImpl.JumpingKick;
import StrategyPattern.PunchImpl.ReversePunch;


public class Main {
    public static void main(String[] args) {
        // Scorpion is a type of mortal kombat character who has default technique as Front Kick and Straight Punch

        Fighter scorpion = new Scorpion();
        scorpion.performKick();
        scorpion.performPunch();

        scorpion.setKick(new JumpingKick()); // strategy changed in runtime
        scorpion.setPunch(new ReversePunch());

        scorpion.performKick();
        scorpion.performPunch();

        // we can also inject the technique of a fighter character at runtime
        Fighter kano = new Kano(new FrontKick(), new ReversePunch());
        kano.performKick();
        kano.performPunch();
    }
}
