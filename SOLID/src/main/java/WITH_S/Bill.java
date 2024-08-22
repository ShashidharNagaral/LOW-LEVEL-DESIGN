package WITH_S;

import java.util.ArrayList;

/*
    NOTE: BillingSystem class has
    - items
    - customerName
    - addItem and removeItem methods for managing the items in the itemList.
 */

public class Bill {
    private ArrayList<Item> items;
    private String customerName;

    private BillCalculator billCalculator;

    public ArrayList<Item> getItems() {
        return items;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Bill(String customerName, BillCalculator billCalculator) {
        this.items = new ArrayList<>();
        this.customerName = customerName;
        this.billCalculator = billCalculator;
    }

    // add item
    public void addItem(Item item) {
        this.items.add(item);
    }

    //  remove item
    public void removeItem(Item item) {
        this.items.remove(item);
    }

    // get total bill amount
    public float getTotalAmount() {
        return this.billCalculator.calculateBill(this.items);
    }
}
