package Linked_List;

public class Reversing {

   static Node head=null;

    public static void Crea(int[] A) {

        if (A.length == 0) return;

        Node last;
        head = new Node();
        head.data = A[0];
        head.next = null;
        last = head;

        for ( int i = 1 ; i < A.length ; i++) {
            Node newNode = new Node();
            newNode.data = A[i];
            newNode.next = null;
            last.next = newNode;
            last = newNode;
        }

    }

    public static void showLL(Node first) {
        while ( first != null) {
            System.out.print(first.data + " ");
            first = first.next;
        }
        System.out.println();
    }

    public static void reverseLinkedList() {
        Node current = head;
        Node previous = null;
        Node ultraPrevious = null;

        while ( current != null) {
            ultraPrevious = previous;
            previous = current;
            current = current.next;

            previous.next = ultraPrevious;
        }

        head = previous;
    }
    public static void main(String[] args) {

        int[] A = {1,2,3,4,5};
        Crea(A);
        reverseLinkedList();
        showLL(head);
    }
}
