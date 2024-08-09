package c_singleton.iv_staticblockinitialization;

/* NOTE:
STATIC BLOCK INITIALIZATION:
This implementation is similar to eager initialization, except that instance of the class
is created in the static block that provides the option for exception handling.

Both eager initialization and static block initialization create the instance even before it’s being used and
this is not a good practice.
 */
public class Singleton {

    private static Singleton instance;
    private int x;
    private Singleton() {}

    // -> code inside the static block is executed only once, only at the first time when the class is loaded into memory.
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
