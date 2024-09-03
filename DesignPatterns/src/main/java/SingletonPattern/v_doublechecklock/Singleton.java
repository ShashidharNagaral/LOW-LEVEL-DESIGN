package SingletonPattern.v_doublechecklock;

/* NOTE:
DOUBLE-CHECKED LOCKING:

Despite this class being thread-safe, there is a clear performance drawback: each time we want to get
the instance of our singleton, we need to acquire a potentially unnecessary lock.

To fix this, we could instead start by verifying if we need to create the object in the first place
and only in that case would we acquire the lock.

The volatile keyword ensures that the instance variable is read from and written to main memory,
not a thread's local cache. It also prevents instruction reordering, ensuring the instance is
fully initialized before any thread accesses it.

Since it requires the volatile keyword to work properly, it's not compatible with Java 1.4 and
lower versions.
 */



public class Singleton {

    // -> we are using volatile type for instance so that we fetch the value directly from the primary memory and
    //  not from the cache memory
    private static volatile Singleton instance;
    private Singleton() {}
    private int x;

    public static Singleton getInstance() {
        // -> before acquiring check if instance is already created, this reduces potential unnecessary lock
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
