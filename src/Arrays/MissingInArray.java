
// https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1

package Arrays;

public class MissingInArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5 };
        long n = arr.length + 1;
        long sum = n * (n + 1) / 2;
        long arraySum = 0;

        for (int element : arr) {
            arraySum += element;

        }

        long result = sum - arraySum;
        System.out.println(result);

    }
}
