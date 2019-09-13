package observer.jdk;

public class Client2 {

    public static void main(String[] args) {
        ConcreteSubject2 subject = new ConcreteSubject2();
        subject.addObserver(new ConcreteObserver2());
        subject.doSomething();
    }
}