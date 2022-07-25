package Arrays;

import java.util.Arrays;

public class RearrangeArrayAlternatively {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6};
        //Extra space is required
        rearrangeAN(arr, arr.length);
        System.out.println(Arrays.toString(arr));
        rearrangeA1(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void rearrangeA1(int[] arr, int n) {
        int max_ele = arr[n - 1];
        int min_ele = arr[0];
        for (int i = 0; i < n; i++) {
            // at even index : we have to put maximum element
            if (i % 2 == 0) {
                arr[i] = max_ele;
                max_ele -= 1;
            }
            // at odd index : we have to put minimum element
            else {
                arr[i] = min_ele;
                min_ele += 1;
            }
        }
    }
    static void rearrangeAN(int[] arr, int n) {
        int temp[] = arr.clone();
        int small = 0, large = n - 1;
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (flag)
                arr[i] = temp[large--];
            else
                arr[i] = temp[small++];

            flag = !flag;
        }
    }

}
