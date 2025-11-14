package Patterns;

public class InvertedRightAngledTriangle {

    public static void main(String[] args) {
        for(int line = 1; line <= 5; line++){
            for(int star = line; star <=5; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
