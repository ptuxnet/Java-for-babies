package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 12, 34, 54, 23, 65, 43, 78, 90 };
        int size = arr.length;
        int firstIndex = 0;
        int lastIndex = size - 1;

        while (firstIndex < lastIndex) {

            int temp = arr[firstIndex];
            arr[firstIndex] = arr[lastIndex];
            arr[lastIndex] = temp;
            firstIndex++;
            lastIndex--;

        }

        for (int arrs : arr) {
            System.out.print(arrs + " ");
        }
    }
}
