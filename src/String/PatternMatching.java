package String;

public class PatternMatching {
    public static void main(String[] args) {
        //matchPatternNaive("ABCABCDABCD", "ABCD");
        matchPatternNaiveImprovedForDistinctChar("ABCEABEFABCD", "ABCD");
    }

    static void matchPatternNaiveImprovedForDistinctChar(String txt, String pat){
        int n = txt.length();
        int m = pat.length();

        for(int i=0;i<=n-m;){
            int j;
            for(j = 0; j<m;j++){
                if(pat.charAt(j) != txt.charAt(i+j)){
                    break;
                }
            }
            if(j==m){
                System.out.println("match at "+i);
            }
            if(j == 0){
                i++;
            }else{
                i = i+j;
            }

        }
    }

    static void matchPatternNaive(String txt, String pat) {
        int m = pat.length();
        int n = txt.length();
        /* A loop to slide pat one by one */
        for (int i = 0; i <= n - m; i++) {
            int j;
            /* For current index i, check for pattern match */
            for (j = 0; j < m; j++){
                if (txt.charAt(i + j) != pat.charAt(j)){
                    break;
                }
            }
            if (j == m){
                System.out.println("Pattern found at index " + i);
            }
        }
    }


}
