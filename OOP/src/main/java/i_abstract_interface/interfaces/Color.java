package i_abstract_interface.interfaces;

public interface Color {

    enum COLORS{
        RED,
        ORANGE
    };

    public void paint(COLORS color);

    public default void greet() {
        System.out.println("this is color interface");
    }
}
