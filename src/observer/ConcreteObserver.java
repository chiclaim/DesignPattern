package observer;

public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("收到通知，处理相关逻辑...");
    }
}