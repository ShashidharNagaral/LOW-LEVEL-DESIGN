package WITH_SO.impl;

import WITH_SO.PaymentStrategy;

public class UPIPayment implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("UPI Transaction");
    }
}
