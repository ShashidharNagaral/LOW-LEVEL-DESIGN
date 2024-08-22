package WITH_SO;

public class BillStorageManager {

    private Storage storage;
    private Bill bill;

    public BillStorageManager(Bill bill, Storage storage) {
        this.bill = bill;
        this.storage = storage;
    }

    public void save() {
        this.storage.save();
    }
}
