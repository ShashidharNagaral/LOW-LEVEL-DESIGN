package scratchbook;

import java.util.HashMap;

public class PageVisitCounter {

    private static volatile PageVisitCounter pageVisitCounter;

    private HashMap<String, Integer> pageCount;

    private PageVisitCounter() {
        this.pageCount = new HashMap<>();
    }

    public static PageVisitCounter getInstance() {

        if(pageVisitCounter == null) {
            synchronized (PageVisitCounter.class) {
                if (pageVisitCounter == null) {
                    pageVisitCounter = new PageVisitCounter();
                }
            }
        }
        return pageVisitCounter;
    }

    public void onPageVisit(String page) {
        if(pageCount.containsKey(page)) {
            pageCount.put(page, pageCount.get(page)+1); // update the count
        } else {
            pageCount.put(page, 1); // first time
        }
    }

    public long getPageVisits(String page) {
        if(pageCount.containsKey(page)) {
            return pageCount.get(page);
        }
        return 0;
    }
}
