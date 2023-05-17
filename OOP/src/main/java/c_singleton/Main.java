package c_singleton;

public class Main {
    public static void main(String[] args) {
        Singleton A = Singleton.getInstance();
        A.setValue(10);
        System.out.println("A: "+A.getValue());

        Singleton B = Singleton.getInstance();
        System.out.println("B: "+B.getValue());

        B.setValue(200);
        System.out.println("B: "+B.getValue());
        System.out.println("A: "+A.getValue());

        System.out.println("A: "+A+"\nB: "+B);

        ESingleton s1 = ESingleton.INSTANCE;
        s1.setValue(10);

        ESingleton s2 = ESingleton.getInstance();
        s2.setValue(20);

        System.out.println(s1.getValue());
        System.out.println(s2.getValue());
    }
}
