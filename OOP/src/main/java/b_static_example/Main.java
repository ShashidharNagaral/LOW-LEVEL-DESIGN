package b_static_example;

public class Main {
    public static void main(String[] args) {
        new Human(23, "shashidhar");
        new Human(22,"Ashutosh");
        new Human(22,"Amey");

        // since population is associated with class, we are calling it through class name itself
        System.out.println(Human.population);
        Human obj = new Human(10, "shubham");
        System.out.println(obj.population); // we are still allowed to call static methods or member by objects
        Main main = new Main();
        Main.sayHello(main);
        main.greetSomebody();
    }

    // since sayHello() is a static method, it does not depend on any instance of any class.

    static void sayHello(Main main) {
        // greet(); // we cannot call greet() method which is non-static inside static method sayHello()
        // NOTE: calling non-static inside static is never allowed, why?
        // -> since greet() is non-static it depends on some instance of class, but sayHello itself is static method,
        // i,e sayHello cannot provide any instance to greet().

        // only way to call is using instance as a parameter to a static method
        main.greet();
        Main main1 = new Main();
        main1.greet();
    }

    void greetSomebody() {
        greet(); // this will not show error bcz greet() method is inside non-static method (greetSomebody) and
        // greetSomebody is non-static that means greetSomebody will get called:
        // 1. inside some static method(here main), where an instance of Main class is created.
        // 2. inside some non-static method (here, greetSomebody), which again depends on other method, or which get called by some instance from
        // main method
    }

    void greet() {
        System.out.println("Congratulations");
    }

}
