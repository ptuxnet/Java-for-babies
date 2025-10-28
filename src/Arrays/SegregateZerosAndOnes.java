// https://www.geeksforgeeks.org/problems/segregate-0s-and-1s5106/1

// Using two pointer for one pass solutions

package Arrays;

public class SegregateZerosAndOnes {
    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 1, 0 };
        int size = arr.length;
        int start = 0;
        int end = size - 1;

        while (start < end) {
            if (arr[start] == 0)
                start++;
            else if (arr[end] == 1)
                end--;
            else if (arr[start] == 0 & arr[end] == 1) {
                arr[start] = 1;
                arr[end] = 0;
                start++;
                end--;
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);

        }
    }

}