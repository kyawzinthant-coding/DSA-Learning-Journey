package Linked_List;

public class Sorting {

    static  Node head = null;
    public static void createLinkedlist ( int[] A ) {
        if ( A.length == 0 ) return;

        Node last;
        head = new Node();
        head.data = A[0];
        head.next = null;
        last = head;

        for ( int i = 1 ; i < A.length ; i++ ) {
            Node newNode = new Node();
            newNode.data = A[i];
            newNode.next = null;
            last.next = newNode;
            last = newNode;
        }
    }

    public static void DisplayLink(Node head) {
        while ( head != null) {
            System.out.print(head.data + " " );
            head = head.next;
        }
        System.out.println();
    }

    public static boolean LinkedListSorted() {
        int x = Integer.MIN_VALUE;
        Node current  = head;
        while ( current != null) {
            if ( current.data < x ) {
                return false;
            }else {
                x = current.data;
                current = current.next;
            }
        }
        return true;
    }

    public static void removeDuplicate() {
        Node current  = head;
        Node nextNode = current.next;

        while ( nextNode != null) {
            if (current.data != nextNode.data) {
                current = nextNode;
                nextNode = nextNode.next;
            }else{
                current.next = nextNode.next;
                nextNode = current.next;
            }
        }
    }
    public static void main(String[] args) {

        int[] A = {1,3,3,4,5,6,7};
        createLinkedlist(A);

        removeDuplicate();
        DisplayLink(head);
    }
}
