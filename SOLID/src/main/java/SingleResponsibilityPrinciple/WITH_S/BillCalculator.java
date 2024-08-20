package SingleResponsibilityPrinciple.WITH_S;

import java.util.ArrayList;

public class BillCalculator {
    public float calculateBill(ArrayList<Item> items) {
        float amount = 0;
        for (Item item : items) {
            amount += item.getPrice();
        }
        return amount;
    }
}
