import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LMissingInteger {


    public  static int largestInteger(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        if (nums.length < k) {
            return -1;
        }

        for (int i = 0; i <= nums.length - k; i++) {

            // to count frequency
            Set<Integer> count = new HashSet<>();

            for (int j = i; j < i + k; j++) {
                count.add(nums[j]);
            }

            //to update the hashmap

            for (int num : count) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        int largest = -1;


        for (Map.Entry<Integer, Integer> en : map.entrySet()) {
            if (en.getValue() == 1 && en.getKey() >= largest) {
                largest = en.getKey();
            }
        }


        return largest;

    }

    public static void main(String[] args) {
        int[] arr = {3,9,2,1,7}; int k = 3;

        System.out.println(largestInteger(arr,k));
    }
}


