package AbstractFactoryPattern.LinuxOS;

import AbstractFactoryPattern.Button;

public class LinuxButton implements Button {
    @Override
    public void render() {
        System.out.println("renders linux button");
    }
}
