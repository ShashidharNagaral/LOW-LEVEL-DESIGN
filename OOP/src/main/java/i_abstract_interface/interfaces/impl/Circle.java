package i_abstract_interface.interfaces.impl;

import i_abstract_interface.interfaces.Color;
import i_abstract_interface.interfaces.Shape;

public class Circle implements Shape, Color {
    private int r;
    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Shape.PI * Math.pow(this.r, 2);
    }

    @Override
    public void paint(COLORS color) {
        System.out.println("Circle is painted with " +color+" color");
    }
}
