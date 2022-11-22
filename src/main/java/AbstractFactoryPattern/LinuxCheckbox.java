package AbstractFactoryPattern;

public class LinuxCheckbox implements Checkbox {

    @Override
    public void onTick() {
        System.out.println("linux ticked");
    }
}
