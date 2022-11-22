package FactoryMethodPattern;

public class SecondCreatorImpl extends Creator{

    @Override
    Product getProduct() {
        return new SecondProductImpl();
    }
}
