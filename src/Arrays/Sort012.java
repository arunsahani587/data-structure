package Arrays;

public class Sort012 {
   /* public static void main(String argc[]) {

        int arr[] = {0, 1, 1, 0, 1, 2, 1,
                2, 0, 0, 0, 1};
        int n = 12;
        sort012(arr, n);
    }
    public static void sort012(int arr[], int n) {
        int count0 = 0, count1 = 0;
        int count2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                count0++;
            if (arr[i] == 1)
                count1++;
            if (arr[i] == 2)
                count2++;
        }
        for (int i = 0; i < count0; i++)
            arr[i] = 0;
        for (int i = count0; i <(count0 + count1); i++)
            arr[i] = 1;
        for (int i = (count0 + count1);
             i < n; i++)
            arr[i] = 2;
        printArray(arr, n);
    }
    public static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }*/

    static void printArr(int arr[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    static void sortArr(int arr[], int n) {
        int i, cnt0 = 0, cnt1 = 0, cnt2 = 0;
        for (i = 0; i < n; i++) {
            switch (arr[i]) {
                case 0:
                    cnt0++;
                    break;
                case 1:
                    cnt1++;
                    break;
                case 2:
                    cnt2++;
                    break;
            }
        }
        i = 0;
        while (cnt0 > 0) {
            arr[i++] = 0;
            cnt0--;
        }

        while (cnt1 > 0) {
            arr[i++] = 1;
            cnt1--;
        }

        while (cnt2 > 0) {
            arr[i++] = 2;
            cnt2--;
        }
        printArr(arr, n);
    }
    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int n = arr.length;
        sortArr(arr, n);
    }

}
