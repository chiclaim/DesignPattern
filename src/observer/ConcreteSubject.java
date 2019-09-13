package observer;

import java.util.Vector;

public class ConcreteSubject implements Subject {

    private Vector<Observer> list = new Vector<>();
    
    @Override
    public void attach(Observer observer) {
        list.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : list) {
            o.update();
        }
    }

    // 模拟业务逻辑
    public void doSomething(){
        // 通知观察者
        notifyObservers();
    }
}