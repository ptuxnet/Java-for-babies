package Arrays;

public class ProductAndMin {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 8, 6, 1 };
        int product = 1;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Product: " + product);
        System.out.println("Minimum: " + min);
    }
}
