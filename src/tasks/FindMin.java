package tasks;

public class FindMin{
    public static int findMin(int[] array, int n){
        if (n==1) {
            return array[0];
        }

        return Math.min(array[n-1], findMin(array,n -1));
    }

}
