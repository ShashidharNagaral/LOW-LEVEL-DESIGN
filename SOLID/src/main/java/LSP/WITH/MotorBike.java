package LSP.WITH;

public class MotorBike implements EngineBike {

    private boolean isEngineOn;
    private int speed;

    @Override
    public void turnOnEngine() {
        this.isEngineOn = true;
    }

    @Override
    public void accelerate() {
        this.speed = this.speed + 10;
        System.out.println(this.speed);
    }
}
