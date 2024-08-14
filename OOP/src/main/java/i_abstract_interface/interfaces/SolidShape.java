package i_abstract_interface.interfaces;

import i_abstract_interface.interfaces.Shape;

public interface SolidShape extends Shape {
    public double volume();

    // when we extend an interface then child interface will inherit all the parent abstract methods and variables
}
