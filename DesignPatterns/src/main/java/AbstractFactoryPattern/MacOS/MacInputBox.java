package AbstractFactoryPattern.MacOS;

import AbstractFactoryPattern.InputBox;

public class MacInputBox implements InputBox {
    @Override
    public void render() {
        System.out.println("renders mac input box");
    }
}
