package FactoryMethodPattern;

public class FirstProductImpl implements  Product {

    @Override
    public void handleBehaviourCommonToAllProducts() {
        System.out.println("First product implementation handling");
        firstProductCode();
    }

    private void firstProductCode(){
        System.out.println("Code that belongs to first product class");
    }
}
