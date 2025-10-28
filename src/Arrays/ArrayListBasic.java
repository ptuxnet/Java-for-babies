package Arrays;

import java.util.ArrayList;

public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(7);
        arr.add(5);
        arr.add(25);
        arr.add(50);

        // To get index 2
        System.out.println(arr.get(2));
        arr.set(1, 0); // arr[2] = 0;

        System.out.println(arr);

        int size = arr.size();
        for (int i = 0; i < size; i++) {
            System.out.print(arr.get(i) + " ");
        }

        System.out.println();

        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();

        arr.add(78);
        arr.add(1, 34);
        System.out.print(arr + " ");
        System.out.println();

        arr.remove(arr.size() - 1);
        System.out.print(arr + " ");

        System.out.println();

        int i = 0;
        int j = arr.size() - 1;

        while (i < j) {
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
            i++;
            j--;

        }
        System.out.print(arr + " ");

    }
}
