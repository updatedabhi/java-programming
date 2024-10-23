class Boy {
    // private int age;
    // private String name;
    protected int age;
    protected String name;

    public void set(int a, String n) {
        this.age = a;
        this.name = n;
    }

    public void details() {
        System.out.println("Your name is " + name + " ,age: " + age);
    }
}

class GoodBoy extends Boy {
    public void printDetails(int n) {
        System.out.println(this.age = n);
    }
}

public class AccessModifier {
    public static void main(String[] args) {
        // Boy b1 = new Boy();
        // b1.set(34, "Abhishek");
        // b1.details();
        GoodBoy gb = new GoodBoy();
        gb.printDetails(5);
    }
}
