package FactoryPattern;

public class FactoryA extends ProductFactory{
    @Override
    public Product createProduct(String productName) {
        if(productName.equalsIgnoreCase("pencil")) {
            return new PencilA();
        } else if (productName.equalsIgnoreCase("Book")) {
            return new RoughBook();
        }
        return null;
    }
}
