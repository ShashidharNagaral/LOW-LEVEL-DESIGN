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

import SingleResponsibilityPrinciple.WITH_SO.impl.DefaultCalculator;
import SingleResponsibilityPrinciple.WITH_SO.impl.DefaultPrinter;
import SingleResponsibilityPrinciple.WITH_SO.impl.DiscountCalculator;
import SingleResponsibilityPrinciple.WITH_SO.impl.DiscountPrinter;

public class Main {
    public static void main(String[] args) {
        BillCalculator defaultCalculator = new DefaultCalculator();
        PrinterStrategy defaultPrinter = new DefaultPrinter();

        Bill bill = new Bill("Shashidhar", defaultCalculator, defaultPrinter);

        Item book = new Item("book", 50);
        Item pen = new Item("pen", 10);

        bill.addItem(book);
        bill.addItem(pen);

        defaultPrinter.printBill(bill);

        BillManager billManager = new BillManager(bill);
        Transaction transaction = new Transaction(bill);

        transaction.payBill();

        billManager.saveToDB();
        billManager.shareBill();

        BillCalculator discountCalculator = new DiscountCalculator();
        PrinterStrategy discountPrinter =  new DiscountPrinter();
        Bill discount_bill = new Bill("Shashidhar_discount", discountCalculator, discountPrinter);
        discount_bill.setDiscount(5);
        Item paints = new Item("paints", 100);
        Item bag = new Item("bag", 500);

        discount_bill.addItem(paints);
        discount_bill.addItem(bag);

        discountPrinter.printBill(discount_bill);
    }
}
