package ObserverPattern;

import java.util.HashSet;
import java.util.Set;


/*
   Is there actually any need of Subject interface?
-> What is use of subject interface ? to follow some contract, right?
-> Who all are implementing Subject ? different subject that act as a source of some data
-> Are they same (instance members)? No, every concrete subject are different and independent
-> Then how can we rely on the subject interface in the observer side (aggregation) ? No, we need the concrete subject aggregation
-> Then does this means we're tight coupling? No, we are not tight coupling since Observer interface is present inside Concrete Subject
*/
public class CricketScore{
    private int runs;
    private int wickets;
    private float over;
    Set<Observer> observers;

    public CricketScore() {
        this.observers = new HashSet<>();
    }

    public int getRuns() {
        return runs;
    }

    public int getWickets() {
        return wickets;
    }

    public float getOver() {
        return over;
    }

    public void add(Observer observer) {
        this.observers.add(observer);
    }

    public void remove(Observer observer) {
        this.observers.remove(observer);
    }

    public void updateAll() {
        for(Observer o: observers) {
            o.update();
        }
    }

    // setScore method will be called by some way (maybe it is polling to some api)
    // this method will call updateAll method and pushes the updated score to all the observers subscribed to this subject
    public void setScore(int runs, int wickets, float over) {
        this.runs = runs;
        this.wickets = wickets;
        this.over = over;
        this.updateAll();
    }
}
