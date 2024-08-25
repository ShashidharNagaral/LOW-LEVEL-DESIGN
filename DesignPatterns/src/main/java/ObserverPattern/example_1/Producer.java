package ObserverPattern.example_1;

import java.util.HashSet;
import java.util.Set;

public class Producer {
    private Set<ISubscriber> subscriberSet;

    public Producer() {
        subscriberSet = new HashSet<>();
    }

    public void addSubscriber(ISubscriber s) {
        subscriberSet.add(s);
    }

    public void removeSubscriber(ISubscriber s) {
        subscriberSet.remove(s);
    }

    public void updateAll(String message) {
        for (ISubscriber o: subscriberSet ) {
            o.update(message+" -> "+o.getName());
        }
    }

    public int getSubscriberCount() {
        return subscriberSet.size();
    }
}
