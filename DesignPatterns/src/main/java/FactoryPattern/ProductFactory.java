package FactoryPattern;

public abstract class ProductFactory {

    public void orderProduct(String productName) {
        Product product = this.createProduct(productName);
        System.out.println(product.getName() + " product ordered !");
    }
    protected abstract Product createProduct(String productName);
}
