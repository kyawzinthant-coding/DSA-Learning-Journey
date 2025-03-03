package Sorting;

import java.util.Arrays;

public class MergeSort {



    public  static void Merge (int A[] , int low , int mid , int high) {
        int i = low;
        int j = mid+1;
        int k = low;
        int[] B = new int[high+1];

        while ( i <= mid && j <= high) {
            if ( A[i] < A[j]){
                B[k++] = A[i];
                i++;
            }else {
                B[k++] = A[j++];
            }
        }

        while ( i <= mid) {
            B[k++] = A[i++];
        }

        while ( j <= high) {
            B[k++] = A[j++];
        }
        for ( i = low ; i <= high ; i++){
            A[i] = B[i];
        }
    }
    public static void IterativeMergeSort(int[] A ) {
        int p;

        for (  p = 2 ; p < A.length ; p*=2) {
            for ( int i = 0 ; i+p-1 < A.length ; i += p) {
                int low = i;
                int high = i+p-1;
                int mid = ( low + high) / 2;
                Merge(A, low, mid,high);
            }
        }
        if ( p/2 < A.length ) {
            Merge(A,0,p/2-1,A.length-1);
        }

    }

    public static void main(String[] args) {
        int A[] = {2, 5, 8, 12, 3, 6, 7, 10};

        IterativeMergeSort(A);

        System.out.println(Arrays.toString(A));

//        for ( int i = 0 ; i < A.length ; i++) {
//            System.out.print(A[i] + " ");
//        }
    }
}
