package i_abstract_interface.abstract_class;

public abstract class Parent {
    // can we make class final and abstract both?
    // -> NO, since final doesn't allow extension of class, whereas abstract tells use to extend and override method, both contradict
    abstract void run();

//    abstract static void build();// abstract and static is not possible because they contradict each other, what I mean is
    // abstract tells the class to override and static methods cannot be overridden since they are global to class

    private int x;

    public Parent(int x) {
        this.x = x;
    }

    // public abstract Parent(); // abstract constructor are not allowed

    // abstract class can have non-abstract methods (concrete methods) which can be called using subclass
    void greeting() {
        System.out.println("Good Morning! This is parent.");
    }
    public int getX() {
        return x;
    }

    // NOTE: we cannot achieve multiple inheritance through abstract classes, why?
    // -> bcz, abstract class still allows concrete methods, which may cause ambiguity
}
