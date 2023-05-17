package f_polymorphism;

public class Shape {
    void area() {
        System.out.println("This is area in shape!");
    }

//    final void area() {
//        System.out.println("This is area in shape!");
//    }
    // this will throw error
    /*
    We cannot override final method, so final methods are resolved at compile time.
    similarly, final class will not allow inheritance and all its method become final
     */
}
