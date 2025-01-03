package Array;

public class SecondLargestElement {

    public static  int getSecondElement ( int[] arr ) {
        int n = arr.length;

        int largest = -1 ; int secondLargest = -1;

        for ( int i = 0 ; i < n ; i++) {
            if ( arr[i] > largest) {
                largest = arr[i];
            }
        }

        for ( int i = 0 ; i < n ; i ++) {
            if ( arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    public static int OnePassSearch ( int [] arr) {
        int n = arr.length;

        int largest = -1; int secondLargest = -1;

        for ( int i = 0 ; i < n ; i ++) {

            if ( arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }else if ( arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }
    public static void main(String[] args) {

        int[] arr = {12, 35, 1, 10, 34, 1};

       int secondLargestElement = getSecondElement(arr);
       int secondlargestElementWithOnePassSearch = OnePassSearch(arr);

        System.out.println(secondLargestElement);
        System.out.println("One pass Search " + secondlargestElementWithOnePassSearch);

    }
}
