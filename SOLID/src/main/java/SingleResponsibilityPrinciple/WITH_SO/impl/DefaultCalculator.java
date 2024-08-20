package SingleResponsibilityPrinciple.WITH_SO.impl;

import SingleResponsibilityPrinciple.WITH_SO.BillCalculator;
import SingleResponsibilityPrinciple.WITH_SO.Item;

import java.util.ArrayList;

public class DefaultCalculator implements BillCalculator {
    public float calculateBill(ArrayList<Item> items) {
        float amount = 0;
        for (Item item : items) {
            amount += item.getPrice();
        }
        return amount;
    }
}
