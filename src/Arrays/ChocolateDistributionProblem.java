package Arrays;

import java.util.Arrays;

public class ChocolateDistributionProblem {
    /* Driver program to test above function */
    public static void main(String[] args) {
        int arr[] = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int m = 7;  // Number of students
        System.out.println("Minimum difference is " + findMinDiff(arr, arr.length, m));

    }
    static int findMinDiff(int arr[], int n, int m) {
        if (m == 0 || n == 0)
            return 0;
        Arrays.sort(arr);
        if (n < m)
            return -1;
        int min_diff = Integer.MAX_VALUE;

        // Find the subarray of size m  such that difference between  last (maximum in case of sorted) and first (minimum in
        // case of sorted) elements of
        // subarray is minimum.
        for (int i = 0; i + m - 1 < n; i++) {
            int diff = arr[i + m - 1] - arr[i];
            if (diff < min_diff)
                min_diff = diff;
        }
        return min_diff;
    }


}
