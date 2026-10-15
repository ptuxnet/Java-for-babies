package OOPS.Immutable_Class;

public class Solutions {
    public static void main(String[] args) {
        College college = new College("ABC College", "123 Main St");
        Student s1 = new Student(20, "John Doe", college);

        System.out.println(s1.getCollege().name);
        s1.getCollege().name = "XYZ College"; // This will change the name of the college in the Student object
        System.out.println(s1.getCollege().name); // Output: XYZ College

    }

}

// Immutable (Purely Immutable)
// Defensive Copying: To make the Student class purely immutable, we need to
// ensure that the mutable College object is not exposed to external
// modification. This can be achieved by creating a defensive copy of the
// College object in the constructor and returning a copy in the getter method.
final class Student {
    private final String name;
    private final int age;
    private final College College;

    Student(int age, String name, College College) {
        this.name = name;
        this.age = age;
        this.College = new College(College.name, College.address); // Defensive Copying
    }

    // Getter Methods
    public int getAge() {
        return this.age;
    }

    public College getCollege() {
        return new College(this.College.name, this.College.address);
    }

    // Setter Methods
    public String getName() {
        return this.name;
    }

}

// Mutable
class College {
    String name;
    String address;

    College(String name, String address) {
        this.name = name;
        this.address = address;
    }

}
