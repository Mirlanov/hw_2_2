public class Main {
    public static Printable createObject(String className) {
        switch (className) {
            case "2nd":
                return new Child2(10, "Object2");
            case "3rd":
                return new Child3(20, true);
            case "4th":
                return new Child4(30, 3.14);
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        Printable[] objects = new Printable[3];
        objects[0] = createObject("2nd");
        objects[1] = createObject("3rd");
        objects[2] = createObject("4th");
        for (Printable obj : objects) {
            obj.print();
            System.out.println();
        }
    }


}

