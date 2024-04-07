package tasks;
/**
 Class PrimeCheck contains methods to check if a number is prime using recursion.
 This is a helper method that checks if a number n is prime, starting the check from a given integer i.
 The isPrime function recursively checks if a number is prime by dividing it by numbers up to the square root of n.
 Therefore, the time complexity is O(sqrt(n))
* */
public class PrimeCheck {
    public static boolean isPrime(int n, int i){
        // If n is less than or equal to 2, it can only be prime if it is exactly 2.
        if(n<=2){
            return (n == 2)?true:false;
        }
        // If n is divisible by i, it is not prime.
        if (n % i == 0){
            return false;
        }
        // If i squared is greater than n, then we have checked all possible factors of n, and n is prime.
        if (i*i > n){
            return true;
        }
        // Recursively check the next divisor.
        return isPrime(n,i+1);
    }
    // This method is an interface to the recursive isPrime method that starts the check from 2.
    public static boolean isPrime(int n){
        return isPrime(n,2);
    }
}
