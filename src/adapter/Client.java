package adapter;

public class Client {

    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        adapter.process1();
        adapter.process2();


        Adapter2 adapter2 = new Adapter2(new Adaptee());
        adapter2.process1();
        adapter2.process2();
    }
}
