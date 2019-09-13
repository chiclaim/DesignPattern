package adapter;

public class Adapter2 implements Target {

    private Adaptee adaptee;

    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void process1() {
        adaptee.process1();
    }

    @Override
    public void process2() {
        System.out.println("处理逻辑2");
    }
}
