package Tree;

public class Levelorder {

    void levelOrder ( Node root  ) {
        Queue q = new Queue(100);
        System.out.print(root.data + " ");
        q.enqueue(root);

        while(!q.isEmpty()){
            root = q.dequeue();
            if (root.Lchild != null) {
                System.out.print(root.Lchild.data + " ");
                q.enqueue(root.Lchild);
            }
            if (root.Rchild != null) {
                System.out.print(root.Rchild.data + " ");
                q.enqueue(root.Rchild);
            }
        }

    }


}
