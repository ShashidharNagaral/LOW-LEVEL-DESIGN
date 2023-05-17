package srp;

public class SaveOrder {
    private Order order;

    public SaveOrder(Order order) {
        this.order = order;
    }

    public void saveToDB() {
        System.out.printf("saving order no. %d in database\n", this.order.getOrderNumber());
    }
}
