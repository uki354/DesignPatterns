package AbstractFactoryPattern;


/**
 *  Abstract Factory pattern is used when there is a multiple objects from the same family that  can have variants.
 *  It's called abstract because client primarly uses  abstract classes and interfaces inside client code.
 *  For each object variant of the same family, interface is declared, as well as interface for the family factory.
 *  Interface used as factory know about all abstract objects.
 */
public class Main {

    public static void main(String[] args) {
        GuiFactory factory = new LinuxFactory();
        Checkbox checkbox = factory.createCheckbox();
        Button button = factory.creteBtn();
        checkbox.onTick();
        button.onClick();

        System.out.println("--------------");

        GuiFactory windowsFactory = new WindowsFactory();
        Checkbox checkbox1 = windowsFactory.createCheckbox();
        Button button1 = windowsFactory.creteBtn();
        checkbox1.onTick();
        button1.onClick();
    }
}
