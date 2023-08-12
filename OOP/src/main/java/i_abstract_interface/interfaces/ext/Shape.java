package i_abstract_interface.interfaces.ext;

public interface Shape {
    // static void fun(); // static interface method should always have a body
    public double area();
    double PI = Math.PI; // variable in interface are by default final and static
}
