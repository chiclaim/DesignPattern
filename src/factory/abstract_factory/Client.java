package factory.abstract_factory;

public class Client {
    public static void main(String[] args) {
        Factory winFactory = new WinFactory();
        Button winBtn = winFactory.createButton();
        Text winTxt = winFactory.createText();

        Factory unixFactory = new UnixFactory();
        Button unixBtn = unixFactory.createButton();
        Text unixTxt = unixFactory.createText();
    }
}