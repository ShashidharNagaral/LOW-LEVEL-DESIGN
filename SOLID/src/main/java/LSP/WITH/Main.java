package LSP.WITH;

/*
    NOTE: In the original code, the ElectricMotorBike class violated the Liskov Substitution Principle (LSP) because it inherited methods from the Bike interface that didn't apply to it, specifically the turnOnEngine() method. This led to runtime errors when ElectricMotorBike objects were used in place of MotorBike.

    To solve this, I refactored the design by:

    Creating Separate Interfaces:
    - The Bike interface now only includes the accelerate() method, which applies to all types of bikes.
    - The EngineBike interface extends Bike and adds the turnOnEngine() method, specifically for bikes with engines.

    Implementing the Interfaces:
    - MotorBike implements the EngineBike interface, which includes both accelerate() and turnOnEngine().
    - ElectricBike implements the Bike interface, focusing solely on accelerate().

    Replacing References:
    - The Main class uses a Bike reference that can be replaced by different implementations (MotorBike and ElectricBike).
    - This demonstrates how the program continues to function correctly when the Bike reference is reassigned, showcasing
    compliance with LSP.

    This solution ensures that the ElectricBike class can be substituted for MotorBike without violating LSP, while
    maintaining the integrity of the program and avoiding runtime errors.
*/

public class Main {
    public static void main(String[] args) {
        Bike bike = new MotorBike();
        ((MotorBike) bike).turnOnEngine();
        bike.accelerate();

        bike = new ElectricBike();
        bike.accelerate();
    }
}
