package Recursion;

public class SumOfDigitsUsingRecursion {
    public static void main(String[] args) {
        System.out.println(fun(253));
    }
    static int fun(int n) {
        if (n < 10)
            return n;

        return fun(n / 10) + n % 10;
    }


}
