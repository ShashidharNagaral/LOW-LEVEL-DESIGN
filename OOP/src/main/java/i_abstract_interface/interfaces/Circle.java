package i_abstract_interface.interfaces;

import i_abstract_interface.interfaces.ext.Shape;

public class Circle implements Shape, Color{

    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Shape.pi * Math.pow(this.r, 2);
    }

    @Override
    public void paint(COLORS color) {
        System.out.println("Circle is painted with " +color+" color");
    }
}
