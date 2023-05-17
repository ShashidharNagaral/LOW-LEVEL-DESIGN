package f_polymorphism;

public class Circle extends Shape {
    void area() {
        System.out.println("Area is pi * radius ^ 2");
    }

    int sum(int a, int b) {
        return a + b;
    }

    double sum(int a, double b) {
        return a + b;
    }

    double sum(int a, int b, int c) {
        return a + b + c;
    }

    double sum(double a, double b) {
        return a + b;
    }

//    double sum(int a, int b) {
//        return Double.valueOf(a+b);
//    } // this won't be allowed since there's already a method sum with int, int as parameter types


    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
