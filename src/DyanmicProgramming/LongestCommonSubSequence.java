package DyanmicProgramming;

import java.util.Arrays;

public class LongestCommonSubSequence {
    /*public static void main(String[] args) {
        String s1 = "AXYZ", s2 = "BAZ";
        int n = 4, m = 3;
        memo = new int[n + 1][m + 1];
        for (int[] i : memo) {
            Arrays.fill(i, -1);
        }
        System.out.println(lcs(s1, s2, n, m));
    }
    static int[][] memo;
    static int lcs(String s1, String s2, int n, int m) {
        if (memo[n][m] != -1)
            return memo[n][m];

        if (n == 0 || m == 0)
            memo[n][m] = 0;
        else {
            if (s1.charAt(n - 1) == s2.charAt(m - 1))
                memo[n][m] = 1 + lcs(s1, s2, n - 1, m - 1);
            else
                memo[n][m] = Math.max(lcs(s1, s2, n - 1, m), lcs(s1, s2, n, m - 1));
        }
        return memo[n][m];
    }*/

    //==================================================================
    public static void main(String[] args) {
        String s1 = "AXYZ", s2 = "BAZ";
        System.out.println(lcs(s1, s2));
    }
    static int lcs(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        int dp[][] = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[m][n];
    }


}
