package singleton;

public class Singleton4 {

    private Singleton4() {
    }

    private static class InstanceHolder {
        private final static Singleton4 instance = new Singleton4();

    }

    public static Singleton4 getInstance() {
        return InstanceHolder.instance;
    }
}