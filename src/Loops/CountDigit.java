package Loops;

public class CountDigit {
    public static void main(String[] args) {
        int numberOfDigit = 0;
        int number = 1234;

        while(number != 0){
            number = number / 10;
            numberOfDigit++;
        }
        System.out.println(numberOfDigit);
    }
}
