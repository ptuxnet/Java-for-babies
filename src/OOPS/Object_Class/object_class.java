package OOPS.Object_Class;

public class object_class {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "John Doe";
        s1.age = 20;

        System.out.println(s1);

        Student s2 = new Student();
        s2.name = "John Doe";
        s2.age = 20;

        Student s3 = null;

        System.out.println(s1.equals(s3)); // Output: false
        System.out.println(s1.equals(s2)); // Output: true
        System.out.println(s1 == s2); // Output: false

        System.out.println(s1.hashCode() == s2.hashCode()); // Output: true

    }

}

class Student {
    String name;
    int age;

    @Override
    public String toString() {
        return (name + " " + age);
    }

    @Override
    public boolean equals(Object obj) {

        // check if the object is compared with itself
        if (this == obj) {
            return true;
        }

        // check if obj is an instance of Student
        // if not checked ---> ClassCastException will be thrown
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student other = (Student) obj;
        return age == other.age && name.equals(other.name);

    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;

    }

}