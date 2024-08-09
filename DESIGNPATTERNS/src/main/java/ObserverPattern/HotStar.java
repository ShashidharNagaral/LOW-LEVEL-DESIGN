package ObserverPattern;

import ObserverPattern.OTT;
import ObserverPattern.Subject;

public class HotStar implements OTT {
    Subject cricketScore;

    public HotStar(Subject cricketScore) {
        this.cricketScore = cricketScore;
        cricketScore.register(this);
    }

    @Override
    public void update() {
        System.out.println("I got called hotstar!");
    }
}
