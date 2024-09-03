package h_abstract_interface.interfaces;

public interface Color {

    enum COLORS{
        RED,
        ORANGE
    };

    void paint(COLORS color);
    default void greet() {
        System.out.println("this is color interface");
    }
}
