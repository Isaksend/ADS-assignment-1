package com.company;
import java.util.Scanner;

import static tasks.BinomCoefficient.binomialCoefficient;
import static tasks.DigitChecker.isNum;
import static tasks.FactorialCalc.factorial;
import static tasks.FindFibonacci.fib;
import static tasks.FindMin.findMin;
import static tasks.PowerCalc.power;
import static tasks.PrimeCheck.isPrime;
import static tasks.PrintReversed.printReversed;
import static tasks.RecursiveAverage.findAverNum;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose task for check:");
        int numTask = scanner.nextInt();
        scanner.nextLine();
        if(numTask == 1 || numTask == 2 || numTask == 7){
            System.out.print("Input the number of elements in massive:");
            int n = scanner.nextInt();
            if (n<=0){
                System.out.println("The number of elements in massive must be positive!");
                return;
            }
            if(numTask == 7){
                printReversed(n,scanner);
            }else {
                int[] numbers = new int[n];
                System.out.println("Input the "+ n + " number value:");
                for(int i = 0; i < n; i++){
                    numbers[i] = scanner.nextInt();
                }
                scanner.nextLine();
                if (numTask == 1) {
                    int min = findMin(numbers,numbers.length);
                    System.out.println("Minimun number: "+ min);
                }   else if (numTask == 2) {
                    double average = findAverNum(numbers, numbers.length);
                    System.out.println("Average number: "+ average);
                }
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
        } else if (numTask == 6) {
            scanner.nextLine();
            boolean check = true;
            while (check){
                System.out.println("Input the number and number of power:");
                String line = scanner.nextLine();
                if (!line.trim().isEmpty()){
                    String[] input = line.split("\\s+");
                    if (input.length == 2){
                        try{
                            int a = Integer.parseInt(input[0]);
                            int n = Integer.parseInt(input[1]);
                            int resultPow = power(a,n);
                            System.out.println(resultPow);
                        }catch (NumberFormatException e){
                            System.out.println("One of the input data is not integer, please put the correct number!");
                        }
                    }else {
                        System.out.println("Error! Write only two integers");
                    }
                }else {
                    check = false;
                    System.out.println("Error! Empty field is not eligible!");
                }
            }
        } else if (numTask == 8) {
            System.out.println("Input the data in one line! For checking is full digit?");
            String input = scanner.nextLine();
            System.out.println(isNum(input)? "Yes":"No");
        } else if (numTask == 9) {
            System.out.println("Input the n and k for formula:");
            String input = scanner.nextLine();
            String[] parts = input.split("\\s+");
            if (parts.length == 2){
                int n = Integer.parseInt(parts[0]);
                int k = Integer.parseInt(parts[1]);
                System.out.println(binomialCoefficient(n,k));
            }else {
                System.out.println("Please enter two integers separated by space!");
            }
        } else{
            System.out.println("This task not ready");
        }
        scanner.close();
    }
}
