package SlidingWindow;


// given an array of integers find the maximum sum of a contiguous subarray
public class ConstandWindow {

    public static int constandWindow(int[] arr , int k) {
        int maxSum = 0 ;
        int sum = 0;
        int L = 0 ;

        for (int R = 0 ; R < k ; R++) {
            sum += arr[R];
        }

        maxSum = sum;

        for ( int R = 0 ; R < arr.length; R++) {
            sum = sum - arr[L] + arr[R];
            L++;
            maxSum = Math.max( maxSum,sum);
        }


        return maxSum;

    }
    public static void main(String[] args) {

        int[] arr = {-1,2,3,3,4,5,-1};
        int k = 4;

        System.out.println(constandWindow(arr,k));



    }
}
