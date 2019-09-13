package observer;

public class Client {
    public static void main(String[]args){
        ConcreteSubject subject = new ConcreteSubject();
        subject.attach(new ConcreteObserver());
        subject.doSomething();
    }
}