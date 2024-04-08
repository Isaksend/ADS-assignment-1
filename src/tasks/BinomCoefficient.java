package tasks;
/*
    Calculates the binomial coefficient for given values of n and k.
    The function recursively calls itself twice with n-1 in each call,
    resulting in a binary tree of recursive calls with a total of 2^n function calls.
    Complexity = O(2^n)
 */
public class BinomCoefficient {
    public static int binomialCoefficient(int n, int k){
        // Base cases: if k equals 0 or n, the coefficient is 1 (C(n, 0) = C(n, n) = 1).
        if (k == 0 || k==n){
            return 1;
        }
        // Recursive case: the sum of coefficients from the previous row in Pascal's triangle.
        // This is based on the recurrence relation: C(n, k) = C(n-1, k-1) + C(n-1, k).
        return binomialCoefficient(n-1,k-1)+binomialCoefficient(n-1, k);
    }
}
