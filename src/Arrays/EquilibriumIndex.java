package Arrays;

public class EquilibriumIndex {
    // Driver code
   /* public static void main(String[] args) {
        EquilibriumIndex equi = new EquilibriumIndex();
        int arr[] = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(equi.equilibrium(arr, arr.length));
    }
    int equilibrium(int arr[], int n) {
        int i, j;
        int leftsum, rightsum;
        for (i = 0; i < n; ++i) {
            leftsum = 0;
            for (j = 0; j < i; j++)
                leftsum += arr[j];
            rightsum = 0;
            for (j = i + 1; j < n; j++)
                rightsum += arr[j];
            if (leftsum == rightsum)
                return i;
        }
        return -1;
    }*/

    // Driver code
    public static void main(String[] args) {
        EquilibriumIndex equi = new EquilibriumIndex();
        int arr[] = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println("First equilibrium index is " + equi.equilibrium(arr, arr.length));
    }
    int equilibrium(int arr[], int n) {
        int sum = 0; // initialize sum of whole array
        int leftsum = 0; // initialize leftsum
        for (int i = 0; i < n; ++i)
            sum += arr[i];
        for (int i = 0; i < n; ++i) {
            sum -= arr[i]; // sum is now right sum for index i

            if (leftsum == sum)
                return i;

            leftsum += arr[i];
        }
        return -1;
    }


}
