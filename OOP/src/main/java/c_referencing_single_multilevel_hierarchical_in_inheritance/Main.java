package c_referencing_single_multilevel_hierarchical_in_inheritance;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------  1");
        Rectangle rect = new Rectangle(10, 21);
        Square square = new Square(11);
        square.getDetail();

        // Square sq = new Rectangle(10, 11); // -> Child can not reference to parent object

        /* Note: A child class cannot refer to a parent object. Why?
        - Creating an object reference of type Child class means we have access to Child class members along with
        non-private members of the Parent class.
        - However, since we are creating an instance of the Parent class, which does not call the constructor of the
        Child class, how can we access Child class member variables? Hence, a child class cannot refer to a parent object.
        */

        System.out.println("--------------  2");

        // -> this is allowed bcz when Square object is created it also calls parent class constructor.
        // -> Reference type = parent, we can access parent class members
        // -> Instance type = child, but since instance is of type child it can access all non-private members and overriden members
        Rectangle rect2 = new Square(10);
        System.out.println("side: "+rect2.length+" side: "+rect2.breadth);

        //  System.out.println(rect2.side); // rect2 cannot access the side member of Square class bcz rect2 variable is
        //  reference of type Rectangle and Rectangle class does not have 'side' member variable in it.

        /* NOTE:
         -> It's "TYPE OF REFERENCE" and "NOT TYPE OF OBJECT" that determines what member can be accessed.
         -> This is applicable only for variable not applicable for methods, variables are resolved at compile time
        */
        System.out.println("--------------  3");
        BigSquare bigSquare = new BigSquare();
        System.out.println("class BigSquare: "+bigSquare.name);

        // at runtime, we have changed the type of reference of BigSquare class instance
        // so, now rect3.name will refer to name variable in Rectangle class.

        System.out.println("--------------  4");
        Rectangle rect3 = bigSquare;
        System.out.println("class Rectangle: "+rect3.name);

        System.out.println(((Square)bigSquare).name); // typecasting is nothing but changing the type of reference

        SmallSquare smallSquare = new SmallSquare();
        smallSquare.getDetail();
    }
}

/*
    hierarchical inheritance
                   Square
                     |
                     |
                ____________
               |            |
           BigSquare    SmallSquare
* */
