package Exceptions;

import java.io.FileNotFoundException;

public class ExceptionDemo {

    // Show Method
    public static void show(){
        try {
            var reader = new FileReader("file.txt");
            System.out.println("File Opened");
        } catch (FileNotFoundException ex) {
            System.out.println("File does not exist");

        }

    }

    // say hello Method
    public static void sayHello(String name){
        System.out.println(name.toUpperCase());
    }
    public static void main(String[] args) {
            ExceptionDemo.show();

    }
}
