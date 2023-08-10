package b_static_example;


public class InnerClass {
    private int number;
    class InnerA {
        int value;
        InnerA(int value, int newNumber) {
            number = newNumber;
            this.value = value;
        }
    }

    // NOTE: OuterClass (InnerClass) cannot be static, only nested class can be static (InnerB)

    static class InnerB {
        int value;

        InnerB(int value) {
            this.value = value;
//            number = value; // not allowed since Inner B is static class and number is member of non-static class
        }

    }

    public InnerClass(int a) {
        this.number = a;
    }
    public int getDetail() {
        return this.number;
    }

    public static void main(String[] args) {
//        InnerA inner = new InnerA(10, 10); // Inner class is non-static i,e it itself depends on instances of InnerClass,

        InnerB innerB = new InnerB(120); // since InnerB is static it does not depend on any instance of any Class
        System.out.println(innerB.value);

        InnerClass c = new InnerClass(12);
        InnerClass d = new InnerClass(21);

        System.out.println(c.getDetail());
        System.out.println(d.getDetail());

        
        InnerA a = c.new InnerA(100, 91); // 'a' is instance of InnerA Class which is property inside instance of class InnerClass (here c)
        InnerA b = d.new InnerA(111, 93); // we are able to change the outer class property from inner class since Inner instance is created from InnerClass

        System.out.println(c.getDetail());
        System.out.println(d.getDetail());
        System.out.println(a.value);
        System.out.println(b.value);
    }

}
// NOTE: whatever we mention as static is actually independent of instance of the class inside which it has mentioned.
// Ex. static class InnerB is independent of objects of class InnerClass, b ut also they have independent identity