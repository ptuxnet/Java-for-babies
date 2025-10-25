package Arrays;

import java.util.Arrays;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {

        // Shallow Copy
        int[] originalArray = { 1, 2, 3, 4, 5 };
        int[] shallowCopyArray = originalArray; // Both reference the same array

        System.out.println("Before modifying shallow copy:");

        for (int num : originalArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("After modifying shallow copy:");
        shallowCopyArray[0] = 10; // Modify the shallow copy
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Deep Copy
        System.out.println("================================");
        int[] deepCopy = Arrays.copyOf(originalArray, originalArray.length);
        System.out.println("Before modifying deep copy:");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.println("After modifying deep copy:");
        deepCopy[1] = 20; // Modify the deep copy
        for (int num : originalArray) {
            System.out.print(num + " ");
        }

        // Another way to create deep copy
        System.out.println();
        System.out.println("Using clone() method for deep copy:");

        // Create another deep copy
        int[] anotherDeepCopy = new int[originalArray.length];

        anotherDeepCopy[2] = 30;
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}
