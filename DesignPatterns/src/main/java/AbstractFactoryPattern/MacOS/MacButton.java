package AbstractFactoryPattern.MacOS;

import AbstractFactoryPattern.Button;

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("renders mac button");
    }
}
