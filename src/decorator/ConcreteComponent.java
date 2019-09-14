package decorator;

public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("正在处理相关逻辑...");
    }
}
