package i_abstract_interface.interfaces;


import i_abstract_interface.interfaces.ext.SolidShape;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println((circle.area())); // -> 314.1592653589793
        circle.paint(Color.COLORS.RED); // -> Circle is painted with RED color

        SolidShape sphere = new Sphere(15);
        System.out.println((sphere.area())); // -> 706.8583470577034
        System.out.println((sphere.volume())); // -> 10602.875205865552
    }
}
