package String;

public class IfStrRotatedBy2Places {
    public static void main(String[] args) {
        System.out.println(checkIfRotated("geeks","eksge"));
    }
    static boolean checkIfRotated(String s1, String s2){
        if(s1.length() != s2.length()){
            return  false;
        }
        String clockWise = "";
        String antiClockWise = "";
        int len = s2.length();

        antiClockWise = antiClockWise + s2.substring(len-2,len)+s2.substring(0, len-2);
        clockWise  = clockWise + s2.substring(2)+ s2.substring(0,2);

        return s1.equals(antiClockWise) || s1.equals(clockWise);
    }

}
