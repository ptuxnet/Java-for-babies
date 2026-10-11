 
package Loops_Problems;

public class CountDigit {
    public static void main(String[] args) {
        int numberOfDigit = 0;
        int number = 1234;

        if (number == 0) {
            numberOfDigit = 1;
        } else {
            int workingNumber = Math.abs(number);
            while (workingNumber != 0) {
                workingNumber = workingNumber / 10;
                numberOfDigit++;
            }
        }

        System.out.println(numberOfDigit);
    }
}
