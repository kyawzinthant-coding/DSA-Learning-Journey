package Heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stone {

    static List<Integer> heap;

    public static void heapify ( int[] arr) {

        heap = new ArrayList<Integer>();
        heap.add(0);
        heap.addAll(Arrays.stream(arr).boxed().collect(Collectors.toList()));


        int current = ( heap.size()-1)/2;

        while ( current > 0 ) {
            heapifyDown(current);
            current--;
        }
    }

    public static void heapifyDown(int i) {

            while ( i <= ( heap.size()-1)/2) {
                int left = 2 * i;
                int right = 2* i +1 ;
                int largest = i;

                if ( left < heap.size() && heap.get(left) > heap.get(largest) ) {
                    largest = left;
                }

                if ( right < heap.size() && heap.get(right) > heap.get(largest) ) {
                    largest = right;
                }

                if ( largest != i ) {
                    int temp = heap.get(i);
                    heap.set(i , heap.get(largest));
                    heap.set(largest , temp );
                    i = largest;
                }else {
                    break;
                }
            }
    }

    public static int pop () {

        if ( heap.size() == 1 ) {
            return 0;
        }

        if ( heap.size() == 2 ) {
            return heap.remove(heap.size() - 1);
        }

        int root = heap.get(1);

        heap.set(1, heap.remove(heap.size()-1) );

        heapifyDown(1);

        return root;
    }


    public static  int lastStoneWeight(int[] stones) {

        heapify(stones);

        while (heap.size() > 2) {
            int first = pop();
            int second = pop();

            if (first != second) {
                int newStone = Math.abs(first - second);
                heap.add(newStone);
            }
            System.out.println(heap);
        }

        return heap.get(1);

//        return heap.size() == 1 ? heap.get(0) : 0;
//        return 0;
    }
    public static void main(String[] args) {

        int[] st = {2,7,4,1,8,1};

        int result = lastStoneWeight(st);

        System.out.println(result);


    }
}
