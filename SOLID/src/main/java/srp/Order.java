package srp;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Item> items;
    private Customer customer;

    private int orderNumber;

    private PrintOrder printOrder;

    public Order(Customer customer, PrintOrder printOrder, int orderNumber) {
        this.customer = customer;
        this.items = new ArrayList<>();
        this.printOrder = printOrder;
        this.orderNumber = orderNumber;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Item addItem(Item item) {
        this.items.add(item);
        return item;
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public void print() {
        this.printOrder.print(this);
    }
}
