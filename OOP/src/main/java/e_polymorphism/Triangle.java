package e_polymorphism;

public class Triangle extends Shape{
    @Override
    void area() {
        System.out.println("area method is override in Triangle class");
        System.out.println("Area is 1/2 * base * height");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
