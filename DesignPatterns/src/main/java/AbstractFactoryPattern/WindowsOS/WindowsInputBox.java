package AbstractFactoryPattern.WindowsOS;

import AbstractFactoryPattern.InputBox;

public class WindowsInputBox implements InputBox {
    @Override
    public void render() {
        System.out.println("renders windows input box");
    }
}
