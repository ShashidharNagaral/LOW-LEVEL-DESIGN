package SingleResponsibilityPrinciple.NO_SOLID;

public class Main {
    public static void main(String[] args) {
        Bill bill = new Bill("Shashidhar"); // new instance of Bill for a new customer

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
