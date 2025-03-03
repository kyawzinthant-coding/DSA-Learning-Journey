package Sorting;

import java.util.Arrays;

import static Sorting.MergeSort.Merge;

public class RecursiveMergeSort {

    public static int[] RecursiveMergeSort ( int[] arr , int l , int r ) {
        if ( l < r ) {
            int mid = ( l+r)/2;
            RecursiveMergeSort(arr,l,mid);
            RecursiveMergeSort(arr,mid+1 , r);
            Merge(arr,l,mid,r);
        }

        return arr;
    }

    public static void main(String[] args) {
        int A[] = {2, 5, 8, 12, 3, 6, 7, 10};
        RecursiveMergeSort(A,0,A.length-1);

        System.out.println(Arrays.toString(A));
    }

}
