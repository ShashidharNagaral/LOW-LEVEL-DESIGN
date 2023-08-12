package i_abstract_interface.abstract_class;

public class Child extends Parent{

    public Child(int x1) {
        super(x1); // we can call the constructor of through child class

    }

    @Override
    void run() {
        System.out.println("Child is running");
    }
}
