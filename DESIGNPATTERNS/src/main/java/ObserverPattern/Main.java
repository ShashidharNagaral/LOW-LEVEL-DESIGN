package ObserverPattern;

public class Main {
    public static void main(String[] args) {
        CricketScore cricketScore = new CricketScore();
        Observer observer = new Hotstar(cricketScore, "1");

        cricketScore.setScore(13, 1, 1.1f);
        Observer observer2 = new Sony(cricketScore, "2");
        cricketScore.setScore(20, 2, 1.5f);
    }
}
