public class Child2 extends Child1 implements Printable {
    private String field2;

    public Child2(int field1, String field2) {
        super(field1);
        this.field2 = field2;
    }

    public String getField2() {
        return field2;
    }

    @Override
    public void print() {
        System.out.println("Child2 object:");
        System.out.println("Field 1: " + getField1());
        System.out.println("Field 2: " + getField2());
    }

}
