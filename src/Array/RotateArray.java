package Array;

import java.util.Arrays;

public class RotateArray {

    public static void rotate ( int[] nums , int k) {

        int[] temp = new int[nums.length];

        int index = nums.length-k;

        int j = 0;

        for (int i = index ; i < nums.length ; i++) {
            temp[j++] = nums[i];
        }

        for ( int i = 0 ; i < index ; i++) {
            temp[j++] = nums[i];
        }

        for ( int v = 0 ; v < nums.length ; v++) {
            nums[v] = temp[v];
        }

        System.out.println(Arrays.toString(temp));
    }
    public static void main(String[] args) {
        int[] nums = {1,2};
        int k = 3;

        rotate(nums,k);

        System.out.println(Arrays.toString(nums));
    }
}
