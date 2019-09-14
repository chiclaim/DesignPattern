package decorator.logger;

public class FileLogger implements ILogger {
    @Override
    public void log(String text) {
        System.out.println("正在将存储到文件中");
    }
}
