package Arrays;

public class LinearSearchInArray {
    public static void main(String[] args) {
        int[] arr = { 12, 34, 54, 23, 65, 43, 78, 90 };
        int target = 65;
        boolean targetFound = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                targetFound = true;
                break;
            }
        }

        if (!targetFound) {
            System.out.println("target is not found");
        } else {
            System.out.println("target found successfully");
        }

    }
}
