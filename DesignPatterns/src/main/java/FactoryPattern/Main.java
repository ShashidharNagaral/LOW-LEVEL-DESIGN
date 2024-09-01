package FactoryPattern;

import FactoryPattern.FactoryA;
import FactoryPattern.FactoryB;
import FactoryPattern.ProductFactory;

public class Main {
    public static void main(String[] args) {
        ProductFactory factoryA = new FactoryA();
        ProductFactory factoryB = new FactoryB();

        factoryA.orderProduct("pencil");
        factoryA.orderProduct("Book");
        factoryB.orderProduct("pencil");
        factoryB.orderProduct("book");
    }
}
