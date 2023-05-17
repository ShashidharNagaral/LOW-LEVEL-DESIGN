package e_inheritance_types;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.create();
    }
}

// we cannot implement multiple inheritance i,e inheriting from both Shape, Color, because if they both had same member
// then ambiguity arises,
// so we can implement the same behaviour using interfaces i,e implementing multiple interfaces even though some of them
// had same method or variable, the actual method definition will be in class (here create method in Circle class)

/*
 similarly, hybrid inheritance is not implementable using classes
                      ___A___
                     |       |
                     B       C
                     |       |
                      ___D___
* */

