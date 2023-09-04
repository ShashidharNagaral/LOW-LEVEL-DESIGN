package c_singleton.staticblockinitialization;

/*
Static block initialization implementation is similar to eager initialization, except that instance of the class
is created in the static block that provides the option for exception handling.

Both eager initialization and static block initialization create the instance even before it’s being used and
that is not the best practice to use.
 */
public class Singleton {

    private static Singleton instance;

    // private constructor

    private int x;
    private Singleton() {

    }

    // static block: code inside the static block is executed only once: the first time the class is loaded into memory.
    static {
        try {
            instance = new Singleton();
        } catch (Exception e) {
            System.out.println("Exception occurred creating instance");
        }
    }

    public static Singleton getInstance() {
        return instance;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
