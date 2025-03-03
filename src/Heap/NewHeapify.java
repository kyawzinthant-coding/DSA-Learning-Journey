package Heap;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//left child  = heap [2 * i ]
//right child = heap [2*i+1]
// parent = heap[ i / 2 ];
public class NewHeapify {

    List<Integer> heap;

    public NewHeapify() {
        heap = new ArrayList<>();
        heap.add(0);
    }

    public void minHeapify ( ArrayList<Integer> arr) {

        heap.addAll(arr);

        int current = ( heap.size()-1 )/2;

        while (current > 0) {

            int i = current;

            while ( i <= ( heap.size()-1)/2 ) {
                int left = 2 * i ;
                int right = 2  * i + 1;
                int smallest = i;

                if ( left < heap.size() && heap.get(left) < heap.get(smallest)) {
                    smallest = left;
                }

                if ( right < heap.size() && heap.get(right) < heap.get(smallest)) {
                    smallest = right;
                }

                if ( smallest != i) {
                    int temp = heap.get(i);
                    heap.set(i, heap.get(smallest));
                    heap.set(smallest, temp);
                    i = smallest;
                }else {
                    break;
                }
            }
            current--;
        }
    }

    public void maxHeap ( ArrayList<Integer> arr) {
        heap.addAll(arr);

        int current = ( heap.size()-1)/2;

        while ( current > 0) {
            int i = current;
            while ( i <= ( heap.size()-1)/2) {
                int left = 2 * i;
                int right = 2 * i +1;
                int highest = i;

                if (left < heap.size() && heap.get(left) > heap.get(highest)) {
                    highest = left;
                }

                if ( right < heap.size() && heap.get(right) >  heap.get(highest) ) {
                    highest = right;
                }

                if (highest != i) {
                    int temp = heap.get(i);
                    heap.set(i , heap.get(highest));
                    heap.set(highest, temp);
                    i = highest;
                }else {
                    break;
                }
            }
            current--;
        }
    }

    public void maxHea () {
        int current = ( heap.size()-1)/2;

        while ( current > 0) {
            int i = current;
            while ( i <= ( heap.size()-1)/2) {
                int left = 2 * i;
                int right = 2 * i +1;
                int highest = i;

                if (left < heap.size() && heap.get(left) > heap.get(highest)) {
                    highest = left;
                }

                if ( right < heap.size() && heap.get(right) >  heap.get(highest) ) {
                    highest = right;
                }

                if (highest != i) {
                    int temp = heap.get(i);
                    heap.set(i , heap.get(highest));
                    heap.set(highest, temp);
                    i = highest;
                }else {
                    break;
                }
            }
            current--;
        }
    }

    public int pop () {
        if ( heap.size() == 1) {
            return 0;
        }

        if ( heap.size() == 2) {
            return heap.remove(heap.size()-1);
        }

        int root = heap.get(1);

        heap.set(1, heap.get(heap.size()-1));

        maxHea();
        return root;
    }

    public static void main(String[] args) {
        NewHeapify minheap = new NewHeapify();
        NewHeapify maxHeap = new NewHeapify();

        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(10, 20, 15, 30, 40, 5, 1));

        minheap.minHeapify(arrayList);
        maxHeap.maxHeap(arrayList);
//
//        System.out.println("finished");
//        System.out.println(maxHeap.heap);

        for ( int i = 0 ; i < maxHeap.heap.size()-1 ; i++) {

            System.out.print(maxHeap.pop() + " ");
        }

//        System.out.println(maxHeap.heap);
    }
}
