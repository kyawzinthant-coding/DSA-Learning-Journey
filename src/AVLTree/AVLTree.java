package AVLTree;


class NodeTree {

    NodeTree lchild;
    int data;
    int height;
    NodeTree rchild;

    public NodeTree(int data){
        this.data = data;
        this.lchild= null;
        this.rchild = null;
    }


}

public class AVLTree {


   static NodeTree root;
    public static int NodeHeight(NodeTree p) {
        int hl = 0, hr = 0;

        if (p != null) {
            hl = (p.lchild != null) ? p.lchild.height : 0;
            hr = (p.rchild != null) ? p.rchild.height : 0;
        }

        return Math.max(hl, hr) + 1;
    }


    public static int BalanceFactor ( NodeTree p ) {
        int hl = 0, hr = 0;

        if (p != null) {
            hl = (p.lchild != null) ? p.lchild.height : 0;
            hr = (p.rchild != null) ? p.rchild.height : 0;
        }

        return hl-hr;
    }

    public static void inOrderTraversal(NodeTree p) {
        if (p != null) {
            inOrderTraversal(p.lchild);
            System.out.print(p.data + " ");
            inOrderTraversal(p.rchild);
        }
    }

    public static void PreOrderTraversal(NodeTree p) {
        if (p != null) {
            System.out.print(p.data + " ");
            PreOrderTraversal(p.lchild);
            PreOrderTraversal(p.rchild);
        }
    }




    public static NodeTree LLRotation(NodeTree p ) {

        NodeTree pl = p.lchild;
        NodeTree plr = pl.rchild;

        pl.rchild = p;
        p.lchild = plr;

        p.height = NodeHeight(p);
        pl.height = NodeHeight(pl);

        if (root == p ) {
            root = pl;
        }

        System.out.println(pl.data);
        return pl;
    }

    public static NodeTree LRRotation(NodeTree p ) {
        NodeTree pl = p.lchild;
        NodeTree plr = pl.rchild;

        pl.rchild = plr.lchild;
        p.lchild = plr.rchild;

        plr.lchild = pl;
        plr.rchild = p;

        pl.height = NodeHeight(pl);
        p.height = NodeHeight(p);
        plr.height = NodeHeight(plr);

        if ( root == p ) {
            root = plr;
        }

        return plr;
    }
    public static NodeTree RRRotation(NodeTree p ) {
        NodeTree pl = p.rchild;
        NodeTree Plr = pl.lchild;

        pl.lchild = p;
        p.rchild = Plr;

        p.height = NodeHeight(p);
        pl.height = NodeHeight(pl);

        if ( root == p ){
            root = pl;
        }

        return pl;

    }
    public static NodeTree RlRotation(NodeTree p ) {
        NodeTree pl = p.rchild;
        NodeTree plr = pl.lchild;

        pl.lchild = plr.rchild;
        p.rchild = plr.lchild;

        plr.rchild = pl;
        plr.lchild = p;

        pl.height = NodeHeight(pl);
        p.height = NodeHeight(p);
        plr.height = NodeHeight(plr);

        if ( root == p ) {
            root = plr;
        }

        return plr;
    }
    public static NodeTree RInsert (NodeTree p , int key ) {
        NodeTree t;
        if ( p == null) {
            t = new NodeTree(key);
            t.height=1;
            return t;
        }

        if ( key < p.data) {
            p.lchild = RInsert(p.lchild, key);
        }else if ( key > p.data) {
            p.rchild = RInsert(p.rchild,key);
        }

        p.height = NodeHeight(p);


        System.out.println(BalanceFactor(p));

        if (BalanceFactor(p) == 2 && BalanceFactor(p.lchild) ==1) {
            return LLRotation(p);
        }else if (BalanceFactor(p) == 2 && BalanceFactor(p.lchild) ==-1){
            return LRRotation(p);
        }else if (BalanceFactor(p) == -2 && BalanceFactor(p.rchild) ==-1){
            return RRRotation(p);
        }else if (BalanceFactor(p) == -2 && BalanceFactor(p.rchild) ==1) {
            return RlRotation(p);
        }

        return p;
    }



    public static void main(String[] args) {



        root = RInsert(root, 10);
        root = RInsert(root, 5);
        root = RInsert(root, 30);
        root = RInsert(root, 20);
        root = RInsert(root, 40);
        root = RInsert(root, 15);

        PreOrderTraversal(root);
    }
}
