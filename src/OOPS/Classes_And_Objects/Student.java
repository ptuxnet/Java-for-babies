package OOPS.Classes_And_Objects;

class Student {
    static int count = 0;
    static final String COLLEGE = "XYZ College";
    final int id;
    String name;
    int age;

    // run once when the class is loaded
    static {
        System.out.println("Static block executed");
    }

    // run before the constructor is called
    {
        System.out.println("Instance block executed");
    }

    // constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++count;
        System.out.println("Constructor executed");

    }

    // calling the other constructor
    Student(String name) {
        this(name, 18);

    }

    // calling the other constructor
    Student() {
        this("Unknown", 18);
    }

    // static method
    static void displayCount() {
        System.out.println("Total students: " + count);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20);
        Student s2 = new Student("Bob");
        Student s3 = new Student();

        System.out.println(s1.name + " is " + s1.age + " years old and has ID: " + s1.id);
        System.out.println(s2.name + " is " + s2.age + " years old and has ID: " + s2.id);
        System.out.println(s3.name + " is " + s3.age + " years old and has ID: " + s3.id);

        displayCount();
    }

}
