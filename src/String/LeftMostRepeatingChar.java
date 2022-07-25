package String;

import java.util.Arrays;

public class LeftMostRepeatingChar {
    public static void main(String[] args) {
        System.out.println(findRepeatFirstN2("bacc"));
        //System.out.println(findLeftMostRepeatingChar("bacc"));
        //System.out.println(findLeftMostRepeatingCharEff1("bab"));
        //System.out.println(findLeftMostRepeatingCharEff2("abacava"));
    }


    static int findRepeatFirstN2(String s) {
        // this is O(N^2) method
        int p = -1, i, j;
        for (i = 0; i < s.length(); i++) {
            for (j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    p = i;
                    break;
                }
            }
            if (p != -1)
                break;
        }
        return p;
    }


    static final int CHAR = 256;
    public static int findLeftMostRepeatingChar(String str){
        int[] count = new int[CHAR];
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++){
            if(count[str.charAt(i)]>1){
                return i;
            }
        }
        return  -1;
    }

    public static int findLeftMostRepeatingCharEff1(String str){
        int[] fIndex = new int[CHAR];
        Arrays.fill(fIndex, -1);
        int res = Integer.MAX_VALUE;

        for(int i=0;i<str.length();i++){
            int fi = fIndex[str.charAt(i)];
            if(fi == -1)
                fIndex[str.charAt(i)] = i;
            else
                res = Math.min(res, fi);
        }
        return (res == Integer.MAX_VALUE ? -1 : res);
    }
    public static int findLeftMostRepeatingCharEff2(String str){
       boolean[] visited = new boolean[CHAR];
       int res = -1;
       for(int i=str.length()-1;i>=0;i--){
            if(visited[str.charAt(i)]){
                res =  i;
            }else{
                visited[str.charAt(i)] = true;
            }
       }
       return  res;
    }
}
