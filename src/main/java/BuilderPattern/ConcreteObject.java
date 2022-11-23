package BuilderPattern;

public class ConcreteObject {

    private String field1;
    private String field2;
    private String field3;
    private String field4;

    public ConcreteObject(String field1, String field2, String field3, String field4) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
        this.field4 = field4;
    }

    @Override
    public String toString() {
        return "ConcreteObject{" +
                "field1='" + field1 + '\'' +
                ", field2='" + field2 + '\'' +
                ", field3='" + field3 + '\'' +
                ", field4='" + field4 + '\'' +
                '}';
    }

    private ConcreteObject(Builder builder){
        this.field1 = builder.field1;
        this.field2 = builder.field2;
        this.field3 = builder.field3;
        this.field4 = builder.field4;

    }


    public static class Builder{
        private String field1;
        private String field2;
        private String field3;
        private String field4;

        //setters that return builder object for each field

        public Builder field1(String field1){
            this.field1 = field1;
            return this;
        }

        public Builder field2(String field2){
            this.field2 = field2;
            return this;
        }

        public Builder field3(String field3){
            this.field3 = field3;
            return this;
        }

        public Builder field4(String field4){
            this.field4 = field4;
            return this;
        }

        public ConcreteObject build(){
            return new ConcreteObject(this);
        }

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

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }

    public String getField4() {
        return field4;
    }

    public void setField4(String field4) {
        this.field4 = field4;
    }
}
