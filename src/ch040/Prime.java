package src.ch040;

// Print all prime numbers between 2 and 100.
public class Prime {
    public static void main(String[] args) {
        for(int i = 2; i <= 100; i++) {

//            boolean isPrime = true;
//            for(int j = 2; j < i; j++) {
//                if(i % j == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
            boolean isPrime = Prime.checkPrime(i);
            if(isPrime) {
                System.out.println(i);
            }
        }
    }

    static boolean checkPrime(int number) {
        boolean isPrime = true;
        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
