package factory.simple_factory;

// 具体产品2
public class Dog implements Animal {
    @Override
    public void sleep() {
        System.out.println("小狗正在睡觉...");
    }

    @Override
    public void eat() {
        System.out.println("小狗正在吃...");

    }

    @Override
    public void run() {
        System.out.println("小狗正在跑...");
    }
}