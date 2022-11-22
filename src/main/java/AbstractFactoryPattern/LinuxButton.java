package AbstractFactoryPattern;

public class LinuxButton implements Button{

    @Override
    public void onClick() {
        System.out.println("linux btn click");
    }
}
