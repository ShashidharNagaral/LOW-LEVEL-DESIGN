package ObserverPattern.example_1;

public interface ISubscriber {
    void update(String message);
    String getName();
}
