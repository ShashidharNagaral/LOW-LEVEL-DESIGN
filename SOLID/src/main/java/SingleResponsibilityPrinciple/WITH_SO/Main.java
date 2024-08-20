package SingleResponsibilityPrinciple.WITH_SO;

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

import SingleResponsibilityPrinciple.WITH_SO.impl.*;

public class Main {
    public static void main(String[] args) {
        BillCalculateStrategy defaultCalculator = new DefaultCalculator();
        PrinterStrategy defaultPrinter = new DefaultPrinter();
        EmailShare emailShare = new EmailShare();

        Bill bill = new Bill("Shashidhar", defaultCalculator, defaultPrinter);

        Item book = new Item("book", 50);
        Item pen = new Item("pen", 10);

        bill.addItem(book);
        bill.addItem(pen);

        Storage dbStorage = new DBStorage();

        BillManager billManager = new BillManager(bill, dbStorage, emailShare);
        Transaction transaction = new Transaction(bill);

        transaction.payBill();

        billManager.save(); // db storage
        billManager.share(); // email sharing

        defaultPrinter.printBill(bill);

        BillCalculateStrategy discountCalculator = new DiscountCalculator();
        PrinterStrategy discountPrinter =  new DiscountPrinter();
        ShareStrategy bluetoothShare = new BluetoothShare();

        Bill discount_bill = new Bill("Shashidhar_discount", discountCalculator, discountPrinter);
        discount_bill.setDiscount(5);

        Storage fileStorage = new FileStorage();
        BillManager billManager1 = new BillManager(bill, fileStorage, bluetoothShare);
        Transaction transaction1 = new Transaction(discount_bill);

        Item paints = new Item("paints", 100);
        Item bag = new Item("bag", 500);

        discount_bill.addItem(paints);
        discount_bill.addItem(bag);

        transaction1.payBill();

        billManager1.save(); // file storage
        billManager1.share(); // bluetooth sharing

        discountPrinter.printBill(discount_bill);
    }
}
