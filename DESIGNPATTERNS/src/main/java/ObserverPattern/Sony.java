package ObserverPattern;

public class Sony implements Observer{
    CricketScore subject;



    private String id;
    public Sony(CricketScore subject, String id) {
        this.subject = subject;
        this.id = id;
        this.subject.add(this);
    }


    @Override
    public void update() {
        System.out.println("id"+this.id+": "+this.subject.getRuns());
    }
}
