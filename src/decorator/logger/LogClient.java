package decorator.logger;

public class LogClient {
    public static void main(String[] args) {
        ILogger logger = new EncryptLogger(new FileLogger());
        logger.log("hello");

        System.out.println();

        ILogger logger2 = new EncryptLogger(new DBLogger());
        logger2.log("world");

        System.out.println();


        ILogger logger3 = new EncryptLogger(new NetLogger());
        logger3.log("chiclaim");
    }
}
