package factory.abstract_factory;

public class UnixFactory implements Factory {
    @Override
    public Button createButton() {
        return new UnixButton();
    }

    @Override
    public Text createText() {
        return new UnixText();
    }
}