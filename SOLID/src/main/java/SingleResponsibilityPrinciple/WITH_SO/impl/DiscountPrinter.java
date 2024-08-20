package SingleResponsibilityPrinciple.WITH_SO.impl;

import SingleResponsibilityPrinciple.WITH_SO.Bill;
import SingleResponsibilityPrinciple.WITH_SO.Item;
import SingleResponsibilityPrinciple.WITH_SO.PrinterStrategy;

public class DiscountPrinter implements PrinterStrategy {
    @Override
    public void printBill(Bill bill) {
        System.out.println("---------");
        System.out.println("Customer Name: "+ bill.getCustomerName());
        for(Item item: bill.getItems()) {
            System.out.println(item.getId()+": "+item.getPrice());
        }
        System.out.println("Discount percentage: "+bill.getDiscount()+"%");
        System.out.println("Discount Total: "+bill.getTotalAmount());
        System.out.println("---------");
    }
}
