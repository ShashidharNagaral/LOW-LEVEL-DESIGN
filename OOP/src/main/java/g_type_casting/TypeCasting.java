package g_type_casting;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int num = input.nextFloat(); //   this won't work bcz float is of large size than int
//        int num = input.next(); //    this won't work bcz string are not compatible to int, float
        float num = input.nextInt(); // this work's fine, but it just accepts int value and for float it will error
        System.out.println(num);

        // Type Casting types

        // 1. Widening Type Casting (implicit type casting) : this happens in Lower data type to Higher data type
        int a = 10;
        double b = a; // automatic type casting take place since
        System.out.println(b);

        // 1. Narrowing Type Casting (explicit type casting) : this happens in Higher data type to Lower data type
        b = 12.343;
//        a = b;    // this will show error
        a = (int) b; // this is called explicitly type casting => 12
        // since, we are converting from higher to lower data type there is the loss of data
        System.out.println(a);


        // automatic type promotion in expressions
        a = 256;
        byte c = (byte) a; // since max value of 1 byte is 256, the remainder of 257 % 256 is stored in c
        System.out.println(c);

        byte num1 = 50;
        byte num2 = 40;
        byte num3 = 100;
        int ans = (num1*num2)/num3; // here 50 * 40 == 2000 both num1 and num2 are byte(max capacity 256)
        // then how 2000 is stored?
        // java promotes the type num1, num2 to int, while evaluating the expression
        System.out.println(ans);

        // rules while promoting
        // 1. Java automatically promotes each byte, short, or char operand to int when evaluating an expression
        // 2. If one operand is long, float or double the whole expression is promoted to long, float or double resp.
    }
}
