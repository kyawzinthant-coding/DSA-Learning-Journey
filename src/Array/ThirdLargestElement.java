package Array;

public class ThirdLargestElement {


    public static  int getThirdLargestElement( int[] arr) {

        int n = arr.length;
        if ( n < 3 ){
            System.out.println("Invalid Input");
            return -1;
        }

        int  first = -1; int second = -1 ; int third = -1;

        for ( int i = 0 ; i < n ; i++ ){
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            }else if ( arr[i] > second && arr[i] < first) {
                third = second;
                second = arr[i];
            }else if ( arr[i] > third && arr[i] < second) {
                third = arr[i];
            }
        }

        return third;
    }
    public static void main(String[] args) {

        int[] arr = {12, 13, 1, 10, 34, 16};

        int thirdLargest = getThirdLargestElement(arr);

        System.out.println(thirdLargest);

    }
}
