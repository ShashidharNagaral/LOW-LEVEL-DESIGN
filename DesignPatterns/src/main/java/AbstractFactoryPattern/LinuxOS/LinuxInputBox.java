package AbstractFactoryPattern.LinuxOS;

import AbstractFactoryPattern.InputBox;

public class LinuxInputBox implements InputBox {
    @Override
    public void render() {
        System.out.println("renders linux input box");
    }
}
