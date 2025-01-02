package Tree;

public class CountingNode {

    int count (Node root) {
        int x,y = 0 ;
        if ( root != null) {
            x = count(root.Lchild);
            y = count(root.Rchild);
            return x + y + 1;
        }

        return 0;
    }
}
