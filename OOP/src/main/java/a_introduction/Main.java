package a_introduction;

import h_access_control.Child;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(10, "shashi", 85.8f);
        // println calls the String.valueOf method where after it calls the toString method of the obj(here in our case student1)
        // since we have overridden the toString method, it will call from Student class and not from Object Class
        System.out.println(student1);

        final Student defaultStudent = new Student();
        // when primitive variable is final we cannot change its member values
        // when non-primitive variable is final we can change its values but not its reference
//        defaultStudent = student1 // this is not allowed
        defaultStudent.updateMarks(98.0f); // but we can update the marks of final objects => called as non-transitivity property
        System.out.println(defaultStudent);
        // when should we use final with non-primitive variables?

        // below is from access control topic please refer package VIII_access_control
        Child child = new Child(19, "newName");
        child.getNum(); // public member accessible anywhere
//      child.name; protected member not accessible in non child class
        // final primitive

        // final int a; // this is not allowed bcz, final primitives are like constants which cannot be modified
        // i.e final without any value doesn't make any sense

        // Wrapper Class
        int a = 10; // a is primitive data type
        Integer num = 10; // here, num is an object of type Integer
        // Integer num = new Integer(10);  this is not used from java 9 version because AUTOBOXING is done
        int b = 10;
        int c = 20;
        swap(b, c); // primitives are passed as values and not reference
        System.out.println(b+" "+c);
        Integer A = 10;
        Integer B = 20;
        swapRef(A, B); // Where was Integer is object and objects are passed as reference
        // BUT STILL WE CAN'T SWAP, bcz Integer is an FINAL class
        System.out.println(A+" "+B);


    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    static void swapRef(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}
