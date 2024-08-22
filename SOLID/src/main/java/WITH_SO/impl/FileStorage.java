package WITH_SO.impl;

import WITH_SO.Storage;

public class FileStorage implements Storage {
    @Override
    public void save() {
        System.out.println("Storing Bills into file");
    }
}
