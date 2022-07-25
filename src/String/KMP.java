package String;

public class KMP {

    public static void main(String args[]) {
        String txt = "ababcababaad";
        int[] lps = new int[txt.length()];
        fillLPS(txt, lps);
        for (int i = 0; i < txt.length(); i++) {
            System.out.print(lps[i] + " ");
        }
        String pat = "ababa";
        KMP(pat, txt);
    }

    static void fillLPS(String str, int lps[]) {
        int n = str.length(), len = 0;
        lps[0] = 0;
        int i = 1;
        while (i < n) {
            if (str.charAt(i) == str.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len == 0) {
                    lps[i] = 0;
                    i++;
                } else {
                    len = lps[len - 1];
                }
            }
        }
    }

    static void KMP(String pat, String txt) {
        int N = txt.length();
        int M = pat.length();
        int[] lps = new int[M];
        fillLPS(pat, lps);
        int i = 0, j = 0;
        while (i < N) {
            if (pat.charAt(j) == txt.charAt(i)) {
                i++;
                j++;
            }
            if (j == M) {
                System.out.println("Found pattern at index " + (i - j));
                j = lps[j - 1];
            } else if (i < N && pat.charAt(j) != txt.charAt(i)) {
                if (j == 0)
                    i++;
                else
                    j = lps[j - 1];
            }
        }
    }
    static int longPropPreSuff(String str, int n){
        for(int len=n-1;len>0;len--){
            boolean flag=true;
            for(int i=0;i<len;i++)
                if(str.charAt(i)!=str.charAt(n-len+i))
                    flag=false;

            if(flag==true)
                return len;
        }
        return 0;
    }

   /* static void fillLPS(String str, int lps[]){
        for(int i=0;i<str.length();i++){
            lps[i]=longPropPreSuff(str,i+1);
        }
    }*/


    //0(n) solution
    /*public static void main(String args[]) {
        String txt = "abacabad";
        int[] lps = new int[txt.length()];
        fillLPS(txt, lps);
        for (int i = 0; i < txt.length(); i++) {
            System.out.print(lps[i] + " ");
        }
    }
    static void fillLPS(String str, int lps[]){
        int n=str.length(),len=0;
        lps[0] = 0;
        int i = 1;
        while (i < n) {
            if (str.charAt(i) == str.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len == 0) {
                    lps[i] = 0;
                    i++;
                } else {
                    len = lps[len - 1];
                }
            }
        }
    }*/



}
