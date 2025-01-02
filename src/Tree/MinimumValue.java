package Tree;

import static Tree.BTS.root;

public class MinimumValue {


    public static  int minValue ( Node root ) {

        if ( root == null) {
            return -1;
        }
        Node curr = root;

        while ( curr.Lchild != null) {
            curr = curr.Lchild;
        }

        return curr.data;
    }


    public static void main(String[] args) {

        Node rootNode =   BTS.RInsert(root,10);
        BTS.RInsert(rootNode,5);
        BTS.RInsert(rootNode,20);
        BTS.RInsert(rootNode,8);
        BTS.RInsert(rootNode,30);

        int minvalue = minValue(rootNode);

        System.out.println("min value is " + minvalue);
    }
}
