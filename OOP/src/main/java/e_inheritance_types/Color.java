package e_inheritance_types;

public interface Color {
    default void create() {
        System.out.println("this is create method of Color Interface");
    }
}
