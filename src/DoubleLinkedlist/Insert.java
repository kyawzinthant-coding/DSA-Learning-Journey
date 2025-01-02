package DoubleLinkedlist;

public class Insert {

    public static void InsertValue (Node head, int value,int index) {
        Node newNode;
        int i ;

        if ( index < 0 || index > Display.Length(head)){
            return;
        }

        if ( index == 0) {
            newNode = new Node();
            newNode.data = value;
            newNode.prev = null;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }else {
            for ( i = 0 ; i < index-1 ; i++ ) {
                head = head.next;
            }
            newNode = new Node();
            newNode.data = value;

            newNode.prev = head;
            newNode.next = head.next;
            head.next = newNode;
            head.next.prev = newNode;
        }

    }


    public static void main(String[] args) {
        int A[] = {3,5,6,7,1};
        Display.createDoubleLinkedlist(A);
        Display.Display();
        System.out.println("After Inserting");
        InsertValue(Display.first , 3 , 2);
        Display.Display();
    }
}
