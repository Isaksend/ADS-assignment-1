package tasks;
/*
    Method to compute the Greatest Common Divisor (GCD) of two integers, a and b.
    The time complexity of the GCD algorithm implemented using Euclidean
    algorithm is O(log(min(a,b))) where a and b are the two input integers. This is because the algorithm
    reduces the problem size by a factor of 2 in each iteration until the smaller number becomes 0.
 */
public class FindGCD {
    //Base case: if b is 0, the GCD is a.
    public static int GCD(int a,int b){
        if (b==0){
            return a;
        }
        // Recursive step: Call GCD with b and the remainder of a divided by b.
        return GCD(b, a%b);
    }
}
