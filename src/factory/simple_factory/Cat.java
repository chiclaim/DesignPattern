package factory.simple_factory;

public class Cat implements Animal {
    @Override
    public void sleep() {
        System.out.println("小猫正在睡觉...");
    }

    @Override
    public void eat() {
        System.out.println("小猫正在吃...");

    }

    @Override
    public void run() {
        System.out.println("小猫正在跑...");
    }
}