package h_access_control;

public class Parent {
    int num; // by default the access control is package private
    // default int num;

    /* NOTE:
    package private:
    -> data accessible inside same package including subclass in same package
    -> use default modifier when we don't want to let the data be used outside the package
     */

    private int arr[];
    /*
    private modifier:
    data can not be used outside the class
     */

    protected String name;
    /*
    protected modifier: useful in inheritance
    -> data can be also be used in another package but the class should be extended.
    -> protected allows access from subclasses and from other classes in the same package.
    -> We can use child class to use protected member outside the package but only child class object can access it.
    -> That's why any Derived class instance can access the protected method in Base.
    -> The other line creates a Base instance (not a Derived instance!!).
    -> And access to protected methods of that instance is only allowed from objects of the same package.
     */

    public Parent(int num, String name) {
        this.num = num;
        this.arr = new int[num];
        this.name = name;
    }

    public int getNum() {
        return num;
    }
    /*
    public modifier:
    this is accessible everywhere (not only subclass)
     */

}
