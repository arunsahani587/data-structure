package DyanmicProgramming;

import java.util.Arrays;

public class EditDistanceProblem {
   /* public static void main(String[] args) {
        String s1 = "CAT", s2 = "CUT";
        int n = 3, m = 3;
        System.out.println(eD(s1, s2, m, n));
    }
    static int eD(String s1, String s2, int m, int n) {
        if (m == 0)
            return n;
        if (n == 0)
            return m;

        if (s1.charAt(m - 1) == s2.charAt(n - 1))
            return eD(s1, s2, m - 1, n - 1);
        else {
            return 1 + Math.min(eD(s1, s2, m, n - 1), Math.min(eD(s1, s2, m - 1, n),
                    eD(s1, s2, m - 1, n - 1)));
        }
    }*/

    //======================================================================
    // Driver program
   /* public static void main(String[] args) {
        String str1 = "voldemort";
        String str2 = "dumbledore";
        int n = str1.length(), m = str2.length();
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i < n + 1; i++)
            Arrays.fill(dp[i], -1);
        System.out.print(minDis(str1, str2, n, m, dp));
    }

    static int minDis(String s1, String s2,int n, int m, int[][] dp) {
        // If any String is empty,
        // return the remaining characters of other String
        if (n == 0)
            return m;
        if (m == 0)
            return n;

        // To check if the recursive tree
        // for given n & m has already been executed
        if (dp[n][m] != -1)
            return dp[n][m];

        // If characters are equal, execute
        // recursive function for n-1, m-1
        if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
            if (dp[n - 1][m - 1] == -1) {
                return dp[n][m] = minDis(s1, s2, n - 1, m - 1, dp);
            } else
                return dp[n][m] = dp[n - 1][m - 1];
        }

        // If characters are nt equal, we need to

        // find the minimum cost out of all 3 operations.
        else {
            int m1, m2, m3;        // temp variables
            if (dp[n - 1][m] != -1) {
                m1 = dp[n - 1][m];
            } else {
                m1 = minDis(s1, s2, n - 1, m, dp);
            }

            if (dp[n][m - 1] != -1) {
                m2 = dp[n][m - 1];
            } else {
                m2 = minDis(s1, s2, n, m - 1, dp);
            }

            if (dp[n - 1][m - 1] != -1) {
                m3 = dp[n - 1][m - 1];
            } else {
                m3 = minDis(s1, s2, n - 1, m - 1, dp);
            }
            return dp[n][m] = 1 + Math.min(m1, Math.min(m2, m3));
        }
    }*/

    //=======================Dp Solution=========\
    public static void main(String[] args) {
        String s1 = "CAT", s2 = "CUT";
        int n = 3, m = 3;
        System.out.println(eD(s1, s2, m, n));
    }

    static int eD(String s1, String s2, int m, int n) {
        int dp[][] = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j], Math.min(dp[i][j - 1],  dp[i - 1][j - 1]));

                }
            }
        }
        return dp[m][n];
    }

}
