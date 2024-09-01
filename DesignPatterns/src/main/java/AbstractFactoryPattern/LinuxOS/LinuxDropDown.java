package AbstractFactoryPattern.LinuxOS;

import AbstractFactoryPattern.DropDown;

public class LinuxDropDown implements DropDown {
    @Override
    public void render() {
        System.out.println("renders linux dropdown");
    }
}
