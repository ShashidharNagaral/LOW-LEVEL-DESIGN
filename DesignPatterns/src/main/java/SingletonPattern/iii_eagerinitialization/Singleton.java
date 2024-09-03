package SingletonPattern.iii_eagerinitialization;

/* NOTE:
EAGER INITIALIZATION:

In eager initialization, the instance of the singleton class is created at the time of class loading. The drawback
of eager initialization is that the instance of the singleton is created even if the client application might not be
using it.

If your singleton class is not using a lot of resources, this approach can be used.

However, in most scenarios, singleton classes are created for resources such as file systems, database connections, etc.
We should avoid instantiation unless the client calls the getInstance method.

Additionally, this method does not provide any options for exception handling.
*/

public class Singleton {

    // -> we can't write exception handling here
    private static final Singleton instance = new Singleton();
    private int x;
    private Singleton() {}

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
