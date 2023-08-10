package d_referencing_single_multilevel_hierarchical_in_inheritance;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 20);
        Square square = new Square(11);
        square.getDetail();


//        Square sq = new Rectangle(10, 11); // Child can not reference to parent object
        // Since sq is child class reference, and it can have access to parent(non-private) and its own members
        // but, we are creating instance of parent even before creating a child object which violates

        Rectangle rect2 = new Square(10);
        // this is allowed bcz when Square object is created it also calls parent class constructor.
        System.out.println("side: "+rect2.length+" side: "+rect2.breadth);

        //  System.out.println(rect2.side); // rect2 cannot access the side member of Square class bcz rect2 variable is
        //  reference of type Rectangle and Rectangle class does not have 'side' member variable in it.

        /*
        it's "TYPE OF REFERENCE" and "NOT TYPE OF OBJECT" that determines what member can be accessed. -> for java variable not applicable for methods
        - java variables are resolved at compile times
        */

        BigSquare bigSquare = new BigSquare();
        System.out.println(bigSquare.name);

        Rectangle rect3 = bigSquare; // at runtime, we have changed the type of reference of bigSquare variable
        // so, now rect3.name will refer to name variable in Rectangle class.
        System.out.println(rect3.name);

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
