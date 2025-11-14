package Loops;

public class PrimeNumber {

    public static boolean isPrime(int number){

        if(number <= 1){
            return false;
        } else if( number <= 3){
            return true;
        } else if((number % 2 == 0) || (number % 3 == 0)){
            return false;
        } else {

            for(int i = 5; i <= Math.sqrt(number); i++){
                if((number % i == 0) || (number % (i + 2) == 0)) return  false;
            }

        }

        return  true;

    }
    public static void main(String[] args) {

        System.out.println(isPrime(32));

    }
}
