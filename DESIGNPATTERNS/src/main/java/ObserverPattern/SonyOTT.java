package ObserverPattern;

public class SonyOTT implements OTT{
    Subject cricketScore;
    public SonyOTT(Subject cricketScore) {
        this.cricketScore = cricketScore;
        cricketScore.register(this);
    }


    @Override
    public void update() {
        System.out.println("I got called sony!");
    }
}
