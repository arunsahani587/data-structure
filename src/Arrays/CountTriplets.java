package Arrays;

import java.util.Arrays;

public class CountTriplets {
    public static void main(String[] args) {
        int n = 4;
        int arr[] = {1, 5, 3, 2};
        //prints  count of triplets
        System.out.print(countTriplets(arr, n));
        //prints  pair of tripes values
        findTriplet(arr, n);
    }
    static void findTriplet(int arr[], int n) {
        Arrays.sort(arr);
        for (int i = n - 1; i >= 0; i--) {
            int j = 0;
            int k = i - 1;
            while (j < k) {
                if (arr[i] == arr[j] + arr[k]) {
                    System.out.println("numbers are " + arr[i] + " "
                            + arr[j] + " " + arr[k]);
                    return;
                } else if (arr[i] > arr[j] + arr[k])
                    j += 1;
                else
                    k -= 1;
            }
        }
        System.out.println("No such triplet exists");
    }

    static int countTriplets(int arr[], int n) {
        int[] freq = new int[100];
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (freq[arr[i] + arr[j]] > 0) {
                    count++;
                }
            }
        }
        return count;
    }
}