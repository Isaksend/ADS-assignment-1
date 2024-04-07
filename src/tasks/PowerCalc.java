package tasks;
/*
    Class PowerCalc contains a method to calculate the power of a number using recursion.
    The power function recursively calls itself n times, decrementing n by 1 each time until n reaches 0.
    Therefore, the time complexity is O(n) where n is the exponent value.
 */
public class PowerCalc {
    // The power method takes a base integer a and an exponent integer n and returns a to the power of n.
    public static int power(int a, int n){
        // Base case: if the exponent n is 0, the result is always 1 (according to the definition of exponentiation).
        if (n==0){
            return 1;
        }
        // Recursive case: multiply the base a by the result of a to the power of (n-1).
        return a * power(a, n-1);
    }
}
