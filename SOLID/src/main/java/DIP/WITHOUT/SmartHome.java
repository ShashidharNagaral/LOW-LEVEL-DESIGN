package DIP.WITHOUT;

public class SmartHome {

    private LightBulb lightBulb; // SmartHome is tightly coupled with LightBulb

    public SmartHome(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    public void updateDevice(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    public void turnOn() {
        this.lightBulb.operate(true);
    }

    public void turnOff() {
        this.lightBulb.operate(false);
    }

}
