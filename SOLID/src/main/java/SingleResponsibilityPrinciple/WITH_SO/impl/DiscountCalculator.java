package SingleResponsibilityPrinciple.WITH_SO.impl;

import SingleResponsibilityPrinciple.WITH_SO.Bill;
import SingleResponsibilityPrinciple.WITH_SO.BillCalculator;
import SingleResponsibilityPrinciple.WITH_SO.Item;

import java.util.ArrayList;

public class DiscountCalculator implements BillCalculator {

    @Override
    public float calculateBill(Bill bill) {
        float amount = 0;
        for (Item item : bill.getItems()) {
            amount += item.getPrice();
        }
        return amount * (100 - bill.getDiscount()) / 100;
    }
}
