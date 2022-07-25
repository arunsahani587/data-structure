package Hashing;

public class UncommonCharacters {
    // Driver code
    public static void main(String[] args) {
        findAndPrintUncommonChars("characters", "alphabets");
    }
    // size of the hash table
    static int MAX_CHAR = 26;
    static void findAndPrintUncommonChars(String str1, String str2) {
        // mark presence of each character as 0
        // in the hash table 'present[]'
        int present[] = new int[MAX_CHAR];
        for (int i = 0; i < MAX_CHAR; i++) {
            present[i] = 0;
        }
        // for each character of str1, mark its
        // presence as 1 in 'present[]'
        for (int i = 0; i < str1.length(); i++) {
            present[str1.charAt(i) - 'a'] = 1;
        }
        // for each character of str2
        for (int i = 0; i < str2.length(); i++) {
            // if a character of str2 is also present
            // in str1, then mark its presence as -1
            if (present[str2.charAt(i) - 'a'] == 1
                    || present[str2.charAt(i) - 'a'] == -1) {
                present[str2.charAt(i) - 'a'] = -1;
            }
            // else mark its presence as 2
            else {
                present[str2.charAt(i) - 'a'] = 2;
            }
        }

        // print all the uncommon characters
        for (int i = 0; i < MAX_CHAR; i++) {
            if (present[i] == 1 || present[i] == 2) {
                System.out.print((char) (i + 'a') + " ");
            }
        }
    }


}
