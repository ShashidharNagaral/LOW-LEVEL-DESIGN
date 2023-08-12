package scratchbook;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class WrapperMain {
    Main m;

    public WrapperMain(Main m) {
        this.m = m;
    }
}
 public class Main {


    int x;

    int y;

    int z;


    public Main(int x) {
        this.x = x;
    }

    static void swap(WrapperMain a, WrapperMain b) {
        Main temp = a.m;
        a.m= b.m;
        b.m = temp;
    }

    @Override
    public String toString() {
        return "Main{" +
                "x=" + x +
                '}';
    }

    public static void main(String[] args) {
        Main a = new Main(10);
        Main b = new Main(20);

        LinkedList<Integer> list = new LinkedList<Integer>();

        WrapperMain wa = new WrapperMain(a);
        WrapperMain wb = new WrapperMain(b);
        swap(wa, wb);

        System.out.println(wa.m);
        System.out.println(wb.m);
    }
}
