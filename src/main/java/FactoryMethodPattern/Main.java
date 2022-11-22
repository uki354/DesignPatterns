package FactoryMethodPattern;


/**
 * Factory method design pattern is used when there are multiple objects that share need a common method but with
 * different implementation each. Common interface is created, with a method that products (objects that have
 * different implementations for the same behaviour) will implement.
 * Creator ( business logic class, that is declared abstract with abstract method for creating products) can be
 * implemented and each implementation can return different product class that can be  altered and used latter on.
 *
 */
public class Main {

    public static void main(String[] args) {
        Creator cr1 = new FirstCreatorImpl();
        cr1.businessCodeOfCreatorClass();

        System.out.println("----------");

        Creator cr2 = new SecondCreatorImpl();
        cr2.businessCodeOfCreatorClass();
    }
}
