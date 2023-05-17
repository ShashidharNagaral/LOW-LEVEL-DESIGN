package d_referencing_single_multilevel_hierarchical_in_inheritance;

public class SmallSquare extends Square{
    String name = "Small square";
    SmallSquare() {
        super();
    }

    @Override
    public void getDetail() {
        System.out.println("Small square: getDetail()");
    }
}
