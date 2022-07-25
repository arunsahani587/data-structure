package String;

public class LongestPalindronicString {
    // Driver program to test above functions
    public static void main(String[] args) {

        String str = "forgeeksskeegfor";
        System.out.println("Length is: " + longestPalSubstr(str));
        System.out.println(longestPanlindronicString("forgeeksskeegfor"));
        System.out.println(manachers("forgeeksskeegfor"));
    }
    // A utility function to print
    // a substring str[low..high]
    static void printSubStr(
            String str, int low, int high) {
        System.out.println(
                str.substring(
                        low, high + 1));
    }
    // This function prints the longest
    // palindrome substring of str[].
    // It also returns the length of the
    // longest palindrome
    static int longestPalSubstr(String str) {
        // get length of input string
        int n = str.length();
        // table[i][j] will be false if
        // substring str[i..j] is not palindrome.
        // Else table[i][j] will be true
        boolean table[][] = new boolean[n][n];
        // All substrings of length 1 are palindromes
        int maxLength = 1;
        for (int i = 0; i < n; ++i)
            table[i][i] = true;
        // check for sub-string of length 2.
        int start = 0;
        for (int i = 0; i < n - 1; ++i) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                table[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }
        // Check for lengths greater than 2.
        // k is length of substring
        for (int k = 3; k <= n; ++k) {
            // Fix the starting index
            for (int i = 0; i < n - k + 1; ++i) {
                // Get the ending index of substring from
                // starting index i and length k
                int j = i + k - 1;
                // checking for sub-string from ith index to
                // jth index iff str.charAt(i+1) to
                // str.charAt(j-1) is a palindrome
                if (table[i + 1][j - 1]
                        && str.charAt(i) == str.charAt(j)) {
                    table[i][j] = true;

                    if (k > maxLength) {
                        start = i;
                        maxLength = k;
                    }
                }
            }
        }
        System.out.print("Longest palindrome substring is; ");
        printSubStr(str, start,
                start + maxLength - 1);

        // return length of LPS
        return maxLength;
    }


    //====================================================================

    public static String preProcess(String str) {
        int len = str.length();
        if (len == 0)
            return "^$";
        String s = "^";
        for (int i = 0; i < len; i++)
            s += "#" + str.charAt(i);
        s += "#$";
        return s;
    }

    public static String manachers(String str) {
        char[] s = preProcess(str).toCharArray();
        int N = s.length;
        int[] p = new int[N + 1];
        int id = 0, mx = 0;
        for (int i = 1; i < N - 1; i++) {
            p[i] = mx > i ? Math.min(p[2 * id - i], mx - i) : 0;
            while (s[i + 1 + p[i]] == s[i - 1 - p[i]])
                p[i]++;
            if (i + p[i] > mx) {
                mx = i + p[i];
                id = i;
            }
        }
        /** length of largest palindrome **/
        int maxLen = 0;
        /** position of center of largest palindrome **/
        int centerIndex = 0;
        for (int i = 1; i < N - 1; i++) {
            if (p[i] > maxLen) {
                maxLen = p[i];
                centerIndex = i;
            }
        }
        /** starting index of palindrome **/
        int pos = (centerIndex - 1 - maxLen) / 2;
        return str.substring(pos, pos + maxLen);
    }
    //============================================================================

    //consider every character as center moved towards both the sides
    //from the center
    public static int expandAroundCenters(String s, int i, int j) {
        while (i >= 0 && j < s.length() && (s.charAt(i) == s.charAt(j))) { //comparing the
            i--;
            j++;
        }
        return j - 1 - i;
    }

    static String longestPanlindronicString(String s) {
        if (s != null && s.length() <= 1)
            return s;
        //len1 for odd and len2 for even
        int len = 0, start = 0, end = 0, len1 = 0, len2 = 0;
        for (int i = 0; i < s.length(); i++) {
            len1 = expandAroundCenters(s, i, i); //even
            len2 = expandAroundCenters(s, i, i + 1); //odd
            len = Math.max(len1, len2);
            if (len > end - start) { //start and end index on that particular sub string
                start = i - (len - 1) / 2; //i would be in center so left side is half that we have remove
                end = i + len / 2; // i would be center so right is half that we have to add
            }
        }
        return s.substring(start, end + 1);
    }
}
