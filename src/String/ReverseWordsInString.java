package String;

public class ReverseWordsInString {
    public static void main(String[] args) {
        reverseWordsReverseLoop("getting good at coding need lot of practice");
        reverseWordsBySwaping("practice of lot need coding at good getting");
        reverseWordsBySwaping("getting good at coding need lot of practice");
    }

    static void reverseWordsReverseLoop(String str){
        //using split by space and looing reverse
        String[] strArr = str.split(" ");
        String rev = "";
        for(int i=strArr.length - 1; i>=0;i--){
            rev = rev + strArr[i]+" ";
        }
        System.out.println(rev);
    }

    static void reverseWordsBySwaping(String str){
        String[] strArr = str.split(" ");
        int l = strArr.length;
        int j;
        String temp;
        if(l%2 == 0){
             j = l/2; //even length
        }else{
            j = l/2 + 1; // odd length
        }
        while(j <= l - 1){
            temp = strArr[l - j -1];
            strArr[l-j-1] = strArr[j];
            strArr[j] = temp;
            j += 1;
        }
        System.out.println(String.join(" ", strArr));

    }
}
