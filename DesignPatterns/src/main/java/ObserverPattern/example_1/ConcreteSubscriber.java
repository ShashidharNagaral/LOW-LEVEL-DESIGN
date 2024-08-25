package ObserverPattern.example_1;

public class ConcreteSubscriber extends Subscriber{

    public ConcreteSubscriber(String name) {
        super(name);
    }

    public ConcreteSubscriber(String name, Producer p) {
        super(name, p);
    }

    @Override
    public void update(String message) {
        System.out.println(message);
    }

    @Override
    public String getName() {
        return "concrete subscriber";
    }
}
