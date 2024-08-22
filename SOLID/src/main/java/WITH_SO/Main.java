package WITH_SO;

/*
    NOTE:
    Open/Closed Principle tells that a class should be open for extension but closed for modification.
    Explanation:
    - A class which is in production should not be modified, so then how to add new feature to this class?
    - So we can think like giving the features/responsibility to some interface, and now we can create concrete classes
    each of which can have its own feature implementation. This is also known as Coding to an Interface.
    - Now to modify the class we can inject the concrete class, as per our requirement.

    Why do we need interface/abstract class here?
    - To define a contract (in this case the feature)

    Do we really need interface/abstract?
    - We can achieve Open/Closed Principle using inheritance where the child classes can modify/override the feature.
    - But, we should rely on composition over inheritance since this can make the code losely coupled, think why and how?
    - Moreover if we dont use interface/abstract it can affect scalability as we increase stratergies.
*/

import WITH_SO.impl.*;

public class Main {
    public static void main(String[] args) {
        BillCalculateStrategy defaultCalculator = new DefaultCalculator();
        PrinterStrategy defaultPrinter = new DefaultPrinter();
        PaymentStrategy bankPayment = new BankPayment();

        Bill bill = new Bill("Shashidhar", defaultCalculator, defaultPrinter);

        Item book = new Item("book", 50);
        Item pen = new Item("pen", 10);

        bill.addItem(book);
        bill.addItem(pen);

        Storage dbStorage = new DBStorage();

        BillStorageManager billStorageManager = new BillStorageManager(bill, dbStorage);
        Payment payment = new Payment(bill, bankPayment);

        payment.pay(); // bank transaction

        billStorageManager.save(); // db storage

        defaultPrinter.printBill(bill);

        BillCalculateStrategy discountCalculator = new DiscountCalculator();
        PrinterStrategy discountPrinter =  new DiscountPrinter();
        PaymentStrategy upiPayment = new UPIPayment();

        Bill discount_bill = new Bill("Shashidhar_discount", discountCalculator, discountPrinter);
        discount_bill.setDiscount(5);

        Storage fileStorage = new FileStorage();
        BillStorageManager billStorageManager1 = new BillStorageManager(bill, fileStorage);
        Payment payment1 = new Payment(discount_bill, upiPayment);

        Item paints = new Item("paints", 100);
        Item bag = new Item("bag", 500);

        discount_bill.addItem(paints);
        discount_bill.addItem(bag);

        payment1.pay(); // upi transaction

        billStorageManager1.save(); // file storage

        discountPrinter.printBill(discount_bill);
    }
}
