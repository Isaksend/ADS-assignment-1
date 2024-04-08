package tasks;
import java.util.Scanner;
/*
    Recursively prints the elements of array in reverse starting from a given index.
    The recursive function printArrayReversed is called recursively for each element in the array,
    decrementing the index by 1 each time until it reaches 0.
    This results in a linear time complexity O(n) where n is the number of elements in the array.
 */
public class PrintReversed {
    // Reads numbers from the console input and prints them in reverse order.
    private static void printArrayReversed(int[] array, int index){
        // Base case: if the index is negative, we've printed all elements, so return.
        if (index<0){
            return;
        }
        System.out.print(array[index]+" ");
        // Recursive call to print the next element (moving backwards in the array).
        printArrayReversed(array,index-1);
    }
    public static void printReversed(int i, Scanner scanner){
        // This line seems unnecessary as it does nothing with the read line.
        System.out.print("Input the numbers in single line:");
        scanner.nextLine();
        String[] elements =scanner.nextLine().split("\\s+");
        // Initializes an array to hold the parsed integers.
        int[] numbers = new int[elements.length];
        // Parses the integers from the string array and stores them in the numbers array.
        for ( i = 0; i<elements.length; i++){
            numbers[i] = Integer.parseInt(elements[i]);
        }
        // Calls printArrayReversed to print the numbers array in reverse order.
        printArrayReversed(numbers,numbers.length-1);
    }
}


