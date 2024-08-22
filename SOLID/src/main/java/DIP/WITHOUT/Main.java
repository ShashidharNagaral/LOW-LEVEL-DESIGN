package DIP.WITHOUT;

public class Main {
    public static void main(String[] args) {
        LightBulb lightBulb = new LightBulb();
        SmartHome smartHome = new SmartHome(lightBulb);

        smartHome.turnOn(); //  turn on the light bulb
        smartHome.turnOff(); //  turn off the light bulb

        Fan fan = new Fan();

        // smartHome.updateDevice(fan); // we cannot update the device in smartHome class

        /*
            NOTE:
            - To solve this issue we need to follow Dependency Inversion Principle
            - i.e. change the dependency from LightBulb class to some abstraction.
         */
    }
}
