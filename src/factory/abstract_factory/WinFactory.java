package factory.abstract_factory;

public class WinFactory implements Factory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Text createText() {
        return new WinText();
    }
}