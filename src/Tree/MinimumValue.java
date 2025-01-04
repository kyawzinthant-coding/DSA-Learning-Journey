package Tree;

import static Tree.BTS.root;

public class MinimumValue {


    public static  int minValue ( Tree.Node root ) {

        if ( root == null) {
            return -1;
        }
        Tree.Node curr = root;

        while ( curr.Lchild != null) {
            curr = curr.Lchild;
        }

        return curr.data;
    }


    public static void main(String[] args) {

        Tree.Node rootNode =   BTS.RInsert(root,10);
        BTS.RInsert(rootNode,5);
        BTS.RInsert(rootNode,20);
        BTS.RInsert(rootNode,8);
        BTS.RInsert(rootNode,30);

        int minvalue = minValue(rootNode);

        System.out.println("min value is " + minvalue);
    }
}
