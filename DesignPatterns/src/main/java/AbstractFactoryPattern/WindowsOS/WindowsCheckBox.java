package AbstractFactoryPattern.WindowsOS;

import AbstractFactoryPattern.Checkbox;

public class WindowsCheckBox implements Checkbox {
    @Override
    public void render() {
        System.out.println("renders windows checkbox");
    }
}
