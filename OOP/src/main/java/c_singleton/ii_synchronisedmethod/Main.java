package c_singleton.ii_synchronisedmethod;


public class Main {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        instance1.setX(100);
        System.out.println(instance1.getX());
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance2.getX());
    }
}
