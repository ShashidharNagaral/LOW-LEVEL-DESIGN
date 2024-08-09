package c_singleton.vii_enummethod;

public class Main {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        instance1.setX(100);
        System.out.println(instance1.getX());
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance2.getX());
    }
}
