package Loops;

import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter term 1: ");
        int t1 = sc.nextInt();

        System.out.print("Enter common difference: ");
        int d = sc.nextInt();

        System.out.print("Enter number terms: ");
        int n = sc.nextInt();




        for(int i = 0; i < n; i = i++){
            int term = t1 + i * d;

            System.out.println(term);
        }


    }
}
