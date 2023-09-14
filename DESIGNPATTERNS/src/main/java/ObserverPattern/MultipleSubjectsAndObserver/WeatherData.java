package ObserverPattern.MultipleSubjectsAndObserver;

public class WeatherData extends Subject {

    @Override
    public void add(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void remove(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void updateAll() {
        for(Observer o: observers) {
            o.update(this.getData());
        }
    }

    public void updateWeatherData(String data) {
        setData(data);
        updateAll();
    }

    public void printObservers() {
        for(Observer o: this.observers) {
            System.out.println(o.getClass().getSimpleName());
        }
    }

}
