package k_cloning;

import java.util.Arrays;



public class DeepCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProduct pen = new DeepProduct("pen", 10);
        DeepProduct book = (DeepProduct) pen.clone();

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

        // Even after changing the value in arr member of pen object, there is no change in the arr member of book object
        // this is DEEP COPY
        System.out.println(Arrays.toString(pen.arr));
        System.out.println(Arrays.toString(book.arr));
    }
}
