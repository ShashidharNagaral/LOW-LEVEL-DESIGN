package h_abstract_interface.interfaces;

import h_abstract_interface.interfaces.impl.Circle;
import h_abstract_interface.interfaces.impl.Sphere;

/*
    NOTE: what does interface actually brings to OOP?
    - Using INTERFACE, we can define WHAT class must do, but not HOW it will do.
    - Interfaces provide several key benefits in OOP:
    1. Abstraction: Define contracts for classes to implement without dictating how.
    2. Polymorphism: Allow different implementations to be treated uniformly.
    3. Multiple Inheritance: Enable a class to implement multiple interfaces.
    4. Loose Coupling: Reduce dependencies between system components.
    5. Testability: Facilitate the creation of mock objects for testing.
    6. Flexibility: Allow system evolution without breaking existing code.
 */

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println((circle.area())); // -> 314.1592653589793
        circle.paint(Color.COLORS.RED); // -> Circle is painted with RED color
        circle.greet();

        SolidShape sphere = new Sphere(15);
        System.out.println((sphere.area())); // -> 706.8583470577034
        System.out.println((sphere.volume())); // -> 10602.875205865552
    }
}
