package NO_SOLID;

import java.util.ArrayList;

public class BillingSystem {
    private ArrayList<Item> items;
    private String customerName;

    public BillingSystem(String customerName) {
        this.items = new ArrayList<>();
        this.customerName = customerName;
    }

    // calculate bill
    public float calculateAmount() {
        float amount = 0;
        for(Item i: items) {
            amount += i.getPrice();
        }
        return amount;
    }

    public void printBill() {
        System.out.println("Items");
        for(Item i: items) {
            System.out.println(i.getId()+": "+i.getPrice());
        }
    }

    // share bill
    public void shareBill() {
        System.out.println("Share bill!");
    }

    // save bill
    public void saveToDB() {
        System.out.println("Save the bill to DB");
    }

    // remove item
    public void removeItem(Item item) {
        items.remove(item);
    }

    // add item
    public void addItem(Item item) {
        items.add(item);
    }
}
