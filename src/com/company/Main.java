package com.company;
import java.util.Scanner;
import static tasks.FindMin.findMin;
import static tasks.RecursiveAverage.findAverNum;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose task for check:");
        int numTask = scanner.nextInt();
        if(numTask == 1 || numTask == 2){
            System.out.print("Input the number of elements in massive:");
            int n = scanner.nextInt();
            if (n<=0){
                System.out.println("The number of elements in massive must be positive!");
                scanner.close();
                return;
            }
            int[] numbers = new int[n];
            System.out.println("Input the "+ n + " number value:");
            for(int i = 0; i < n; i++){
                numbers[i] = scanner.nextInt();
            }
            scanner.close();
            if(numTask == 1){
                int min = findMin(numbers,numbers.length);
                System.out.println("Minimun number: "+ min);
            } else if (numTask == 2) {
                double average = findAverNum(numbers, numbers.length);
                System.out.println("Average number: "+ average);
            }
        }else{
            System.out.println("This task not ready");
        }
    }
}
