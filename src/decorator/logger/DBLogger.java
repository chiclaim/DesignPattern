package decorator.logger;

public class DBLogger implements ILogger {
    @Override
    public void log(String text) {
        System.out.println("正在将日志存储到数据库中");
    }
}
