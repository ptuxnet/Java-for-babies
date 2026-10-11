package OOPS.Classes_And_Objects;

public class Persons2 {
    String name;
    int age;

    Persons2() {
        this("Unknown", 0);
    }

    Persons2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Persons2 p1 = new Persons2("John", 25);
        System.out.println(p1.name + " is " + p1.age + " years old.");

        Persons2 p2 = new Persons2("Jane", 30);
        System.out.println(p2.name + " is " + p2.age + " years old.");

        Persons2 p3 = new Persons2();
        System.out.println(p3.name + " is " + p3.age + " years old.");
    }

}
