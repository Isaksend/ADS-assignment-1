package tasks;
/*
    Class FactorialCalc contains a method to calculate the factorial of a given number recursively.
    The factorial function recursively calls itself n times, decrementing n by 1 each time until it reaches 0 or 1. \
    Therefore, the time complexity is O(n) where n is the input value.
 */
public class FactorialCalc {
    // The factorial method takes an integer n and returns its factorial.
    public static int factorial(int n){
        // Base case: if n is 0 or 1, the factorial is 1.
        if (n == 0 || n == 1){
            return 1;
        }
        // Recursive case: return n multiplied by the factorial of n-1.
        return n * factorial(n-1);
    }
}
