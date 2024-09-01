package AbstractFactoryPattern.MacOS;

import AbstractFactoryPattern.Checkbox;

public class MacCheckBox implements Checkbox {
    @Override
    public void render() {
        System.out.println("renders mac checkbox");
    }
}
