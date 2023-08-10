package k_cloning;

public class DeepProduct implements Cloneable{
    String name;
    int price;
    int arr[] = new int[]{1, 2, 3, 4};

    public DeepProduct(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // copy constructor
//    public Product(Product other) {
//        this.name = other.name;
//        this.price = other.price;
//    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // below is deep copy steps

        // 1. first we copy the object in another reference variable

        DeepProduct deepProduct = (DeepProduct) super.clone();

        deepProduct.arr = new int[this.arr.length]; // recreating new array for copied object

        // copying all the elements from old object arr
        for(int i=0; i<this.arr.length; i++) {
            deepProduct.arr[i] = this.arr[i];
        }

        return deepProduct;
    }
}
