package String;

import java.util.LinkedHashSet;

public class RemoveDups {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("geeksforgeeks"));
    }

    static String removeDuplicates(String s) {
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
        for (int i = 0; i < s.length(); i++) {
            lhs.add(s.charAt(i));
        }
        String s1 = "";
        for (Character c : lhs) {
            s1 += c;
        }
        return s1;
    }
    // Function to make the string unique
    public static String unique(String s) {
        String str = new String();
        int len = s.length();
        // loop to traverse the string and
        // check for repeating chars using
        // IndexOf() method in Java
        for (int i = 0; i < len; i++){
            // character at i'th index of s
            char c = s.charAt(i);
            // if c is present in str, it returns
            // the index of c, else it returns -1
            if (str.indexOf(c) < 0){
                // adding c to str if -1 is returned
                str += c;
            }
        }
        return str;
    }
}
