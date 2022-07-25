package String;

import java.util.Arrays;

public class LeftMostNonRepeatingChar {
    public static void main(String[] args) {
        //System.out.println(findLeftMostNonRepeatingCharWithtwoForLoop("zgeeksforgeeks"));
        //System.out.println(findLeftMostNonRepeatingChar("geeksforgeeks"));
        System.out.println(nonRep("geeksforgeeks"));
    }
    public static int findLeftMostNonRepeatingCharWithtwoForLoop(String str){

        for(int i = 0; i<str.length();i++){
            boolean match = false;
            for(int j = i+1;j<str.length();j++){
                if(i!=j && str.charAt(i) == str.charAt(j)){
                    match = true;
                    break;
                }
            }
            if(!match){
                return  i;
            }
        }
        return  -1;
    }
    static final int CHAR = 256;
    public static int findLeftMostNonRepeatingChar(String str){
        int[] count = new int[CHAR];
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++){
            if(count[str.charAt(i)] == 1){
                return  i;
            }
        }
        return -1;
    }

    static int nonRep(String str) {
        int[] fI = new int[CHAR];
        Arrays.fill(fI, -1);

        for (int i = 0; i < str.length(); i++) {
            if (fI[str.charAt(i)] == -1)
                fI[str.charAt(i)] = i;
            else
                fI[str.charAt(i)] = -2;
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < CHAR; i++) {
            if (fI[i] >= 0) res = Math.min(res, fI[i]);
        }
        return (res == Integer.MAX_VALUE) ? -1 : res;
    }
}
