package DyanmicProgramming;

import java.util.Arrays;

public class Fibonacci {
    //the memoization implementation of Dynamic Programming- Top-Down Approach.
   /* public static void main(String[] args) {
        int n = 5;
        memo = new int[n + 1];
        Arrays.fill(memo, -1);
        System.out.println(fib(n));
    }
    static int[] memo;

    static int fib(int n) {
        if (memo[n] == -1) {
            int res;
            if (n == 0 || n == 1)
                return n;

            else {
                res = fib(n - 1) + fib(n - 2);
            }
            memo[n] = res;
        }
        return memo[n];
    }*/
//=====================================================================================

    //tabulation in Dynamic Programming - Bottom-Up Approach
    static int fib(int n) {
        int f[] = new int[n + 1];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));
    }
}
