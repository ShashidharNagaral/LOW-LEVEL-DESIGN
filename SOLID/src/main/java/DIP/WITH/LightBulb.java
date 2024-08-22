package DIP.WITH;

public class LightBulb implements Switchable{
    private boolean isOn;

    public void operate(boolean isOn) {
        this.isOn = isOn;
    }

    @Override
    public void turnOn() {
        this.isOn = true;
    }

    @Override
    public void turnOff() {
        this.isOn = false;
    }
}
