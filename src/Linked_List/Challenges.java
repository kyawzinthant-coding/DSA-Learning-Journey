package Linked_List;

public class Challenges {


    public static int findMiddleElement( Node head) {
        Node current = head;
        Node nextTwo = head;

        while ( nextTwo != null) {
            nextTwo  = nextTwo.next;
            if ( nextTwo != null) {
                nextTwo = nextTwo.next;
                current = current.next;
            }
        }

        return current.data;
    }

    public static void main(String[] args) {
        int[] A= {1 ,2 ,3, 4,5,6,7};
        Display.create(A);
        int middle = findMiddleElement(Display.first);
        System.out.println(middle);

    }
}
