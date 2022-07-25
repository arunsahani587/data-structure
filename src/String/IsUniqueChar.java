package String;

import java.util.Arrays;

public class IsUniqueChar {
    public static void main(String[] args) {
        //System.out.println(isUniqueChar("arun"));
        //System.out.println(isUniqueChar("arun sahani"));
        //System.out.println(uniqueCharacters("abb"));
        System.out.println(uniqueCharacterss("aruna"));
    }
    public  static boolean uniqueCharacterss(String str) {
        char[] charArr = str.toCharArray();
        Arrays.sort(charArr);
        for(int i=0;i<charArr.length-1;i++){
            if(charArr[i] != charArr[i+1])
                continue;
            else
                return false;
        }
        return  true;
    }


    public  static boolean isUniqueChar(String str){
        if(str.length() > 128) return false;
        boolean[] char_set = new boolean[128];
        for (int i=0; i < str.length(); i++){
            int val = str.charAt(i);// int type gives ASCII value ex: a = 97
            char val1 = str.charAt(i); //char type give the character at i position
            if(char_set[val]){
                return false;
            }
            char_set[val] = true;
        }
        return  true;
    }
    //O(n), O(1)


    public  static boolean uniqueCharacters(String str) {
        // Assuming string can have characters a-z
        // this has 32 bits set to 0
        //In ASCII, val = str.charAt(i) - 'a' = 116 - 97 = 19
        //What about 1 << val ?
        // 1        == 00000000000000000000000000000001
        //  1 << 19  == 00000000000010000000000000000000
        //checker |= (1 << val) means checker = checker | (1 << val)
        //so checker = 00000000000000000000000000000000 | 00000000000010000000000000000000
        // checker == 524288 (00000000000010000000000000000000)
        //  00000000000010000000000000000000 is binary
        //  524288  is decimal
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int bitAtIndex = str.charAt(i) - 'a';
            // if that bit is already set in checker,
            // return false
            if ((checker & (1 << bitAtIndex)) > 0)
                return false;
            // otherwise update and continue by
            // setting that bit in the checker
            checker = checker | (1 << bitAtIndex);
        }
        // no duplicates encountered, return true
        return true;
    }


}
