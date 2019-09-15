package proxy;

// 客户
public class Client {

    public void registerCompany(){
        IBusiness agent = new Agent();
        agent.registerCompany();
    }

    public static void main(String[] args) {
        new Client().registerCompany();
    }
}
