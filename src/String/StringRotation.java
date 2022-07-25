package String;

public class StringRotation {
    // Driver method
   /* public static void main(String[] args) {
        String str1 = "AACD";
        String str2 = "ACDA";
        if (areRotations(str1, str2))
            System.out.println("Strings are rotations of each other");
        else
            System.out.printf("Strings are not rotations of each other");
    }*/
    /* Function checks if passed strings (str1 and str2)
      are rotations of each other */
   /* static boolean areRotations1(String str1, String str2) {
        // There lengths must be same and str2 must be
        // a substring of str1 concatenated with str1.
        return (str1.length() == str2.length()) &&
                ((str1 + str1).indexOf(str2) != -1);
    }*/
    static boolean areRotations1(String s1,String s2){
        if(s1.length()!=s2.length())return false;
        return ((s1+s1).indexOf(s2)>=0);
    }

    public static void main(String args[])
    {   String s1 = "ABCD";String s2="CDAB";
        if(areRotations1(s1,s2)){System.out.println("Strings are rotations of each other");}
        else{System.out.println("Strings are not rotations of each other");}
    }

}
