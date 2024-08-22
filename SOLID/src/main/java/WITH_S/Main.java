package WITH_S;

/*
    NOTE:
    Single Responsibility Principle tells that every class
    - should have only one reason to change
    - should have only one responsibility
 */

public class Main {
    public static void main(String[] args) {
        BillCalculator billCalculator = new BillCalculator();
        Bill bill = new Bill("Shashidhar", billCalculator);

        Item book = new Item("book", 50);
        Item pen = new Item("pen", 10);

        bill.addItem(book);
        bill.addItem(pen);

        Printer billPrinter = new Printer(bill);
        billPrinter.printBill();

        BillManager billManager = new BillManager(bill);
        Payment transaction = new Payment(bill);

        transaction.pay();

        billManager.saveToDB();
        billManager.shareBill();
    }
}
