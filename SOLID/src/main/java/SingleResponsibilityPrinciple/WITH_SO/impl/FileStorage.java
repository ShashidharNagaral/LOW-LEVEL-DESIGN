package SingleResponsibilityPrinciple.WITH_SO.impl;

import SingleResponsibilityPrinciple.WITH_SO.Storage;

public class FileStorage implements Storage {
    @Override
    public void save() {
        System.out.println("Storing Bills into file");
    }
}
