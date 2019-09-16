package proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {
    private Object target;

    // 真实主题通过构造方法传递进来
    public ProxyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("整理相关资料");
        Object result = method.invoke(target, args); //placeholder
        System.out.println("邮寄资料给客户");
        return result;
    }
}
