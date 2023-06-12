public class Child3 extends Child1 implements Printable {
    private boolean field3;

    public Child3(int field1, boolean field3) {
        super(field1);
        this.field3 = field3;
    }

    public boolean getField3() {
        return field3;
    }

    @Override

    public void print() {
        System.out.println("Child3 object:");
        System.out.println("Field 1: " + getField1());
        System.out.println("Field 3: " + getField3());
    }
}
