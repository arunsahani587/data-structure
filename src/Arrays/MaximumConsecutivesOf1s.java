package Arrays;

public class MaximumConsecutivesOf1s {
    public static void main(String[] args) {
        boolean arr[] = {true, true, false, false,  true, false, true, false,  true, true, true, true};
        System.out.println(getMaxLength(arr, arr.length));
    }
    static int getMaxLength(boolean arr[], int n){
        int count = 0; //intitialize count
        int result = 0; //initialize max
        for (int i = 0; i < n; i++){
            // Reset count when 0 is found
            if (arr[i] == false)
                count = 0;
                // If 1 is found, increment count
                // and update result if count becomes
                // more.
            else{
                count++;//increase count
                result = Math.max(result, count);
            }
        }
        return result;
    }


}
