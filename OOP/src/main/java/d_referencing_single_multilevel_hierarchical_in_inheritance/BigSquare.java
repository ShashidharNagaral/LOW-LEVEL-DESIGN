package d_referencing_single_multilevel_hierarchical_in_inheritance;

public class BigSquare extends Square {
    String name = "BigSquare";
    public BigSquare() {
    } // by default, it will call default constructor of its parent class (here Square) super()

    @Override
    public void getDetail() {
        System.out.println("BigSquare: getDetail()");
    }
}
