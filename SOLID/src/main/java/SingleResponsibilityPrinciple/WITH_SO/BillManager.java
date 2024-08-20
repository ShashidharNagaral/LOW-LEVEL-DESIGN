package SingleResponsibilityPrinciple.WITH_SO;

/* NOTE:
    - BillManager has savetoDB, we can also add new feature called save to Files.
    - This will lead to creating a new strategy in BillManager called Storage
 */
public class BillManager {

    private Bill bill;
    private Storage storage;

    private ShareStrategy shareStrategy;

    public BillManager(Bill bill, Storage storage, ShareStrategy shareStrategy) {
        this.bill = bill;
        this.storage = storage;
        this.shareStrategy = shareStrategy;
    }

    public void save() {
        this.storage.save();
    }

    public void share() {
        this.shareStrategy.share();
    }

}
