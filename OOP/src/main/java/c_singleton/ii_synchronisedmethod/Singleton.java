package c_singleton.ii_synchronisedmethod;


/* NOTE:
SYNCHRONIZED METHOD:
A simple way to create a thread-safe singleton class is to make the global access method synchronised so that
only one thread can execute this method at a time. (locking mechanism)

The preceding implementation works fine and provides thread-safety, but it reduces the performance because of the cost
associated with the synchronised method, although we need it only for the first few threads that might create
separate instances.
*/

public class Singleton {

    private static Singleton instance;
    private int x;
    private Singleton() {}

    //
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

/* NOTE:
Why does performance gets affected due to synchronized block?

Thread Contention:
- When we use synchronized block of code, only one thread can execute the code at a time, while other
threads has to wait. This causes context switching.
- Context switching is a costly operation in terms of CPU time,
as it involves saving and restoring registers, program counters, and memory maps.

Acquiring and Releasing Locks:
- Overhead of lock managment for JVM

Reduced Concurrency:
- Synchronization effectively reduces the level of concurrency in an application. While a synchronized
block is being executed by one thread, other threads trying to access it are blocked.

Deadlock:
-improper use of synchronization can lead to deadlocks
*/