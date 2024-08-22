package LSP.WITHOUT;

public class MotorBike implements Bike{

    private boolean isEngineOn;
    private int speed;

    @Override
    public void turnOnEngine() {
        this.isEngineOn = true;
    }

    @Override
    public void accelerate() {
        this.speed = this.speed + 10;
    }
}
