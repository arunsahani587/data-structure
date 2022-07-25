package Arrays;

public class LeadersInArray {
   /* public static void main(String[] args) {
        int arr[] = new int[]{16, 17, 4, 3, 5, 2};
        printLeaders(arr, arr.length);
    }
    static void printLeaders(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            int j;
            for (j = i + 1; j < size; j++) {
                if (arr[i] < arr[j])
                    break;
            }
            if (j == size) // the loop didn't break
                System.out.print(arr[i] + " ");
        }
    }*/

    public static void main(String[] args) {
        int arr[] = new int[]{16, 17, 4, 3, 5, 2};
        printLeaders(arr, arr.length);
    }
    static void printLeaders(int arr[], int size) {
        int max_from_right = arr[size - 1];
        /* Rightmost element is always leader */
        System.out.print(max_from_right + " ");
        for (int i = size - 2; i >= 0; i--) {
            if (max_from_right <= arr[i]) {
                max_from_right = arr[i];
                System.out.print(max_from_right + " ");
            }
        }
    }



}
