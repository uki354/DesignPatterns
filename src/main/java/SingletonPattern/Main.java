package SingletonPattern;

public class Main {

    /**
     * Singleton is creational design pattern used for creating "global variable".
     * Main purpose of it is  to define a class in such a way that only
     * once instance can be created.
     * Such scenarios can occur often, e.g. database connection instance, in which using multiple instances of the same class
     * can result in an unexpected behaviour of the code.
     * Many consider singleton pattern to be anti-pattern,
     * because it introduces difficulty afterwards, such as testing or multiple threads creating singleton object.
     */

    public static void main(String[] args) {
        SingletonObject object = SingletonObject.getInstance();

        // test instance creation counter
        SingletonObject object1 = SingletonObject.getInstance();
        SingletonObject object2 = SingletonObject.getInstance();

        object.setField1("object set");
        String test_message =
                object2.getField1().equals(object.getField1()) ? "every variable points to same instance" : "somethings wrong";
        System.out.println(test_message);
    }
}
