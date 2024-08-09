package d_referencing_single_multilevel_hierarchical_in_inheritance;

public class Rectangle {
    String name = "Rectangle";
    int length;
    int breadth;

    // primary constructor -> responsible to create instance of class
    public Rectangle(int length, int breadth) {
        System.out.println("Rectangle primary constructor!");
        this.length = length;
        this.breadth = breadth;
    }

    // default constructor -> calls primary constructor with default values
    public Rectangle() {
        System.out.println("Rectangle default constructor!");
        new Rectangle( 0, 0);
    }

    public void getDetail() {
        System.out.println("Rectangle: getDetail()");
        System.out.println("length: "+this.length+"breadth: "+this.breadth);
    }
}
