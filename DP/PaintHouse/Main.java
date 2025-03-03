package BytesPart2.DP.PaintHouse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static int minimumCost(int[][] dp,int[][] list, int i,int j){
        if(i == list.length) {
            return 0;
        }
        if(dp[i][j] != -1) return dp[i][j];
        int left = list[i][j] + minimumCost(dp,list,i+1,(j+1)%3);
        int right = list[i][j] + minimumCost(dp,list,i+1,(j+2)%3);
        return dp[i][j] = Math.min(left , right);
    }
    public static void main(String[] args) {
        int[][] list = {{17,2,17},{16,16,5},{14,3,19},{15,20,2}};
        if(list==null) System.out.println(0);
        int n = list.length;
        int m = list[0].length;
        if(n==0||m==0) System.out.println(0);
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        int ans= Integer.MAX_VALUE;

        for(int i = 0; i<3; i++) {
            ans=Math.min(ans,minimumCost(dp,list, 0, i));

        }

    }
}
