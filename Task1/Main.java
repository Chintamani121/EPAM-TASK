package BytesPart2.Task1;

public class Main {
    static int helper(int[] arr, int n){
        if(n==arr.length) return 0;
        return arr[n]+helper(arr,n+1);
    }
    static int recurr(int[] arr){
        if(arr==null) return 0;
        return helper(arr,0);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(recurr(arr));
    }
}
