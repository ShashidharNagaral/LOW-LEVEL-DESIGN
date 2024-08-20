package SingleResponsibilityPrinciple.WITH_SO;

import java.util.ArrayList;

/*  NOTE: Bill class has
    - items
    - customerName
    - addItem and removeItem methods for managing the items in the itemList.
 */

public class Bill {
    private ArrayList<Item> items;
    private String customerName;
    private BillCalculateStrategy billCalculator;
    private float discount;
    private PrinterStrategy printerStrategy;

    /*
        NOTE:
        - In the `WITH_S` package, `BillPrinter` and `Bill` are treated as separate concrete classes.
        While they could be coupled, keeping their implementations separate adheres to composition with delegation.
        - In the `WITH_SO` package, we explore this approach further, as composition is beneficial when dealing with
        different ways of printing the bill.
        - This approach adds new functionality to the `Bill` class by allowing it to delegate printing responsibilities
        to the`BillPrinter` class, while keeping the actual implementation of printing contained within `BillPrinter`.
    */


    public ArrayList<Item> getItems() {
        return items;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Bill(String customerName, BillCalculateStrategy billCalculator, PrinterStrategy printerStrategy) {
        this.items = new ArrayList<>();
        this.customerName = customerName;
        this.billCalculator = billCalculator;
        this.printerStrategy = printerStrategy;
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
        return this.billCalculator.calculateBill(this);
    }

    public void printBill() {
        this.printerStrategy.printBill(this);
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public float getDiscount() {
        return discount;
    }
}
