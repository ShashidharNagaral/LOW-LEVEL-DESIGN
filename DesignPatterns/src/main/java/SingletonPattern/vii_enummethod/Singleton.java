package SingletonPattern.vii_enummethod;

/* NOTE:
ENUM METHOD:

This method leverages the Java enum type to implement a Singleton. The enum type provides implicit support
for thread safety and serialization. The instance is created when the enum is first accessed, ensuring
lazy initialization with no synchronization overhead.
 */

enum Singleton {

    INSTANCE; // -> public static Singleton INSTANCE = new Singleton();

    static {
        System.out.println("We can write some exception handling before the enum is created");
    }

    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
