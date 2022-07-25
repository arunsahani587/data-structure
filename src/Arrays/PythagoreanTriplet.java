package Arrays;

import java.util.Arrays;

public class PythagoreanTriplet {
   /* // Driver program to test above function
    public static void main(String[] args) {
        int ar[] = {3, 1, 4, 6, 5};
        if (isTriplet(ar, ar.length) == true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    // Returns true if there is Pythagorean triplet in ar[0..n-1]
    static boolean isTriplet(int ar[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    // Calculate square of array elements
                    int x = ar[i] * ar[i], y = ar[j] * ar[j], z = ar[k] * ar[k];

                    if (x == y + z || y == x + z || z == x + y)
                        return true;
                }
            }
        }
        return false;
    }
*/

    //using sorting
   /* public static void main(String[] args){
        int arr[] = { 3, 1, 4, 6, 5 };
        if (isTriplet(arr, arr.length) == true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    // Returns true if there is a triplet with following property
    // A[i]*A[i] = A[j]*A[j] + A[k]*[k]
    // Note that this function modifies given array
    static boolean isTriplet(int arr[], int n)
    {
        // Square array elements
        for (int i = 0; i < n; i++)
            arr[i] = arr[i] * arr[i];

        // Sort array elements
        Arrays.sort(arr);

        // Now fix one element one by one and find the other two
        // elements
        for (int i = n - 1; i >= 2; i--) {
            // To find the other two elements, start two index
            // variables from two corners of the array and move
            // them toward each other
            int l = 0; // index of the first element in arr[0..i-1]
            int r = i - 1; // index of the last element in arr[0..i-1]
            while (l < r) {
                // A triplet found
                if (arr[l] + arr[r] == arr[i])
                    return true;

                // Else either move 'l' or 'r'
                if (arr[l] + arr[r] < arr[i])
                    l++;
                else
                    r--;
            }
        }
        // If we reach here, then no triplet found
        return false;
    }*/


    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 6, 5};
        if (checkTriplet(arr, arr.length))
            System.out.print("Yes");
        else
            System.out.print("No");
    }

    static boolean checkTriplet(int arr[], int n) {
        int maximum = 0;
        // Find the maximum element
        for (int i = 0; i < n; i++) {
            maximum = Math.max(maximum, arr[i]);
        }
        // Hashing array
        int[] hash = new int[maximum + 1];
        // Increase the count of array elements
        // in hash table
        for (int i = 0; i < n; i++)
            hash[arr[i]]++;

        // Iterate for all possible a
        for (int i = 1; i < maximum + 1; i++) {
            // If a is not there
            if (hash[i] == 0)
                continue;

            // Iterate for all possible b
            for (int j = 1; j < maximum + 1; j++) {
                // If a and b are same and there is only one a
                // or if there is no b in original array
                if ((i == j && hash[i] == 1) || hash[j] == 0)
                    continue;

                // Find c
                int val = (int) Math.sqrt(i * i + j * j);
                // If c^2 is not a perfect square
                if ((val * val) != (i * i + j * j))
                    continue;

                // If c exceeds the maximum value
                if (val > maximum)
                    continue;

                // If there exists c in the original array,
                // we have the triplet
                if (hash[val] == 1) {
                    return true;
                }
            }
        }
        return false;
    }

}
