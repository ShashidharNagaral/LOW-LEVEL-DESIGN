package c_singleton.doublechecklock;

/*
DOUBLE-CHECKED LOCKING:
Despite this class being thread-safe, we can see that there's a clear performance drawback: each time we want to get the
instance of our singleton, we need to acquire a potentially unnecessary lock.

To fix that, we could instead start by verifying if we need to create the object in the first place and only in that
case we would acquire the lock.

since it requires the volatile keyword to work properly, it's not compatible with Java 1.4 and lower versions
 */



public class Singleton {
    // we are using volatile type for instance so that we fetch the value directly from the primary memory and not from
    // the cache memory
    private static volatile Singleton instance;

    private Singleton() {}

    private int x;

    public static Singleton getInstance() {
        if(instance == null) {
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
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
