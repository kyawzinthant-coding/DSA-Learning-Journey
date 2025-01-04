package Array;

public class MaxNumberOfThreeProduct {

    public static int ProductOfTriplet (int[] arr) {

        int n = arr.length;

        if ( n < 3 ) {
            return -1;
        }

        int largest = Integer.MIN_VALUE;


        for ( int i = 0 ; i < n-2 ; i++) {
            for ( int j = i + 1 ; j < n-1 ; j ++ ) {
                for ( int k = j + 1 ; k < n ; k++) {
                    int product = arr[i] * arr[j] * arr[k];
                    if ( largest < product) {
                        largest = product;
                    }
                }
            }
        }

        return largest;

    }
    public static void main(String[] args) {


        int[] nums = {1, -4, 3, -6, 7, 0};

       int largest =  ProductOfTriplet(nums);

        System.out.println(largest);
    }
}
