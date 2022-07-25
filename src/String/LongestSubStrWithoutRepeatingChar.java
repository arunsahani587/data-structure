package String;

import java.util.Arrays;

public class LongestSubStrWithoutRepeatingChar {
    public static void main(String[] args) {
        //System.out.println(longestSubString("geeksforgeeks"));
        System.out.println(longestUniqueSubsttr("geeksforgeeks"));
    }

    static int longestUniqueSubsttr(String str) {
        int res = 0; // result
        // last index of all characters is initialized
        // as -1
        int[] lastIndex = new int[256];
        Arrays.fill(lastIndex, -1);
        // Initialize start of current window
        int i = 0;
        // Move end of current window
        for (int j = 0; j < str.length(); j++) {
            // Find the last index of str[j]
            // Update i (starting index of current window)
            // as maximum of current value of i and last
            // index plus 1
            i = Math.max(i, lastIndex[str.charAt(j)] + 1);
            // Update result if we get a larger window
            res = Math.max(res, j - i + 1);
            // Update last index of j.
            lastIndex[str.charAt(j)] = j;
        }
        return res;
    }

    static int longestSubString(String str){
        int res = 0;
        for(int i = 0; i < str.length(); i++) {
            boolean[] visited = new boolean[256];
            for(int j = i; j < str.length(); j++)  {
                if (visited[str.charAt(j)] == true) {
                    break;
                    // Else update the result if
                    // this window is larger, and mark
                    // current character as visited.
                }else {
                    res = Math.max(res, j - i + 1);
                    visited[str.charAt(j)] = true;
                }
            }
            // Remove the first character of previous
            // window
            visited[str.charAt(i)] = false;
        }
        return res;
    }
}
