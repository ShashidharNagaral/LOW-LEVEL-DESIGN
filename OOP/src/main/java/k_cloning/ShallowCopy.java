package k_cloning;

import java.util.Arrays;

public class ShallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Product pen = new Product("pen", 10);
        Product book = (Product) pen.clone();

        System.out.println(pen.name);
        System.out.println(book.name);

        // changing the name of pen object
        book.name = "book";

        // name attribute changed in book object and it has not reflected in pen object
        System.out.println(pen.name);
        System.out.println(book.name);

        System.out.println(Arrays.toString(pen.arr));
        System.out.println(Arrays.toString(book.arr));
        pen.arr[0] = 20;

        // BUT, in non-primitive data type like arr the changes in one object reflected in copied (book) object also
        // this is called SHALLOW COPY
        System.out.println(Arrays.toString(pen.arr));
        System.out.println(Arrays.toString(book.arr));
    }
}
