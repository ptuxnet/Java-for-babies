
package OOPS.Nested_Class;

public class nested_class_example {
    public static void main(String[] args) {

        Outer outer = new Outer();

        Outer.Inner inner = new Outer.Inner(); 
        inner.fun(outer);
         
    }
}


class Outer {
    static int x; 
    int y = 4; 

    static class Inner {

        void fun(Outer outer){
            System.out.println("hello");
            System.out.println(x);

            // can access non-static variable y from outer class using object of outer class
            System.out.println(outer.y);

            // cannot access non-static variable y from static context
            //System.out.println(y);
        }
    }

}


// Usecase of nested class:
// 1. Nested classes are used to group classes that belong together, which makes your code more readable and maintainable.
// 2. Nested classes can access all members (including private members) of the outer class, which can be useful for encapsulation and data hiding.  
// 3. Builder pattern: Nested classes are often used in the builder pattern, where a static nested class is used to construct an instance of the outer class. This can make the construction process more readable and flexible.

  