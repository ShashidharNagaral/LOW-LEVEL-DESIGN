package ObserverPattern.example_2;

public class ObserverA<T> implements Observer<T> {
    @Override
    public void update(T data) {
        System.out.println("Observer A: "+data);
    }
}
