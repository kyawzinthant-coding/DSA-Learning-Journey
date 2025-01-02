package Linked_List;

class Node {
    int data;
    Node next;
}

public class Display {

    static Node first = null;

   public static void create(int[] A) {
        if (A.length == 0) return;

        Node last;
        first = new Node();
        first.data = A[0];
        first.next = null;
        last = first;

        for ( int i = 1 ; i < A.length ; i++) {
            Node t = new Node();
            t.data = A[i];
            t.next = null;
            last.next = t;
            last = t;
        }

    }


    public static int Max ( Node p ) {
       int m = -32342;
       while (p != null) {
           if ( p.data > m) {
               m = p.data;
           }
           p = p.next;
       }
       return m;
    }

    public static void DisplayLL(Node p) {
       while( p != null) {
           System.out.print(p.data + " ");
           p = p.next;
       }
        System.out.println();
    }

    public static void RDisplayLL(Node p) {
       if(p != null) {
           RDisplayLL(p.next);
           System.out.print(p.data + " ");
       }
    }

    public static int count( Node p ) {
       int length = 0;
       while(p != null) {
           length++;
           p = p.next;
       }

       return length;
    }


    public static int RCount(Node p) {
       if ( p != null) {
           return RCount(p.next) + 1;
       }else  {
           return 0;
        }
    }

    public static int sum ( Node p ) {
       int s = 0;

       while( p != null) {
           s += p.data;
           p = p.next;
       }

       return s;
    }

    public static int Rsum(Node p) {
       if ( p == null) {
           return 0;
       }else {
           return Rsum(p.next) + p.data;
       }
    }

    public static void main(String[] args) {
        int[] A = {3,4,7,10};
        create(A);
        int MaxValue = Max(first);
        System.out.println(MaxValue);

    }
}
