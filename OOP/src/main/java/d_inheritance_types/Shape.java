package d_inheritance_types;

public interface Shape {
    default void create() {
        System.out.println("this is create method of Shape Interface");
    }
}
