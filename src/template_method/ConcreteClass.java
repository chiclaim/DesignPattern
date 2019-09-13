package template_method;

// 子类实现父类的抽象操作
public class ConcreteClass extends AbstractClass {
    @Override
    protected void operate1() {
        System.out.println("操作1");
    }

    @Override
    protected void operate2() {
        System.out.println("操作2");

    }
}