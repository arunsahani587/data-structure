package Arrays;

import java.util.Arrays;

public class KthSmallestElement {
   /* // driver program
    public static void main(String[] args) {
        Integer arr[] = new Integer[]{12, 3, 5, 7, 19};
        int k = 2;
        System.out.print("K'th smallest element is " + kthSmallest(arr, k));
    }

    // Function to return k'th smallest
    // element in a given array
    public static int kthSmallest(Integer[] arr,
                                  int k) {
        // Sort the given array
        Arrays.sort(arr);

        // Return k'th element in
        // the sorted array
        return arr[k - 1];
    }*/



    public static void main(String[] args) {
        Integer arr[] = new Integer[]{12, 3, 5, 7, 4, 19, 26};
        int k = 3;
        System.out.print("K'th smallest element is " + kthSmallest(arr, 0, arr.length - 1, k));
    }
    // Standard partition process of QuickSort.
    // It considers the last element as pivot
    // and moves all smaller element to left of
    // it and greater elements to right
    public static int partition(Integer[] arr, int l, int r) {
        int x = arr[r], i = l;
        for (int j = l; j <= r - 1; j++) {
            if (arr[j] <= x) {
                // Swapping arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
            }
        }
        // Swapping arr[i] and arr[r]
        int temp = arr[i];
        arr[i] = arr[r];
        arr[r] = temp;
        return i;
    }
    public static int kthSmallest(Integer[] arr, int l, int r, int k) {
        // If k is smaller than number of elements
        // in array
        if (k > 0 && k <= r - l + 1) {
            // Partition the array around last
            // element and get position of pivot
            // element in sorted array
            int pos = partition(arr, l, r);

            // If position is same as k
            if (pos - l == k - 1)
                return arr[pos];

            // If position is more, recur for
            // left subarray
            if (pos - l > k - 1)
                return kthSmallest(arr, l, pos - 1, k);

            // Else recur for right subarray
            return kthSmallest(arr, pos + 1, r, k - pos + l - 1);
        }
        // If k is more than number of elements
        // in array
        return Integer.MAX_VALUE;
    }



}
