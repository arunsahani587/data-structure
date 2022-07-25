package String;

public class PermutationOfString {
    public static void main(String[] args) {
        permutations("ABC", 0, "ABC".length() - 1);
    }

    static void permutations(String str, int start, int end) {
        if (start == end) {
            System.out.println(str);
        } else {
            for (int i = start; i <= end; i++) {
                str = swap(str, start, i);
                permutations(str, start + 1, end);
                str = swap(str, start, i);
            }
        }
    }
    static String swap(String str, int i, int j) {
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
