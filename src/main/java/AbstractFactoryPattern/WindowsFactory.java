package AbstractFactoryPattern;

public class WindowsFactory implements  GuiFactory {

    @Override
    public Button creteBtn() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
