package ObserverPattern;

public class Main {

    public static void main(String[] args) {
        Subject cs = new CricketScore();
        Subject acs = new AnotherCricketScore();
        OTT s = new Sony(cs);
        OTT h = new HotStar(acs);
        ((CricketScore) cs).setScore(10);
        ((AnotherCricketScore) acs).setScore(20);
    }

}
