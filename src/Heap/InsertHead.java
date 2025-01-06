package Heap;

public class InsertHead {

    public static void insert ( int[] A , int n ) {
        int temp = A[n];
        int i = n ;

        while ( i > 1 && temp > A[i/2]) {
            A[i] = A[i/2];
            i = i /2;
        }

        A[i] = temp;


    }
    public static void main(String[] args) {
        int[] arr = {0,10,20,30,25,5,40,35};

        for (int i =2 ; i < arr.length ; i++) {
            insert(arr,i);
        }

        for ( int nums : arr) {
            System.out.print(nums + " ");
        }


    }
}
