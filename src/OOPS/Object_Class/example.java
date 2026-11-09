package OOPS.Object_Class;

public class example {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Dog();

        System.out.println(a.getClass().getName()); // Output: OOPS.Object_Class.Animal
        System.out.println(b.getClass().getName()); // Output: OOPS.Object_Class.Dog

        System.out.println(a instanceof Dog); // Output: false
        System.out.println(b instanceof Animal); // Output: true

    }
}

class Animal {

}

class Dog extends Animal {

}