package Array;

public class MaxConsecutiveOne {

    public static int maxConsecutive(int[] nums) {
        int maxSize = Integer.MIN_VALUE;
        int count = 0;

        for ( int i = 0 ; i < nums.length ; i++) {
            if (nums[i] == 1) {
                count++;
            }else {
                count = 0;
            }

            if (count > maxSize) {
                maxSize= count;
            }
        }

        System.out.println(maxSize);
        return maxSize;
    }
    public static void main(String[] args) {

        int[] arr = {0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1};

        maxConsecutive(arr);
    }
}
