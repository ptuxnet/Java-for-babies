package Basic_Sorting_Algorithms;

//! Time limit exceded....

public class MovingAllZeroToEnd {
    public static void main(String[] args) {
        int arr[] = { 12, 1, -2, 34, 0, 34, 0, 34, 0, 22 };
        int size = arr.length;

        for (int i = 0; i < size - 1; i++) {

            for (int j = 0; j < size - 1 - i; j++) {
                if (arr[j] == 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
