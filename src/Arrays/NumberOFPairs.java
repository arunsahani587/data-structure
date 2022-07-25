package Arrays;

public class NumberOFPairs {
    public static void main(String[] args) {
        int x[] = {2, 1, 6};
        int y[] = {1, 5};
        System.out.println(countPairsBruteForce(x, y, x.length, y.length));
    }
    public static int countPairsBruteForce(int X[], int Y[], int m, int n) {
        int ans = 0;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (Math.pow(X[i], Y[j]) >
                        Math.pow(Y[j], X[i]))
                    ans++;
        return ans;
    }
}
