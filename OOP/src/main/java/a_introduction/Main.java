package a_introduction;

import h_access_control.Child;

import java.util.ArrayList;

public class Main {

    static char ch; // default value to char variable is null value
    public static void main(String[] args) {


//        char ch; // default values are only assigned to class member variables and not local variable
        System.out.println(ch);

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

        // null vs '\0'
        // \0 represents null character (ascii value 0)
        // null represents absence of value of lack of reference to an object


        Integer ref = 100;
        ref = 10;
        // You are not directly modifying the value inside the existing Integer object with a value of 100.
        // Instead, you are creating a new Integer object with the value 10 and then updating the
        // reference ref to point to the new Integer object. The original Integer object with the value 100
        // becomes eligible for garbage collection if there are no other references to it.

        int x = 0;
        System.out.println(timeForPrimitive(x));
        Integer refc = 0;
        System.out.println(timeForNonPrimitive(refc));


        // String pool
        String obj = "literal"; // obj will point to "literal" in string pool
        String obj1 = obj; // obj1 will also point to same "literal" in string pool
        obj1 = obj1.concat("base"); // now we concatinate "base" to "literal" this will create "base" and "literalbase"
        // so now overall we have 3 strings in string pool -> "literal", "base" and "literalbase"

        // obj1 will point to new string "literalbase"
        System.out.println(obj); // NOTE: obj will also point to the literalbase
    }

    static double timeForPrimitive(int a) {
        double start = System.currentTimeMillis();
        for(int i=0; i<1000000; i++) {
            a++;
        }
        double end = System.currentTimeMillis();
        return end-start;
    }

    static double timeForNonPrimitive(Integer a) {
        double start = System.currentTimeMillis();
        for(int i=0; i<1000000; i++) {
            a++;
        }
        double end = System.currentTimeMillis();
        return end-start;
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
