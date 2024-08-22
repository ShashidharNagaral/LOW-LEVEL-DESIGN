package LSP.WITHOUT;

public class Main {
    public static void main(String[] args) {
        Bike bike = new MotorBike();
        bike.turnOnEngine();

        bike =  new ElectricBike();
        bike.turnOnEngine();
    }
}
