package j_cloning;

/*  NOTE: Cloning
    The clone() method is a method provided by the Java runtime in the Object class.
    You can override it to customize the copying behavior for your class. If you want to achieve
    a deep copy, you need to implement the Cloneable interface and provide your own deep copying logic.

    Copy Constructor
    Copy constructor is a user-defined constructor that you implement in your class.
    You have full control over how the copying process is implemented. You can choose whether to perform
    a shallow or deep copy, or any other custom copy logic you need.
 */

/*
    NOTE: why a class needs to implement Cloneable for overriding the clone() method, even though Cloneable doesn't
    have any abstract methods?

    - The Purpose of Cloneable Interface:
    The Cloneable interface is a marker interface, which means it doesn't contain any methods to implement. Its sole
    purpose is to indicate that a class is eligible for the clone() method provided by Object to create a
    field-for-field copy of an object.

    - Why Implement Cloneable?
    By default, the clone() method in the Object class checks whether the object’s class implements the Cloneable
    interface. If the class doesn’t implement Cloneable, the clone() method throws a CloneNotSupportedException.
    Implementing Cloneable tells the JVM and other developers that your class is intended to support cloning. It’s a
    signal that your class has overridden the clone() method appropriately and supports this behavior.
 */

public class ShallowProduct implements Cloneable {
    String name;
    int price;
    int arr[] = new int[]{1, 2, 3, 4};

    public ShallowProduct(String name, int price) {
        this.name = new String(name);
        this.price = price;
    }

    // copy constructor
//    public Product(Product other) {
//        this.name = other.name;
//        this.price = other.price;
//    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // this is shallow copy
        return super.clone();
    }
}
