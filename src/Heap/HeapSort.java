package Heap;

public class HeapSort {

    // Method to delete the root element from the heap
    public static int deleteFromHeap(int[] A, int n) {
        int root = A[0]; // Save the root value (max element)

        int value = A[0];

        // Replace the root with the last element
        A[0] = A[n - 1];

        // Decrease the size of the heap
//        n--;

        // Heapify to restore max-heap property
        int i = 0; // Start at the root
        int j = 2 * i + 1; // Left child index

        while (j < n) { // While there are children
            // Find the larger child
            if (j + 1 < n && A[j + 1] > A[j]) {
                j = j + 1;
            }

            // If the child is larger than the parent, swap
            if (A[j] > A[i]) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;

                // Move down to the child
                i = j;
                j = 2 * i + 1;
            } else {
                break; // Heap property is restored
            }
        }

        System.out.println("value " + value);
        A[n-1]= value;

        return root; // Return the deleted root value
    }

    public static void main(String[] args) {
        int[] heap = {40, 25, 35, 10, 5, 20, 30}; // Max-Heap

        System.out.println("Original Heap:");
        for (int num : heap) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Delete the root
       for ( int i = heap.length-1 ; i > 0 ; i--) {
           deleteFromHeap(heap,i);
       }



        System.out.println("Heap After Deletion:");
        for (int i = 0; i < heap.length; i++) { // Ignore the last element (reduced heap size)
            System.out.print(heap[i] + " ");
        }


    }
}
