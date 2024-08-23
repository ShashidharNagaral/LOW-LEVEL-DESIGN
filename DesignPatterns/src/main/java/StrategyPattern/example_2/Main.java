package StrategyPattern.example_2;

import StrategyPattern.example_2.KickImpl.FrontKick;
import StrategyPattern.example_2.KickImpl.JumpingKick;
import StrategyPattern.example_2.PunchImpl.ReversePunch;

public class Main {
    public static void main(String[] args) {
        // Scorpion is a type of mortal kombat character who has default technique as Front Kick and Straight Punch
        Fighter scorpion = new Scorpion();
        scorpion.performKick();
        scorpion.performPunch();

        // strategy changed in runtime
        scorpion.setKick(new JumpingKick());
        scorpion.setPunch(new ReversePunch());

        scorpion.performKick();
        scorpion.performPunch();

        Fighter kano = new Kano(new FrontKick(), new ReversePunch());
        kano.performKick();
        kano.performPunch();
    }
}
