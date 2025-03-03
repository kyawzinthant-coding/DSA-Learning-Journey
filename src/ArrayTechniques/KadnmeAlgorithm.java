package ArrayTechniques;

// Find a non-empty subarray with the largest sum
public class KadnmeAlgorithm {

    public static int bruteForce(int[] array){

        int maxSum = array[0];

        for ( int i = 0 ; i < array.length ; i++ ){
            int currentSum = 0;
            for ( int j  = i ; j < array.length ; j++ ){
                currentSum += array[j];
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        System.out.println(maxSum);
        return maxSum;
    }

    public static void Kadane(int[] array) {
        int maxSum = array[0];
        int currentSum = 0;

        for ( int i = 0 ; i < array.length ; i++) {
            currentSum = Math.max(currentSum , 0);
            currentSum += array[i];
            maxSum = Math.max(maxSum,currentSum);
        }

        System.out.println(maxSum);
    }

    public static int[] KadameSlidingWindow (int[] arr) {
        int maxSum = arr[0];
        int currentSum = 0;
        int MaxL = 0 ,  MaxR= 0;
        int L = 0;

        for ( int R = 0 ; R < arr.length ; R++) {
            if ( currentSum < 0 ) {
                currentSum = 0;
                L = R;
            }
            currentSum += arr[R];
            if ( currentSum > maxSum) {
                maxSum = currentSum;
                MaxL = L;
                 MaxR= R;
            }
        }
        System.out.println(MaxL + " " + MaxR);
        return new int[] { MaxL , MaxR};
    }
    public static void main(String[] args) {

        int[] arr = {-4,-1,2,-7,3,4};

        bruteForce(arr);
        Kadane(arr);
        KadameSlidingWindow(arr);

    }
}
