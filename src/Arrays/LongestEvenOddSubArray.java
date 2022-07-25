package Arrays;

public class LongestEvenOddSubArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 7, 8};
        System.out.println(longestEvenOddSubarray(a, a.length));
    }
    static int longestEvenOddSubarray(int a[], int n){
        int longest = 1;
        int cnt = 1;
        for (int i = 0; i < n - 1; i++) {
            // increment count if consecutive
            // elements has an odd sum
            if ((a[i] + a[i + 1]) % 2 == 1){
                cnt++;
            } else {
                // Store maximum count in longest
                longest = Math.max(longest, cnt);
                // Reinitialize cnt as 1 consecutive
                // elements does not have an odd sum
                cnt = 1;
            }
        }
        // Length of 'longest' can never be 1
        // since even odd has to occur in pair or more
        // so return 0 if longest = 1
        if (longest == 1)
            return 0;

        return Math.max(cnt, longest);
    }


}
