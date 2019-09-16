package proxy.jdk;

import proxy.IBusiness;

import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {
        ProxyHandler handler = new ProxyHandler(new GovDepartment());
        // com.sun.proxy 包下生成代理类
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        ISettle business = (ISettle) Proxy.newProxyInstance(
                ISettle.class.getClassLoader(),
                new Class[]{ISettle.class},
                handler);
        business.settle();

    }



    public static void main() {
        ProxyHandler handler = new ProxyHandler(new proxy.GovDepartment());
        IBusiness business = (IBusiness) Proxy.newProxyInstance(
                IBusiness.class.getClassLoader(),
                new Class[]{IBusiness.class},
                handler);
        business.registerCompany();
    }
}
