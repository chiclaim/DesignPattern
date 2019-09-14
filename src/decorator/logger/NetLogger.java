package decorator.logger;

public class NetLogger implements ILogger {
    @Override
    public void log(String text) {
        System.out.println("正在将日志存储到远程服务器");
    }
}
