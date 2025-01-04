package Tree;


public class BTS {

    static Node root;

    public static void insert( int key ) {
        Node t = root;
        Node r = null;
        Node p;

        if ( root == null) {
            p = new Node(key);
            root = p;
            return;
        }

        while ( t != null) {
            r = t ;

            if ( key == t.data) {
                return;
            }

            if ( key < t.data) {
                t = t.Lchild;
            }else if (key > t.data) {
                t = t.Rchild;
            }
        }

        p = new Node(key);
        if (p.data < r.data) {
            r.Lchild = p;
        }else if ( p.data > r.data) {
            r.Rchild = p;
        }
    }

    public static Node RInsert(Node p , int key ) {
        Node t;
        if ( p == null ) {
            t = new Node(key);
            return t;
        }

        if ( key < p.data) {
            p.Lchild = RInsert(p.Lchild,key);
        }else if ( key > p.data) {
            p.Rchild = RInsert(p.Rchild, key);
        }

        return p;
    }

    public static Node RSearch (int value, Node root) {

        if ( root == null || value == root.data) {
            return root;
        }

        if ( value < root.data ) {
            return RSearch(value , root.Lchild);
        }else if ( value > root.data) {
            return RSearch(value , root.Rchild);
        }

        return null;

    }


    public static void Inorder(Node p) {
        if ( p != null) {
            Inorder(p.Lchild);
            System.out.print(p.data + " ");
            Inorder(p.Rchild);
        }
    }

    public static void main(String[] args) {
      Node rootNode =   RInsert(root,10);
        RInsert(rootNode,5);
        RInsert(rootNode,20);
        RInsert(rootNode,8);
        RInsert(rootNode,30);


        Inorder(rootNode);

        Node temp = RSearch(20,rootNode);

        System.out.println();

        if ( temp == null) {
            System.out.println("Not Found ");
        }else {
            System.out.println("found : " + temp.data);
        }


    }
}
