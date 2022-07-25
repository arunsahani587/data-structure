package Arrays;

import java.util.Arrays;

public class SecondLargestElementInArray {
   /* public static void main(String[] args)  {
        int arr[] = {12, 35, 1, 10, 34, 1};
        print2largest(arr, arr.length);
    }
    static void print2largest(int arr[], int arr_size){
        int i, first, second;
        if (arr_size < 2){
            System.out.printf(" Invalid Input ");
            return;
        }
        Arrays.sort(arr);
        for (i = arr_size - 2; i >= 0; i--){
            if (arr[i] != arr[arr_size - 1]){
                System.out.printf("The second largest " + "element is %d\n", arr[i]);
                return;
            }
        }
        System.out.printf("There is no second " + "largest element\n");
    }*/


    public static void main(String[] args) {
        int arr[] = { 12, 35, 1, 10, 34, 1 };
        print2largest(arr,  arr.length);
    }
    public static void print2largest(int arr[], int arr_size){
        int i, first, second;
        if (arr_size < 2) {
            System.out.print(" Invalid Input ");
            return;
        }
        first = second = Integer.MIN_VALUE;
        for (i = 0; i < arr_size; i++) {
            /* If current element is smaller than
            first then update both first and second */
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            }
            /* If arr[i] is in between first and
               second then update second  */
            else if (arr[i] > second && arr[i] != first)
                second = arr[i];
        }
        if (second == Integer.MIN_VALUE)
            System.out.print("There is no second largest"
                    + " element\n");
        else
            System.out.print("The second largest element"
                    + " is " + second);
    }


}


