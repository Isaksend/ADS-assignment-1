package tasks;

import java.util.Scanner;

public class PrintReversed {
    private static void printArrayReversed(int[] array, int index){
        if (index<0){
            return;
        }
        System.out.print(array[index]+" ");
        printArrayReversed(array,index-1);
    }
    public static void printReversed(int n, Scanner scanner){
        System.out.print("Input the numbers in single line:");
        scanner.nextLine();
        String[] elements =scanner.nextLine().split("\\s+");
        int[] numbers = new int[elements.length];
        for (int i = 0; i<elements.length; i++){
            numbers[i] = Integer.parseInt(elements[i]);
        }
        printArrayReversed(numbers,numbers.length-1);
    }
}
