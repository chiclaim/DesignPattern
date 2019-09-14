package decorator.logger;

public abstract class LoggerDecorator implements ILogger {

    private ILogger logger;

    public LoggerDecorator(ILogger logger){
        this.logger = logger;
    }

    @Override
    public void log(String text) {
        logger.log(text);
    }
}
