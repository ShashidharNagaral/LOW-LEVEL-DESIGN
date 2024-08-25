package ObserverPattern.example_2;

public class ObserverB<T> implements Observer<T>{
    @Override
    public void update(T data) {
        System.out.println("Observer B: "+data);
    }
}
