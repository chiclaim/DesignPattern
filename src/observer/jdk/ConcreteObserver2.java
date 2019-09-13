package observer.jdk;

import java.util.Observable;
import java.util.Observer;

// 具体观察者
public class ConcreteObserver2 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("收到通知，处理相关逻辑...");
    }
}