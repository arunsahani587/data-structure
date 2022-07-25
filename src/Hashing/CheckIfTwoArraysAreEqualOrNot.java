package Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckIfTwoArraysAreEqualOrNot {
    // Driver code
   /* public static void main(String[] args) {
        int arr1[] = {3, 5, 2, 5, 2};
        int arr2[] = {2, 3, 5, 5, 2};

        if (areEqual(arr1, arr2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    public static boolean areEqual(int arr1[], int arr2[]) {
        if (arr1.length != arr2.length)
            return false;

        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Linearly compare elements
        for (int i = 0; i < arr1.length; i++)
            if (arr1[i] != arr2[i])
                return false;

        // If all elements were same.
        return true;
    }*/
//=========================================================================
    // Driver code
   /* public static void main(String[] args) {
        int arr1[] = {3, 5, 2, 5, 2};
        int arr2[] = {2, 3, 5, 5, 2};
        if (areEqual(arr1, arr2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static boolean areEqual(int arr1[], int arr2[]) {
        if (arr1.length != arr2.length)
            return false;

        // Store arr1[] elements and their counts in
        // hash map
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (map.get(arr1[i]) == null)
                map.put(arr1[i], 1);
            else {
                count = map.get(arr1[i]);
                count++;
                map.put(arr1[i], count);
            }
        }

        // Traverse arr2[] elements and check if all
        // elements of arr2[] are present same number
        // of times or not.
        for (int i = 0; i < arr1.length; i++) {
            // If there is an element in arr2[], but
            // not in arr1[]
            if (!map.containsKey(arr2[i]))
                return false;

            // If an element of arr2[] appears more
            // times than it appears in arr1[]
            if (map.get(arr2[i]) == 0)
                return false;

            count = map.get(arr2[i]);
            --count;
            map.put(arr2[i], count);
        }
        return true;
    }*/
//========================================================================
    // Driver code
    public static void main(String[] args) {
        int arr1[] = {3, 5, 2, 5, 2};
        int arr2[] = {2, 3, 5, 5, 2};

        // Function call
        if (areEqual(arr1, arr2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    public static boolean areEqual(int arr1[], int arr2[]) {
        // If lengths of arrays are not equal
        if (arr1.length != arr2.length)
            return false;

        // To store xor of both arrays
        int b1 = arr1[0];
        int b2 = arr2[0];

        // Find xor of each elements in array
        for (int i = 1; i < arr1.length; i++) {
            b1 ^= arr1[i];
        }
        for (int i = 1; i < arr2.length; i++) {
            b2 ^= arr2[i];
        }
        int all_xor = b1 ^ b2;

        // If xor is zero means they are
        // equal (5^5=0)
        if (all_xor == 0)
            return true;

        // If all elements were not same,
        // then xor will not be zero
        return false;
    }





}
