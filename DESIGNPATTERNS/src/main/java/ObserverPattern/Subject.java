package ObserverPattern;

public interface Subject {
    void udpateAll(); // notify
    void register(OTT o);
    void remove(OTT o);
}
