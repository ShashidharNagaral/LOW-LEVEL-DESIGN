package FactoryMethodPattern;

public class FactoryB extends ProductFactory{
    @Override
    public Product createProduct(String productName) {
        if(productName.equalsIgnoreCase("pencil")) {
            return new PencilB();
        } else if (productName.equalsIgnoreCase("Book")) {
            return new Book();
        }
        return null;
    }
}
