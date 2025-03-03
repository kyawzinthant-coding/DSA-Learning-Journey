package Sorting;

import java.util.Arrays;

public class BucketSort {

    public static void bucketSort(int arr[]) {
        int n = arr.length;
        int max = arr[0];

        for ( int i = 0 ; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        int[] bucket = new int[max+1];

        for ( int num : arr) {
            bucket[num] ++;
        }

        int index = 0;

        for ( int i = 0 ; i < bucket.length ; i++ ) {
            while ( bucket[i] > 0) {
                arr[index] = i;
                index++;
                bucket[i] --;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
            int[] arr ={2,0,2,1,1,0};

            bucketSort(arr);
    }
}
