package i_abstract_interface.interfaces;


import i_abstract_interface.interfaces.ext.SolidShape;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println((circle.area()));
        circle.paint(Color.COLORS.RED);

        SolidShape sphere = new Sphere(10);
        System.out.println((sphere.area()));
        System.out.println((sphere.volume()));
    }
}
