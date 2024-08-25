package ObserverPattern.example_1;

public class Notification extends Subscriber {
    public Notification(String name) {
        super(name);
    }

    public Notification(String name, Producer p) {
        super(name, p);
    }

    @Override
    public void update(String message) {
        System.out.println(message);
    }

    @Override
    public String getName() {
        return "notification";
    }
}
