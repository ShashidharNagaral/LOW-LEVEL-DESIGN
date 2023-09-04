package c_singleton.eagerinitialization;

public class Main {
    public static void main(String[] args) {
//        Singleton singleton = new Singleton(); Singleton Constructor is private
        Singleton instance1 = Singleton.getInstance();
        instance1.setX(100);
        System.out.println(instance1.getX());
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance2.getX()); // another2 will also refer to same instance in heap space
    }
}

