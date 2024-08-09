package e_inheritance_types;

public class Circle implements Color, Shape{

    @Override
    public void create() {
        Color.super.create();
    }
}
