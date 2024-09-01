package AbstractFactoryPattern.LinuxOS;

import AbstractFactoryPattern.Checkbox;

public class LinuxCheckBox implements Checkbox {
    @Override
    public void render() {
        System.out.println("renders linux checkbox");
    }
}
