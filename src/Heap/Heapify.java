package Heap;

public class Heapify {

    public static void Heapify(int[] arr , int n ){
        for ( int i = (n/2)-1 ; i >=0 ; i--) {
            int j = 2 * i +1 ;

            while ( j < n-1) {
                if ( arr[j] < arr[j+1]){
                    j = j+1;
                }

                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i = j ;
                    j = 2 * i + 1;
                }else {
                    break;
                }
            }

        }
    }
    public static void main(String[] args) {

        int[] arr = {5,10,30,20,35,40,15};
        Heapify(arr,arr.length);

        System.out.println(arr.length);

        for ( int nums : arr) {
            System.out.print(nums + " ");
        }
    }
}
