package AbstractFactoryPattern;

public class WindowsCheckbox implements  Checkbox {


    @Override
    public void onTick() {
        System.out.println("Windows ticked");
    }
}
