package h_access_control;

public class ObjectDemo {
    int num;

    public ObjectDemo(int num) {
        this.num = num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo) obj).num;
    }

    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(10);
        System.out.println(obj1.hashCode());

        ObjectDemo obj2 = new ObjectDemo(10);
        System.out.println(obj2.hashCode());

        System.out.println(obj1 == obj2);
        System.out.println(obj1.equals(obj2));

        String a = "shashi";
        String b = "shashi";

        // java doesn't create another string object with same value for optimisation
        System.out.println(b == a); // this is because a and b are pointing to shashi (same object) in string pool

        // so to create new objects with same values, we should explicitly create string objects
        String c = new String("shashi");
        String d = new String("shashi");
        System.out.println(c == d); // this will give false since c and d are referencing to different objects

        // to compare only values of it we should use equal method
        System.out.println(c.equals(d)); // this will give true
    }
}
