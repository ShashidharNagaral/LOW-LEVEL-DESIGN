package i_abstract_interface.interfaces;

import i_abstract_interface.interfaces.impl.Shape;
import i_abstract_interface.interfaces.impl.SolidShape;

public class Sphere implements SolidShape {
    int r;

    public Sphere(int r) {
        this.r = r;
    }

    @Override
    public double volume() {
        return (4/3) * Shape.PI * Math.pow(this.r, 3);
    }

    @Override
    public double area() {
        return Shape.PI * Math.pow(this.r, 2);
    }
}
