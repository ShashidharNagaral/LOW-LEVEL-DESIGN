package e_polymorphism;

public class Shape {
    void area() {
        System.out.println("Shape class: area method");
    }

/* NOTE:
We cannot override final method, so final methods are resolved at compile time.
similarly, final class will not allow inheritance and all its method become final.
*/

//    final void area() {
//        System.out.println("Shape class: area method");
//    }
}
