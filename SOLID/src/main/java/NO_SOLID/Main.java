package NO_SOLID;

public class Main {
    public static void main(String[] args) {
        BillingSystem bill = new BillingSystem("Shashidhar"); // new instance of BillingSystem for a new customer

        Item rice = new Item("rice", 120.0f);
        Item book = new Item("book", 10);

        bill.addItem(rice);
        bill.addItem(book);

        bill.printBill();
        System.out.println(bill.calculateAmount());

        bill.removeItem(book);

        bill.printBill();
        System.out.println(bill.calculateAmount());
    }
}