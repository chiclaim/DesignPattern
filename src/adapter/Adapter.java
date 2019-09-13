package adapter;

public class Adapter extends Adaptee implements Target {
    @Override
    public void process2() {
        System.out.println("处理逻辑2");
    }
}
