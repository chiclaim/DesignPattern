package factory.simple_factory;

// 测试类
public class Client {
    public static void main(String[] args) {
        Animal dog = ZooKeeper.create("dog");
        Animal cat = ZooKeeper.create("cat");
    }
}