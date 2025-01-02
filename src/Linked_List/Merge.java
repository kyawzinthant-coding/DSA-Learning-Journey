package Linked_List;

class MergeNode {
    int data;
    MergeNode next;
}


public class Merge {

    static MergeNode first = null;
    static MergeNode second = null;

    public static void createMerge ( int[] A, boolean isFirst) {

        if ( A.length == 0 ) return;

        MergeNode last;
        MergeNode head = new MergeNode();
        head.data = A[0];
        head.next = null;
        last = head;

        for ( int i =1 ; i < A.length ; i++ ) {
            MergeNode newNode = new MergeNode();
            newNode.data = A[i];
            newNode.next = null;
            last.next = newNode;
            last = newNode;
        }

        if ( isFirst) {
            first  = head;
        }else {
            second = head;
        }
    }

    private static MergeNode concatenate(MergeNode first, MergeNode second) {
        if ( first == null) return second;
        if ( second == null) return first;

        MergeNode currentHead = first;

        while ( currentHead.next != null) {
            currentHead = currentHead.next;
        }

        currentHead.next = second;
        second = null;

        return first;
    }

    public static  void Display(MergeNode head) {
        while ( head != null) {
            System.out.print(head.data + " ");
            head = head.next ;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        int[] B = {6,7,8,9,10};
        createMerge(A, true);
        createMerge(B,false);
        MergeNode concatenatedHead = concatenate(first, second);
        Display(concatenatedHead);
    }

}


