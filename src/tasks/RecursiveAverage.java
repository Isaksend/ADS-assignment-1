package tasks;
/**
    Class RecursiveAverage contains methods to calculate the sum
    and average of an array recursively.
    The sum method takes an array and the number of elements, n, to sum up.
    It returns the sum of the first n elements of the array.
    The sum method is called recursively n times, each time reducing the value of n by 1 until it reaches 0.
    Therefore, the time complexity is O(n)
**/

public class RecursiveAverage{
    public static double sum(int[] array, int n){
        // Base case: if n is less than or equal to 0, the sum is 0.
        if (n<=0){
            return 0;
        }
        // Recursive case: return the last element plus the sum of the rest of the array.
        return array[n-1] + sum(array, n-1);
    }
    // The findAverNum method calculates the average of the first n elements of the array.
    public static double findAverNum(int[] array, int n){
        // Calculate the total sum of the first n elements.
        double totalSum = sum(array,n);
        // Divide the total sum by the number of elements, n, to find the average.
        return totalSum / n;
    }

}
