package Loops_Problems;

public class ReverseNumber {

    public static void main(String[] args) {
        int number = 23415;

        int reverse = 0;

        while(number > 0){
            int last_digit = number % 10;
            reverse  = (reverse  * 10) + last_digit;
            number = number / 10;

        }

        System.out.println(reverse);
    }
}
