package ObserverPattern.example_1;

public abstract class Subscriber implements ISubscriber {

    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public Subscriber(String name, Producer p) {
        this.name = name;
        p.addSubscriber(this); // whenever an instance of Subscriber is created we will add it to producer
    }

    public abstract void update(String message);
}
