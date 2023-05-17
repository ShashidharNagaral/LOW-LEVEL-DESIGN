package h_access_control;

public class Child extends Parent {

    public Child(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Child child = new Child(13, "nagaral");
        // child.arr; private member not accessible
        child.name = "newName"; // protected member
    }

}
