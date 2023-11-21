package ObserverPattern;

import java.util.HashSet;
import java.util.Set;

public class AnotherCricketScore implements Subject{
    Set<OTT> list;
    int run;

    public AnotherCricketScore() {
        list = new HashSet<>();
    }

    @Override
    public void udpateAll() {
        for(OTT o: list) {
            o.update();
        }
    }

    @Override
    public void register(OTT o) {
        list.add(o);
    }

    @Override
    public void remove(OTT o) {
        list.remove(o);
    }

    public void setScore(int run) {
        this.run = run;
        udpateAll();
    }
}
