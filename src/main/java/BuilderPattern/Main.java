package BuilderPattern;


/**
 *  Builder pattern should be used when there are multiple fields that can be set. There could be a reason to set few fields
 *  while other ones remain as nulls or defaults. Instead of creating a bunch of constructors for each variant (telescoping)
 *  builder pattern provides a clean and simple way to set desired fields.
 *  Builder is static class inside concrete object class, that has all the fields as class it builds.
 *  For each field, should be defined setter method that returns builder object.The reason for that is so the client code
 *  can set multiple objects in one line (chaining). Builder class should also have build method that calls private
 *  constructor in concrete object class. Constructor takes builder as a parameter and sets each of the fields from the builder
 *  respectively.
 */
public class Main {

    public static void main(String[] args) {
        ConcreteObject obj = new ConcreteObject.Builder()
                .field1("this is field1")
                .field2("this is field 2")
                .field4("this is field 4, field 3 should be null")
                .build();


        System.out.println(obj.toString());
    }




}
