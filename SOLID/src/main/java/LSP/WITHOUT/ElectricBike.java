package LSP.WITHOUT;

public class ElectricBike implements Bike{

    private int speed;

    @Override
    public void turnOnEngine() {
        throw new RuntimeException("No Engine!");
    }

    @Override
    public void accelerate() {
        this.speed += 5;
    }
}
