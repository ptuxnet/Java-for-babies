package Arrays;

public class waveArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int size = arr.length;

        for (int i = 0; i < size; i = i + 2) {
            if (i == size - 1)
                break;
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;

        }

        // Wavy array
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
