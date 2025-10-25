package Arrays;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr = { 12, 34, 54, 23, 65, 43, 78, 90 };
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > smax && arr[i] != max)
                smax = arr[i];
        }

        System.out.println(smax);
    }
}
