package OOPS.Classes_And_Objects;

public class Persons {
    String name;

    void display() {
        System.out.println(this.name);
    }

    public static void main(String[] agrs) {
        Persons p1 = new Persons();
        p1.name = "John";
        p1.display();

        Persons p2 = new Persons();
        p2.name = "Jane";
        p2.display();

        Persons p3 = new Persons();
        p3.name = "Doe";
        p3.display();
    }

}
