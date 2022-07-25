package String;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //System.out.println(isAnagramSortCompare("aaaccb", "bccaaa"));
        //System.out.println(isAnagram("aaaccb", "bccaaa"));
        System.out.println(isAnagramWithCount0("aaaccb", "bccaaa"));
    }

    public static boolean isAnagramSortCompare(String str1, String str2){
        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();
        Arrays.sort(charArr1);
        Arrays.sort(charArr2);
        String s1 = new String(charArr1);
        String s2 = new String(charArr2);
        return  s1.equals(s2);
    }


    static final int CHAR = 256;
    public static boolean isAnagram(String str1, String str2) {
        if(str1.length() != str2.length())
            return  false;
        int [] count = new int[CHAR];
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for (int i = 0; i < CHAR; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagramWithCount0(String str1, String str2){
        if(str1.length() != str2.length())
            return false;
        int count =0;
        for(int i =0;i<str1.length();i++){
            count = count + str1.charAt(i);
        }
        for(int i=0;i<str2.length();i++){
            count = count - str2.charAt(i);
        }
        return (count == 0);
    }
}
