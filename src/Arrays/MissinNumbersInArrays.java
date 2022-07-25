package Arrays;

public class MissinNumbersInArrays {
    public static void main(String args[]) {
        int a[] = {1, 2, 4, 5, 6};
        System.out.println(getMissingNoWithOverflow(a, 5));
        System.out.println(getMissingNoWithoutOverflow(a, 5));
    }
    static int getMissingNoWithOverflow(int a[], int n) {
        int i, total;
        total = (n + 1) * (n + 2) / 2;
        for (i = 0; i < n; i++)
            total -= a[i];
        return total;
    }


    static int getMissingNoWithoutOverflow(int a[], int n) {
        int total = 1;
        for (int i = 2; i <= (n + 1); i++) {
            total += i;
            total -= a[i - 2];
        }
        return total;
    }




}
