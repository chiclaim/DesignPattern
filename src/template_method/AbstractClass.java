package template_method;

public abstract class AbstractClass {
	//模板方法，封装固定算法逻辑
    public final void templateMethod(){
        operate1();
        System.out.println("处理相关逻辑...");
        operate2();
        System.out.println("处理相关逻辑2...");
    }

    protected abstract void operate1();
    protected abstract void operate2();
}