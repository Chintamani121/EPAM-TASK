package BytesPart2.DP.NumberOfDiceRolled;

import java.util.Arrays;

public class Main {
    static int MOD=1000000007;
    static int func(int n,int k,int target,int[][] dp){
        if (target < 0) return 0;
        if (n == 0) return target == 0 ? 1 : 0;
        if (dp[n][target] != -1) return dp[n][target];
        int ways = 0;
        for (int face = 1; face <= k; face++) {
            ways = (ways + func(n - 1, k, target - face, dp)) % MOD;
        }

        return dp[n][target] = ways;
    }
    public static void main(String[] args) {
        int n = 3, k = 3, target = 5;
        int[][] dp = new int[n + 1][target + 1];
        for (int[] row : dp) Arrays.fill(row, -1);
        System.out.println(func(n, k, target, dp));
    }
}
