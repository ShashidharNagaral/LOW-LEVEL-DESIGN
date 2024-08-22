package WITH_SO.impl;

import WITH_SO.Bill;
import WITH_SO.BillCalculateStrategy;
import WITH_SO.Item;

public class DiscountCalculator implements BillCalculateStrategy {

    @Override
    public float calculateBill(Bill bill) {
        float amount = 0;
        for (Item item : bill.getItems()) {
            amount += item.getPrice();
        }
        return amount * (100 - bill.getDiscount()) / 100;
    }
}
