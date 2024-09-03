package h_abstract_interface.abstract_class;

public class Child extends Parent{

    public Child(int x1) {
        super(x1);
    }

    @Override
    void run() {
        System.out.println("Override run() method in Child Class");
    }
}
