package Array;

public class moveAllZeroToRight {

    public static void main(String[] args) {

        int[] arr = {1,2,0,4,3,0,5,0};

        int j = 0 ;

        for ( int i = 0 ; i < arr.length ; i ++) {

            if ( arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }

        while ( j < arr.length){
            arr[j] = 0;
            j++;
        }

        for (int num : arr ) {
            System.out.print(num + " ");
        }
    }
}
