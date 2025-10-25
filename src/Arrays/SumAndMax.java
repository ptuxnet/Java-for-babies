package Arrays;

public class SumAndMax {
    public static void main(String[] args) {

        int[] arr = { 12, 32, 34, 54, 64, 43 };
        int max = Integer.MIN_VALUE;
        System.out.println(max);

        int sum = 0;
        int size = arr.length;

        // sum of arr
        for (int i = 0; i < size; i++) {
            sum = sum + arr[i];

        }
        System.out.println(sum);

        // Max of arr
        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
