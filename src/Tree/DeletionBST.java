package Tree;


import static Tree.BTS.root;

public class DeletionBST {


    static int Height(Node rootNode){
        int x;
        int y;
        if (rootNode == null){
            return 0;
        }
        x = Height(rootNode.Lchild);
        y = Height(rootNode.Rchild);
        return x > y ? x + 1 : y + 1;
    }

    static Node InPre ( Node p ) {
        while ( p != null & p.Lchild != null) {
            p = p.Lchild;
        }
        return p;
    }

    static  Node InSuccess( Node p ) {
        while ( p != null & p.Rchild != null) {
            p = p.Rchild;
        }
        return p;
    }

    static  Node deleteNode(Node rootN , int key ) {

        Node q;
        if (rootN == null) {
            return null;
        }

        if (rootN.Lchild == null && rootN.Rchild == null) {
            if ( rootN == root) {
                root = null;
            }
            return null;
        }

        if ( rootN.data > key) {
            rootN.Lchild = deleteNode(rootN.Lchild,key);
        }else if ( rootN.data < key ) {
            rootN.Rchild = deleteNode(rootN.Rchild,key);
        }else {

            if ( Height(rootN.Lchild) > Height(rootN.Rchild)) {
               q = InPre(rootN.Lchild);
               rootN.data = q.data;
               rootN.Lchild = deleteNode(rootN.Lchild, q.data);
            }else {
                q = InSuccess(rootN.Rchild);
                rootN.data = q.data;
                rootN.Rchild = deleteNode(rootN.Rchild, q.data);
            }

        }

        return rootN;
    }
    public static void main(String[] args) {

        Node rootNode =   BTS.RInsert(root,10);
        BTS.RInsert(rootNode,5);
        BTS.RInsert(rootNode,20);
        BTS.RInsert(rootNode,8);
        BTS.RInsert(rootNode,30);

        int deleteNode = 5;

        deleteNode(rootNode, deleteNode);

        System.out.println("deleted " + deleteNode);

        BTS.Inorder(rootNode);



    }
}
