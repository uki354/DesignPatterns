package FactoryMethodPattern;

public class SecondProductImpl implements Product {

    @Override
    public void handleBehaviourCommonToAllProducts() {
        System.out.println("Second product implementation");
        secondProductCode();
    }

    public void secondProductCode(){
        System.out.println("Code that belongs to second product class");
    }
}
