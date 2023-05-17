package f_polymorphism;

public class Triangle extends Shape{
    void area() {
        System.out.println("Area is 1/2 * base * height");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
