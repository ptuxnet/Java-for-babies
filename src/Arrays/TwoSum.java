package Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 9;
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    flag = true;
                    break;
                }
            }
        }

        if (flag)
            System.out.println("target sum found");
        else
            System.out.println("not found");

    }
}
