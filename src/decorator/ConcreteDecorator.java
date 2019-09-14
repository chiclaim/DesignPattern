package decorator;

public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }


    @Override
    public void operation() {
        System.out.println("在处理之前，增加点功能...");
        super.operation();

    }
}
