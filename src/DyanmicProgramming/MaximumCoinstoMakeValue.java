package DyanmicProgramming;

import java.util.Vector;

public class MaximumCoinstoMakeValue {
   /* public static void main(String[] args) {
        int arr[] = {3, 4, 1}, val = 5, n = 3;
        System.out.println(minCoins(arr, n, val));
    }
    static int minCoins(int arr[], int m, int value) {
        int dp[] = new int[value + 1];
        dp[0] = 0;
        for (int i = 1; i <= value; i++)
            dp[i] = Integer.MAX_VALUE;

        for (int i = 1; i <= value; i++) {
            for (int j = 0; j < m; j++)
                if (arr[j] <= i) {
                    int sub_res = dp[i - arr[j]];
                    if (sub_res != Integer.MAX_VALUE
                            && sub_res + 1 < dp[i])
                        dp[i] = sub_res + 1;
                }
        }
        return dp[value];
    }*/
    //==================================================================
   // All denominations of Indian Currency
   // Driver code
   public static void main(String[] args) {
       int n = 93;
       System.out.print("Following is minimal number " + "of change for " + n + ": ");
       findMin(n);
   }
   static int deno[] = {1, 2, 5, 10, 20,  50, 100, 500, 1000};
    static int n = deno.length;
    static void findMin(int V) {
        // Initialize result
        Vector<Integer> ans = new Vector<>();
        // Traverse through all denomination
        for (int i = n - 1; i >= 0; i--) {
            // Find denominations
            while (V >= deno[i]) {
                V -= deno[i];
                ans.add(deno[i]);
            }
        }
        // Print result
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(" " + ans.elementAt(i));
        }
    }


}
