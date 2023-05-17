package srp;

public class PrintOrder {

    public void print(Order order) {
        System.out.printf("printing bill no. %d\n", order.getOrderNumber());
    }
}
