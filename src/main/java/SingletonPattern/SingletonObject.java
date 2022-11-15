package SingletonPattern;

import java.util.Objects;

public class SingletonObject {

    private String field1;
    private String field2;

    public static int count;

    private SingletonObject(){
        System.out.println("created "  + ++count);
        this.field1 = "";
        this.field2 = "";
    }

    private static  SingletonObject singletonObject;

    public static  SingletonObject getInstance(){
        if(Objects.isNull(singletonObject))
            singletonObject = new SingletonObject();
        return singletonObject;
    }


    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }
}
