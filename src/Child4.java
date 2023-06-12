public class Child4 extends Child1 implements Printable {
    private double field4;

    public Child4(int field1, double field4) {
        super(field1);
        this.field4 = field4;
    }

    public double getField4() {
        return field4;
    }

    @Override
    public void print() {
        System.out.println("Child4 object:");
        System.out.println("Field 1: " + getField1());
        System.out.println("Field 4: " + getField4());
    }
}
