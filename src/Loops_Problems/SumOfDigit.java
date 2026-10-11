package Loops_Problems;

public class SumOfDigit {
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            int last_digit = number % 10;
            sum = sum + last_digit;
            number = number / 10;

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(123));
    }
}
