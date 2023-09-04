package c_singleton.synchronisedmethod;


/*
SYNCHRONISED METHOD:
A simple way to create a thread-safe singleton class is to make the global access method synchronized so that
only one thread can execute this method at a time.

The preceding implementation works fine and provides thread-safety, but it reduces the performance because of the cost
associated with the synchronised method, although we need it only for the first few threads that might create
separate instances.

 */
public class Singleton {

    private static Singleton instance;


    private int x;

    private Singleton() {}

    synchronized public static Singleton getInstance() {
        if(instance == null)
            instance = new Singleton();
        return instance;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
