package Hashing;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int arr[] = new int[]{15, 16, 27, 27, 28, 15};
        countFreq(arr, arr.length);
    }

    static void countFreq(int arr[], int n) {
        Map<Integer, Integer> hmp = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            if (hmp.containsKey(arr[i]) == true)
                hmp.put(arr[i], hmp.get(arr[i]) + 1);
            else
                hmp.put(arr[i], 1);
        }

        for (Map.Entry<Integer, Integer> itr : hmp.entrySet())
            System.out.println(itr.getKey() + " " + itr.getValue());
    }
}
