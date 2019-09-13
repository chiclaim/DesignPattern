package factory.simple_factory;

// 工厂类，动物管理员
public class ZooKeeper {
    public static Animal create(String type) {
        switch (type) {
            case "cat":
                return new Cat();
            case "dog":
                return new Dog();
            default:
                throw new IllegalArgumentException("不支持的类型:" + type);
        }
    }
}