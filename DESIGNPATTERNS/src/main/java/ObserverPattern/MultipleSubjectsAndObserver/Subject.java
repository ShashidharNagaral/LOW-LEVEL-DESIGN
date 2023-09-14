package ObserverPattern.MultipleSubjectsAndObserver;

import java.util.HashSet;
import java.util.Set;

public abstract class Subject {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    Set<Observer> observers = new HashSet<>();

    public abstract void add(Observer o);
    public abstract void remove(Observer o);
    public abstract void updateAll();
}
