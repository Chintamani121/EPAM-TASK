package BytesPart2.Task2;
import java.util.ArrayList;

public class Main {
    static int subArray(int[]arr,int i,int max){
        if(i==arr.length) return arr[i-1];
        if(i>0) max = Math.max(max,arr[i-1]);
        if(arr[i]<0){
            arr[i]=0;

        }
        return 0;
    }
    static int maxSubArray(int[] arr){
        if(arr==null) return 0;
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for(int a : arr){
            if(a>0) ans+=a;
            max = Math.max(a,max);
        }
        if(ans>0) return ans;
        return max;
    }
    public static void main(String[] args) {
        int[] arr= {-1,-2,-1,-2};
        System.out.println(maxSubArray(arr));
    }
}
