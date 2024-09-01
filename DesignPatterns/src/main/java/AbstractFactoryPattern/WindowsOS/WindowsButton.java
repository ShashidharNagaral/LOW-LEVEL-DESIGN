package AbstractFactoryPattern.WindowsOS;

import AbstractFactoryPattern.Button;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("renders windows button");
    }
}
