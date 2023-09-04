package c_singleton.billpughsmethod;

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
