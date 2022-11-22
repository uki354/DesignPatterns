package FactoryMethodPattern;

public class FirstCreatorImpl extends  Creator {

    @Override
    Product getProduct() {
        return new FirstProductImpl();
    }
}
