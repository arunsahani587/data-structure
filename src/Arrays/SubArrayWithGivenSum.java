package Arrays;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int arr[] = { 3, 4, -7, 1, 3, 3, 1, -4 }, sum = 7;
        //naiveSolution(arr, sum);
        subArraySum(arr, arr.length, sum);
    }

    public static void subArraySum(int[] arr, int n, int sum) {
        //cur_sum to keep track of cummulative sum till that point
        int cur_sum = 0;
        int start = 0;
        int end = -1;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            cur_sum = cur_sum + arr[i];
            //check whether cur_sum - sum = 0, if 0 it means
            //the sub array is starting from index 0- so stop
            if (cur_sum - sum == 0) {
                start = 0;
                end = i;
                break;
            }
            //if hashMap already has the value, means we already
            // have subarray with the sum - so stop
            if (hashMap.containsKey(cur_sum - sum)) {
                start = hashMap.get(cur_sum - sum) + 1;
                end = i;
                break;
            }
            //if value is not present then add to hashmap
            hashMap.put(cur_sum, i);

        }
        // if end is -1 : means we have reached end without the sum
        if (end == -1) {
            System.out.println("No subarray with given sum exists");
        } else {
            System.out.println("Sum found between indexes "
                    + start + " to " + end);
        }
    }


    static  void naiveSolution(int arr[], int sum){
        for(int i=0;i<arr.length;i++){
            int currSum = 0;
            for(int j=i;j<arr.length;j++){
                currSum += arr[j];
                if(currSum == sum){
                    System.out.println("sum found between indices "+i+":"+j);
                    System.out.println((IntStream.range(i, j + 1)
                            .mapToObj(k -> arr[k])
                            .collect(Collectors.toList())));
                }
            }
        }
    }
}
