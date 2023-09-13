package k_cloning;

/*
    Cloning: The clone() method is a method provided by the Java runtime in the Object class.
    You can override it to customize the copying behavior for your class. If you want to achieve
    a deep copy, you need to implement the Cloneable interface and provide your own deep copying logic.

    Copy Constructor: The copy constructor is a user-defined constructor that you implement in your class.
    You have full control over how the copying process is implemented. You can choose whether to perform
    a shallow or deep copy, or any other custom copy logic you need.
 */

public class Product implements Cloneable{
    String name;
    int price;
    int arr[] = new int[]{1, 2, 3, 4};

    public Product(String name, int price) {
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
