package Heap;

import java.util.ArrayList;
import java.util.List;

public class HeapADT {

    static List<Integer> heap;

    public HeapADT() {
        heap = new ArrayList<Integer>();
        heap.add(0);
    }

    public static void push(int val) {
        heap.add(val);
        int i = heap.size()-1;

        // percolate up
        while ( i > 1 && heap.get(i) < heap.get(i/2)) {
            int temp = heap.get(i);
            heap.set(i , heap.get(i/2));
            heap.set(i/2, temp);
        }
    }

    public static int pop () {
        if ( heap.size() == 1) {
            return 0;
        }

        if ( heap.size() ==2) {
            return heap.remove(heap.size()-1);
        }

        int root = heap.get(1);

        heap.set(1, heap.remove(heap.size()-1));
        int i = 1;

        while ( 2 * i < heap.size()) {
            if ( 2 * i + 1 < heap.size() &&
                    heap.get(2*i+1) < heap.get(2*i) &&
                    heap.get(i) > heap.get(2*i+1)
            ) {
                int temp = heap.get(i);
                heap.set(i , heap.get(2*i+1));
                heap.set(2*i+1, temp);
                i = 2*i+1;
            }else if ( heap.get(i) > heap.get(2*i)) {
                int temp = heap.get(i);
                heap.set(i , heap.get(2*i));
                heap.set(2*i, temp);
                i = 2* i;
            }else break;
        }

        return  root;


    }
    public static void main(String[] args) {

        HeapADT heapADT = new HeapADT();

        push(1);
        push(3);
        push(2);

        System.out.println(heap);

        System.out.println(pop());
        System.out.println(heap);


    }
}
