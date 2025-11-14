package Patterns;

public class InverseRightAngle {
    public static void main(String[] args) {
        for (int row = 1; row <= 4; row++) {

            // print space
            for (int space = 1; space <= 4 - row; space++) {
                System.out.print(" ");
            }

            // print star
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int counter = 1;

        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(counter + " ");
                counter++;

            }
            System.out.println();

        }

        for (int row = 1; row <= 4; row++) {
            for (int col = 1; col <= row; col++) {
                if ((row + col) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }

        System.out.println();
        for (int row = 1; row <= 4; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row = 1; row <= 4; row++) {
            for (int col = row; col <= 4; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
