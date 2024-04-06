package tasks;
public class RecursiveAverage{
    public static double sum(int[] array, int n){
        if (n<=0){
            return 0;
        }
        return array[n-1] + sum(array, n-1);
    }
    public static double findAverNum(int[] array, int n){
        double totalSum = sum(array,n);
        return totalSum / n;
    }

}
