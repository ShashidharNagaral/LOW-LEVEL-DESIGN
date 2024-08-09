package c_singleton.i_lazyinitialization;


/* NOTE:
LAZY INITIALIZATION:
This below implementation works fine in the case of the single-threaded environment, but when it comes
to multithreaded systems, it can cause issues if multiple threads are inside the if condition at the same time.
It will destroy the singleton pattern and both threads will get different instances of the singleton class.
 */

public class Singleton {
    private static Singleton instance;
    private int x;
    private Singleton(){}

    // instance is created first time when getInstance is called, and on later calls it will just return the same instance
    public static Singleton getInstance() {
        // -> in multithreading more than one thread may enter the if condition and can create multiple instances of Singleton class.
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
