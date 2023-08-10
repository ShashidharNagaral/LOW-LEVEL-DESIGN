package scratchbook;

public class OuterClass {

    private int value;

    // constructor to the outer class
    public OuterClass(int value) {
        this.value = value;
    }

    class InnerClass {
        private int innerValue;

        public InnerClass(int innerValue) {
            this.innerValue = innerValue;
        }
    }

    // innerValue cannot be accessed outside the class

    static class InnerStatic {
        private int staticValue;

        public InnerStatic(int staticValue) {
            this.staticValue = staticValue;
        }
    }
}
