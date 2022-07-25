package Hashing;

import java.util.HashSet;

public class FindFirstRepeatedCharacter {
    // Driver code
   /* public static void main(String args[]) {
        String s = "abcfdeacf";
        int i = FirstRepeated(s);
        if (i != -1)
            System.out.println("Char = " + s.charAt(i) + "   and Index = " + i);
        else
            System.out.println("No repeated Char");
    }
    static int FirstRepeated(String str) {
        // An integer to store presence/absence
        // of 26 characters using its 32 bits.
        int checker = 0;

        for (int i = 0; i < str.length(); ++i) {
            int val = (str.charAt(i) - 'a');

            // If bit corresponding to current
            // character is already set
            if ((checker & (1 << val)) > 0)
                return i;

            // set bit in checker
            checker |= (1 << val);
        }
        return -1;
    }*/

    //===============================================================
    // Creates an empty hashset
    // Driver method to test above method
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        char[] arr = str.toCharArray();
        System.out.println(firstRepeating(arr));
    }
    static char firstRepeating(char str[]) {
        // Creates an empty hashset
        HashSet<Character> h = new HashSet<>();
        // Traverse the input array from left to right
        for (int i = 0; i <= str.length - 1; i++) {
            char c = str[i];

            // If element is already in hash set, update x
            // and then break
            if (h.contains(c))
                return c;

            else // Else add element to hash set
                h.add(c);
        }
        return '\0';
    }




}
