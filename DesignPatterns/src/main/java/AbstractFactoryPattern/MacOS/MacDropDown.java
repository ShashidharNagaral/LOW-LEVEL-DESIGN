package AbstractFactoryPattern.MacOS;

import AbstractFactoryPattern.DropDown;

public class MacDropDown implements DropDown {
    @Override
    public void render() {
        System.out.println("renders mac dropdown");
    }
}
