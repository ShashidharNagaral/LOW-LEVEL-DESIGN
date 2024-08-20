package SingleResponsibilityPrinciple.WITH_S;

/* NOTE: BillManager Class handles saving the bills into the database, and also sharing the bill through some api services.
 */
public class BillManager {

    private Bill bill;

    public BillManager(Bill bill) {
        this.bill = bill;
    }

    public void saveToDB() {
        System.out.println("save bill to some database");
    }

    public void shareBill() {
        System.out.println("share bill using email");
    }
}
