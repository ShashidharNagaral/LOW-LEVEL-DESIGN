package n_pojo_javabeans;

import java.io.*;

/*
JAVA BEAN:
They should ALWAYS implement Serializable interface.
They MUST have a public no-arg constructor.
The properties within them should ALWAYS be PRIVATE with public getters and setter methods.
 */


public class StorageBean implements Serializable {
    private int value;

    public StorageBean() {

    }

    public StorageBean(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
        StorageBean storage = new StorageBean(120);
        StudentPOJO studentPOJO = new StudentPOJO(10, "shashdhi", 40);
        String path = "OOP/src/main/java/n_pojo_javabeans/";
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(path+"storage.ser"));
            outputStream.writeObject(storage);
//            outputStream.writeObject(studentPOJO); // this throws not serializable exception
            System.out.println("Storage object serialised and saved in file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(path+"storage.ser"));
            StorageBean obj = (StorageBean) inputStream.readObject();
            System.out.println("Deserialised the data and converted back to Storage type object");
            System.out.println("Storage value: "+obj.value);
        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
