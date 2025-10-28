package Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] a = { 2, 5, 6, 9, 20 };
        int[] b = { 1, 3, 4, 5, 7, 8 };

        int[] c = new int[a.length + b.length];

        for (int element : c) {
            System.out.print(element + " ");
        }

        System.out.println();

        merger(a, b, c);
        for (int element : c) {
            System.out.print(element + " ");
        }

    }

    public static void merger(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length)
            c[k++] = (a[i] < b[j]) ? a[i++] : b[j++];
        while (i < a.length)
            c[k++] = a[i++];
        while (j < b.length)
            c[k++] = b[j++];

    }
}
