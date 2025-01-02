package DoubleLinkedlist;

class Node<T> {
    Node<T> prev;
    T data;
    Node<T> next;
}

public class Display {

    static Node first = null;

    public static void createDoubleLinkedlist (int[] array) {
        if ( array == null || array.length == 0) {
            return;
        }

        first = new Node<>();
        first.data = array[0];
        Node<Integer>  current = first;

        for ( int i =1  ; i < array.length ; i++) {
            Node<Integer> newNode = new Node<>();
            newNode.data = array[i];
            current.next = newNode;
            newNode.prev = current;
            current = newNode;
        }

    }

    public static void Display() {
        Node<Integer> current = first;
        while ( current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }


    public static void Display( Node node) {
        Node<Integer> current =node;
        while ( current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static int Length ( Node head) {
        Node current = head;
        int len  = 0;

        while ( current != null) {
            len++;
            current = current.next;
        }

        return len;
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6};
        createDoubleLinkedlist(A);
        Display();
        System.out.print("Length of the double linked list is "  + Length(first));
    }
}
