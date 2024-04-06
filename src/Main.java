import java.util.Scanner;
public class Main {

    public static int findMin(int[] array, int n){
        if (n==1) {
            return array[0];
        }

        return Math.min(array[n-1], findMin(array,n -1));
    }
//    public static int averNum(int[] array, int n){
//
//    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inpur the number of elements in massive:");
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
        int min = findMin(numbers,numbers.length);
        System.out.println("Minimun number: "+ min);
    }





}
