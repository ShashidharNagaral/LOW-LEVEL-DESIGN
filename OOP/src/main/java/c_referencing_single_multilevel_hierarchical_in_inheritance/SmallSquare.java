package c_referencing_single_multilevel_hierarchical_in_inheritance;

public class SmallSquare extends Square{
    String name = "Small square";
    SmallSquare() {
        super();
        System.out.println("Default SmallSquare Constructor!");
    }

    @Override
    public void getDetail() {
        System.out.println("Small square: getDetail()");
    }
}
