package String;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] input = {"geeksforgeeks", "geeks", "geek", "geezer"};
        System.out.println("The longest Common Prefix is : " + longestCommonPrefixUsingSorting(input));
        System.out.println("The longest Common Prefix is : " + longestCommonPrefixWordByWordMatching(input));
    }

    // A Function that returns the longest common prefix
    // from the array of strings
    static String longestCommonPrefixWordByWordMatching(String arr[]) {
        int n = arr.length;
        String prefix = arr[0];
        for (int i = 1; i <= n - 1; i++) {
            prefix = commonPrefixUtil(prefix, arr[i]);
        }
        return (prefix);
    }
    // A Utility Function to find the common prefix between
    // strings- str1 and str2
        static String commonPrefixUtil(String str1, String str2) {
            String result = "";
            int n1 = str1.length(), n2 = str2.length();
            // Compare str1 and str2
            for (int i = 0, j = 0; i <= n1 - 1 && j <= n2 - 1; i++, j++) {
                if (str1.charAt(i) != str2.charAt(j)) {
                    break;
                }
                result += str1.charAt(i);
            }
            return (result);
        }


    public static String longestCommonPrefixUsingSorting(String[] a) {
        int size = a.length;
        /* if size is 0, return empty string */
        if (size == 0)
            return "";
        if (size == 1)
            return a[0];
        /* sort the array of strings */
        Arrays.sort(a);
        /* find the minimum length from first and last string */
        int end = Math.min(a[0].length(), a[size - 1].length());
        /* find the common prefix between the first and
           last string */
        int i = 0;
        while (i < end && a[0].charAt(i) == a[size - 1].charAt(i))
            i++;
        String pre = a[0].substring(0, i);
        return pre;
    }
}
