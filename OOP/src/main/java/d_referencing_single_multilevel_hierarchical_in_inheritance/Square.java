package d_referencing_single_multilevel_hierarchical_in_inheritance;

public class Square extends Rectangle {
    String name = "Square";
    int side;

    // by default every child constructor calls default super() method i.e default constructor of its next parent class

    // super call will be always first since the child class need the parent class to get instantiated first
    public Square(int side) {
        super(side, side);
        this.side = side;
        System.out.println("Square primary constructor!");
    }

    public Square() {
        new Square(0);
        System.out.println("Square default constructor!");
    }


    @Override
    public void getDetail() {
        System.out.println("Square: getDetail()");
        System.out.println("Side: "+ super.length);
    }
}
