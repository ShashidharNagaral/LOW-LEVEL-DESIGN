package DIP.WITH;

public class SmartHome {

    private Switchable switchable; // SmartHome is not dependent specifically on LightBulb or Fan but on Switchable interface

    public SmartHome(Switchable switchable) {
        this.switchable = switchable;
    }

    public void updateDevice(Switchable switchable) {
        this.switchable = switchable;
    }

    public void turnOn() {
        this.switchable.turnOn();
    }

    public void turnOff() {
        this.switchable.turnOff();
    }

}
