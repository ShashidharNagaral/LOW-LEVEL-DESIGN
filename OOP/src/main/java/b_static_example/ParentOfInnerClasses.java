package b_static_example;


public class ParentOfInnerClasses {
    private int number;
    class InnerA {
        int value;
        InnerA(int value, int newNumber) {
            this.value = value;
            number = newNumber;
        }
    }

    // NOTE: Outer class (ParentOfInnerClasses) cannot be static, only nested class can be static (InnerB)

    static class InnerB {
        int value;

        InnerB(int value) {
            this.value = value;
            // -> number = value; // not allowed since Inner B is static class and number is member of non-static class
        }
    }

    public ParentOfInnerClasses(int a) {
        this.number = a;
    }
    public int getDetail() {
        return this.number;
    }

    public static void main(String[] args) {
//        InnerA inner = new InnerA(10, 10); // Inner class is non-static class i.e. it itself depends on instances of ParentOfInnerClasses,

        ParentOfInnerClasses.InnerB innerB = new ParentOfInnerClasses.InnerB(120); // since InnerB is static it does not depend on any instance of any Class
        System.out.println(innerB.value);

        ParentOfInnerClasses c = new ParentOfInnerClasses(12);
        ParentOfInnerClasses d = new ParentOfInnerClasses(21);

        System.out.println(c.getDetail());
        System.out.println(d.getDetail());


        /*
            NOTE:
            InnerA a = new c.InnerA(100, 91); // this is ALLOWED
            InnerA a = c. new InnerA(100, 91); // this is not ALLOWED

            why?
            - when we say new InnerA(100, 91) this means we are accessing the InnerA directly
            without any instance variable of ParentOfInnerClasses, but we know InnerA always need some instance of it outer class
            - so when we say c. new InnerA this means we are accessing InnerA (to create its instance) only through the
            instance of ParentOfInnerClasses
        */
        
        InnerA a = c.new InnerA(100, 91);
        // -> 'a' is instance of InnerA Class which is will be now an attribute for an instance of ParentOfInnerClasses (here c)

        InnerA b = d.new InnerA(111, 93);
        // -> we are able to change the outer class property through inner class since its instance is created from ParentOfInnerClasses

        System.out.println(c.getDetail());
        System.out.println(d.getDetail());
        System.out.println(a.value);
        System.out.println(b.value);
    }

}
// NOTE: whatever we mention as static is actually independent of instance of the class inside which it has mentioned.
// Ex. static class InnerB is independent of objects of class ParentOfInnerClasses, but also they have independent identity