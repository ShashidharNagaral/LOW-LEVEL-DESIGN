package SingletonPattern.i_lazyinitialization;


public class Main {
    public static void main(String[] args) {
        // TODO: with multiple threads and create more than one instance of Singleton Class
        Singleton instance1 = Singleton.getInstance();
        instance1.setX(100);
        System.out.println(instance1.getX());
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance2.getX());
    }
}
