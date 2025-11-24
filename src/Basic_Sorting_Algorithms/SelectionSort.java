package Basic_Sorting_Algorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 4, 3, 23, 4, 0 };
        int size = arr.length;

        for (int i = 0; i < size - 1; i++) {
            int min = Integer.MAX_VALUE;
            int minIndex = -1;

            for (int j = 0; j < size - 1; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }

            // swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
