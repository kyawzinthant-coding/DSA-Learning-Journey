package Tree;


import java.util.Scanner;

class Node {
    Node Lchild;
    int data;
    Node Rchild;

    public Node(int data) {
        this.Lchild = null;
        this.data = data;
        this.Rchild = null;
    }
}

class Queue {
    int size;
    int front;
    int rear;
    Node[] Q;


    public Queue(int size) {
        this.size = size;
        this.front = 0;
        this.rear = 0;
        Q = new Node[size];
    }

    public void enqueue ( Node value) {
        if (isFull()){
            System.out.println("Queue is full");
        }

        rear = ( rear +  1) % size;
        Q[rear] = value;
    }

    public Node dequeue() {
        Node x = null;
        if ( isEmpty()) {
            System.out.println("Queue is empty");
        }
        front = ( front + 1) % size;
        x = Q[front];

        return x;
    }


    public boolean isFull() {
        return (rear+1)% size == front;
    }

    public boolean isEmpty(){
        return front == rear;
    }

}


public class BinaryTreeQueue {
    private static Node root;

    public static void createTree () {
        Scanner sc = new Scanner(System.in);

        Queue q = new Queue(10);

        System.out.print("Enter root value: ");
        int x = sc.nextInt();
        root = new Node(x);
        q.enqueue(root);

        while(!q.isEmpty()){
            Node p = q.dequeue();

            System.out.print("Enter left child value of " + p.data + ": ");
            x = sc.nextInt();

            if ( x != -1) {
                Node t = new Node(x);
                p.Lchild = t;
                q.enqueue(t);
            }

            System.out.print("Enter right child value of " + p.data + ": ");
            x = sc.nextInt();

            if ( x != -1) {
                Node t = new Node(x);
                p.Rchild = t;
                q.enqueue(t);
            }
        }

        sc.close();
    }

    public static void preorder(Node p ) {
        if (p != null) {
            System.out.print(p.data + ", ");
            preorder(p.Lchild);
            preorder(p.Rchild);
        }
    }

    public static void main(String[] args) {
        createTree();

        CountingNode CN = new CountingNode();

        int result = CN.count(root);

        System.out.println("The number of node " + result);


    }

}