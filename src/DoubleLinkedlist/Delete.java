package DoubleLinkedlist;

public class Delete {


    public static Node DeleteDoublyLinkedList (Node head, int index ) {

        if ( head == null || index < 0 ) {
            System.out.println("Invalid Index");
            return head;
        }

            Node current = head;
            if ( index == 1 ) {
                head = current.next;
                if ( head != null) {
                    head.prev = null;
                }
                return head;
            }

            for ( int i = 0 ; i < index-1; i++ ) {
                head = head.next;
            }

            //removing the node
        if (head.next != null) {
            head.next.prev = head.prev;
        }
        if (head.prev != null) {
            head.prev.next =head.next;
        }

        System.out.println(head.data);
            return head;
    }

    public static void main(String[] args) {

        int[] A = { 1, 2, 3, 4 , 5 };

        Display.createDoubleLinkedlist(A);
        Node DeletedNodeResult =  DeleteDoublyLinkedList(Display.first , 5);
        Display.Display();
//        Display.Display(DeletedNodeResult);
    }
}
