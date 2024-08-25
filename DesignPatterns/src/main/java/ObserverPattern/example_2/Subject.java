package ObserverPattern.example_2;

import java.util.HashSet;
import java.util.Set;

public abstract class Subject<T> {

    protected Set<Observer<T>> observers;

    public Subject() {
        this.observers = new HashSet<>();
    }

    public void addSubject(Observer<T> observer) {
        this.observers.add(observer);
    }

    public void removeSubject(Observer<T> observer) {
        this.observers.remove(observer);
    }

    public void notifyAll(T data) {
        for(Observer<T> observer: observers) {
            observer.update(data);
        }
    }
}
