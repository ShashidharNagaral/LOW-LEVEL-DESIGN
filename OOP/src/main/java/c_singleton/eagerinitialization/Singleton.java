package c_singleton.eagerinitialization;

/*
EAGER INITIALIZATION:
In eager initialization, the instance of the singleton class is created at the time of class loading.
The drawback to eager initialization is that the instance of Singleton is created even though the client application might
not be using it.

If your singleton class is not using a lot of resources, this is the approach to use.

But in most of the scenarios, singleton classes are created for resources such as File System, Database connections, etc.
We should avoid the instantiation unless the client calls the getInstance method.

Also, this method does not provide any options for exception handling.

*/

public class Singleton {

    private static final Singleton instance = new Singleton(); // we can't write exception handling here
    private int x;

    // make the constructor private
    private Singleton() {

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
