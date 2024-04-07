package tasks;

/**
 Class FindMin contains a method to find the minimum number in an array.
 The findMin method takes an array of integers and the number of elements, n, to consider in the array.
 The function recursively calls itself n-1 times, each time reducing the size of the input array by 1 until it reaches the base case.
 Therefore, the time complexity is O(n) where n is the size of the input array.
 **/
public class FindMin{
    public static int findMin(int[] array, int n){
        //Base case: if the array contains only one element (n==1), that element is the minimum.
        if (n==1) {
            return array[0];
        }
        //Recursive case: find the minimum between the last element and the minimum of the rest of the array.
        return Math.min(array[n-1], findMin(array,n -1));
    }
}
