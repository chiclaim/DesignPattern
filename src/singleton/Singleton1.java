package singleton;

public class Singleton1 {

    private static Singleton1 instance = new Singleton1();

    // 禁止外部实例化
    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return instance;
    }

}