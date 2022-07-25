package Arrays;

public class CheckIfArrayIsSorted {
    // main function
    /*public static void main(String[] args) {
        int arr[] = {20, 23, 23, 45, 78, 88};
        if (arraySortedOrNot(arr, arr.length) != 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    static int arraySortedOrNot(int arr[], int n) {
        if (n == 1 || n == 0)
            return 1;

        // Unsorted pair found (Equal values allowed)
        if (arr[n - 1] < arr[n - 2])
            return 0;

        // Last pair was sorted
        // Keep on checking
        return arraySortedOrNot(arr, n - 1);
    }*/

    // driver code
    public static void main(String[] args) {
        int arr[] = {20, 23, 23, 45, 78, 88};
        if (arraySortedOrNot(arr,arr.length))
            System.out.print("Yes\n");
        else
            System.out.print("No\n");
    }
    static boolean arraySortedOrNot(int arr[], int n) {
        if (n == 0 || n == 1)
            return true;

        for (int i = 1; i < n; i++)
            if (arr[i - 1] > arr[i])
                return false;

        return true;
    }





}
