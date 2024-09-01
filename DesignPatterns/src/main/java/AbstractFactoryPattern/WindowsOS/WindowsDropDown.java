package AbstractFactoryPattern.WindowsOS;

import AbstractFactoryPattern.DropDown;

public class WindowsDropDown implements DropDown {
    @Override
    public void render() {
        System.out.println("renders windows dropdown");
    }
}
