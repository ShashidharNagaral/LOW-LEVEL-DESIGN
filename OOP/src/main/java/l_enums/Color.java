package l_enums;
public enum Color {
    RED(1) {

        // abstract methods are overridden and defined
        @Override
        public String greet() {
            return "Hey, this is " + this.name() + "color";
        }
    }, ORANGE(2) {
        @Override
        public String greet() {
            return "My color is"+this.name();
        }
    }, BLUE(3) {
        @Override
        public String greet() {
            return "I'm am of sky color";
        }
    };

    // enums can have variables
    int value;

    // constructor cannot be public

    // the constructor is called for all the constants present inside
    Color(int value) {
        System.out.println("Constructor for color" + value);
        this.value = value;
    }

    // enums can have concrete method
    public int getValue() {
        return value;
    }

    // enums can also have abstract methods, but then each instance of enum class must implement this method
    public abstract String greet();

    public static void main(String[] args) {

    }

}
