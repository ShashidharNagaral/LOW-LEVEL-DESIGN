package c_singleton;

/*
    What if you want to create only 1 instance of class?
    1. i,e ir-respect any number of reference variable, number of instances will be 1.
    2. We know we can create instance of any class only through Constructor.
    3. i,e we should give the privilege of calling a constructor to the user, i,e we should make it private
    4.
 */

public class Singleton {
    private int value = 0;
    private Singleton() {
        // this default will never be able to call from outside class
    }

    // singleton object will hold the only instance of Singleton Class
    // since all singleton is not a part of instance, we have to make it static
    private static Singleton singleton = null;

    //NOTE: this below method is NOT THREAD SAFE, i,e multiple threads can call getInstance() method and this will create multiple instances
    public static Singleton getInstance() {
        // if singleton is null i,e till now there's no any instance
        if (singleton == null) {
            singleton = new Singleton(); // we can call private constructor inside its own class
        }
        // if instance was already created then return that to any reference variable.
        return singleton;
    }

    /*
     Q. How to create thread safe single instance of class?
    -> We can create an instance at the time of class loading (early initialization)
    i,e private static Singleton singleton = new Singleton();
    -> but this will unnecessarily create an instance even when there is no need.
     */

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

/*
It has many applications like in multithreaded application, database connection etc.
 */


// implementing singleton using enum

enum ESingleton {
    INSTANCE;
    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static ESingleton getInstance() {
        return INSTANCE;
    }
}