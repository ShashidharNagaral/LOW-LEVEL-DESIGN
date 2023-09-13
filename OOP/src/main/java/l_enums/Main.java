package l_enums;

public class Main {
    public static void main(String[] args) {
        Color color = Color.RED;
        Color color1 = Color.RED;
        System.out.println(color);
        System.out.println(color1);
        System.out.println(color.getValue());

        for(Color c: Color.values()) {
            System.out.println(c.greet());
        }
    }

}
