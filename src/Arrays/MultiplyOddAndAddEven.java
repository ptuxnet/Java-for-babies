package Arrays;

public class MultiplyOddAndAddEven {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int evenSum = 0;
        int oddProduct = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenSum += arr[i];
            } else {
                oddProduct *= arr[i];
            }
        }
        System.out.println(oddProduct);
        System.out.println(evenSum);
    }

}
