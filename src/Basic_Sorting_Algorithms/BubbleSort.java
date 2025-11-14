package Basic_Sorting_Algorithms;

public class BubbleSort {

    public static void print(int arr[]) {
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 4, 3, 23, 4, 0 };
        int size = arr.length;
        print(arr);

        for (int i = 0; i < size - 1; i++) {

            boolean isSorted = true;
            // int swap = 0;

            // Bubble up the largest element in each pass
            for (int j = 0; j < size - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    // swap++;
                    isSorted = false;
                }
            }
            // if (swap == 0) break;

            if (isSorted == true) {
                break;
            }
        }
        print(arr);

    }
}
