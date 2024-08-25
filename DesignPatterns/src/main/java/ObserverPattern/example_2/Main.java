package ObserverPattern.example_2;

public class Main {
    public static void main(String[] args) {
        SubjectA<String> subjectA = new SubjectA<>();
        SubjectB<Integer> subjectB = new SubjectB<>();

        Observer<Integer> integerObserver = new ObserverA<>();
        Observer<String> stringObserver = new ObserverB<>();

        subjectB.addSubject(integerObserver);
        subjectA.addSubject(stringObserver);

        subjectA.notifyAll("{data: '123'}");
        subjectB.notifyAll(123);
    }
}
