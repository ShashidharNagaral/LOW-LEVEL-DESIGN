package DIP.WITH;

public class Fan implements Switchable{
    private int speed;
    private boolean isOn;

    @Override
    public void turnOn() {
        this.isOn = true;
    }

    @Override
    public void turnOff() {
        this.isOn = false;
    }
}
