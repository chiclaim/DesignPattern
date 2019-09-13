package observer.jdk;

import java.util.Observable;

// 具体主题
public class ConcreteSubject2 extends Observable {

    // 模拟业务逻辑
    public void doSomething(){
        // changed = true
        setChanged();
        // 通知观察者
        notifyObservers();
    }

}