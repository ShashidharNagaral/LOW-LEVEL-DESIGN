package WITH_SO.impl;

import WITH_SO.PaymentStrategy;

public class BankPayment implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Bank Transaction");
    }
}
