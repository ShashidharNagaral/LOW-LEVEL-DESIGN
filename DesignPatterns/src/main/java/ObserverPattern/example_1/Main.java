package ObserverPattern.example_1;

public class Main {
    public static void main(String[] args) {
        Producer p1 = new Producer();

        Subscriber s1 = new ConcreteSubscriber("ConcreteSubscriber:s1", p1);
        Notification s2 = new Notification("Notification:s2", p1);

        p1.addSubscriber(s1); // this will not make any difference, since s1 is already got added in p1

        System.out.println("Subscriber Count "+p1.getSubscriberCount()); // count = 2

        p1.updateAll("this message is sent to all the subscriber of p1");

        Subscriber s3 = new ConcreteSubscriber("ConcreteSubscriber:s3"); // creating a subscriber instance without adding to any producer
        p1.addSubscriber(s3); // adding subscriber to p1

        System.out.println("Subscriber Count "+p1.getSubscriberCount()); // count = 3

        p1.updateAll("new message");
    }
}
