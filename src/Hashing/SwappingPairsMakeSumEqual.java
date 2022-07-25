package Hashing;

public class SwappingPairsMakeSumEqual {
    // driver program
    public static void main(String[] args) {
        int A[] = {4, 1, 2, 1, 1, 2};
        int B[] = {3, 6, 3, 3};
        findSwapValues(A, A.length, B, B.length);
    }
    static int getSum(int X[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += X[i];
        return sum;
    }

    static void findSwapValues(int A[], int n, int B[], int m) {
        int sum1 = getSum(A, n);
        int sum2 = getSum(B, m);
        // Look for val1 and val2, such that
        // sumA - val1 + val2 = sumB - val2 + val1
        int newsum1, newsum2, val1 = 0, val2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                newsum1 = sum1 - A[i] + B[j];
                newsum2 = sum2 - B[j] + A[i];
                if (newsum1 == newsum2) {
                    val1 = A[i];
                    val2 = B[j];
                }
            }
        }
        System.out.println(val1 + " " + val2);
    }


}
