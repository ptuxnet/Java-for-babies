
package OOPS.Autoboxing_And_Abstract_Classes;


public class autoboxing_example {
    
    public static void main(String[] args){

        // Autoboxing is the automatic conversion that the Java compiler makes 
        // between the primitive types and their corresponding object wrapper classes. 
        // For example, converting an int to an Integer, a double to a Double, and so on.
        int x = 5;
        Integer y = x; // Autoboxing: converting int to Integer

        System.out.println("Primitive int: " + x);
        System.out.println("Wrapper Integer: " + y);


        // Unboxing is the reverse process of autoboxing. 
        // It is the automatic conversion that the Java compiler makes from the wrapper class to its corresponding primitive type. 
        // For example, converting an Integer to an int, a Double to a double, and so on.
        Integer a = 10;
        int b = a; // Unboxing: converting Integer to int
        
        System.out.println("Wrapper Integer: " + a);
        System.out.println("Primitive int: " + b);


        Integer c = 20;
        printInt(c); // Autoboxing: converting Integer to int

        Animal myDog = new dog("Bruno");
        myDog.makeSound();
    }

    static void printInt(int x) {
        System.out.println("int value: " + x);
    }
    
}

// 1. Assignment Conversion: Autoboxing allows you to assign a primitive value to a wrapper class variable without explicit conversion. 
// For example, assigning an int to an Integer variable automatically converts the int to an Integer object.

// 2. Method Invocation: Autoboxing enables you to pass primitive values as arguments to methods that expect wrapper class parameters. 
// The compiler automatically converts the primitive value to the corresponding wrapper class object.

// 3. Arithmetic Operations: Autoboxing allows you to perform arithmetic operations on wrapper class objects as if they were primitive types. 
// The compiler automatically unboxes the wrapper class objects to their corresponding primitive values for the operation.

abstract class Animal {

    // Is Constructor is allowed in abstract class?
    // Yes, an abstract class can have a constructor. 
    // The constructor of an abstract class is called when an instance of a concrete subclass is created. 
    //However, you cannot create an instance of the abstract class itself.

    String name; 
    
    Animal(String name){
        this.name = name; 
    }


    abstract void makeSound();

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class dog extends Animal {

    dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " the dog barks");
    }
}

//. Questions:
//1. Can abstract classes have constructors?  --> Yes
//2. Can abstract classes be final ? --> No
//3. Can abstract class have static methods/variables ? --> Yes
//4. Can abstract classes private methods ? --> yes but non abstract
//5. Can abstract classes have final methods ? --> yes but non abstract
//6. Can abstract classes have no abstract method ? --> Yes