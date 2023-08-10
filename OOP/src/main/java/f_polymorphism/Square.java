package f_polymorphism;

public class Square extends Shape{
    @Override // this is called annotation
    // this will run when obj of Square is created
    // hence it is overriding the parent(Shape) area method
    void area() {
        System.out.println("Area is side^2");
    }

    void perimeter() {
        System.out.println("Perimeter is 4*side");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
