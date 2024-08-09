package c_singleton.vi_billpughsmethod;


/* NOTE:
BILL PUGH SINGLETON METHOD:

This method uses a static inner helper class to hold the Singleton instance. The inner class is not
loaded until the getInstance() method is called, ensuring lazy initialization without synchronization overhead.

Static inner classes are loaded only when they are referenced, unlike static methods and members
which are loaded when the outer class is loaded.
 */
public class Singleton {

    private Singleton() {}
    private int x;

    private static class SingletonInstance  {
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInstance.instance;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
