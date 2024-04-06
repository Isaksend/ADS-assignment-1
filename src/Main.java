public class Main {

    public static int findMin(int[] array, int n){
        if (n==1){
            return array[0];
        }
        return Math.min(array[n-1], findMin(array,n -1));
    }
    public static void main(String[] args){
        int[] numbers = {10,32,1,3,45};

        int min = findMin(numbers,numbers.length);
        System.out.println("Minimun number: "+ min);
    }
    
}
