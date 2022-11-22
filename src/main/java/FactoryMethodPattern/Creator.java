package FactoryMethodPattern;

public  abstract class Creator {

    abstract Product getProduct();

    public void businessCodeOfCreatorClass(){
        System.out.println("Inside  creator class, even tho it's name is creator it's primary job is not to create object" +
                "but instead do its own business logic");

        Product product = getProduct();
        product.handleBehaviourCommonToAllProducts();
    }
}
