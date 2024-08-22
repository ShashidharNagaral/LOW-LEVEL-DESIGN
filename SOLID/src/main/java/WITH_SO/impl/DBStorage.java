package WITH_SO.impl;

import WITH_SO.Storage;

public class DBStorage implements Storage {
    @Override
    public void save() {
        System.out.println("Storing BillingSystem into DB");
    }
}
