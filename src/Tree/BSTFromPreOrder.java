package Tree;

import StackStructure.Stack;

public class BSTFromPreOrder {

    static Node CratePre( int[] pre) {
        Stack<Node> stk = new Stack<>(pre.length);
        int i = 0;
        Node rootNode = new Node(pre[i++]);
        Node t;
        Node p = rootNode;

        while ( i < pre.length) {
            if ( pre[i] < p.data) {
                t = new Node(pre[i++]);
                p.Lchild = t;
                stk.push(p);
                p = t;
            }else {
                if (pre[i] > p.data && pre[i] < (stk.isEmpty() ? Integer.MAX_VALUE : stk.peek().data)) {
                    t = new Node(pre[i++]);
                    p.Rchild = t;
                    p = t;
                } else {
                    p= stk.pop();
                }
            }
        }

        return rootNode;

    }
    public static void main(String[] args) {
        int[]  arr = {30,20,10,15,25,40,50,45};

       Node root =  CratePre(arr);

       BTS.Inorder(root);


    }
}
