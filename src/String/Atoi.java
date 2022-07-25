package String;

public class Atoi {
    public static void main(String[] args) {
        System.out.println(myAtoiWithNegativeNumberAndStr("-123"));
        System.out.println(myAtoi("-1234"));
    }

    static int myAtoiWithNegativeNumberAndStr(String str) {
        if (str.length() == 0)
            return -1;
        int sign = 1;
        int res = 0;
        int i = 0;
        if (str.charAt(0) == '-') {
            sign = -1;
            i++;
        }
        for (; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)) == false) {
                return -1;
            }
            res = res * 10 + Character.getNumericValue(str.charAt(i));
        }

        return res * sign;
    }
    static int myAtoi(String str){
        int res=0;
        // Iterate through all characters
        // of input string and update result
        // take ASCII character of corosponding digit and
        // subtract the code from '0' to get numerical
        // value and multiply res by 10 to shuffle
        // digits left to update running total
        // Minus the ASCII code of '0' to get the value of the charAt(i++).
        // ASCII value of '0' is 48
        for (int i = 0; i < str.length(); ++i)
            res = res * 10 + str.charAt(i) - '0';
        return res;
    }
}
