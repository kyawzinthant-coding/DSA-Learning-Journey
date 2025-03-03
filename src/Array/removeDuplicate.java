package Array;

import java.util.Arrays;

public class removeDuplicate {

    public static int removeDuplicates(int[] nums) {
        int[] temp = new int[nums.length];


        int i = 0;
        int j = 1;

        int index = 0;

        while  (j < nums.length) {
            if (nums[i] == nums[j]) {
                j++;
            }else if ( nums[i] < nums[j]) {
                nums[++index] = nums[j];
                i = j;
                j++;
            }
        }


        System.out.println(index+1);
        System.out.println(Arrays.toString(nums));


//        while  ( i < nums.length) {
//            if (nums[i] == nums[i+1]) {
//                i++;
//            }else if ( nums[i] > nums[i+1]) {
//                temp[index] = nums[i];
//                index++;
//            }
//        }


        return temp.length;
    }
    public static void main(String[] args) {


        int[] arr = {1,1,2};
        removeDuplicates(arr);

    }
}
