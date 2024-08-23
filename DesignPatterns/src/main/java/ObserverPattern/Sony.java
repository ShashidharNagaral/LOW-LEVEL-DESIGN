package ObserverPattern;

public class Sony implements OTT{
    Subject cricketScore;
    public Sony(Subject cricketScore) {
        this.cricketScore = cricketScore;
        cricketScore.register(this);
    }


    @Override
    public void update() {
        System.out.println("I got called sony!");
    }
}
