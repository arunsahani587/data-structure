package StackAndQueue;

import java.util.*;

public class MaximumOfAllSubarraysOfSizeK {
    // Driver code
   /* public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 3;
        printKMax(arr, arr.length, k);
    }
    static void printKMax(int arr[], int n, int k) {
        int j, max;
        for (int i = 0; i <= n - k; i++) {
            max = arr[i];
            for (j = 1; j < k; j++) {
                if (arr[i + j] > max)
                    max = arr[i + j];
            }
            System.out.print(max + " ");
        }
    }*/
    //=====================================================================
    // Driver Code
   /* public static void main(String[] args) {
        int arr[] = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
        int k = 4, n = arr.length;
        List<Integer> res = findKMaxElement(arr, k, n);
        for (int x : res)
            System.out.print(x + " ");
    }

    static ArrayList<Integer> findKMaxElement(int[] arr,int k, int n) {
        // creating the max heap ,to get max element always
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0;
        for (; i < k; i++)
            queue.add(arr[i]);

        // adding the maximum element among first k elements
        res.add(queue.peek());
        // removing the first element of the array
        queue.remove(arr[0]);
        // iterarting for the next elements
        for (; i < n; i++) {
            // adding the new element in the window
            queue.add(arr[i]);
            // finding & adding the max element in the
            // current sliding window
            res.add(queue.peek());
            // finally removing the first element from front
            // end of queue
            queue.remove(arr[i - k + 1]);
        }
        return res;
    }*/

    //=====================================================
    // Driver code
    public static void main(String[] args) {
        int arr[] = {12, 1, 78, 90, 57, 89, 56};
        int k = 3;
        printMax(arr, arr.length, k);
    }

    static void printMax(int arr[], int n, int k) {
        // Create a Double Ended Queue, Qi
        // that will store indexes of array elements
        // The queue will store indexes of
        // useful elements in every window and it will
        // maintain decreasing order of values
        // from front to rear in Qi, i.e.,
        // arr[Qi.front[]] to arr[Qi.rear()]
        // are sorted in decreasing order
        Deque<Integer> Qi = new LinkedList<Integer>();

        /* Process first k (or first window)
        elements of array */
        int i;
        for (i = 0; i < k; ++i) {
            // For every element, the previous
            // smaller elements are useless so
            // remove them from Qi
            while (!Qi.isEmpty() && arr[i] >=
                    arr[Qi.peekLast()])

                // Remove from rear
                Qi.removeLast();
            // Add new element at rear of queue
            Qi.addLast(i);
        }
        // Process rest of the elements,
        // i.e., from arr[k] to arr[n-1]
        for (; i < n; ++i) {
            // The element at the front of the
            // queue is the largest element of
            // previous window, so print it
            System.out.print(arr[Qi.peek()] + " ");
            // Remove the elements which
            // are out of this window
            while ((!Qi.isEmpty()) && Qi.peek() <= i - k)
                Qi.removeFirst();

            // Remove all elements smaller
            // than the currently
            // being added element (remove
            // useless elements)
            while ((!Qi.isEmpty()) && arr[i] >=
                    arr[Qi.peekLast()])
                Qi.removeLast();
            // Add current element at the rear of Qi
            Qi.addLast(i);
        }
        // Print the maximum element of last window
        System.out.print(arr[Qi.peek()]);
    }




}
