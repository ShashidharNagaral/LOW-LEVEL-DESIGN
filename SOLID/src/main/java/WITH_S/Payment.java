package WITH_S;

/*
    NOTE: Payment Class is responsible to handle transaction
    (Further we can me it more generalise to make it adapt different paying interfaces)
 */

public class Payment {

    Bill bill;

    public Payment(Bill bill) {
        this.bill = bill;
    }

    public void pay() {
        System.out.println("bill payment");
    }
}
