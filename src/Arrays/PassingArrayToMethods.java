package Arrays;

public class PassingArrayToMethods {
    public static void main(String[] args) {

        // create an array
        int[] x = { 23, 43, 43, 22, };
        System.out.println(x[1]);

        // passing array to method
        change(x);
        System.out.println(x[1]);

        // passing primitive to method
        int y = 45;
        System.out.println(y);

        // passing primitive to method
        change2(y);
        System.out.println(y);

    }

    public static void change(int[] x) {
        x[1] = 2;

    }

    public static void change2(int y) {
        y = 2;

    }
}
