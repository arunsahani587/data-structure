package DyanmicProgramming;

public class MaximumCuts {
   /* public static void main(String[] args) {
        int n = 5, a = 1, b = 2, c = 3;
        System.out.println(maxCuts(n, a, b, c));
    }
    static int maxCuts(int n, int a, int b, int c) {
        int dp[] = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            dp[i] = -1;
            if (i - a >= 0) dp[i] = Math.max(dp[i], dp[i - a]);
            if (i - b >= 0) dp[i] = Math.max(dp[i], dp[i - b]);
            if (i - c >= 0) dp[i] = Math.max(dp[i], dp[i - c]);
            if (dp[i] != -1)
                dp[i]++;
        }
        return dp[n];
    }*/
        //=================================================
   // Driver code
   public static void main(String[] args) {
       int N = 17;
       int arr[] = {10, 11, 3};
       System.out.print(cuttingRod(arr, N));
   }
   static int cuttingRod(int arr[], int N) {
       int[] dp = new int[N + 1];
       // Initializing the number of rods we
       // can make from length 0
       dp[0] = 0;
       // Iterating over lengths that can
       // be formed
       for (int i = 1; i <= N; i++) {
           // Initializing the possible
           // cuts as infinite
           dp[i] = Integer.MIN_VALUE;
           // Cutting the desired lengths
           for (int j = 0; j < 3; j++) {
               // Checking whether the length of
               // rod becomes 0 or if after cutting
               // the rod, it becomes useless
               if ((i - arr[j]) >= 0 && dp[i - arr[j]] != Integer.MIN_VALUE) {
                   // Choosing the maximum
                   // possible desired
                   // length cuts to be made
                   dp[i] = Math.max(dp[i - arr[j]] + 1,
                           dp[i]);
               }
           }
       }
       return dp[N];
   }


}
