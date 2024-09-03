package d_inheritance_types;

public interface Color {
    // NOTE: here default is not an access modifier, its a default implementation to the interface method
    default void create() {
        System.out.println("this is create method of Color Interface");
    }
}
