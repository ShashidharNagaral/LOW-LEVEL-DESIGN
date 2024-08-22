package LSP.WITH;

public class ElectricBike implements Bike {

    private int speed;

    @Override
    public void accelerate() {
        this.speed += 5;
        System.out.println(this.speed);
    }
}
