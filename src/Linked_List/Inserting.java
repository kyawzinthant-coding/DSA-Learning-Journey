package Linked_List;

public class Inserting {

    static Node head;

    public static  void insert (int pos, int x ) {
        Node t;
        Node p;
        if ( pos == 0) {
            t = new Node();
            t.data = x;
            t.next = Display.first;
            Display.first = t;
        }else if ( pos > 0 ) {
            p = Display.first;
            for ( int i = 0 ; i < pos-1 && p != null ; i ++) {
                p = p.next;
            }

            if ( p != null) {
                t = new Node();
                t.data = x;
                t.next = p.next;
                p.next = t;
            }
        }
    }

    public static void insertLast(int x ) {
        Node newNode = new Node();
        newNode.data = x;
        newNode.next = null;

        if ( head == null) {
            head = newNode;
            return;
        }

        Node last = head;
        while (last.next !=null) {
            last = last.next;
        }

        last.next = newNode;

    }

    public static void insertSorted(int value) {
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = null;

        Node current = head;
        Node previous = null;

        if ( head == null) {
            head = newNode;
            return;
        }else {
            while ( current != null && current.data < value) {
                previous = current;
                current = current.next;
            }

            if ( head == current) {
                newNode.next = head;
                head = newNode;
            }else {
                newNode.next = previous.next;
                previous.next = newNode;
            }
        }

    }

    public static int count() {
        Node current = head;
        int count = 0;
        while ( current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    public static int Delete( int index) {
        if (index < 1 || index > count()) {
            return -1;
        }

        Node current = head;
        Node previous = null;
        int deletedValue = -1;

        if (index == 1) {
            deletedValue = head.data;
            head = head.next;
            return deletedValue;
        } else {
            for ( int i = 0 ; i < index -1 ; i++) {
                previous = current;
                current = current.next;
            }
            deletedValue = current.data;
            previous.next = current.next;
            return deletedValue;
        }
    }

    public static void main(String[] args) {
        int[] A = { 2, 3 ,4 ,5, 6,};

        insertLast(1);
        insertLast(2);
        insertLast(5);
        insertLast(8);

        insertSorted(3);

        System.out.print("Deleted value " + Delete(3));
        System.out.println();
        Display.DisplayLL(head);
    }
}
