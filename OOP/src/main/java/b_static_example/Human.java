package b_static_example;

public class Human {

    // a non-static property is always dependent on some instance of an object, whereas static property doesn't depend on object
    // inside which it is defined
    // since non-static are associated to objects they are stored in heap
    // whereas static properties are stored in permgen section -> a part of heap memory for static content (reflection data)
    int age;
    String name;

    // population variable keeps track of number of human objects
    // int population; // we can't declare it as non-static or else every object will have their own population property which will
    // no longer increment w.r.t the other object.

    static int population;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        ++Human.population;
    }
}
