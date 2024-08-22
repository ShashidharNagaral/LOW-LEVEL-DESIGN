package WITH_SO.impl;

import WITH_SO.Bill;
import WITH_SO.Item;
import WITH_SO.PrinterStrategy;

// NOTE: Printer class is only responsible for handling the displaying logic
public class DefaultPrinter implements PrinterStrategy {
    @Override
    public void printBill(Bill bill) {
        System.out.println("---------");
        System.out.println("Customer Name: "+ bill.getCustomerName());
        for(Item item: bill.getItems()) {
            System.out.println(item.getId()+": "+item.getPrice());
        }
        System.out.println("Total: "+bill.getTotalAmount());
        System.out.println("---------");
    }
}
