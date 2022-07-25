package String;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverString("I love coding"));
    }

    static String reverString(String str){
        String[] arr = str.split(" ");
        String revStr = "";
        for(int i=arr.length-1; i>=0;i--){
            revStr = revStr+arr[i]+" ";
        }
        return revStr;
    }
}
