package Arrays;

import java.util.HashMap;

public class MooresVotingAlgo {
    /* Driver code */
    public static void main(String[] args) {
        int a[] = new int[]{1, 3, 3, 1, 2};
        int size = a.length;
        printMajority(a, a.length);
    }
    static void printMajority(int a[], int size) {
        /* Find the candidate for Majority*/
        int cand = findCandidate(a, size);

        /* Print the candidate if it is Majority*/
        if (isMajority(a, size, cand))
            System.out.println(" " + cand + " ");
        else
            System.out.println("No Majority Element");
    }
    /* Function to find the candidate for Majority */
    static int findCandidate(int a[], int size) {
        int maj_index = 0, count = 1;
        int i;
        for (i = 1; i < size; i++) {
            if (a[maj_index] == a[i])
                count++;
            else
                count--;
            if (count == 0) {
                maj_index = i;
                count = 1;
            }
        }
        return a[maj_index];
    }
    /* Function to check if the candidate occurs more
       than n/2 times */
    static boolean isMajority(int a[], int size, int cand) {
        int i, count = 0;
        for (i = 0; i < size; i++) {
            if (a[i] == cand)
                count++;
        }
        if (count > size / 2)
            return true;
        else
            return false;
    }

    private static void findMajority(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int count = map.get(arr[i]) + 1;
                if (count > arr.length / 2) {
                    System.out.println("Majority found :- " + arr[i]);
                    return;
                } else
                    map.put(arr[i], count);

            } else
                map.put(arr[i], 1);
        }
        System.out.println(" No Majority element");
    }


    /* Driver program to test the above functions */
  /*  public static void main(String[] args) {
        int a[] = new int[]{2, 2, 2, 2, 5, 5, 2, 3, 3};

        findMajority(a);
    }*/


}
