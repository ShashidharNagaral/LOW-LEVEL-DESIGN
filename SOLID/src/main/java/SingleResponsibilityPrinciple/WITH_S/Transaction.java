package SingleResponsibilityPrinciple.WITH_S;

/*
    NOTE: Transaction Class is responsible to handle payment
    (Further we can me it more generalise to make it adapt different paying interfaces)
 */

public class Transaction {

    Bill bill;

    public Transaction(Bill bill) {
        this.bill = bill;
    }

    public void payBill() {
        System.out.println("bill payment");
    }
}
