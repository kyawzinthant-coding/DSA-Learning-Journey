package Queue;

class Node<T> {
    T data;
    Node<T> next;
}

public class LinkedListQueue<T> {
    Node<T> front, rear;
    int size;

    public LinkedListQueue() {
        this.front = this.rear = null;
        this.size = 0;
    }

    public void enqueue(T value) {
        Node<T> newNode = new Node<>();

        newNode.data =value;
        newNode.next = null;
        if ( front == null) {
            front = rear = newNode;
        }else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public void dequeue () {
        Node<T> p = new Node<>();
        if ( front == null ) {
            System.out.println("Queue is empty");
        }{
            p = front;
            front = front.next;
        }
    }

    public void Display() {
        Node<T> p = front;

        while (p != null){
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListQueue<Integer> qu = new LinkedListQueue<>();

        qu.enqueue(10);
        qu.enqueue(20);
        qu.enqueue(30);
        qu.dequeue();
        qu.Display();
    }
}
