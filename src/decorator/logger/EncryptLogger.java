package decorator.logger;

public class EncryptLogger extends LoggerDecorator {

    public EncryptLogger(ILogger logger) {
        super(logger);
    }

    @Override
    public void log(String text) {
        System.out.println("对日志 " + text + " 进行加密");
        super.log(text);
    }
}
