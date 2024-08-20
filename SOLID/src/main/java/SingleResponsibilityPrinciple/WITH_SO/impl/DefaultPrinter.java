package SingleResponsibilityPrinciple.WITH_SO.impl;

import SingleResponsibilityPrinciple.WITH_SO.Bill;
import SingleResponsibilityPrinciple.WITH_SO.Item;
import SingleResponsibilityPrinciple.WITH_SO.PrinterStrategy;

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
