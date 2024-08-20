package SingleResponsibilityPrinciple.WITH_SO.impl;

import SingleResponsibilityPrinciple.WITH_SO.Storage;

public class DBStorage implements Storage {
    @Override
    public void save() {
        System.out.println("Storing Bill into DB");
    }
}
