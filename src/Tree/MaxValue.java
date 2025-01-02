package Tree;

public class MaxValue {


    public static int maxValue ( Node root) {
        if ( root == null) {
            return -1;
        }

        while ( root.Rchild != null) {
            root = root.Rchild;
        }

        return root.data;
    }
    public static void main(String[] args) {
        Node root = BTS.RInsert(BTS.root, 10);
         BTS.RInsert(root, 20);
        BTS.RInsert(root, 80);
         BTS.RInsert(root, 40);
         BTS.RInsert(root, 50);


         int value = maxValue(root);

        System.out.println(5/2);
    }
}
