package a_introduction;

import h_access_control.Child;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(10, "shashi", 85.8f);
        // println calls the String.valueOf method where after it calls the toString method of the obj(here in our case student1)
        // since we have overridden the toString method, it will call and not from Object Class
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
//        child.name; protected member not accessible in non child class
    }
}
