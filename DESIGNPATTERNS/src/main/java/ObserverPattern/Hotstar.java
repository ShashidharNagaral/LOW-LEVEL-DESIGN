package ObserverPattern;

public class Hotstar implements Observer{

    CricketScore subject;

    private String id;
    public Hotstar(CricketScore subject, String id) {
        this.subject = subject;
        this.id = id;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("id"+this.id +" : "+ this.subject.getOver() + " " + this.subject.getRuns() +" " + this.subject.getWickets());
    }
}
