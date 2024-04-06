package com.company;
import java.util.Scanner;

import static tasks.FactorialCalc.factorial;
import static tasks.FindFibonacci.fib;
import static tasks.FindMin.findMin;
import static tasks.PrimeCheck.isPrime;
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
        } else if (numTask == 3) {
            System.out.println("Input the number for check 'Is Prime?'");
            int n = scanner.nextInt();
            if (isPrime(n)){
                System.out.println(n + " is Prime number");
            }else {
                System.out.println(n + " is Composite number");
            }
        } else if (numTask == 4) {
            System.out.println("Input the number for calculate factorial of number");
            int n = scanner.nextInt();
            int result = factorial(n);
            System.out.println("Factorial of "+ n + " equal to "+result);
        } else if (numTask == 5) {
            System.out.println("Input the number for find Fibonacci number");
            int n = scanner.nextInt();
            System.out.println(fib(n) + " is Fibonacci number");
        } else{
            System.out.println("This task not ready");
        }
    }
}
