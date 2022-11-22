package AbstractFactoryPattern;

public class LinuxFactory implements GuiFactory {
    @Override
    public Button creteBtn() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }
}
