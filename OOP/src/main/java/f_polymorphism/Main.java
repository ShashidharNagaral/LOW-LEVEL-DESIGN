package f_polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();

        Shape shape1 = new Triangle();
        // even though reference type is of Shape Class, area method of triangle object gets called
        shape1.area();

        /*
        Method Overloading:
        it is compile-time/ static polymorphism in which the method to be called is resolved while code is being compiled
         */
        System.out.println(circle.sum(1, 2));
        System.out.println(circle.sum(1, 1.2));
        System.out.println(circle.sum(1, 2, 3));
        System.out.println(circle.sum(1.3, 1.4));
        // for same method name either
        // 1. number of parameter's should be different
        // 2. parameter type should be different


        /*
        Method Overriding:
        How method overriding is runtime polymorphism?
        -> method binding between method call and method definition happens at runtime and also the objects created at runtime
         */
        shape.area();
        circle.area();
        triangle.area();
        square.area();

        // NOTE: what method is accessible is dependent on reference type whereas which method will be accessed depends on object type.
        Shape circle2 = new Circle();
        circle2.area(); // this will call area method of circle class not because it was having method defined, but it was overriding method
        // from  parent class (Shape).

        //  circle2.perimeter();  //  this won't work as above example
        // since the reference type of circle2 is Shape, the method is
        System.out.println(square);

        // NOTE: static methods cannot be overridden(can be inherited), bcz the static method will not depend on object but class itself
    }
}
