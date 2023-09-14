package ObserverPattern.MultipleSubjectsAndObserver;

import java.util.Set;

public class Sony extends Observer{

    public Sony(Set<Subject> subjects) {
        super(subjects);
    }

    public Sony(Subject subject) {
        super(subject);
    }

    public Sony() {
        super();
    }

    @Override
    public void add(Subject s) {
        this.subjects.add(s);
        s.add(this);
    }

    @Override
    public void add(Set<Subject> subjects) {
        for(Subject s: subjects) {
            this.add(s);
            s.add(this);
        }
    }

    @Override
    public void remove(Subject s) {
        this.subjects.remove(s);
    }

    @Override
    public void removeAll() {
        this.subjects.clear();
    }

    @Override
    public void update(String data) {
        System.out.println(this.getClass().getSimpleName()+": "+data);
    }

    public void printSubject() {
        for(Subject s: this.subjects) {
            System.out.println(s.getClass().getSimpleName());
        }
    }
}
