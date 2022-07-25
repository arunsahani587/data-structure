package String;

import java.util.LinkedHashSet;

public class RecursiveRemoveAdjDup {
    public static void main(String[] args) {
        System.out.println(removeAdjDup("DBAABDAB", "DBAABDAB".length()));
    }
    // Function to in-place remove all adjacent duplicates from
    // the given String
    public static String removeAdjDup(String str, int n) {
        char[] chars = str.toCharArray();
        // k maintains the index of next free location in the result
        // and i maintains the current index in the String
        int i, k = 0;
        int len = chars.length;
        // start from second character
        for (i = 1; i < len; i++) {
            // if current character is not same as the
            // previous character, add it to result
            if (chars[i - 1] != chars[i]) {
                chars[k++] = chars[i - 1];
            } else {
                // remove adjacent duplicates
                while (i < len && chars[i - 1] == chars[i]) {
                    i++;
                }
            }
        }
        // Add last character to result
        chars[k++] = chars[i - 1];
        System.out.println(new String(chars).substring(0, k));
        // construct the String with first k chars
        str = new String(chars).substring(0, k);
        // start again if any duplicate is removed
        if (k != n) {
            return removeAdjDup(str, k); // Shlemiel Painter's Algorithm
        }
        // if the algorithm didn't change the input String, that means
        // all the adjacent duplicates are removed
        return str;
    }

    String removeDups(String S) {
        LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();
        for(int i=0;i<S.length();i++){
            lhs.add(S.charAt(i));
        }
        String str = "";
        for(Character c : lhs){
            str = str + c;
        }
        return str;
    }
}
