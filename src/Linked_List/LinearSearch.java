package Linked_List;

public class LinearSearch {


    public static Node LSearch ( Node p , int key) {
        Node q = null;

        while( p != null) {
         if ( p.data == key) {
                q.next = p.next;
                p.next =  Display.first;
                Display.first = p;
                return p;
         }
         q = p;
         p = p.next;
        }
        return null;
    }

    public static void main(String[] args) {
        int[] A  = {3,5,7,10,25,8,32,2};

        Display.create(A);

        Node result = LSearch(Display.first , 8);
        LSearch(Display.first,25);
        System.out.println(result.data);

        Display.DisplayLL(Display.first);

    }
}
