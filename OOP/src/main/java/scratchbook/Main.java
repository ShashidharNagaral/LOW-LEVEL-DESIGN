package scratchbook;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        PageVisitCounter pageVisitCounter = PageVisitCounter.getInstance();

        pageVisitCounter.onPageVisit("home");

        PageVisitCounter pageVisitCounter1 = PageVisitCounter.getInstance();
        pageVisitCounter1.onPageVisit("home");
        System.out.println(pageVisitCounter.getPageVisits("home"));
    }
}
