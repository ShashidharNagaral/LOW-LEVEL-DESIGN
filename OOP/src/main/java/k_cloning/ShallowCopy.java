package k_cloning;

import java.util.Arrays;

public class ShallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        ShallowProduct pen = new ShallowProduct("pen", 10);
        ShallowProduct book = (ShallowProduct) pen.clone();

        System.out.println(pen.name); // -> pen
        System.out.println(book.name); // -> pen

        // changing the name of pen object
        book.name = "book";

        // name attribute changed in book object, but it has not reflected in pen object
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
