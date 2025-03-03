package BytesPart2.DP.CountVowelsPermutation;

import java.util.Arrays;

public class Main {
    static int vowels(int n, int i, int count,char[] arr,int[][] dp){
        if(count == n) return 1;
        if(dp[count][i]!=-1) return dp[count][i];
        if(arr[i]=='a'||arr[i]=='u'){
            return dp[count][i]=vowels(n,(i+1)%5,count+1,arr,dp);
        }
        else if(arr[i]=='e'||arr[i]=='o'){
            return dp[count][i]=vowels(n,(i+1)%5,count+1,arr,dp)+
                    vowels(n,(i-1)%5,count+1,arr,dp);
        }
        else{
            int ans=0;
            for(int j=0;j<5;j++){
                if(j!=i) ans += vowels(n,j,count+1,arr,dp);
            }
            return dp[count][i]=ans;
        }
    }
    public static void main(String[] args) {
        int ans=0;
        char[] charArray = {'a','e','i','o','u'};
        int n=5;
        int[][] dp = new int[n][5];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        for(int i=0;i<5;i++){
            ans+=vowels(n,i,1,charArray,dp);

        }
        System.out.println(ans);
    }
}
