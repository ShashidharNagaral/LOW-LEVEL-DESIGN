package b_static_example;

public class StaticBlock {
    static int a = 10;
    static int b;

    /* NOTE: Static block is a block provided by java compiler which get called "before" main method.
     also its get called only once first time when the class is loaded in the memory. */

    static {
        b = a*10;
        System.out.println("this is static block");
    }

    public static void main(String[] args) {
        System.out.println("this is main method");
        StaticBlock block1 = new StaticBlock();
        System.out.println("a: "+StaticBlock.a +"\nb: "+StaticBlock.b);
        StaticBlock.b += 5;

        // -> even though we create another instance the static block did not get called second time
        StaticBlock block2 = new StaticBlock();
        System.out.println("a: "+StaticBlock.a +"\nb: "+StaticBlock.b);
    }
}
