package tasks;
/*
    Class FindFibonacci contains a method to calculate the nth Fibonacci number recursively.
    The recursive function calls itself twice for each input n,
    resulting in an exponential time complexity.
 */
public class FindFibonacci {
    // The fib method takes an integer n and returns the nth Fibonacci number.
    public static int fib(int n){
        // Base cases: if n is 1 or 0, return n, since the first two Fibonacci numbers are 0 and 1.
        if (n == 1 || n==0){
            return n;
        }
        // Recursive case: return the sum of the previous two Fibonacci numbers.
        // This is based on the definition of the Fibonacci sequence.
        return fib(n-1)+fib(n-2);
    }
}
