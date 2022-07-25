package Arrays;

public class LastIndexCharInString {
   /* public static void main(String[] args) {
        String str = "geeksforgeeks";
        Character x = 'e';
        int index = findLastIndex(str, x);
        if (index == -1)
            System.out.println("Character not found");
        else
            System.out.println("Last index is " + index);
    }
    static int findLastIndex(String str, Character x) {
        int index = -1;
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == x)
                index = i;
        return index;
    }*/
   // Driver code
   public static void main(String[] args) {
       String str = "geeksforgeeks";
       Character x = 'e';
       int index = findLastIndex(str, x);
       if (index == -1)
           System.out.println("Character not found");
       else
           System.out.println("Last index is " + index);
   }

    static int findLastIndex(String str, Character x) {
        // Traverse from right
        for (int i = str.length() - 1; i >= 0; i--)
            if (str.charAt(i) == x)
                return i;

        return -1;
    }


}
