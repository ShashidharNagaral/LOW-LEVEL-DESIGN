package ObserverPattern.MultipleSubjectsAndObserver;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public abstract class Observer {
    Set<Subject> subjects = new HashSet<>();

    public Observer() {
        subjects = new HashSet<>();
    }

    public Observer(Set<Subject> subjects) {
        this.subjects = subjects;
        for(Subject s: subjects) {
            s.add(this);
        }
    }

    public Observer(Subject subject) {
        this.subjects.add(subject);
        subject.add(this);
    }

    public abstract void add(Subject s);

    public abstract void add(Set<Subject> s);

    public abstract void remove(Subject s);

    public abstract void removeAll();

    public abstract void update(String data);

}
