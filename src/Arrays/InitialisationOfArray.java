package Arrays;

public class InitialisationOfArray {
    public static void main(String[] args) {
        // Method 1: Static Initialization
        int[] staticArray = { 1, 2, 3, 4, 5 };

        // Method 2: Dynamic Initialization
        int[] dynamicArray = new int[5];
        dynamicArray[0] = 10;
        dynamicArray[1] = 20;
        dynamicArray[2] = 30;
        dynamicArray[3] = 40;
        dynamicArray[4] = 50;

        // Print both arrays
        System.out.println("Static Array:");
        for (int i = 0; i < staticArray.length; i++) {
            System.out.print(staticArray[i] + " ");
        }

        System.out.println("\nDynamic Array:");
        for (int i = 0; i < dynamicArray.length; i++) {
            System.out.print(dynamicArray[i] + " ");
        }
    }
}
