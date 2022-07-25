package DyanmicProgramming;

public class EggDroppingPuzzle {
    // Driver code
    /*public static void main(String args[]) {
        int n = 2, k = 10;
        System.out.print("Minimum number of " + "trials in worst case with "+ n + " eggs and " + k
                + " floors is " + eggDrop(n, k));
    }
    *//* Function to get minimum number of
	trials needed in worst case with n
	eggs and k floors *//*
    static int eggDrop(int n, int k) {
        // If there are no floors, then
        // no trials needed. OR if there
        // is one floor, one trial needed.
        if (k == 1 || k == 0)
            return k;

        // We need k trials for one egg
        // and k floors
        if (n == 1)
            return k;

        int min = Integer.MAX_VALUE;
        int x, res;
        // Consider all droppings from
        // 1st floor to kth floor and
        // return the minimum of these
        // values plus 1.
        for (x = 1; x <= k; x++) {
            res = Math.max(eggDrop(n - 1, x - 1),
                    eggDrop(n, k - x));
            if (res < min)
                min = res;
        }
        return min + 1;
    }*/
    //=========================================================================
    public static void main(String[] args) {
        int n = 2;
        int f = 10;
        System.out.println(res(n, f));
    }

    static int res(int e, int f) {
        int dp[][] = new int[f + 1][e + 1];
        for (int i = 1; i <= e; i++) {
            dp[1][i] = 1;
            dp[0][i] = 0;
        }
        for (int j = 1; j <= f; j++) {
            dp[j][1] = j;
        }
        for (int i = 2; i <= f; i++) {
            for (int j = 2; j <= e; j++) {
                dp[i][j] = Integer.MAX_VALUE;
                for (int x = 1; x <= i; x++) {
                    dp[i][j] = Math.min(dp[i][j], 1 + Math.max(dp[x - 1][j - 1], dp[i - x][j]));
                }
            }
        }
        return dp[f][e];
    }


}
