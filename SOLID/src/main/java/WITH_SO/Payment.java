package WITH_SO;

/*
    NOTE: Payment Class is responsible to handle transaction
    (Further we can me it more generalise to make it adapt different paying interfaces)
 */

public class Payment {

    Bill bill;
    PaymentStrategy paymentStrategy;

    public Payment(Bill bill, PaymentStrategy paymentStrategy) {
        this.bill = bill;
        this.paymentStrategy = paymentStrategy;
    }

    public void pay() {
        this.paymentStrategy.pay();
    }
}
