package DIP.WITH;

public class Main {
    public static void main(String[] args) {
        LightBulb lightBulb = new LightBulb();
        SmartHome smartHome = new SmartHome(lightBulb);

        smartHome.turnOn(); //  turn on the light bulb
        smartHome.turnOff(); //  turn off the light bulb

        Fan fan = new Fan();

        smartHome.updateDevice(fan); // we can easily update the behaviour of SmartHome when we do loose coupling

        fan.turnOn();
        fan.turnOff();
    }
}
