package SingleResponsibilityPrinciple.WITH_SO.impl;

import SingleResponsibilityPrinciple.WITH_SO.BillCalculator;
import SingleResponsibilityPrinciple.WITH_SO.Item;

import java.util.ArrayList;

public class DiscountCalculator implements BillCalculator {
    private float discount;

    public DiscountCalculator(float discount) {
        this.discount = discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public float calculateBill(ArrayList<Item> items) {
        float amount = 0;
        for (Item item : items) {
            amount += item.getPrice();
        }
        return amount * (100 - discount) / 100;
    }
}
