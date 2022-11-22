package AbstractFactoryPattern;

public class WindowsButton implements Button{

    @Override
    public void onClick() {
        System.out.println("Windows btn click");
    }
}
