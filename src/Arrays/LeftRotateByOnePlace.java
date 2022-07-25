package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class LeftRotateByOnePlace {
   /* public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9};
        int n = arr.length;
        int k = 2;
        leftRotate(arr, n, k);
        k = 3;
        leftRotate(arr, n, k);
        k = 4;
        leftRotate(arr, n, k);
    }
    static void leftRotate(int arr[], int n, int k) {
        *//* To get the starting point of
        rotated array *//*
        int mod = k % n;
        // Prints the rotated array from
        // start position
        for (int i = 0; i < n; ++i)
            System.out.print(arr[(i + mod) % n] + " ");

        System.out.println();
    }*/

    public static void main(String[] args){
        Integer arr[] = { 1, 3, 5, 7, 9 };
        int n = arr.length;
        int k = 2;
        leftRotate(arr, k, n);
    }
    static void leftRotate(Integer arr[], int k, int n){
        // In Collection class rotate function
        // takes two parameters - the name of
        // array and the position by which it
        // should be rotated
        // The below function will be rotating
        // the array left  in linear time

        // Collections.rotate()rotate the
        // array from right hence n-k
        Collections.rotate(Arrays.asList(arr), n - k);
        // Print the rotated array from start position
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }



}
