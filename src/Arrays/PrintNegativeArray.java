package Arrays;

public class PrintNegativeArray {
    public static void main(String[] args) {
        int[] numbers = { 10, -5, 3, -1, 7, -9, 0, 4 };

        System.out.println("Negative numbers in the array:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
